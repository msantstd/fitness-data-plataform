Desenvolvi esta plataforma de ingestão e processamento de dados em Java/Spring Boot,
integrando APIs REST, executando pipelines ETL em batch, com regra de negócio,
persistência de dados em PostgreSQL, fornecendo dados para relatórios analíticos,
 BI e dashboards..

## Como executar o projeto

1. Instale o PostgreSQL.
2. Crie um banco chamado `studio_db`.
3. Copie `src/main/resources/application-local.example.properties`
   para `src/main/resources/application-local.properties`.
4. Ajuste `username` e `password` conforme sua instalação.
5. Execute a aplicação.

As tabelas serão criadas automaticamente pelo Hibernate.