FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY target/projeto-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/projeto-0.0.1-SNAPSHOT.jar"]