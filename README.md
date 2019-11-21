# javaassignments
Spring Boot rest API with swagger.

Swagger Service configuration(yaml file) attached in the root folder.

Used libraries & dependencies: 

h2 in memory database
lombok for getter,setter,and additional functions. 
swagger & swagger ui for api documentation. 
mapstruct for DTOs. ( distinguish api models from inner entities.)

Running:
./mvnw spring-boot:run in main folder.

Packages & Purposes :

com.fractal.api : generated from yaml(design-first) . edited default methods and converted to interface methods. interfaces with suffix api are annotated for swaggerui. classes extend them with suffix controller are the handler methods. 

com.fractal.model : base inner entities. 
com.fractal.api.v1.domain : exposed DTO versions of inner entities. Gives the ability to distinguish inner and outer entities. 
com.fractal.bootstrap : data load on startup. 
com.fractal.mapper : mapping entitites to DTOs
com.fractal.repositories : JPA repositories with added custom functionalities.
com.fractal.service : services used in apis.
 


