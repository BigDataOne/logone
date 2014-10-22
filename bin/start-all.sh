#!/bin/bash

#this command configure all the symbolics according to deploy.conf, and start corresponding services.
bin=`which $0`
bin=`dirname ${bin}`
bin=`cd "$bin"; pwd`

_SEARCH_HOME=../elasticsearch-1.3.1-logone1u1
_FLUME_HOME=../flume-1.5.0-bin-logone1u1
_HADOOP_HOME=../hadoop-2.5.1-logone1u1
_WEB_HOME=../apache-tomcat-7.0.42-logone1u1

#system environment settings. 
#If system has set, use system's setting
if [ "x$JAVA_HOME" = "x" ]; then
    export JAVA_HOME=/jre
fi

function print_usage(){
    echo "Usage: start-all.sh"
}

#Usage: start_search <node_type> 
function start_search(){
    echo "Entering start_search ..."
    if (( $# < 1 )); then
	echo "Error: No node_type is specified."
	echo "Usage: start_search <node_type>"
	return 0
    fi
    cd "${_SEARCH_HOME}"/config
    echo "Linking elasticsearch.yml --> elasticsearch.yml.$1 ..."
    ln -sf elasticsearch.yml.$1 elasticsearch.yml 

    #run
    cd ${bin}
    if [ -f "${_SEARCH_HOME}"/bin/start.sh ]; then
	"${_SEARCH_HOME}"/bin/start.sh
    else
	echo "${_SEARCH_HOME}/bin/start.sh not found!"
    fi
    return 1
}

#Usage: start_flume <node_type> 
function start_flume(){
    echo "Entering start_flume"

    if [ -f "${_FLUME_HOME}"/bin/start.sh ]; then
	"${_FLUME_HOME}"/bin/start.sh
    else
        echo "${_FLUME_HOME}/bin/start.sh not found!"
    fi
    return 1
}

#Usage: start_web <node_type> 
function start_web(){
    echo "Entering start_web"

    if [ -f "${_WEB_HOME}"/bin/startup.sh ]; then
	"${_WEB_HOME}"/bin/startup.sh
    else
        echo "${_WEB_HOME}/bin/startup.sh not found!"
    fi
    return 1
}

#Usage: start_hadoop <node_type> 
function start_hadoop(){
    echo "Entering start_hadoop"
}

function contains() {
    local n=$#
    local value=${!n}
    for ((i=1;i < $#;i++)) {
        if [ "${!i}" == "${value}" ]; then
            echo "y"
            return 0
        fi
    }
    echo "n"
    return 1
}

FILE="${bin}/deploy.conf"

while read line; do
    echo "This is a line: $line"
    read -a array <<< "$line"
    echo "First: ${array[0]} and Second: ${array[1]}"
    #ip that is looked from etc/hosts
    hostip=$(gethostip -d ${array[0]})
    #ips of the current machine
    ips=$(ifconfig | awk '/inet addr/{print substr($2,6)}')
    if [ $(contains $ips $hostip) == "n" ]; then
        echo "$line is not for this node."
	continue
    fi
    case ${array[1]} in
        #node type (search node only): 
	#   es data node [sd], es master [sm], es query balance [sb], es comprehensive node [sc]
	sc|sd|sb|sm)
        #assign mem to stand alone search node
	export ES_MIN_MEM=512m
	export ES_MAX_MEM=512m
	export ES_HEAP_SIZE=512m
	start_search "${array[1]}"
	exit 1
	;;

        #node type (flume node only)
        #   flume node [fn] 
	fn)
	#assign mem to stand alone search node
	export FLUME_MIN_MEM=700m
	export FLUME_MAX_MEM=700m
	start_flume
	exit
	;;

	#node type (web node only)
	#   web node [wn]
	wn)
        #assign mem
	#run
        start_web
	exit
	;;

        #node type sd+wn
	sd+wn)
        #assign mem 
	export ES_MIN_MEM=512m
        export ES_MAX_MEM=512m
        export ES_HEAP_SIZE=512m
	start_search "sd"
	exit 1
	;;

#node type: hd+hn
	hd+hn)
#assign mem
	#run
	start_hadoop
	exit 1
	;;

#node type: hd+fn
	hd+fn)
#assign mem
	export FLUME_MIN_MEM=384m
	export FLUME_MAX_MEM=384m
	#export DATANODE_MIN_MEM
        #export DATANODE_MAX_MEM
        #run
	start_flume
	start_hadoop
	exit 1
	;;

#other cases
	*)
	echo "${array[1]} is not a defined type of node"
	;;

    esac
done < $FILE

