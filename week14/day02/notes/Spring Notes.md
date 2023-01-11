# Spring Notes

## Review of Yesterday (Monday)

- We created an empty Spring Boot project
   - Important settings: Java 8, Maven, Jar
   - Important! use Spring Boot version 2.7.x (this is the version that supports Java 8) bc 3.0.x only supports Java 17 and above
   - The only dependency we need is Spring Web right now
- Open the Boot Dashboard (Window>Show View > Other> Other > Boot Dashboard)
   - Use the dashboard to start the server, in the console you should see it start on 8080

# Steps we are taking today (Tuedsay)
- Create a new Spring Boot project with 3 dependencies (Spring Data JPA, MySQL Driver, Spring Web)
- Create a schema in our database (MySQL workbench) called Store (will have two tables Store and Products - one to many relationship between store and products) 
    ex: groceryStore has eggs, ice, milk vs hardwareStore has hammer, nails
- Fill in the application.properties file (in order to start up the application we need these values defined)

```
server.port=8080
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/shop
spring.datasource.username=root
spring.datasource.password=root
```

- Set up folder structure described below (models, respositories, services, controllers packages all under src/main/java/com/skillstorm)
- Set up the controller API end points with method stubs
    - Test the API end points with Postman to see if the requests are making it to our API end points
- Set up ther service interface and implemenation class with methods for each CRUD functionality (stub methods for now)
    - Inject the service into the controller class by adding a property to the ShopController class 
    ```
    @Autowired
    private ShopService service;
    ```
    - Call the service methods (which are still stubs) from the controller methods and retest the API endpoints making sure the controller and service methods are being called
- Set up the ShopRepository by making an interface that extends CrudRepository
```
@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer> {
    // 
}
```
- Set up the Model classes and annotate them to map each attribute to a column in your table
    - Inject the repository into the ShopServiceImpl class by using `@Autowired private ShopRepository repo;`
    - Call the repository methods inside the Service class's methods
        - Remember findById returns an Optional, check if the id exists in the database before calling repository save update or deleteById, 
    - Restart the application and test the enpoints in Postman (if you're application.properties has .ddl-auto=update the tables will be generated for you on application startup)
- - Repeat steps for Product
- Join the Shop and Product tables by adding to the Shop class:
```
```
and to the Product class:
```
```
- TODO many-to-many relationship
- TODO Add a generated query using JPA keywords ex: for product getByNameLike(String name); 
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details 

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


## What is Spring Boot
https://spring.io/projects/spring-boot
- Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
- We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.
	- Opinionated means they decide how it is configured instead of giving us the flexibility to configure it and organize the project however we want

### Features
- Create stand-alone Spring application
- Embedded Tomcat server
- Provides opinionated 'starter' dependencies 
- no XML configuration files required (we used annotations)

## What is Spring Boot doing for us and what do we need to implement?
- https://terasolunaorg.github.io/guideline/1.0.1.RELEASE/en/_images/RequestLifecycle.png
- 
We are working on three layers: 
    1. repository (and model)
    2. service
    3. contr/oller 

## Spring Annotations

- @SpringBootApplication 
   - This is a convenienceannotation that is equivalent to declaring 
      1. @Configuration 
      2. @EnableAutoConfiguration
      3. @ComponentScan here is where it finds our @Service classes and creates an instance of them
- @Controller this tells Spring Boot the class contains methods for interacting with HTTP Client Requests
- @RestController
TODO change @Controller to @RestController to avoid putting @ResponseBody on every method's return type (use @Controller for returninf html views and @RestController for returning json data)
    - @RequestMapping lets us define in the API endpoint like `\shop`
    - @ResponseBody
    - @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
    - @PathVariable you can specify the name and can specify required = true or required = false
    - @RequestBody let's you grab the object from the body of the request and pass it in as a parameter to the controller's method (ex: save(@ResponseBody Shop shop))
- @Service
- @Repository
- @Entity
    - @Table
    - @Column
    - @Id
    - @GeneratedValue(strategy = GenerationType.IDENTITY)
    - @OneToMany
    - @ManyToOne
    - TODO create a many-to-many relationship

##  TODO Rest principles

- REST stands "REpresentational State Transfer"
    - It is the defacto way of setting up web APIs
    - Other web API alternatives are SOAP or GraphQL
- Great for Data transfer (not HTML pages but data like JSON or XML)

https://restfulapi.net/ 
1. Uniform Interface
    - The same resource should not  be available at two different paths ex: /products and /items 
    - even worse if you had to do /products and /item/27 (consistent naming)
2. Client-Server
    - The client and server should be completely seperate so that they client only knows about the server through the API endpoints and the data format sent back
3. Stateless
    - Each request from the client to the server must include all the data necessary to process the request
    - The server cannot take advantage of any previously stored context info
    We cannot depend on our request always going to the same server, it might go down and our request might go to a different instance of the application running on a seprate server, or there might just be multiple that traffic is redirected between
4. Cacheable
    - The cacheable constraint requires that a response should implicitly or explicitly label itself as cacheable or non-cacheable
        - if cacheable, it should specify a time period
        - cacheable means the client application can save the response data to use later, so if the same request needs to be made and the old cacheable response has not expired, it can save time and usse that data instead
5. Layered System
    - Gateways (we'll talk about during microservices week) between the client and the server )
    - The client is "agnostic" to the number of layers, they always send the request in the same manner
6. Code-on-demand
    - optional
    It just means the client can request and recieve executable scripts
    - in other words, the respone might contain code that the client can then run themselves


## DTO = Data Transfer Object
- The data we send to the user does not need to be identical the the data stored the database
    - Create a new class (DONT annoted as an entity because it does not directly map to any tables in our database)
    https://miro.medium.com/max/1400/1*I7lmEQZX6m2Ow__RtAJcBQ.png 
    https://i.ytimg.com/vi/dBVd1SsfqLc/maxresdefault.jpg 

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
    Note: Amazon uses path variable and request params https://www.amazon.com/cat-toys/s?k=cat+toys 
          Target uses path  variables https://www.target.com/c/toothpaste-oral-care-personal 
          Half Price books uses request params https://hpb.com/products/?keywords=HARRY+POTTER
          So you do you, just be consistent with your design decisions
5. Versioning
     - You don't want to change the response json format or the user's code will break when they try to parse it
     - so if you're going to do that define a new endpoint 
     - anticipating this, include a version number in your endpoints
     - https://www.myapp.com/v1/movies
        {"title":"Glass Onion", "director":"?", "length":120}
       if we change this to 
         {"title":"Glass Onion", "director":"?", "length":{"hours"=2, "minutes":30}}
       better put this at a new api endpoint called /v2/movies

## TODO Add notes on Dependency Injection and Java Beans definitions

## TODO Review JDBC vs JPA 