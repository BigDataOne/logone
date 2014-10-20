#!/bin/bash
#bin/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.root.logger=INFO,console
#bin/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.root.logger=INFO,LOGFILE
#monitor with http
#bin/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.root.logger=INFO,LOGFILE  -Dflume.monitoring.type=http -Dflume.monitoring.port=8989
bin/flume-ng agent --conf conf --conf-file conf/example.conf --name a1 -Dflume.monitoring.type=ganglia -Dflume.monitoring.hosts=localhost:8649

