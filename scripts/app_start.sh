#!/bin/bash
cd /home/ubuntu/server/target
# java -jar HMIS-0.0.1-SNAPSHOT.jar
sudo java -jar -Dserver.port=80 \
    HMIS-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &

