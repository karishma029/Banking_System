
 🏦 Banking System
 A Console-Based Banking Application built with Java
 
 📖 About the Project

**Banking System** is a Java console application that demonstrates how a real banking system manages customers, accounts, and financial transactions.

The application follows a **layered architecture** by separating models, business logic, repositories, and utility classes, making the code clean, modular, and easy to maintain.

This project was developed to strengthen practical knowledge of:

- Core Java
- Object-Oriented Programming
- Layered Architecture
- Clean Code Practices
- Git & GitHub

---

 ✨ Key Features

- 👤 Customer Registration
- 🏦 Bank Account Creation
- 💵 Deposit Money
- 💸 Withdraw Money
- 🔄 Money Transfer
- 💰 Balance Enquiry
- 📑 Transaction History
- 🆔 Automatic Transaction ID Generation
- 📄 Automatic UTR ID Generation
- 📅 Date & Time Tracking
- ✅ Transaction Status
- ✔ Input Validation

---

 🛠 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java | Core Programming |
| Maven | Project Management |
| IntelliJ IDEA | Development IDE |
| Git | Version Control |
| GitHub | Source Code Hosting |

---

 🏗 Project Architecture

```
BankingSystem
│
├── src
│
├── model
│     ├── Customer.java
│     ├── Account.java
│     └── Transaction.java
│
├── repository
│     └── BankRepository.java
│
├── service
│     ├── BankService.java
│     ├── TransferService.java
│     └── UTRGenerator.java
│
├── util
│     ├── Constants.java
│     ├── Validation.java
│     └── DateTimeUtil.java
│
└── App.java
```

---

 🔄 Application Workflow

```
Customer
      │
      ▼
Create Account
      │
      ▼
Deposit / Withdraw
      │
      ▼
Transfer Money
      │
      ▼
Generate Transaction ID
Generate UTR ID
Generate Date & Time
      │
      ▼
Save Transaction
      │
      ▼
Display Transaction Details
```

---

 💳 Banking Operations

### Customer

- Register Customer
- Store Customer Details

### Account

- Create Account
- View Account Information
- Check Balance

### Transactions

- Deposit Money
- Withdraw Money
- Transfer Money
- Generate Transaction ID
- Generate UTR Number
- Record Transaction Time
- Maintain Transaction Status

---

📌 Object-Oriented Programming Concepts Used

- Classes & Objects
- Constructors
- Encapsulation
- Method Calling
- Packages
- Layered Architecture
- Object Composition
- Collections
- UUID Generation
- Date & Time API

---

 📷 Sample Output

```
===================================================

            TRANSACTION SUCCESSFUL

---------------------------------------------------

Transaction ID : TXN7B91A2D4E8
UTR ID         : UTR91AB23CD45EF
Sender         : ACC1001
Receiver       : ACC1002

Transferred Amount : ₹5,000.00

Status         : SUCCESS

Date & Time    : 03-Jul-2026 11:45:10

===================================================
```

---

 🚀 Getting Started

## Clone Repository

```bash
git clone https://github.com/karishma029/BankingSystem.git
```

## Navigate to Project

```bash
cd BankingSystem
```

## Build Project

```bash
mvn clean install
```

## Run Application

Run the **App.java** file using IntelliJ IDEA.

---

 📚 What I Learned

During this project I gained practical experience in:

- Java Programming
- Object-Oriented Programming
- Package Organization
- Business Logic Implementation
- Layered Architecture
- Transaction Management
- Git & GitHub Workflow
- Maven Project Structure
- Clean Coding Practices

---

 🚀 Future Improvements

- Database Integration (MySQL)
- JDBC
- Spring Boot REST API
- User Authentication
- Login & Registration
- Mini Statement
- Transaction Search
- Exception Logging
- JUnit Testing
- RESTful Banking APIs

---

 👩‍💻 Author

**Karishma Shaik**

📧 Email: **karishmaashaik12@gmail.com**

🐙 GitHub: **https://github.com/karishma029**

💼 LinkedIn: linkedin.com/in/karishma-shaik-123469390


### ⭐ If you like this project, don't forget to give it a Star!

**Thank you for visiting my repository ❤️**

