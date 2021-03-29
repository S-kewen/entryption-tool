FROM java:8

MAINTAINER skwen<sgh@iskwen.com>

COPY *.jar /app.jar

CMD ["--server.port=8100"]
EXPOSE 8100

ENTRYPOINT ["java","-jar","/app.jar"]