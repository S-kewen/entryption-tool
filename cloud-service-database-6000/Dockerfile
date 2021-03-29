FROM java:8

MAINTAINER skwen<sgh@iskwen.com>

COPY *.jar /app.jar

CMD ["--server.port=6000"]
EXPOSE 6000

ENTRYPOINT ["java","-jar","/app.jar"]