#!/bin/bash
# Set rack id based on IP address.
# Assumes network administrator has complete control
# over IP addresses assigned to nodes and they are
# in the 10.x.y.z address space. Assumes that
# IP addresses are distributed hierarchically. e.g.,
# 10.1.y.z is one data center segment and 10.2.y.z is another;
# 10.1.1.z is one rack, 10.1.2.z is another rack in
# the same segment, etc.)
#
# This is invoked with an IP address as its only argument

# get IP address from the input
ipaddr=$1

# select "x.y" and convert it to "x/y"
segments=`echo $ipaddr | cut --delimiter=. --fields=2-3 --output-delimiter=/`
echo /${segments}
