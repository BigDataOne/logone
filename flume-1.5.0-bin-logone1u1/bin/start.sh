#!/bin/bash
bin=`which $0`
bin=`dirname ${bin}`
#echo $bin
bin=`cd "$bin"; pwd`
#echo $bin
#echo $(pwd)

#bin/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.root.logger=INFO,console
"${bin}"/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.root.logger=INFO,LOGFILE
