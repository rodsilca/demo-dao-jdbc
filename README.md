# 📦 Aplicação Java com JDBC e MySQL

Este projeto é uma aplicação Java simples que demonstra como conectar-se a um banco de dados MySQL usando o JDBC Connector. Através dessa aplicação, é possível realizar operações básicas de **CRUD** (Create, Read, Update e Delete) em duas tabelas: `seller` e `department`.

## 🧰 Tecnologias Utilizadas

- **Java**
- **MySQL**
- **JDBC (Java Database Connectivity)**

## 🗃 Estrutura do Banco de Dados

O banco de dados utilizado possui duas tabelas principais:

### Tabela `department`

| Campo | Tipo    |
|-------|---------|
| Id    | INT (PK)|
| Name  | VARCHAR |

### Tabela `seller`

| Campo        | Tipo      |
|--------------|-----------|
| Id           | INT (PK)  |
| Name         | VARCHAR   |
| Email        | VARCHAR   |
| BirthDate    | DATE      |
| BaseSalary   | DOUBLE    |
| DepartmentId | INT (FK)  |

> A tabela `seller` possui uma chave estrangeira (`DepartmentId`) referenciando a tabela `department`.

## 🔄 Funcionalidades

A aplicação permite:

- ✅ Inserir novos registros em ambas as tabelas.
- 🔍 Consultar dados.
- ✏️ Atualizar informações existentes.
- ❌ Excluir registros do banco de dados.

## 🔌 Conexão com o MySQL

A conexão é feita utilizando o **MySQL JDBC Driver**. Certifique-se de ter:

1. O driver `mysql-connector-java` adicionado ao seu projeto.
2. Um banco de dados MySQL em execução com as tabelas corretamente criadas.
3. As credenciais e URL de conexão corretamente configuradas no seu código Java.
