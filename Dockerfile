FROM maven:3.6-jdk-8-alpine AS builder
WORKDIR  /app
COPY pom.xml ./
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package
FROM openjdk:8-jre-alpine
RUN apk add --no-cache tzdata
COPY --from=builder /app/target/accounts-0.0.1-SNAPSHOT.jar  /
CMD ["java", "-jar", "/accounts-0.0.1-SNAPSHOT.jar"]