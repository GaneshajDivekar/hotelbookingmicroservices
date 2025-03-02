# Hotel Booking Microservices

## Overview
This project is a **microservices-based hotel booking system** built using Spring Boot. It consists of multiple services to handle different functionalities such as user management, hotel services, ratings, and service discovery.

## Architecture
The project follows a **microservices architecture** with the following components:
- **User Service** – Manages user-related operations.
- **Hotel Service** – Handles hotel-related data.
- **Rating Service** – Manages user ratings for hotels.
- **Service Registry** – Acts as a discovery server for microservices.

## Tech Stack
- **Backend**: Spring Boot, Spring Cloud
- **Database**: MySQL/PostgreSQL (as per configuration)
- **Service Discovery**: Eureka
- **Build Tool**: Maven
- **API Communication**: REST

## Setup and Installation
### Prerequisites
Make sure you have the following installed:
- Java 17+
- Maven
- MySQL/PostgreSQL
- IntelliJ IDEA (or any IDE of your choice)
- Git

### Steps to Run Locally
1. **Clone the repository**
   ```bash
   git clone https://github.com/GaneshajDivekar/hotelbookingmicroservices.git
   cd hotelbookingmicroservices
   ```

2. **Configure database**
   - Update the database credentials in `application.properties` files inside each service.

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the services** (Each service needs to be started separately)
   ```bash
   cd Service-Registry
   mvn spring-boot:run
   ```
   ```bash
   cd UserService
   mvn spring-boot:run
   ```
   ```bash
   cd Hotel-Service
   mvn spring-boot:run
   ```
   ```bash
   cd Rating-Service
   mvn spring-boot:run
   ```

5. **Access APIs**
   - **Eureka Dashboard**: `http://localhost:8761/`
   - **User Service**: `http://localhost:8081/users`
   - **Hotel Service**: `http://localhost:8082/hotels`
   - **Rating Service**: `http://localhost:8083/ratings`

## API Endpoints
### **User Service** (`/users`)
- `GET /users/{id}` – Get user details by ID
- `POST /users` – Create a new user

### **Hotel Service** (`/hotels`)
- `GET /hotels/{id}` – Get hotel details by ID
- `POST /hotels` – Add a new hotel

### **Rating Service** (`/ratings`)
- `GET /ratings/{hotelId}` – Get all ratings for a hotel
- `POST /ratings` – Submit a rating

## Contribution
Feel free to raise issues and submit pull requests.

## License
This project is licensed under the MIT License.

