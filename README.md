# CinemaTicketBookingSystem


## PURPOSE OF PROJECT
***
### Cinema Ticket Booking System" is a project whose main goal is to provide online movie ticket bookings at a certain cinema. Waiting at a cinema queue just to get a ticket has always been a problem which the movie lovers hate. With our system, this problem has been dealt with and anyone who hates the queues can purchase their ticket with just one click.
## Our goal in this project is to provide the Rest API for our system using Spring Boot framework which will help viewing and managing the data stored in our Cinema Ticket Booking System database.


## VERSION
### The project is a Spring Boot application using Maven with Java 17 SDK.

## HOW TO START THIS PROJECT
### First of all you have to unzip the folder of the project,activate XAMPP and run the MySql and Apache Servers than create a new database with the name "cinema" and import the sql file in PhpMyAdmin. In order to not have any problem with your code you have work with IntelliJ ultimate.  After you run the Spring Boot code, you can access the application at http://localhost:8000/ through Postman.

## DATABASE

### Our database have 6 entities 
### Auditorium
> AuditoriumNumber
> AuditorumCapacity
### Customer
> CustomerName
> CustomerSurname
> CustomerAge
> CustomerEmail
### Movie
> MovieName
> MovieCategory
### Seat
> SeatNumber	
> SeatRow	
> AuditoriumNumber
### Streams
> SAuditoriumNr	
> SMovieName	
> StreamsDate	
> StreamsTime
### Ticket
> TicketID	
> TicketDate	
> TicketTime	
> TicketFee	
> TicketSeatNr	
> TicketSeatRow	
> TMovieName	
> TCustomerEmail

## DEPENDENCIES
### We have some important dependencies

**Spring-boot-starter-data-jpa**
```
 <dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency> 
```
### Spring Boot provides spring-boot-starter-data-jpa dependency to connect Spring application with relational database efficiently

**Spring-boot-starter-web**
```
<dependency>
<groupId>org.springframework.boot</groupId>
Car Dealership – User Manual 5
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
### We use this dependecy for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container.

**MySql-Connector**
```
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
</dependency>
```
### MySQL provides connectivity for client applications developed in the Java programming language with MySQL Connector/J, a driver that implements the Java Database Connectivity (JDBC) API


**spring-boot-starter-test**
```
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
<scope>test</scope>
</dependency>

```
### It is used to test Spring Boot applications with libraries, including JUnit, Hamcrest, and Mockito.


## REST Endpoints
=========================
### **@RestController indicates that the data returned by each method will be written straight into the response body instead of rendering a template.**
### Different REST requests mappings. Every entity has at least a single GET, POST, PUT and DELETE mapping

**AUDITORIUM's REST Endpoints**
### Lists the auditoriums with their numbers and capacity
GET: localhost:8080/auditorium

### List the auditoriums by their numbers
GET: localhost:8080/auditorium/number

### Enables us to input data using Json formmat to the auditorium atrribute
POST: localhost:8080/auditorium

### Update the auditorium data by the given name
PUT: localhost:8080/auditorium/number

### Allows us to delete the data of auditorium by the given number
Delete: localhost:8080/auditorium/number

---

**CUSTOMER's REST Endpoints**
### Lists of customers which have booked tickets
GET: localhost:8080/customer/bookings
### List the customers and their data
GET: localhost:8080/customer

### Lists the customers by their names
GET: localhost:8080/customer/name

### Allows us to input customer's data using Json format 
POST: localhsot:8080/customer

### Update the data of the customer by the given name
PUT: localhost:8080/customer/name

### Deletes the data of the customer by the given name
DELETE: localhost:8080/customer/name

---

**MOVIE's REST Endpoints**
### Lists of movies that have been booked
GET: localhost:8080/movie/bookings
### Lists the movies and their data
GET: localhost:8080/movie

### Lists the movies by their name
GET: localhost:8080/movie/name

### Enables us to input movies's data by using Json format
POST: localhost:8080/movie

### Updates the data of movies by the given name
PUT: localhost:8080/movie/name

### Deletes the data of the movies by the given name
DELETE: localhost:8080/movie/name

---

**SEAT's REST Endpoints**
### Lists of seats that have been booked
GET: localhost:8080/booked/seats
### List the seats and their data
GET: localhost:8080/seats

### List the seat by their name
GET: localhost:8080/seat/number

### Enables us to input seat's data by using Json format
POST: localhost:8080/seat

### Update the data of seat by the given number
PUT: localhost:8080/seat/number

### Deletes the data of the movies by the given number
DELETE :localhost:8080/seat/number

--- 

**STREAMS's REST Endpoints**
### Lists the data of the streams
GET: localhost:8080/streams

### Lists the data and time of the streaming movie
GET: localhost:8080/streams/time/data

### Enables us to input strams's data by using Json format
POST: localhost:8080/streams

### Update the data of stream by the given time
PUT: localhost:8080/streams/time

### Deletes the data of the streams by the given time
DELETE: localhost:8080/streams/time

--- 

**TICKET's REST Endpoints**
### Lists the data of the ticket
GET: localhost:8080/tickets

### Lists the data of the ticket by the given id
GET: localhost:8080/ticket/id

### Enables us to input ticket's data by using Json format
POST: localhost:8080/ticket

### Update the data of ticket by the given id
PUT: localhost:8080/streams/time

### Deletes the data of the ticket by the given id
DELETE: localhost:8080/ticket/id
