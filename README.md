# 🚀 Simple HTTP Server in Java

This project is a minimal HTTP server built **entirely in plain Java** using low-level `ServerSocket` and `Socket` APIs. It listens on **port 8080** and responds to HTTP requests with the **current date and time**.

> 🔧 No frameworks. No libraries. Just core Java and a clear understanding of how HTTP works at the socket level.

---

## 📌 Features

- Listens for client connections on `localhost:8080`
- Accepts socket connections and reads raw HTTP requests
- Sends a valid `HTTP/1.1 200 OK` response
- Displays the current server date/time in the response body
- Minimal, readable, and beginner-friendly code

---

## 🧠 What I Learned

- How `ServerSocket` and `Socket` work in Java
- Basics of the HTTP protocol (request/response format)
- How to send data back to the client using output streams
- How browsers and tools like `curl` communicate with servers

---

## 📂 Project Structure

simple-http-server-java/
├── src/
│ └── tcp_server_creation/
│ └── Simplehttpserver.java
└── README.md

yaml
Copy
Edit

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/simple-http-server-java.git
cd simple-http-server-java
2. Compile and Run
bash
Copy
Edit
javac src/tcp_server_creation/Simplehttpserver.java
java -cp src tcp_server_creation.Simplehttpserver
You’ll see:

csharp
Copy
Edit
port is listening 8080
🌐 Test in Browser or Curl
Open a browser and go to:
http://localhost:8080

Or use curl:

bash
Copy
Edit
curl http://localhost:8080
✅ Output Example:
yaml
Copy
Edit
HTTP/1.1 200 OK

Tue Aug 05 22:15:00 IST 2025
