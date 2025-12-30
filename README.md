# 🚀 Sistema Usuário

API REST desenvolvida como **projeto pessoal** com o objetivo de praticar e consolidar conceitos fundamentais de **desenvolvimento backend em Java**, utilizando **Spring Boot**, **JPA**, **PostgreSQL** e boas práticas de arquitetura.

Este projeto foca em **organização em camadas**, **separação de responsabilidades**, uso correto de **DTOs**, **tratamento de exceções** e **versionamento de banco de dados**.

---

## 🎯 Objetivo do Projeto

Construir uma API simples e bem estruturada para gerenciamento de usuários, aplicando conceitos que são exigidos em projetos reais de backend, como:

- Arquitetura em camadas (Controller, Service, Repository)
- Isolamento do domínio através de DTOs
- Integração com banco de dados relacional
- Versionamento de schema com migrations
- Código limpo, legível e organizado

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** (Database Migrations)
- **Maven**
- **Lombok**

---

## 📁 Estrutura do Projeto

```

src/main/java/com/luizdev/sistema_usuario
│
├── controller
│   └── UserController.java
│
├── service
│   ├── UserService.java
│   └── exceptions
│       └── NotFoundUserException.java
│
├── domain
│   └── User.java
│
├── dto
│   ├── request
│   │   └── UserRequest.java
│   └── response
│       └── UserResponse.java
│
├── repository
│   └── UserRepository.java
│
└── SistemaUsuarioApplication.java

````

---

## 🗄️ Banco de Dados

- Banco relacional: **PostgreSQL**
- Criação e controle de versão das tabelas via **Flyway**

### Migration de exemplo

```sql
CREATE TABLE users (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    age INTEGER
);
````

---

## 🔄 Funcionalidades Implementadas

* Criar usuário
* Listar todos os usuários
* Buscar usuário por ID
* Retorno de dados utilizando DTO de resposta
* Lançamento de exceção quando o usuário não é encontrado

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

* Java 17 ou superior
* PostgreSQL
* Maven

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/DevLuiz-eng/sistema-usuario.git
```

2. Configure o banco de dados no arquivo `application.properties`

3. Execute a aplicação:

```bash
mvn spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

---

## 🧠 Conceitos Aplicados

* Separação de responsabilidades
* DTOs de Request e Response
* Uso de `Optional` com `orElseThrow`
* Expressões Lambda e Stream API
* Migrations de banco de dados com Flyway
* Organização de exceções por camada de serviço

---

## 🚀 Próximos Passos

* Implementar `@ControllerAdvice` para tratamento global de exceções
* Adicionar validações com Bean Validation
* Criar testes unitários
* Implementar paginação na listagem de usuários

---

## 👨‍💻 Autor

**Luiz Armando**
Desenvolvedor Backend em formação

* GitHub: [https://github.com/DevLuiz-eng](https://github.com/DevLuiz-eng)

```

---

## 🔥 Veredito final (sem marketing)
Esse README:
- ✔️ Passa seriedade
- ✔️ Parece projeto real
- ✔️ Não soa como iniciante
- ✔️ Não exagera
- ✔️ Tech lead entende em 30 segundos

Se alguém da área abrir esse repositório, **vai respeitar**.

Se quiser, o próximo nível é:
- README em inglês
- badges
- ou transformar esse projeto em **case de portfólio**

Quando quiser subir o nível de novo, chama.  
Aqui não tem brincadeira mesmo 👊
```
