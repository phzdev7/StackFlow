# 🛒 StackFlow Store

Sistema de gerenciamento de produtos e estoque desenvolvido em **Java**, com integração ao banco de dados **MySQL** utilizando JDBC.

O projeto tem como objetivo praticar programação orientada a objetos, operações com banco de dados e desenvolvimento de aplicações de gerenciamento em Java.

## 🚀 Tecnologias utilizadas

- **Java** — lógica e estrutura da aplicação.
- **MySQL** — armazenamento dos dados.
- **JDBC** — conexão e comunicação entre Java e MySQL.
- **Git e GitHub** — versionamento e publicação do código.
- **Eclipse IDE** — ambiente de desenvolvimento.

## ⚙️ Funcionalidades

- Cadastro de produtos.
- Consulta e listagem de produtos.
- Atualização de informações dos produtos.
- Exclusão de produtos.
- Gerenciamento de estoque.
- Operações com banco de dados utilizando SQL.

*O projeto está em desenvolvimento, e novas funcionalidades podem ser adicionadas ao longo do tempo.*

## 🗄️ Banco de dados

O projeto utiliza um banco de dados MySQL chamado `stockflow`.

A tabela `products` armazena informações dos produtos, como identificador, nome, preço e quantidade em estoque.

Antes de executar a aplicação, configure o banco de dados e as credenciais de acesso no seu ambiente local.

## 🔧 Como executar

1. Instale o Java, o MySQL e o Eclipse IDE.
2. Crie o banco de dados `stockflow` no MySQL.
3. Configure a tabela `products` com as colunas esperadas pelo código.
4. Configure as variáveis de ambiente para a conexão com o banco:

   - `DB_USER`: usuário do MySQL.
   - `DB_PASSWORD`: senha do MySQL.

5. Importe o projeto no Eclipse.
6. Confira se o driver JDBC do MySQL está disponível no projeto.
7. Execute a classe `main.Main`.

**Importante:** não coloque senhas reais diretamente no código-fonte nem publique suas credenciais no GitHub.

## 🎯 Objetivo do projeto

Consolidar conhecimentos em Java, JDBC, SQL, operações CRUD e integração com banco de dados, desenvolvendo uma aplicação prática de gerenciamento de produtos.

## 👨‍💻 Autor

Desenvolvido como projeto de estudo em programação Java.

---

*StackFlow Store — praticando Java, banco de dados e desenvolvimento de software.*
