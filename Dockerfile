FROM maven:3.8.7-eclipse-temurin-17-alpine
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn install
#ENV MONGODB_HOST=localhost
CMD ["java","-jar","app.jar"]