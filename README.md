# ✨ API REST com Spring Boot, Lambda e Swagger ✨

Este projeto é uma API REST simples de **gerenciamento de clientes**, desenvolvida com **Spring Boot**. Ele utiliza **funções lambda** para manipulação de dados e **Swagger** para documentação da API.

## 🛠️ Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- Banco de Dados H2 (em memória)
- Swagger (Springdoc OpenAPI)
- Maven

---

## 🛠️ Configuração do Projeto
### 1. Clonar o Repositório
```sh
git clone https://github.com/lazaaro01/Lambda.git
cd spring-boot-lambda-api
```

### 2. Configurar o Banco de Dados
O projeto já está configurado para usar o **banco H2** em memória. Nenhuma instalação extra é necessária. Caso queira mudar para outro banco (PostgreSQL, MySQL), basta editar o arquivo `application.properties`.

### 3. Rodar a API
Se estiver usando **Maven**, execute:
```sh
mvn spring-boot:run
```
Se estiver usando **Gradle**, execute:
```sh
gradle bootRun
```

A API será iniciada em `http://localhost:8080`.

---

## 🌎 Documentação com Swagger
Após iniciar a API, acesse a documentação interativa pelo Swagger:

🔗 **[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)**

Aqui você pode testar todos os endpoints diretamente pelo navegador!

---

## 🔄 Endpoints da API
### 1. Criar Cliente
- **POST** `/clientes`
- **Body JSON:**
  ```json
  {
    "nome": "Carlos Silva",
    "email": "carlos@email.com",
    "idade": 30
  }
  ```

### 2. Listar Clientes
- **GET** `/clientes`

### 3. Filtrar Clientes por Idade Mínima
- **GET** `/clientes/idade-minima/{idade}`
    - **Exemplo:** `/clientes/idade-minima/25`

---

## 🔧 Estrutura do Projeto
```
src/
├── main/
│   ├── java/com/exemplo/lambda/
│   │   ├── controller/   # Controllers da API
│   │   ├── dto/          # DTOs para transferência de dados
│   │   ├── model/        # Entidades do banco de dados
│   │   ├── repository/   # Interfaces do Spring Data JPA
│   │   ├── service/      # Regras de negócio e funções lambda
│   ├── resources/
│   │   ├── application.properties  # Configurações do projeto
├── pom.xml  # Dependências do Maven
└── README.md  # Documentação do projeto
```

---

## ✨ Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma **issue** ou enviar um **pull request**.

Se gostou do projeto, dê uma ★ no repositório!

💪 Bora codar juntos! 🚀

