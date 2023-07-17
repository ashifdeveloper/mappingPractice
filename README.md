# Mapping Practice App

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>
   
An easy-to-use online application, this project enables users to log in, register, and maintain their personal data. Users also have the option of posting and viewing posts made by other users. Tokens used for authentication are used by the programme to protect user information and guarantee that only authorised users may access particular functionalities.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
By adding the correct database URL, user name, and password to the application.properties file, you can connect to a MySQL database. It's time to update the following properties:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Student Model
```
@Id
private String ID;
private String name;
private String age;
private String phoneNumber;
private String branch;
private String department;

@OneToOne
private Address address;
```

* Laptop Model
```
@Id
private String ID;
private String name;
private String brand;
private Integer price;

@OneToOne
private Student student;
```

* Course Model
```
private String ID;
private String title;
private String description;
private String duration;

@ManyToMany
List<Student> studentList;
```

* Book Model
```
private String ID;

private String title;
private String author;
private String description;
private String price;

@ManyToOne
private Student student;
```



* Authentication Token 
```
tokenId : Long
token : string
tokenCreationDate : LocalDate
@OneToOne 
user : User
```

* Admin Token 
```
adminId : Long
firstName : string
lastName : string
email : string

```
## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:

* Student Controller:
```
PUT /student: update user details
DELETE /studentById: 
```

* Laptop Controller
```
POST /laptop: add a laptop 
GET /laptops: get all laptop
```

* Book Controller
```
POST /laptop: add a laptop 
GET /laptops: get all laptop```

* Course Controller
```
POST /course: add the course
```

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The project consists of a straightforward web application created with Java and the Spring framework. 
## Author

👤 **Mohammad Ashif**

* GitHub: [Mohammad Ashif]( https://github.com/ashifdeveloper)

    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome.
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Mohammad Ashif]( https://github.com/ashifdeveloper).<br />
    
---
