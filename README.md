# 📸 IFgram - API RESTful

<p align="center"\>
<strong\>Uma API RESTful simulando o "Instagram do IF", desenvolvida como projeto acadêmico de modelagem de APIs com Java e Spring Boot.</strong\>
</p\>

<p align="center">
<img src="https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot">
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
<img src="https://img.shields.io/badge/Status-Completo-green?style=for-the-badge" alt="Status: Completo.">
</p>

-----

## 📖 Sobre o Projeto

O **IFgram** é um projeto acadêmico desenvolvido no **IFSP - Câmpus Bragança Paulista** para a disciplina de Desenvolvimento Web Back-end Modelagem de API REST.pdf]. O objetivo principal é aplicar os conceitos de arquitetura RESTful através da construção de uma API para gerenciar postagens Modelagem de API REST.pdf]. O sistema adota uma abordagem moderna utilizando **Java** e o ecossistema **Spring Boot**, focando na correta utilização dos verbos HTTP, códigos de status e representação de recursos em JSON.

-----

## ✨ Funcionalidades

O sistema foi projetado para expor as operações fundamentais (CRUD) do recurso principal: a **Postagem**.

### Endpoints da API:

  - 🖼️ **Listagem Dinâmica:** Endpoint `GET /postagens` para retornar todas as postagens cadastradas no sistema.
  - 📝 **Criação de Conteúdo:** Endpoint `POST /postagens` que recebe título e conteúdo, gerando automaticamente o ID e a data de criação.
  - 🔍 **Busca Específica:** Endpoint `GET /postagens/{id}` para detalhar uma postagem única, retornando `404 Not Found` caso não exista.
  - 🔄 **Atualização:** Endpoint `PUT /postagens/{id}` para modificar os dados de uma publicação existente.
  - 🗑️ **Exclusão:** Endpoint `DELETE /postagens/{id}` para remover publicações da base de dados.

-----

## 🚀 O que foi Aprendido e Implementado?

Este projeto consolida importantes práticas de desenvolvimento Back-end:

  * **Arquitetura RESTful:** Separação clara de responsabilidades e uso semântico de URIs (ex: `/postagens`).
  * **Respostas HTTP Adequadas:** Uso da classe `ResponseEntity` do Spring para retornar status precisos como `200 OK`, `201 Created` e `404 Not Found`.
  * **Persistência em Memória:** Estruturação de uma lógica de persistência inicial utilizando coleções Java (`ArrayList`) para simular o comportamento de um banco de dados de forma ágil.

-----

## 🧠 Dificuldades Enfrentadas

Durante o desenvolvimento, superamos desafios essenciais para a compreensão do framework:

1.  **Mapeamento de Rotas:** Configurar corretamente as anotações `@RestController`, `@RequestMapping`, `@PathVariable` e `@RequestBody` para o tráfego correto das informações JSON.
2.  **Gerenciamento de Estado:** Lidar com a simulação do banco de dados em memória, garantindo que a geração de IDs automáticos e as buscas na lista funcionassem sem falhas.

-----

## 🛠️ Tecnologias Utilizadas

### **Backend**

  - **Linguagem:** Java (JDK 17+)
  - **Framework:** Spring Boot (Spring Web MVC)
  - **Gerenciador de Dependências:** Maven
  - **Formato de Dados:** JSON

-----

## ⚙️ Começando

### Configuração do Ambiente

Por utilizar um banco de dados em memória, o projeto não exige a instalação prévia do MySQL ou outras ferramentas externas.

1.  Clone o repositório ou importe a pasta do projeto na sua IDE favorita (VS Code, IntelliJ, Eclipse).
2.  Aguarde o Maven baixar as dependências (`spring-boot-starter-web`).
3.  Execute a classe principal da aplicação: `br.edu.ifsp.ifgram.IfgramApplication`.
4.  A API estará ativa e pronta para receber requisições em: `http://localhost:8080`.

### Como Testar

Utilize ferramentas como **Postman**, **Insomnia** ou a extensão **Thunder Client** do VS Code para enviar requisições JSON para a API.

Exemplo de payload para o `POST /postagens`:

```json
{
  "titulo": "Primeira foto no IFSP!",
  "conteudo": "Começando as aulas de Análise e Desenvolvimento de Sistemas. #IFSP #TADS"
}
```

-----

## 👨‍💻 Autor

Desenvolvido por **Luiz Henrique** *Estudante de Análise e Desenvolvimento de Sistemas* **IFSP - Câmpus Bragança Paulista**

-----

© 2026 IFgram API. Todos os direitos reservados.
