# Studio Franchini - Fitness Data Platform

Aplicação web em desenvolvimento para gestão integrada de um estúdio de Pilates, desenvolvida com Java e Spring Boot, aplicando fundamentos de Engenharia de Software em um projeto baseado em um cenário real de negócio.

O objetivo da plataforma é centralizar processos operacionais, controle de usuários, autenticação, agendamentos, gestão financeira e disponibilização de indicadores gerenciais, reduzindo atividades manuais, otimizando processos e facilitando a evolução contínua do sistema.

---

# Tecnologias

## Backend

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Banco de Dados

- PostgreSQL

## Frontend

- Thymeleaf
- HTML5
- CSS3
- JavaScript

## Ferramentas

- Git
- GitHub
- IntelliJ IDEA

---

# Arquitetura

O projeto utiliza arquitetura em camadas, promovendo separação de responsabilidades, baixo acoplamento e maior facilidade de manutenção e evolução do sistema.

```
Controller
     │
     ▼
Service
     │
     ▼
Repository
     │
     ▼
PostgreSQL
```

---

# Funcionalidades implementadas

- ✅ Homepage institucional
- ✅ Tela de Login
- ✅ Persistência de dados com PostgreSQL
- ✅ Modelagem da entidade `Usuario`
- ✅ Bootstrap automático do usuário administrador
- ✅ Endpoints REST iniciais
- ✅ Arquitetura MVC
- ✅ Configuração externa via `application-local.properties`

---

# Funcionalidades em desenvolvimento

- 🔄 Spring Security
- 🔄 Criptografia de senhas (BCrypt)
- 🔄 Cadastro de usuários
- 🔄 Agenda de aulas
- 🔄 Dashboard gerencial
- 🔄 Módulo financeiro
- 🔄 Integração com ferramentas analíticas em Python

---

# Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/msantstd/StudioFranchini.git
```

2. Acesse o diretório do projeto:

```bash
cd StudioFranchini
```

3. Instale o PostgreSQL.

4. Crie um banco de dados chamado:

```text
studio_db
```

5. Copie o arquivo:

```text
src/main/resources/application-local.example.properties
```

para:

```text
src/main/resources/application-local.properties
```

6. Configure:

- URL do banco de dados
- Usuário
- Senha

7. Execute a classe:

```text
StudioFranchiniApplication
```

O Hibernate criará automaticamente as tabelas necessárias e o sistema realizará o bootstrap do primeiro usuário administrador caso ele ainda não exista.

---

# Conceitos de Engenharia de Software aplicados

Durante o desenvolvimento desta aplicação estão sendo empregados conceitos fundamentais de Engenharia de Software, entre eles:

- Levantamento e análise de requisitos
- Definição de escopo
- Arquitetura em camadas
- Padrão MVC
- Persistência de dados com JPA/Hibernate
- Desenvolvimento de APIs REST
- Modelagem de banco de dados relacional
- Controle de acesso
- Versionamento com Git e GitHub
- Evolução incremental de software

---

# Status do projeto

🚧 **Em desenvolvimento**

O projeto encontra-se em evolução contínua, com novas funcionalidades sendo implementadas incrementalmente à medida que o desenvolvimento avança.

---

# Autor

**Marcio Santos**

- LinkedIn: https://www.linkedin.com/in/marciosant/
- GitHub: https://github.com/msantstd