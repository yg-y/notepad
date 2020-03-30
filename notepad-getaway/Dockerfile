FROM openjdk:8-jre-alpine

LABEL maintainer="y627756022@gmail.com"

ENV SW_APPLICATION_CODE=notepad-getaway \
	SW_COLLECTOR_SERVERS=192.168.31.129:12800

COPY ../docs/agent/ /agent

COPY target/${JAR_FILE} /app.jar

EXPOSE 8000

ENTRYPOINT java -javaagent:/Users/young/lib/skywalking-agent.jar -Dskywalking.collector.backend_service=${SW_COLLECTOR_SERVERS} \
-Dskywalking.agent.application_code=${SW_APPLICATION_CODE} -jar /app.jar