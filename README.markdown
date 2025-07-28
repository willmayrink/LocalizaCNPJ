# LocalizaCNPJ 🇧🇷🔍

Welcome to **LocalizaCNPJ**, a slick Java GUI app that lets you query Brazilian CNPJ data with ease! Powered by the [BrasilAPI](https://brasilapi.com.br/docs), this app fetches key details like company name, opening date, address, and postal code in a snap. Perfect for developers, entrepreneurs, or anyone curious about Brazilian businesses! 😎


<img src="snapshot.jpg" style="align-items:center;justify-content:center;display:flex;">

## 🎯 Features
- **CNPJ Lookup**: Enter a valid CNPJ and get instant info! 📊
- **Data Display**: Shows company details like:
  - 📅 Opening date
  - 🏢 Legal name (razão social)
  - 📍 Full address
  - 📮 Postal code (CEP)
- **Sleek UI**: Built with FlatLaf for a modern, polished look. ✨
- **Real-Time Queries**: Fetches live data from BrasilAPI. 🌐
- **Error Handling**: Graceful handling of invalid inputs or API errors. 🛡️

## 🛠️ Tech Stack
- **Java**: JDK 24 ☕
- **Build Tool**: Maven 3.9.11 🛠️
- **HTTP Client**: Apache HttpClient 5.5 📡
- **JSON Parsing**: Jackson Databind 2.15.2 🧩
- **Logging**: SLF4J Simple 2.0.9 📜
- **UI Theme**: FlatLaf 3.6.1 🎨
- **API**: [BrasilAPI](https://brasilapi.com.br/docs) 🚀

## 🚀 Getting Started

### Prerequisites
- **JDK 24**: Make sure you have Java 24 installed. [Download here](https://www.oracle.com/java/technologies/downloads/#jdk24). ☕
- **Maven 3.9.11**: Get Maven to build the project. [Install guide](https://maven.apache.org/install.html). 🛠️
- **Internet**: Required to connect to BrasilAPI. 🌐

### Installation
1. Clone the repo:
   ```bash
   git clone https://github.com/willmayrink/LocalizaCNPJ.git
   ```
2. Navigate to the project folder:
   ```bash
   cd LocalizaCNPJ
   ```
3. Build the project with Maven:
   ```bash
   mvn clean install
   ```
4. Run the app:
   ```bash
   mvn exec:java
   ```
   Or, use the generated executable JAR:
   ```bash
   java -jar target/LocalizaCNPJ-1.0.jar
   ```

### Usage
1. Fire up the app. 🔥
2. Enter a valid CNPJ (e.g., `12345678000195`) in the input field. ✍️
3. Hit the query button to fetch data from BrasilAPI. 🚀
4. Check out the results: company name, opening date, address, and CEP displayed in the GUI. 🎉

## 📚 Dependencies
All dependencies are managed in the `pom.xml`. Key libraries include:
- **Apache HttpClient 5.5**: For making HTTP requests to BrasilAPI.
- **Jackson Databind 2.15.2**: For parsing JSON responses.
- **SLF4J Simple 2.0.9**: For lightweight logging.
- **FlatLaf 3.6.1**: For a modern, flat UI theme.

See the full `pom.xml` in the repo for details. 📄

## 🛠️ Build Details
The project uses the Maven Shade Plugin to create an executable JAR with all dependencies included. The main class is `com.rjoliveira.localizacnpj.view.Main`. Run `mvn package` to generate the JAR in the `target/` directory. 🏗️

## 🌐 API Reference
This app queries the BrasilAPI endpoint `/api/cnpj/v1/{cnpj}` to fetch CNPJ data. Check out the [BrasilAPI docs](https://brasilapi.com.br/docs) for more details. 📡

## 🤝 Contributing
Want to make this app even cooler? Contributions are welcome! 🎉
1. Fork the repo: [https://github.com/willmayrink/LocalizaCNPJ](https://github.com/willmayrink/LocalizaCNPJ)
2. Create a feature branch:
   ```bash
   git checkout -b feature/awesome-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add awesome feature"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/awesome-feature
   ```
5. Open a pull request and let’s make it happen! 🚀

## 📜 License
This project is licensed under the MIT License. See the `LICENSE` file in the repo for details. 🗳️

## 🙌 Acknowledgments
- [BrasilAPI](https://brasilapi.com.br/) for providing free, open CNPJ data. 🙏
- [FlatLaf](https://www.formdev.com/flatlaf/) for the sleek UI theme. 🎨
- All contributors who make this project shine! 🌟

## 📬 Contact
Got questions or ideas? Open an issue on [GitHub](https://github.com/willmayrink/LocalizaCNPJ/issues) or ping me there! 📩

Happy coding! 💻