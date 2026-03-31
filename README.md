pré-requisitos:
  docker instalado e rodando

como executar
  abra o terminal na pasta do projeto e execute:
    docker-compose up --build

espere o terminal estabilizar,
o sql server pode levar cerca de 1 a 2 minutos para iniciar completamente na primeira vez

criar o banco de dados:
  com o docker rodando, abra um novo terminal e execute o comando abaixo para criar a base TS06A1:
    docker exec -it mssql_db /opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P "TSA1!2026z" -C -Q "CREATE DATABASE TS06A1"

acesso:
  swagger ui: http://localhost:8080/swagger-ui/index.html
  api local: http://localhost:8080/

validações implementadas:
  exercício 1 (usuários):
    email único
    senha com mínimo de 8 caracteres
  exercício 2 (produtos):
    nome único (3 a 100 caracteres)
    preço > 0
    quantidade >= 0

execução de testes:
  requisito: o container mssql_db deve estar rodando e o banco TS06A1 já deve ter sido criado
      execute:
        docker compose up -d db-sqlserver
      apenas exercicio 1:
        ./mvnw.cmd test -Dtest=Exercicio01
      apenas exercicio 2:
        ./mvnw.cmd test -Dtest=Exercicio02
      ambos:
        ./mvnw.cmd test
