# Projeto Java Spring

Este é um projeto de exemplo em Java Spring com o objetivo de aprender a utilizar o framework springboot. Ele apresenta uma aplicação simples com CRUD (Create, Read, Update, Delete) utilizando o banco de dados H2.

## Pré-requisitos

Antes de executar o projeto, você precisará ter as seguintes ferramentas instaladas em sua máquina:

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)

## Tecnologias utilizadas
- Java
- SpringBoot
- Maven
- Database H2

## Instalação e Execução

1. Clone o repositório:

```
git clone https://github.com/ccaioadriano/java-spring.git
```

2. Entre na pasta do projeto:

```
cd java-spring
```

3. Instale as dependências do projeto:

```
mvn clean install
```

4. Execute a aplicação:

```
mvn spring-boot:run
```

5. Abra o navegador e acesse a aplicação em:

```
http://localhost:8080
```

## Endpoints

A aplicação é uma API REST que disponibiliza os seguintes endpoints:

- **GET /api/books**: Retorna todos os livros cadastrados no banco de dados.

- **GET /api/books/{id}**: Retorna um livro com o ID correspondente.

- **POST /api/books**: Adiciona um novo livro ao banco de dados.

- **PUT /api/books/{id}**: Atualiza um livro com o ID correspondente.

- **DELETE /api/books/{id}**: Remove um livro com o ID correspondente.

Os dados da aplicação são salvos em um banco de dados H2 que é criado automaticamente ao executar a aplicação.

## Contribuição
Se você quiser contribuir com este projeto, siga os seguintes passos:

1. Faça um fork deste repositório.
2. Crie uma branch com a sua feature: `git checkout -b minha-feature`
3. Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`
4. Envie a sua branch: `git push origin minha-feature`
5. Faça um pull request.
