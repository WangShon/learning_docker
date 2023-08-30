# Build stage
# Use a Maven image as the build environment
FROM maven:3.8.2-openjdk-17 as build

# Set the working directory inside the container
WORKDIR /library-management

# Copy project's pom.xml to download dependencies
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline -B

# Copy the source code into the container
COPY src ./src

# Build the Spring Boot application
RUN mvn clean package -DskipTests

# Package stage
# Use a smaller base image for the final image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /library-management

# Copy the compiled JAR from the build image
COPY --from=build /library-management/target/LibraryManagementApplication.jar library-management.jar

# Expose the port that your Spring Boot app will run on
EXPOSE 8082

# Command to run the Spring Boot application when the container starts
CMD ["java","-jar","library-management.jar"]