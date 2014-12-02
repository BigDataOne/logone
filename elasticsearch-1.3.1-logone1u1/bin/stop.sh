#!/bin/bash
echo "This is a test of stop.sh in elasticsearch"
pid=`cat ./service/elasticsearch.pid`
kill pid
#echo $MY_TEST
