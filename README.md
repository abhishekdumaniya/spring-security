# Spring Boot Security Application

This project is a **Spring Boot application** demonstrating **Spring Security** with a custom `UserDetailsService`, authentication configuration, and a clean layered architecture using DTOs, entities, and mappers.

---

## 🚀 Features

- Spring Boot REST API
- Spring Security configuration
- Custom `UserDetailsService`
- User authentication using database
- DTO ↔ Entity mapping
- Clean package structure (Controller, Service, Repository)
- Password encoding support (BCrypt / configurable)

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Maven
- MySQL / H2 (configurable)

---

## 🔐 Security Overview

- Uses **Spring Security**
- Custom implementation of `UserDetailsService`
- Authentication handled via `DaoAuthenticationProvider`
- Password encoding using `BCryptPasswordEncoder`
- User details loaded from database

---

## ⚙️ Configuration

### application.properties (example)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/security_db
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
---

If you want, I can also:
- Customize this README **exactly to your APIs**
- Add **JWT authentication section**
- Write a **professional project tagline**
- Optimize it for **recruiters / portfolio**

Just tell me 👍

