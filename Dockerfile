FROM maven:3.9.9-eclipse-temurin-21-alpine as build
COPY . .
RUN mvn package -DskipTests

FROM eclipse-temurin:21-alpine
COPY --from=build targe/lontraApp.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]