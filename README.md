# javaassignments
Spring Boot rest API with swagger.

Swagger Service configuration(yaml file) attached in the root folder.

# Key Notes
used Aho-Corasick Algorithm to reduce time complexity. 
For a given account, all transaction ids and descriptions are combined with seperated by pipelines. 

|txid1|description1|txid2|description2

then applied the algorithm with predifened list of words. 

created and updated put requests. 

# Used libraries & dependencies: 

h2 in memory database
lombok for getter,setter,and additional functions. 
swagger & swagger ui for api documentation. 
mapstruct for DTOs. ( distinguish api models from inner entities.)
Aho-Corasick Algorithm. 

# Running:
./mvnw spring-boot:run in main folder.

for database login : http://localhost:8080/bozturkmenuk/assignment/1.0.0/h2-console (just leave the credentials as is)
postman importable swagger file with example data is in importforpostman.json file on the root folder of repository

# Packages & Purposes :
This assignment first started api side and then switched to client side. So there are seperate model classes and services. 


com.fractal.api : generated from yaml(design-first) . edited default methods and converted to interface methods. interfaces with suffix api are annotated for swaggerui. classes extend them with suffix controller are the handler methods. 

com.fractal.model : base inner entities. 
com.fractal.api.v1.domain : exposed DTO versions of inner entities. Gives the ability to distinguish inner and outer entities. 
com.fractal.bootstrap : data load on startup. 
com.fractal.mapper : mapping entitites to DTOs
com.fractal.repositories : JPA repositories with added custom functionalities.
com.fractal.service : services used in apis.
 


