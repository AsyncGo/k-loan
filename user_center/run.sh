#!/bin/sh

def_port=8080

PORT=`[ -z "$1" ] && echo "$def_port" || echo "$1"`

if [ "$PORT" -eq "$def_port" ]
then
    export MAVEN_OPTS="-Xrunjdwp:transport=dt_socket,address=1311,suspend=n,server=y"
else
    unset MAVEN_OPTS
fi

mvn -Pdev clean spring-boot:run -Dasync=on -Drun.arguments="--server.port=$PORT"