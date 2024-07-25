# Console-Based JDBC Student Management Application

## Project Overview
This Console-Based JDBC Student Management Application is designed to manage student data through a command-line interface. 
It demonstrates the fundamental CRUD (Create, Read, Update, Delete) operations using Java and JDBC.

## Key Features
- **Insert Data:** Add new student records to the database, including Roll Number, Name, and Email.
- **Update Data:** Modify existing student records by updating the Name or Email.
- **Delete Data:** Remove student records from the database using the Roll Number.
- **Read Data:** Retrieve and display all student records from the database.

## Technologies Used
- **Java:** Core programming language for the application logic.
- **JDBC:** Java Database Connectivity for interacting with the MySQL database.
- **MySQL:** Relational database management system to store student data.

## Project Structure
- **Main.java:** Entry point of the application, providing a menu-driven interface for user interaction.
- **DB.java:** Handles the database connection setup.
- **Query.java:** Stores SQL query strings for database operations.
- **Student.java:** Represents the Student entity with Roll Number, Name, and Email fields.
- **StudentDBMS.java:** Contains methods for executing database operations (insert, update, delete, read).

## How to Run
1. **Setup Database:**
   - Ensure you have MySQL installed and running.
   - Create a database named `Student` and a table `Student` with columns: RollNo (INT), Name (VARCHAR), and Email (VARCHAR).

2. **Configure Database Connection:**
   - Update the database connection details in DB.java with your MySQL username and password.

3. **Compile and Run:**
   - Compile the Java files and run the Main class.
