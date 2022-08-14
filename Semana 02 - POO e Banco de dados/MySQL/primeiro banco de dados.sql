-- Criando um DataBase
create database ibm; 

-- Pondo em uso o DataBase
use ibm;

-- Criando uma tabela dentro do DataBase
create table clientes(
id_clientes int not null auto_increment primary key, 
nome_clientes varchar(50) not null,
email_cliente varchar(80) not null,
whats_cliente char(11) not null);

-- Vendo a estrutura do DataBase
describe clientes; 

-- Inserindo registro na tabela
insert into clientes
(nome_clientes,email_cliente,whats_cliente)
values
("Ricardo dos Santos de Lima", "ricardo@ibm.com","71982994569");

-- Inserindo registro em uma tabela de outra forma
insert into clientes
values
(null, "Paulo Henrique","paulo@ibm.com","71996547426");

-- Visualizando as informações do nosso banco de dados
select  * from clientes;
select nome_clientes, whats_cliente from clientes;

-- Visualizando as informações da nossa tabela em condições
select * from clientes where id_clientes=1;

-- Visualizando registros com Like % para campos do tipo texto
select * from clientes where nome_clientes like "Paulo%";
select * from clientes where nome_clientes like "%Henrique";
select * from clientes where nome_clientes like "%Santos%";

-- Visualizando os registro por ordem especifica
select * from clientes order by nome_clientes asc; -- ascendente
select * from clientes order by nome_clientes desc; -- descendente 

-- Inserindo um novo campo na tabela do banco de dados
alter table clientes add idade_cliente int not null;

-- Removendo um campo da tabela do banco de dados
alter table clientes drop idade_cliente; 

-- Renomeando um campo ja existente na estrutura da tabela
alter table clientes rename column idade_cliente to idade;

-- Atualizando um contéudo de um campo na tabela 
update clientes set idade=23 where id_clientes=1;

update clientes set idade=18, email_cliente="ricardolima@ibm.com" where id_clientes=1;

-- Criando um backup da base de dados
create table clientes_bck select * from clientes;

-- Excluindo um registro da nossa base de dados
delete from clientes;
delete from clientes where id_clientes=2;

select * from clientes_bck;

-- Restaurando um backup
insert into clientes
(id_clientes,nome_clientes,email_cliente,whats_cliente,idade)
select id_clientes,nome_clientes,email_cliente,whats_cliente,idade from clientes_bck;

select * from clientes;

-- Retornando a quantidade de registros na estrutura da tabela
select count(*) as Total_Registros from clientes;

use ibm;

create table produtos(
id_produto int not null auto_increment,
nome_produto varchar(50) not null,
qtd_produto int not null,
cod_marca int not null,
primary key(id_produto));

describe produtos;

create table marcas(
id_marca int not null auto_increment primary key,
nome_marca varchar (50));

describe marcas;

insert into marcas
value
(null, "Brastemp"),
(null, "Samsung"),
(null, "Eletrolux");

select * from marcas;

-- Apagando registros com where e a clausula in para determinar uma faixa
delete from marcas where id_marca in(4, 5, 6);


insert into produtos
value
(null, "Geladeira",10,1),
(null, "Fogao",15,1),
(null, "Batedeira",2,2),
(null, "Celular",100,3);


describe produtos;
select * from produtos;

delete from produtos where id_produto in(5,6,7,8,9,10,11,12);

-- Vinculando os campos da nossa tabela
select p.nome_produto,p.qtd_produto,p.cod_marca,m.id_marca,m.nome_marca
from
produtos as p,
marcas as m
where(p.cod_marca=m.id_marca);

-- Somando todos os valores encontrados em um campo de tabela
select sum(qtd_produto) as Total from produtos;

select nome_produto, qtd_produto, (qtd_produto+10) as novo_estoque from produtos;




















