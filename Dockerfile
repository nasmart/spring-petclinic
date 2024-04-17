FROM maven:3.8.3-openjdk-17 as build

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/spring-petclinic-3.0.0-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app/spring-petclinic-3.0.0-SNAPSHOT.jar"]
