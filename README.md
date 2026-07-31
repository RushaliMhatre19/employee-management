# Employee Management System

Employee Management System is a Spring Boot web application developed to manage employee records efficiently.

The application allows users to add, view, edit, update, delete, and search employee information.

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Frontend
- HTML
- Thymeleaf

### Database
- MySQL

### Tools
- Eclipse IDE
- Spring Initializr
- MySQL Workbench
- Maven

## Dependencies

The project was created using Spring Initializr with the following dependencies:

- Spring Web
- Spring Data JPA
- MySQL Driver
- Thymeleaf

## Features

- Add new employees
- View employee records
- Edit employee details
- Update employee information
- Delete employee records
- Search employees
- Store employee data in MySQL database

## Project Setup

1. The Spring Boot project was created using Spring Initializr.
2. Maven was selected as the project type.
3. Java was selected as the programming language.
4. Java 17 was used for the project.
5. Spring Web, Spring Data JPA, MySQL Driver, and Thymeleaf dependencies were added.
6. The generated project was downloaded and extracted.
7. The project was imported into Eclipse as an Existing Maven Project.
8. A MySQL database was created using MySQL Workbench.
9. Database configuration was added in `application.properties`.
10. Employee Entity, Repository, and Controller were created.
11. Thymeleaf templates were created for the user interface.

## Project Structure

- `Employee.java` - Entity class representing employee data.
- `EmployeeRepository.java` - Handles database operations using Spring Data JPA.
- `EmployeeController.java` - Handles application requests and employee operations.
- `index.html` - Displays employee records.
- `add-employee.html` - Form for adding new employees.
- `edit-employee.html` - Form for editing employee information.
- `application.properties` - Contains Spring Boot and database configuration.

## Database Configuration

The application uses MySQL as the database.

For security, the database password is not stored directly in the source code.

The password is configured using the `DB_PASSWORD` environment variable.

Example:

spring.datasource.password=${DB_PASSWORD}

## How to Run

1. Clone or download the repository.
2. Open the project in Eclipse IDE.
3. Make sure MySQL Server is running.
4. Create the required `employee_management` database in MySQL.
5. Set the `DB_PASSWORD` environment variable with your MySQL password.
6. Run the project using:

   `Run As → Spring Boot App`

7. Open the browser and visit:

   `http://localhost:8080/`

## Author

Rushali Mhatre
