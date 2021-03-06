# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# If this file is placed at FLUME_CONF_DIR/flume-env.sh, it will be sourced
# during Flume startup.

# Enviroment variables can be set here.

#JAVA_HOME=/usr/lib/jvm/java-6-sun
#JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64/
#JAVA_HOME=/jre
if [ "x$JAVA_HOME" = "x" ]; then
    JAVA_HOME=/jre
fi

# Give Flume more memory and pre-allocate, enable remote monitoring via JMX
#-Xms200m -Xmx200m 
if [ "x$FLUME_MIN_MEM" = "x" ]; then
    FLUME_MIN_MEM=256m
fi
if [ "x$FLUME_MAX_MEM" = "x" ]; then
    FLUME_MAX_MEM=256m
fi

FLUME_JAVA_OPTS="-Xms${FLUME_MIN_MEM} -Xms${FLUME_MAX_MEM}"

FLUME_JAVA_OPTS="$FLUME_JAVA_OPTS -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.port=5400"

# Note that the Flume conf directory is always included in the classpath.
#FLUME_CLASSPATH=""

#Append the FLUME_JAVA_LIBRARY_PATH to whatever the user may have specified in
#flume-env.sh
#FLUME_JAVA_LIBRARY_PATH
