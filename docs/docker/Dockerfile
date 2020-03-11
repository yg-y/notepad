FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER young@mobikok.com

RUN mkdir -p /opt/app

# 安装 timezone 数据包
RUN apk add tzdata

# 更换系统时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

WORKDIR /opt/app

ADD app.jar app.jar

ENV JAVA_OPTS="-Xmx1024m -Xms512m"
#ENV JAVA_OPTS=""

ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar
