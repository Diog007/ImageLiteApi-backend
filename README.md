# Sobre o projeto 

# 🖼️ Image-Lite-api


A Image Lite API é uma API desenvolvida em Java, utilizando Spring Boot para o backend e React para o frontend. Seu propósito central é o gerenciamento de imagens. Através dessa aplicação, é possível realizar diversas operações, como postar imagens, pesquisar imagens por nome e tag. Além disso, inclui funcionalidades de login, permitindo aos usuários tanto efetuar login quanto se cadastrar.

# 📂 Repositórios do Projeto
## Backend
- [Repositório - backend:](https://github.com/Diog007/ImageLiteApi-backend#/)
## Frontend
- [Repositório - FrontEnd:](https://github.com/Diog007/ImageLite-FrontEnd#/#/)



## 🚀 Deploy 
A api foi implantada na AWS para facilitar o teste. Você pode acessar a aplicação através deste
[Deploy for application](http://ec2-3-129-57-99.us-east-2.compute.amazonaws.com:3000/login#/).

Aqui estão as credenciais padrão para obter o Token JWT :


      "login": "test@test.com",
      "senha": "123456789"



## 🛠️ Compilação
Para gerar os arquivos-fonte, siga o padrão de um projeto Maven: `mvn clean install`.

Aqui estão alguns links úteis para a aplicação local:
- SignUp: http://localhost:8080/v1/users
- Login: http://localhost:8080/v1/users/auth
- Imagens: http://localhost:8080/v1/images
---

## 🧰 Tecnologias utilizadas
Aqui estão algumas das principais tecnologias utilizadas no desenvolvimento do Clinic Med:
| Tecnologia | Versão |
| --- | --- |
| Java | 17 |
| Spring Boot | 3.2.3 |
| Spring Security | 3.1.0 |
| JPA | 3.1.0 |
| Maven | 3.9.6 |
| Lombok | 3.1.0 | |
| jjwt | 0.12.5 |
| PostgreSQL | 16.3 |

## 🎯 Funcionalidades
O Image Lite api oferece uma variedade de funcionalidades, incluindo:
- Postar Imagem: Endpoint para salvar uma imagem no banco de dados.
- Buscar Imagem: Endpoint para buscar uma imagem pelo ID.
- Pesquisar Imagem por Nome, tags e tipo: Endpoint para pesquisar imagens.
- Criar Usuário: Endpoint para cadastrar um novo usuário na aplicação.
- Autenticar Usuário: Endpoint para autenticar um usuário e gerar um token de acesso.
---

## Docker compose especificações

Nesta stack, são utilizadas as seguintes imagens Docker:

1. **Postgres**:
   - **Imagem**: postgres
   - **Versão**: 16.3
   - **Configuração**:
     ```
     POSTGRES_USER: postgres
     POSTGRES_PASSWORD: postgres
     POSTGRES_DB: imagelite
     ```
   - **Portas Expostas**: `5432:5432`
   - **Volumes**: `./imageapi/data:/var/lib/postgresql/data`

2. **PgAdmin**:
   - **Imagem**: dpage/pgadmin4
   - **Versão**: Última versão disponível
   - **Descrição**: Interface web do PostgreSQL.
   - **Configuração**:
     ```
     PGADMIN_DEFAULT_PASSWORD: admin
     PGADMIN_DEFAULT_EMAIL: admin@admin.com
     ```
   - **Portas Expostas**: `15432:80`
   - **Dependências**: `db`

3. **Spring Boot API**:
   - **Dockerfile**: Localizado em `./imageapi`
   - **Descrição**: API desenvolvida com Spring Boot.
   - **Portas Expostas**: `8080:8080`
   - **Dependências**: `db`
   - **Variável de Ambiente**:
     ```
     POSTGRES_HOST: db
     ```

4. **Front-end da Aplicação**:
   - **Dockerfile**: Localizado em `./imagelite`
   - **Descrição**: Front-end da aplicação.
   - **Portas Expostas**: `3000:3000`
   - **Dependências**: `sbootapi`


## 📚 Como rodar o Projeto
Existem duas maneiras principais de começar com o Image Lite api:
1. [Baixe o ZIP do projeto](https://github.com/Diog007/imageapi-backend/archive/refs/heads/main.zip) e abra-o em uma IDE de sua escolha.
2. Clone o repositório usando o seguinte comando: `https://github.com/Diog007/imageapi-backend.git`.
3. [Baixe o ZIP do front end](https://github.com/Diog007/ImageLite-Front/archive/refs/heads/main.zip) e abra-o em uma IDE de sua escolha.
#### Depois de obter os código-fontes, siga os passos abaixo:
- Copie as duas aplicações para uma pasta e mova ou copie o arquivo docker-compose.yml.
- Abra o terminal na pasta onde estão os projetos.
- Execute o comando docker-compose up.
- O backend estará disponível no URL http://localhost:8080 
- O frontend estará disponível no URL http://localhost:3000
---
