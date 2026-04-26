# 🚀 CC_Mini_Project – Task Manager

## 📌 Project Overview

This is a **Spring Boot-based Task Manager application** demonstrating **Docker containerization and cloud deployment**.

---

## 👥 Contributors

* Pranali Nikose
* Iqra Shaikh
* Sanika Pawar

---

## 🛠️ Technologies Used

* Java (Spring Boot)
* Docker
* Docker Hub
* GitHub
* Render

---

## 🐳 Docker Image

https://hub.docker.com/r/pranalinikose/task-manager

---

## ▶️ Run with Docker

```bash id="9t2d6x"
docker pull pranalinikose/task-manager
docker run -p 8080:8080 pranalinikose/task-manager
```

Open:
http://localhost:8080

---

## ☁️ Live Deployment

https://cc-mini-project-zie3.onrender.com

---

## 💻 Run Locally

```bash id="1m4j2q"
git clone https://github.com/prana0908/devops-mini-project.git
cd devops-mini-project/devops-app
./mvnw spring-boot:run
```

---

## 🔌 API Endpoints

| Method | Endpoint       | Description    |
| ------ | -------------- | -------------- |
| GET    | /tasks         | Get all tasks  |
| POST   | /tasks         | Add a new task |
| DELETE | /tasks/{index} | Delete task    |

---

## 🐳 Dockerfile

* Multi-stage build
* Maven build stage
* Java runtime stage

---

## 🎯 Features

* Add and delete tasks
* Simple UI
* Containerized application
* Cloud deployed
