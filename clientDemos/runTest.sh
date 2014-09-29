#!/bin/bash
java -cp .:./libs/MsgClient.jar:./libs/json-lib-2.4-jdk15.jar:./libs/commons-lang-2.6.jar:./libs/commons-logging-1.2.jar:./libs/commons-collections-3.2.1.jar:./libs/commons-beanutils-1.9.2.jar:./libs/ezmorph-1.0.6.jar  docone.logsys.test.IndexLogFile ./data/part_for_SC_tru_trid15_a_20131104_13_09.txt localhost:5140

