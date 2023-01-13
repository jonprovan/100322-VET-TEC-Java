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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // above the class

```

```
@OneToMany(mappedBy = "shop") // above the list of products property

```
and to the Product class:
```
@ManyToOne
@JoinColumnname = "shop_id")
@JsonIdentityReference(alwaysAsId = true)
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

##  Rest principles

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

- Dependency Injection
    - 3 types
        1. constructor 
        2. setter
        3. property (this is what we are using by @Autowired)

## TODO Review JDBC vs JPA 

- JPA - Java Persistency API
- https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details 
- Instead of writing queries it can generate it based on keywords that we put in our method signature
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords 
- Hibernate vs JPA when using that term innerchangeably 
    - Hibernate is actually an implementation of the JPA standard others include OpenJPA
    - all of these are used for Object Relational Mapping
    - Spring Boot we are using Data JPA which is using Hibernate
    - one fun thing we can do is turn on a logger that shows the generated queries and ddl statements

    Inside application.properties (dont do this in production but for now it's ok to take a peak at what it's doing)

```
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
```

Instead to see the parameters as well, you can do:
```
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```

### Creating a logger 

1. Create the logger
2. Make sure the level of logging that is turned on is high enough, so your logs aren't "turned off"
(tip: put something long, and eye catching to find your logs in the mess of all the logs ========================================== )



- Use the sl4j logger (or any logger you want but the below example only applies to sl4j)

```
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MyClass {
	Logger log = LoggerFactory.getLogger(getClass());
         ...
}
```

- Set the logging level in application.properties
```
logging.level.root=WARN 
logging.level.org.springframework.web: DEBUG
```

- NOTE: Yesterday (Wednesday) we created a logger and set the log level

1. Trace - The most fine grained level of logging (you are logging a lot at every single step or method of your code)
2. Debug - This is less fine grained than trace, you are only looking at peices that you are interested in
3. Info - The standard log level that indicates that something happened
4. Warn - This log level indicates that something unexpected happened but didn't break anything
5. Error - This log level indicates that something unexpected happened and broke something
6. Fatal - This log level indates that something happened and is unrecoverable

- Why do we use a logger?
    - So far we've been using print lines, which we'll have to go find and delete before pushing to production
    - If we instead use a logger, we don't have to go track them down and delete them, we just "flip a switch" and turn them off from application.properties

### Which type of repository (DAO data access object) should we use?

 * CrudRepository provides CRUD functions
 * PagingAndSortingRepository provides methods to do pagination and sort records
 * JpaRepository provides JPA related methods such as flushing the persistence context and delete records in a batch


 
 # How to fix our many-to-many relationship

 - To get rid of the circular reference in the JSON use the annotation @JsonIgnore in the target class (of the owner-target relationship)

 ``` 
 object references an unsaved transient instance - save the transient instance before flushing: com.skillstorm.practice.models.Product; nested exception is java.lang.IllegalStateException: org.hibernate.TransientObjectException: 
 ```

 - Check that your Cascade types are correct
 - Cascade types include:

JPA
 1. ALL
 2. PERSIST
 3. MERGE
 4. REMOVE
 5. REFRESH
 6. DETACH
 HIBERNATE
 7. SAVE_UPDATE
 8. REPLICATE
 9. LOCK

 - Use the following imports and cascade setting on both sides of your many-to-many

 ```
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.MERGE, CascadeType.PERSIST})

 ```

 - To read more about the cascade tpes available https://www.baeldung.com/jpa-cascade-types 

 NOTE: Also set the fetch type to `fetch = FetchType.LAZY` on the list property in the "target" side of the owner-target relationship

 # Writing Complex Queries in Spring Boot with Data JPA

 1. check if the repository type you extended comes with that query/statement already implemented
 2. look at the jpa generated query documentation for the keywords list to see if you can just define the method signature and have the query generated for you
 3. if neither of the above contain the query you want to make, write it yourself!
    - Option 1: JPQL (java persistence query language) -- this looks like a query, but we are using the names of classes and properties NOT tables and columns
        - You need a method signature in Repository inteface 
        - You need the @Query("   ") annotation
        - To use parameters:
            Option 1: Named parameters with :id in the query string instead of ? for the placeholders
                       and myMethod(@Param("id") int id) in the method signature
            Option 2: Numbered question marks for the parameters (make sure they match the order of the method's parameters!)
            ex: SELECT * FROM product WHERE id = ?1
                myMethod(int id);
    - Option 2: SQL (whatever native sql language your database is using) -- this is the exact same query you run in your MySQL Workbench
        - You need to tell it this is a MySQL query
        - @Query(value = "    ", nativeQuery = true) -- you can copy past the query from your workbench, avoid this if you can to maintain a layer of abstraction and use jpql


# Swagger Document

- Now we have built our Rest API, we need to document it
    - To help users of API understand how we have set up the endpoints, the data format sent back, and the errors they can expect to have to handle
- If we do this by hand in our ReadMe.md on our github for example, it could become out dated/ out of sync with our code pretty quickly
    - Instead use a dodumentation generator like swagger

- Add this dependency to your POM.xml

```
        <dependency>
           <groupId>org.springdoc</groupId>
           <artifactId>springdoc-openapi-ui</artifactId>
           <version>1.6.8</version>
        </dependency>
```

- We can add to the default generated documentation using annotations in our controller class at the class and method level
    - At the class level we use
    `@Tag(name = "name here", description = "description goes here")
    - At the method level we use
    `@Operation(summary = "summary here", description = "description here")

- To find the webpage with your documentation, you can look at the logs using the setting in your application.properties:
```
logging.level.org.springframework.web=trace 
```

Which should show you:
```
	o.s.w.a.OpenApiWebMvcResource:
	{GET [/v3/api-docs], produces [application/json]}: openapiJson(HttpServletRequest,String,Locale)
	{GET [/v3/api-docs.yaml], produces [application/vnd.oai.openapi]}: openapiYaml(HttpServletRequest,String,Locale)
2023-01-12 11:13:05.230 TRACE 31476 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 
	o.s.w.u.SwaggerWelcomeWebMvc:
	{GET [/swagger-ui.html]}: redirectToUi(HttpServletRequest)
2023-01-12 11:13:05.231 TRACE 31476 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 
	o.s.w.u.SwaggerConfigResource:
	{GET [/v3/api-docs/swagger-config], produces [application/json]}: openapiJson(HttpServletRequest)
```

The one we care about is the HTML page at localhost:8080/swagger-ui.html

# How to Use a Global Exception Handler to change the response code instead of in our Controller

1. Create an exception class 
2. Throw the exception from our service class instead of handing back null 
3. Create a Global Exception Handler class 
    - with a method to change the response code when an exception is thrown


We have:
1. created a custom exception class -- extended the Exception (checked exception) and defined two constructors (no-arg and a String message)
2. throw our exception in the service update method
    - this is a checked exception so must also declare throws MyException
    - the interface method signature must also declare throws MyException
3. Create the GloablExceptionHandler class
    - put this in the controller folder (it interacts with the client)
    - annotate it the @RestControllerAdvice
    - Create a method that is annotated with the type of exception it needs to handle @ExceptionHandler(MyException.class) and the status code @ResponseSTatus(code = HttpStatus.BAD_REQUEST)
    - Return type of your method can be anything!!! It will be converted to json in the body of the response (don't put too much info you don't want just anyone knowing the inner workings of your backend)