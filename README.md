# 🏛️ dio-padroes-projeto-spring

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=spring-boot"/>
  <img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java"/>
  <img src="https://img.shields.io/badge/Maven-Build-orange?style=for-the-badge&logo=apache-maven"/>
  <img src="https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge&logo=h2"/>
  <img src="https://img.shields.io/badge/OpenAPI-3.0-yellow?style=for-the-badge&logo=openapiinitiative"/>
</p>

<div align="center">
  <b>🇧🇷 Português | <a href="#english-version">🇺🇸 English below</a></b>
</div>

---

## 📑 Sumário | Table of Contents
- [Sobre o Projeto | About](#sobre-o-projeto--about)
- [Funcionalidades | Features](#funcionalidades--features)
- [Tecnologias | Technologies](#tecnologias--technologies)
- [Estrutura | Structure](#estrutura--structure)
- [Configuração | Configuration](#configuração--configuration)
- [Instalação e Execução | Setup & Run](#instalação-e-execução--setup--run)
- [Rotas da API | API Routes](#rotas-da-api--api-routes)
- [Autor | Author](#autor--author)

---

## Sobre o Projeto | About

**PT-BR:**
> Projeto Spring Boot demonstrando o uso de padrões de projeto (Strategy, Facade, Singleton) na construção de uma API REST para cadastro de clientes, integrando banco de dados H2 e consulta de endereços via API ViaCEP.

**EN:**
> Spring Boot project demonstrating the use of design patterns (Strategy, Facade, Singleton) in building a REST API for customer registration, integrating H2 database and address lookup via ViaCEP API.

---

## 🛠️ Funcionalidades | Features

**PT-BR:**
- Cadastro, atualização, busca e remoção de clientes.
- Integração automática com ViaCEP para preenchimento de endereço pelo CEP.
- Persistência de dados em banco H2 em memória.
- API RESTful documentada com OpenAPI (Swagger UI).
- Padrões de projeto aplicados: Strategy, Facade, Singleton.

**EN:**
- Register, update, search and delete customers.
- Automatic integration with ViaCEP for address lookup by postal code (CEP).
- Data persistence using in-memory H2 database.
- RESTful API documented with OpenAPI (Swagger UI).
- Applied design patterns: Strategy, Facade, Singleton.

---

## 🚀 Tecnologias | Technologies

- Spring Boot 3.5.4
- Java 17
- Maven
- Spring Data JPA
- Spring Web
- Spring Cloud OpenFeign
- H2 Database
- OpenAPI (springdoc-openapi)

---

## 🗂️ Estrutura | Structure
```
dio-padroes-projeto-spring/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/dio/dio_padroes_projeto_spring/
│   │   │       ├── controller/
│   │   │       │   └── ClienteRestController.java
│   │   │       ├── model/
│   │   │       │   ├── Cliente.java
│   │   │       │   ├── Endereco.java
│   │   │       │   ├── ClienteRepository.java
│   │   │       │   └── EnderecoRepository.java
│   │   │       ├── service/
│   │   │       │   ├── ClienteService.java
│   │   │       │   ├── ViaCepService.java
│   │   │       │   └── Impl/
│   │   │       │       └── ClienteServiceImpl.java
│   │   │       └── DioPadroesProjetoSpringApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── br/com/dio/dio_padroes_projeto_spring/
│               └── DioPadroesProjetoSpringApplicationTests.java
├── pom.xml
└── README.md
```

---

## ⚙️ Configuração | Configuration

- O nome da aplicação pode ser ajustado em `src/main/resources/application.properties`:
  ```properties
  spring.application.name=dio-padroes-projeto-spring
  ```
- O banco H2 é configurado automaticamente pelo Spring Boot.
- A documentação da API estará disponível em `/swagger-ui.html` após iniciar a aplicação.

---

## 🏃 Instalação e Execução | Setup & Run

**PT-BR:**
1. **Pré-requisitos:** Java 17+ e Maven
2. **Clone o repositório:**
   ```bash
   git clone <url-do-repo>
   cd dio-padroes-projeto-spring
   ```
3. **Compile e execute:**
   ```bash
   ./mvnw spring-boot:run
   ```
   ou
   ```bash
   mvn spring-boot:run
   ```
4. **Acesse a documentação da API:**
   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

**EN:**
1. **Prerequisites:** Java 17+ and Maven
2. **Clone the repository:**
   ```bash
   git clone <repo-url>
   cd dio-padroes-projeto-spring
   ```
3. **Build and run:**
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   ```bash
   mvn spring-boot:run
   ```
4. **Access API documentation:**
   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🌐 Rotas da API | API Routes

| Método | Endpoint         | Descrição / Description                |
|--------|------------------|----------------------------------------|
| GET    | /clientes        | Lista todos os clientes / List all     |
| GET    | /clientes/{id}   | Busca cliente por ID / Get by ID       |
| POST   | /clientes        | Cria novo cliente / Create new         |
| PUT    | /clientes/{id}   | Atualiza cliente / Update by ID        |
| DELETE | /clientes/{id}   | Remove cliente / Delete by ID          |

---

## 👨‍💻 Autor | Author

**PT-BR:**

<div align="center">

**Rodolfo M. F. Abreu**  
Desenvolvedor de software apaixonado por tecnologia, aprendizado contínuo e boas práticas de programação. Sempre em busca de novos desafios e oportunidades para colaborar em projetos inovadores.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Sinta-se à vontade para entrar em contato para dúvidas, sugestões ou colaborações!

</div>

**EN:**

<div align="center">

**Rodolfo M. F. Abreu**  
Software developer passionate about technology, continuous learning, and best programming practices. Always looking for new challenges and opportunities to collaborate on innovative projects.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Feel free to get in touch for questions, suggestions, or collaborations!

</div>

---

<div align="center">
  <b>Feito com 💙 para estudos de Spring Boot, Java e padrões de projeto.<br/>
  Made with 💙 for Spring Boot, Java and design patterns studies.</b>
</div>

---

<div align="center" id="english-version">
  <b>🇺🇸 English version above | <a href="#top">🇧🇷 Versão em português acima</a></b>
</div>