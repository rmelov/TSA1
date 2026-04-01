pré-requisitos:
<<<<<<< HEAD
  docker instalado e em execução
  jdk21 instalado, se desejar executar via ./mvnw
=======
	docker instalado e rodando
>>>>>>> feb4cb911cc56fbc708a54e3ee062bc1be95fd16

como executar:
  abra o terminal na pasta do projeto e execute:
    docker compose up --build
  ou, caso falhe:
    docker-compose up --build

espere o terminal estabilizar,
o sql server pode levar cerca de 1 a 2 minutos para iniciar completamente na primeira vez

verificar o docker:
  docker ps

criar o banco de dados:
<<<<<<< HEAD
  com o docker em execução, abra um novo terminal e execute o comando abaixo para criar a base TS06A1:
=======
  com o docker rodando, abra um novo terminal e execute o comando para criar a base TS06A1:
>>>>>>> feb4cb911cc56fbc708a54e3ee062bc1be95fd16
    docker exec -it mssql_db /opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P "TSA1!2026z" -C -Q "CREATE DATABASE TS06A1"

o container mssql_db deve estar rodando e o banco TS06A1 já deve ter sido criado
  execute:
    docker compose up -d db-sqlserver
  ou
    docker compose up -d

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

execução de testes pelo docker:
    apenas exercicio 1:
      docker run --rm -v ".:/app" -w /app maven:3.9.6-eclipse-temurin-21 mvn test -Dtest=Exercicio01
    apenas exercicio 2:
      docker run --rm -v ".:/app" -w /app maven:3.9.6-eclipse-temurin-21 mvn test -Dtest=Exercicio02
    ambos:
      docker run --rm -v ".:/app" -w /app maven:3.9.6-eclipse-temurin-21 mvn test

execução de testes pelo maven (barra invertida + .cmd no win):
    apenas exercicio 1:
      .\mvnw.cmd test -Dtest=Exercicio01
    apenas exercicio 2:
      .\mvnw.cmd test -Dtest=Exercicio02
    ambos:
      .\mvnw.cmd test

em caso de erro de sintaxe (getters/setters), instale o Lombok
