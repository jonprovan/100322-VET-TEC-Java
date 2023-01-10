# Spring Notes

## Review of Yesterday

- We created an empty Spring Boot project
   - Important settings: Java 8, Maven, Jar
   - Important! use Spring Boot version 2.7.x (this is the version that supports Java 8) bc 3.0.x only supports Java 17 and above
   - The only dependency we need is Spring Web right now
- Open the Boot Dashboard (Window>Show View > Other> Other > Boot Dashboard)
   - Use the dashboard to start the server, in the console you should see it start on 8080

# Steps we are taking today
- Create a new Spring Boot project with 3 dependencies (Spring Data JPA, MySQL Driver, Spring Web)
- Create a schema in our database (MySQL workbench) called Store and Products (one to many relationship between store and products)
- Fill in the application.properties file (in order to start up the application we need these values defined)

```
server.port=8080
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/shop
spring.datasource.username=root
spring.datasource.password=root
```


## Project Structure

/src/main/java -- this is where all our code will go
               -- this already has an application class with a main method generated for us
/src/main/resources -- this is where static resource like images html files configuration files will go
                    -- note: it already has a application.properties file

help.md -- has tutorials/documentation links for each the dependencies we chose

### Recommended src/main/java structure

/src/main/java/com/skillstorm
  - /controllers
     = where we will put a controller for interacting with eaach table
  - /models
     = a Java Class for each table in your database -- properties mapped to columns/attributes
  - /services
      = a service class to put all the logic for interacting with each table, most of your code should be here
  - /repositories
      = this is like our DAO (data access object) from last week when we did JDBC but this week we are using JPA and it will generate queries for us

## What is Spring

- Spring is a framework that came about to solve the problem Java didn't have a distinct we framework
   - We had to found our own web server and werite low level servlet code to handle the HTTP requests
- Spring has a vast ecosystem
   - Spring Web
   - Spring Data
   - Spring Security (authentication and authoriztion)
   - Spring Boot (most popular bc it helps get started with enterprise level applications quickly -- it bootstraps the entire project for us)
   - Spring Session
   - Spring Cloud (microservices)

## What is Spring Boot doing for us and what do we need to implement?
- https://terasolunaorg.github.io/guideline/1.0.1.RELEASE/en/_images/RequestLifecycle.png
- 


## Spring Annotations

- @SpringBootApplication 
   - This is a convenienceannotation that is equivalent to declaring 
      1. @Configuration 
      2. @EnableAutoConfiguration
      3. @ComponentScan