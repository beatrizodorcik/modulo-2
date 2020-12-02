-- create database db_ecommerce;

/* use db_ecommerce;
create table produtos(
	id int(5) auto_increment,
    nome varchar (30) not null,
    valor float not null,
    setor varchar (15) not null,
    marca varchar (20) not null,
    
    primary key (id)
); */

-- INSERT INTO produtos (nome, valor, setor, marca) values ("Carrinho", 180.90, "Eletrônicos", "Dell");
-- delete from produtos where id = 1;
-- insert into produtos (nome, valor, setor, marca) values ("Computador", 3900.23, "Eletrônicos", "Dell");
-- insert into produtos (nome, valor, setor, marca) values ("Iphone 12", 5900.56, "Eletrônicos", "Apple");
/* insert into produtos (nome, valor, setor, marca) values ("Agenda 2021", 45.99, "Papelaria", "Tilibra");
insert into produtos (nome, valor, setor, marca) values ("Álcool em gel - 500 mL", 26.30, "Saúde e Beleza", "Needs");
insert into produtos (nome, valor, setor, marca) values ("Protetor solar FPS 70", 89.23, "Saúde e Beleza", "Needs");
insert into produtos (nome, valor, setor, marca) values ("Samsung A31", 2100.76, "Eletrônicos", "Samsung");
insert into produtos (nome, valor, setor, marca) values ("Adesivos planner", 15.99, "Papelaria", "Grafon's");
insert into produtos (nome, valor, setor, marca) values ("Camiseta M Sou DEV", 39.99, "Roupas", "Heringer");
insert into produtos (nome, valor, setor, marca) values ("Camiseta F Sou DEV", 39.99, "Roupas", "Heringer");
insert into produtos (nome, valor, setor, marca) values ("Caneca", 26.56, "Casa e Cozinha", "Canecaria");
insert into produtos (nome, valor, setor, marca) values ("Suporte em macramê", 50.00, "Casa", "Camis");
insert into produtos (nome, valor, setor, marca) values ("Canetas Stabilo", 126.30, "Papelaria", "Stabilo"); */ 

-- select * from produtos where valor > 500
-- select * from produtos where valor < 500
-- select * from produtos where valor > 700 && valor < 900

-- delete from produtos where id = 5;

-- update produtos set valor = 1988.90 where id = 7;