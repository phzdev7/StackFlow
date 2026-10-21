# 🛒 StackFlow Store

Sistema de gerenciamento de produtos, estoque e compras desenvolvido em **Java**, com integração ao **MySQL utilizando JDBC**.

> 🔐 **ACESSO À ÁREA DO GERENTE**
>
> **Senha de demonstração:** `300309`
>
> Utilize essa senha para acessar a área administrativa durante a execução local do sistema.

O StackFlow Store é uma aplicação de terminal que simula o funcionamento de uma loja, permitindo consultar produtos, organizar compras e gerenciar o catálogo por meio de uma área administrativa.

## 🖥️ Interface e funcionamento

O sistema utiliza menus interativos no terminal Java, permitindo que o usuário escolha as operações disponíveis.

### 🛍️ Área do cliente

Área destinada à consulta de produtos e à realização de compras.

- **Consulta de produtos:** pesquisa e visualização dos produtos cadastrados.
- **Carrinho de compras:** adição e remoção de itens.
- **Conferência da compra:** consulta dos produtos selecionados e de seus valores.
- **Finalização da compra:** conclusão do fluxo de compra, conforme as funcionalidades implementadas.

### 🔐 Área do gerente

Área administrativa protegida por senha, destinada ao gerenciamento dos produtos e do estoque.

- **Cadastro de produtos:** inclusão de novos itens no catálogo.
- **Consulta de produtos:** pesquisa e listagem dos registros.
- **Atualização de produtos:** alteração das informações cadastradas.
- **Exclusão de produtos:** remoção de itens do catálogo.
- **Controle de estoque:** gerenciamento das quantidades disponíveis.

## ⚙️ Tecnologias utilizadas

- **Java:** lógica da aplicação e programação orientada a objetos.
- **MySQL:** armazenamento persistente dos dados.
- **JDBC:** conexão entre a aplicação Java e o banco de dados.
- **SQL:** consultas e operações sobre os registros.
- **Git e GitHub:** versionamento e hospedagem do código-fonte.
- **Eclipse IDE:** ambiente de desenvolvimento.

## 🗄️ Banco de dados

O projeto utiliza um banco de dados MySQL chamado `stockflow`.

A tabela `products` armazena os dados dos produtos.

| Campo | Tipo | Descrição |
|---|---|---|
| `id` | INT | Identificador único do produto |
| `nome` | VARCHAR(100) | Nome do produto |
| `preco` | DECIMAL(10,2) | Preço do produto |
| `estoque` | INT | Quantidade disponível |

A comunicação com o banco de dados é realizada por JDBC, permitindo executar consultas e operações de cadastro, atualização e exclusão.

## 🧱 Estrutura do projeto

```text
StackFlow_Store/
├── src/
│   ├── entities/
│   │   ├── DBConnection.java
│   │   └── Product.java
│   └── main/
│       └── Main.java
├── .gitignore
└── README.md
```

- **`Main.java`:** contém o menu principal e o fluxo de interação com o usuário.
- **`Product.java`:** representa os produtos manipulados pela aplicação.
- **`DBConnection.java`:** centraliza a conexão com o banco de dados MySQL.

## 🚀 Como executar

### Pré-requisitos

- JDK instalado.
- MySQL Server instalado e configurado.
- Eclipse IDE.
- Driver JDBC do MySQL.

### 1. Criar o banco de dados

Execute no MySQL:

```sql
CREATE DATABASE stockflow;
```

### 2. Criar a tabela de produtos

```sql
USE stockflow;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL
);
```

### 3. Configurar a conexão

Configure as seguintes variáveis de ambiente no seu ambiente local:

- `DB_USER`: usuário do MySQL.
- `DB_PASSWORD`: senha do MySQL.

Confira também se o driver JDBC está disponível no projeto.

### 4. Executar a aplicação

1. Importe o projeto no Eclipse.
2. Verifique a configuração da conexão com o banco de dados.
3. Abra a classe `main.Main`.
4. Execute o método `main`.

## 🎯 Objetivos de aprendizagem

O desenvolvimento do StackFlow Store tem como objetivo consolidar conhecimentos em:

- Programação Orientada a Objetos (POO).
- Classes, objetos e encapsulamento.
- Operações CRUD com Java e MySQL.
- Consultas SQL e utilização de JDBC.
- Manipulação de coleções em Java.
- Tratamento de exceções.
- Versionamento de código com Git e GitHub.

## 📌 Status do projeto

**Em desenvolvimento.**

O sistema está sendo desenvolvido de forma incremental, com foco na evolução das funcionalidades de compra, carrinho, gerenciamento de produtos e controle de estoque.

## 👨‍💻 Autor

Desenvolvido como projeto de estudo em Java.

---

**StackFlow Store** — Java • JDBC • MySQL • SQL
