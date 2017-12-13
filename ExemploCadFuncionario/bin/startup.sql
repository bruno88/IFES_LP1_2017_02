drop database testes_funcionario

CREATE DATABASE testes_funcionario

USE testes_funcionario

CREATE TABLE FUNCIONARIO (
codigo int not null auto_increment,
nome varchar(255),
funcao varchar(255),
idade int,
salario double,
primary key (codigo)
);

drop table funcionario

delete from funcionario;

select * from FUNCIONARIO