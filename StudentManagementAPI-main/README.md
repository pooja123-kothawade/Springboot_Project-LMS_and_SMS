# 🎓 Student Management API - Spring Boot Project

This project is a RESTful API for managing student records built using Spring Boot. It allows for full CRUD operations (Create, Read, Update, Delete) on student data and is integrated with a relational database like MySQL or H2. All endpoints are tested using Postman.

---

## 📁 Project Structure

```
src/
├── controller/
│   └── StudentController.java
├── model/
│   └── Student.java
├── repository/
│   └── StudentRepository.java
├── service/
│   └── StudentService.java
└── StudentManagementApiApplication.java
```

---

## 💡 Features

* Add new student records
* Retrieve all students or by ID
* Update existing student information
* Delete students from the database
* RESTful APIs using Spring Boot
* Integration with MySQL or H2
* Postman-tested endpoints

---

## 💻 Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL / H2 Database
* Postman for API testing

---

## 🔌 Base Path

```
/api/students
```

---

## 🔌 API Endpoints

| Method | Endpoint     | Description          |
| ------ | ------------ | -------------------- |
| POST   | /add         | Add a new student    |
| GET    | /get         | Get all students     |
| GET    | /get/{id}    | Get student by ID    |
| PUT    | /insert/{id} | Update student by ID |
| DELETE | /delete/{id} | Delete student by ID |

---

## 📦 Database Configuration

### Option 1: MySQL (in `application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Option 2: H2 In-Memory DB

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📬 Sample JSON for POST/PUT

```json
{
  "name": "shreyas Khandare",
  "email": "shreyas@gmail.com",
  "course": "cloud computing"
}
```

---

## 🧪 Postman Testing

Screenshots below show sample responses from Postman:

| Action                | Screenshot |
| --------------------- | ---------- |
| POST /students (Add)  | POST       |
| GET /students         | GET        |
| PUT /students/{id}    | PUT        |
| DELETE /students/{id} | DELETE     |

---

## 🚀 How to Run

### Clone this repository:

```bash
git clone https://github.com/your-username/student-management-api.git
```

### Navigate to the project folder and run:

```bash
mvn spring-boot:run
```

### Use Postman to test the APIs locally at:

```
http://localhost:8080/api/students
```

---

| **Action**                                             | **Screenshot**                                                                             |
| ------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `POST /students/add` <br> *(Add Student)*              | ![POST](https://github.com/user-attachments/assets/20cc18bd-ce34-4d21-8b18-433448af5c23)   |
| `GET /students/get` <br> *(Get All Students)*          | ![GET](https://github.com/user-attachments/assets/70d2be26-cabf-4d23-9b33-ad360c2469d6)    |
| `GET /students/get/{id}` <br> *(Get Student By ID)*    | ![GET](https://github.com/user-attachments/assets/ca84141f-352f-4dad-a0dc-1c08768d479a)    |
| `PUT /students/insert/{id}` <br> *(Update Student)*    | ![PUT](https://github.com/user-attachments/assets/b2e732b3-5c02-4727-8bf6-e8861e3acf3a)    |
| `DELETE /students/delete/{id}` <br> *(Delete Student)* | ![DELETE](https://github.com/user-attachments/assets/50369ca0-f8b5-4891-b3c1-ad3b8fc3b334) |


## 📄 License

This project is intended for learning and educational purposes only.
No commercial use is permitted.
