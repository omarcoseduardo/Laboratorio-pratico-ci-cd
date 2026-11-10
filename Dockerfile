FROM amazoncorretto:21-alpine-jdk AS build
RUN apk add --no-cache maven
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
