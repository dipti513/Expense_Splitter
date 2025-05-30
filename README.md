# ExpenseSplitter 💸

**ExpenseSplitter** is a full-stack web application designed to simplify group expense tracking and splitting. Whether you're traveling with friends or managing shared bills, this app ensures everyone pays their fair share — with style and dark mode included!

## 🌟 Features

- Create and manage groups for shared expenses
- Add multiple members with email and phone
- Record and itemize expenses for the group
- Split expenses equally or by percentage
- Fully responsive and user-friendly interface
- Toggle between light and dark mode 🌙
- Data stored locally (for demo; extendable to back-end)
- Backend built with Spring Boot and Maven
- Frontend powered by HTML, CSS, and JavaScript

## 🖼️ Dark Mode Preview

The app supports dark mode across both the login interface and the main dashboard. Dark mode settings are saved using `localStorage`.

## ⚙️ Technologies Used

### Frontend
- HTML5, CSS3, JavaScript (Vanilla)
- Responsive Design
- Dark Mode Styling

### Backend
- Java 17
- Spring Boot (Web, Security, JPA, Mail)
- MySQL (via Connector/J)
- JWT (for authentication)
- Lombok

### Build Tools
- Maven (via `pom.xml`)

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL (or switch to H2 for quick testing)

### Running the App (Backend)

```bash
# Clone the repository
git clone https://dipti513/expense-splitter.git
cd expense-splitter

# Build the app
./mvnw clean install

# Run it
./mvnw spring-boot:run

