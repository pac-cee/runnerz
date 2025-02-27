# Library Management System - Spring Boot Project

This project is a simple Library Management System built with Spring Boot. It's designed to help you learn Spring Boot concepts through practical implementation.

## Key Concepts Covered

### 1. Spring Boot Basics
- **@SpringBootApplication**: Main application class that bootstraps the application
- **Auto-configuration**: Spring Boot automatically configures components based on dependencies
- **Properties Configuration**: Using application.properties for configuration

### 2. Data Persistence (JPA)
- **@Entity**: Marks a class as a JPA entity
- **@Table**: Specifies the database table details
- **@Column**: Defines column properties
- **@Id & @GeneratedValue**: Handles primary key generation
- **JpaRepository**: Provides CRUD operations out of the box

### 3. REST API Design
- **@RestController**: Creates REST endpoints
- **@RequestMapping**: Maps URLs to controllers
- **HTTP Methods**: 
  - GET: Retrieve resources
  - POST: Create new resources
  - PUT: Update existing resources
  - DELETE: Remove resources

### 4. Project Layers
- **Controllers**: Handle HTTP requests/responses
- **Services**: Contain business logic
- **Repositories**: Handle data persistence
- **Models/Entities**: Represent data structure

## Project Structure 

## Setup & Installation

1. Prerequisites:
   - Java 23
   - Maven
   - PostgreSQL
   - IDE (VS Code, IntelliJ, etc.)

2. Database Setup:
   ```sql
   CREATE DATABASE library_db;
   ```

3. Configure application.properties:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/library_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. Build the project:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Books
- GET `/api/books` - List all books
- GET `/api/books/{id}` - Get a specific book
- POST `/api/books` - Create a new book
- PUT `/api/books/{id}` - Update a book
- DELETE `/api/books/{id}` - Delete a book

### Request/Response Examples

1. Create a Book (POST `/api/books`):
```json
{
    "title": "Spring Boot in Action",
    "author": "John Doe",
    "isbn": "1234567890",
    "category": "Programming",
    "quantity": 5,
    "publishedYear": 2023
}
```

2. Get Book Response:
```json
{
    "id": 1,
    "title": "Spring Boot in Action",
    "author": "John Doe",
    "isbn": "1234567890",
    "category": "Programming",
    "quantity": 5,
    "availableQuantity": 5,
    "publishedYear": 2023
}
```

## Testing

The project includes three types of tests:
1. **Unit Tests**: Testing individual components
2. **Integration Tests**: Testing component interactions
3. **Repository Tests**: Testing database operations

Run tests using:
```bash
mvn test
```

## Technologies Used

- Spring Boot 3.4.3
- Spring Data JPA
- PostgreSQL
- Lombok
- JUnit 5
- Maven

## Best Practices Demonstrated

1. **Layered Architecture**:
   - Clear separation of concerns
   - Each layer has specific responsibilities

2. **REST Principles**:
   - Proper HTTP method usage
   - Resource-based URLs
   - Stateless communication

3. **Testing**:
   - Unit tests for business logic
   - Integration tests for API endpoints
   - Repository tests for data access

4. **Code Organization**:
   - Consistent package structure
   - Clear naming conventions
   - Proper use of annotations

## Learning Resources

- [Spring Boot Official Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [REST API Best Practices](https://restfulapi.net/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)

## Contributing

Feel free to fork this project and submit pull requests. You can also open issues for bugs or feature requests.

## License

This project is open source and available under the [MIT License](LICENSE). 