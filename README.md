# Spring Boot JWT Authentication with PostgreSQL

A simple Spring Boot 3.x project demonstrating **JWT-based authentication** with **PostgreSQL**.

---

## 🚀 Features
- User registration & login with JWT
- BCrypt password hashing
- Stateless authentication with Spring Security
- PostgreSQL persistence with Spring Data JPA
- REST APIs secured with JWT
- H2 Console support (optional for testing)

---

## 🛠️ Requirements
- Java 17+
- Maven 3.9+
- PostgreSQL 13+ (running locally or in Docker)

---

## ⚙️ Setup

### 1. Create PostgreSQL database & user
```sql
CREATE DATABASE jwt_demo;
CREATE USER jwt_user WITH ENCRYPTED PASSWORD 'jwt_pass';
GRANT ALL PRIVILEGES ON DATABASE jwt_demo TO jwt_user;
