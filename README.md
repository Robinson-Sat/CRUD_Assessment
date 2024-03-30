# Spring Boot REST API Application

This is a Spring Boot application that exposes a REST API for managing records.

## Description

This application provides CRUD (Create, Read, Update, Delete) operations for managing records. It includes endpoints for creating, retrieving, updating, and deleting records.

## Endpoints

### Create Record
- **URL:** `/api/records`
- **Method:** POST
- **Request Body:** JSON representing the record to be created
- **Response:** JSON representing the created record

### Get All Records
- **URL:** `/api/records`
- **Method:** GET
- **Response:** JSON array representing all records

### Get Record by ID
- **URL:** `/api/records/{id}`
- **Method:** GET
- **Path Variable:** `id` (ID of the record)
- **Response:** JSON representing the record with the specified ID, or 404 Not Found if not found

### Update Record
- **URL:** `/api/records/{id}`
- **Method:** PUT
- **Path Variable:** `id` (ID of the record)
- **Request Body:** JSON representing the updated record
- **Response:** JSON representing the updated record

### Delete Record
- **URL:** `/api/records/{id}`
- **Method:** DELETE
- **Path Variable:** `id` (ID of the record)
- **Response:** No content (204)

## Technologies Used

- Spring Boot
- H2 Database (In-memory)
- Maven

## How to Run

1. Clone this repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd spring-boot-rest-api`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`
5. Access the API endpoints using a tool like Postman.

## Contributing

Contributions are welcome! Please feel free to open a pull request or submit an issue if you find any bugs or have suggestions for improvements.

## License

This project is licensed under the [MIT License](LICENSE).
