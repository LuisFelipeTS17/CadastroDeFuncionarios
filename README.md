# Cadastro de Funcionários

Aplicação Spring Boot para cadastro e gerenciamento de funcionários.

> **Status:** projeto recém-inicializado. A estrutura base do Spring Boot está pronta
> (aplicação, build e teste de contexto), mas as entidades, repositórios, serviços e
> endpoints do domínio ainda serão implementados.

## Tecnologias

| Item | Versão |
|------|--------|
| Java | 17 |
| Spring Boot | 4.1.1 |
| Maven | via Maven Wrapper (`mvnw`) |

Dependências atuais:

- `spring-boot-starter-webmvc` — API REST / MVC
- `spring-boot-starter-webmvc-test` — testes (escopo `test`)

## Pré-requisitos

- JDK 17 ou superior instalado e `JAVA_HOME` configurado
- Não é necessário instalar o Maven: o projeto inclui o Maven Wrapper

## Como executar

**Windows (PowerShell / CMD):**

```bat
mvnw.cmd spring-boot:run
```

**Linux / macOS:**

```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

## Build

Gerar o `.jar` executável:

```bash
./mvnw clean package
```

O artefato é criado em `target/CadastroDeFuncionarios-0.0.1-SNAPSHOT.jar` e pode ser executado com:

```bash
java -jar target/CadastroDeFuncionarios-0.0.1-SNAPSHOT.jar
```

## Testes

```bash
./mvnw test
```

## Estrutura do projeto

```
CadastroDeFuncionarios/
├── pom.xml
├── mvnw / mvnw.cmd              # Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/com/senacsp/CadastroDeFuncionarios/
│   │   │   └── CadastroDeFuncionariosApplication.java   # classe principal
│   │   └── resources/
│   │       └── application.properties                   # configurações
│   └── test/
│       └── java/com/senacsp/CadastroDeFuncionarios/
│           └── CadastroDeFuncionariosApplicationTests.java
└── README.md
```

## Configuração

As configurações ficam em `src/main/resources/application.properties`:

```properties
spring.application.name=CadastroDeFuncionarios
```

Para alterar a porta do servidor, adicione:

```properties
server.port=8081
```

## Próximos passos

- [ ] Criar a entidade `Funcionario` (nome, cargo, salário, data de admissão, etc.)
- [ ] Adicionar persistência (Spring Data JPA + banco de dados)
- [ ] Implementar repositório e camada de serviço
- [ ] Expor os endpoints REST de CRUD
- [ ] Adicionar validação dos dados de entrada
- [ ] Escrever os testes de integração dos endpoints
