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
      3. @ComponentScan here is where it finds our @Service classes and creates an instance of them
- @Controller this tells Spring Boot the class contains methods for interacting with HTTP Client Requests
    - @RequestMapping lets us define in the API endpoint like `\shop`
    - @ResponseBody
    - @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
    - @PathVariable you can specify the name and can specify required = true or required = false
- @Service


## How to name your API endpoints

1. Do not put the HTTP method name in the API endpoint name
    - BAD: /getshops and /saveshops
    - GOOD: GET /shops and POST /shops
2. Be consistend and don't have multiple endpoints for the same thing
     - BAD: /shops and /stores both return your shop data
3. Implement hierarchy
    - hierarchy like /users/29/orders so this gets the user with id 29 's orders 
    - or even like /users/29/orders/432  so this gets the user with id 29 's order with order number 432
4. Filtering
    - https://myapp.com/movies?title=glass%20onion use parameters (exception to this rule is filtering by id where you will define an enpoint with the id in thet path like /users/29)
    - https://myapp.com/movies?limit=10&offset=20 we can even have multiple parameters
    NOtation is ? followed by key-value pairs (multiple key-value pairs separate by &)
5. Versioning
     - You don't want to change the response json format or the user's code will break when they try to parse it
     - so if you're going to do that define a new endpoint 
     - anticipating this, include a version number in your endpoints
     - https://www.myapp.com/v1/movies
        {"title":"Glass Onion", "director":"?", "length":120}
       if we change this to 
         {"title":"Glass Onion", "director":"?", "length":{"hours"=2, "minutes":30}}
       better put this at a new api endpoint called /v2/movies