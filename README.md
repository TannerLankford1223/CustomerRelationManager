# Customer Relation Manager
This is a basic customer relation management application that allows the users to 
perform CRUD operations on customers, as well as create and save notes pertaining
to a customer.

## Technology Used

1. Java 17
2. Maven
3. SpringBoot
4. Thymeleaf
5. PostgreSQL
6. Docker

## Installation and getting started

1. Clone to a local repo
2. Install any necessary dependencies

````java
./mvnw install
````

## Running the Application Locally

The project can be started using 

````java
./mvnw spring-boot:start
````

And can be stopped with

````java
./mvnw spring-boot:stop
````

## Running the Application With Docker

First ensure that you have Docker installed. See the following link for details

* https://docs.docker.com/get-docker/

Then create the image and build the containers using Docker Compose

````
docker-compose up --build
````

The container can be stopped with

````
docker-compose down
````

## Details

Once the application has started you can view the project at 
http://localhost:8080/customer/

