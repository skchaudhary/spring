# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.learner.spring-boot-crud-with-h2db' is invalid and this project uses 'com.learner.springbootcrudwithh2db' instead.

# Getting Started

This project is for how to connect and run spring boot application to perform CRUD operation.
In this project we discussed the minimum requirement to perform CRUD.

This is web application and jar packaging and maven project, So directly can be imported in eclipse or intellij and run.
three dependency used here.
1. Jpa dependency to provide the jpa repository implementation to perform crud.
2. h2 db related dependency to connect and perform db operation.
3. starter spring web dependency to implement rest services.

For running this project in IDE some prerequisite needs.
1. Project should use java8 version
2. Maven 3.5 or above
3. Postman to perform api(CRUD) operation

Postman collection already present at path: 01-spring-boot-crud-with-h2db/postman collection
just need to import in your postman, run the application and test the api.


All codes are very simple and property file having comments for property attributes.

Note:
data.sql and schema.sql file automatically detected by the spring and run these script on startup of the application.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

