IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'TS06A1')
BEGIN
  CREATE DATABASE TS06A1;
END;

if object_id('fk_cteste_exercicio', 'f') is not null alter table caso_de_teste drop constraint fk_cteste_exercicio;
if object_id('fk_email_usuario', 'f') is not null alter table email drop constraint fk_email_usuario;

drop table if exists caso_de_teste;
drop table if exists exercicio;
drop table if exists produto;
drop table if exists email;
drop table if exists usuario;

create table usuario(
	id_usuario uniqueidentifier primary key nonclustered default newid(),
	nome nvarchar(100) not null,
	senha nvarchar(100) not null
);

alter table usuario
	add constraint ck_senha_minimo
	check (len(trim(senha)) >= 8);

alter table usuario add constraint ck_senha_regra check (senha collate Latin1_General_BIN like '%[a-z]%' and senha collate Latin1_General_BIN like '%[A-Z]%[A-Z]%' and senha like '%[^a-zA-Z0-9]%[^a-zA-Z0-9]%');


create table email(
	id_email uniqueidentifier primary key nonclustered default newid(),
	endereco varchar(100) unique not null,
	id_usuario uniqueidentifier unique not null
);

alter table email
	add constraint fk_email_usuario
		foreign key(id_usuario)
		references usuario(id_usuario);

alter table email
	add constraint ck_email_formato
	check (
			endereco like '%_@_%._%'
			and endereco not like '% %'
			and endereco not like '%@%@%'
);

create table produto(
	id_produto uniqueidentifier primary key nonclustered default newid(),
	nome nvarchar(100) unique not null,
	preco decimal(10,2) not null,
	quantidade integer not null
);

alter table produto
	add constraint ck_produto_nome
	check (len(trim(nome)) between 3 and 100);

alter table produto
	add constraint ck_produto_preco
	check (preco > 0);

alter table produto
	add constraint ck_produto_quantidade
	check (quantidade >= 0);


/*******************************/

create table exercicio(
    id_exercicio uniqueidentifier primary key nonclustered default newid(),
    n_exercicio integer unique not null,
    descricao nvarchar(30) not null
);

if not exists(
    select 1 from exercicio where n_exercicio = 1
)
insert into exercicio(
	n_exercicio,
	descricao
)
values(
	1,
	'cadastro de usuários'
);

if not exists(
    select 1 from exercicio where n_exercicio = 2
)
insert into exercicio(
	n_exercicio,
	descricao
)
values(
	2,
	'gerenciamento de produtos'
);


create table caso_de_teste(
    cod_caso_de_teste int identity(1,1) primary key,
    descricao nvarchar(255) not null,
    pre_condicoes nvarchar(255) not null,
    passos nvarchar(255) not null,
    resultado_esperado nvarchar(255) not null,
    requisitos_nao_funcionais nvarchar(255) not null,
    id_exercicio uniqueidentifier
);

create clustered index ix_casos_cod on caso_de_teste(cod_caso_de_teste);

alter table caso_de_teste
	add constraint fk_cteste_exercicio
		foreign key(id_exercicio)
		references exercicio(id_exercicio);
