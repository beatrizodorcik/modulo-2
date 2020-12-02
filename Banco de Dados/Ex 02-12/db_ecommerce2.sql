-- create database db_ecommerce2

-- use db_ecommerce2
create table tb_categoria(
	id bigint auto_increment,
    tipo varchar(20),
    categ varchar(30),
    
    primary key (id)
);

create table tb_produto(
	codigo bigint auto_increment,
    nome varchar (30),
    peso decimal,
    preco decimal,
    marca varchar (30),
    id_codigo bigint,
    
    foreign key (id_codigo) references tb_categoria (id),
    primary key (codigo)
);

insert into tb_categoria (tipo, categ) values ("Físico", "Cozinha");
insert into tb_categoria (tipo, categ) values ("Físico", "Papelaria");
insert into tb_categoria (tipo, categ) values ("Físico", "Celulares");
insert into tb_categoria (tipo, categ) values ("Virtual", "Softwares");
insert into tb_categoria (tipo, categ) values ("Físico", "Computadores");

insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Escumadeira", 0.2, 19.99, "Tramontina", 1);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Kit de talheres", 1.5, 102.99, "Tramontina", 1);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Frigideira", 1.1, 79.99, "Tramontina", 1);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Post-it", 0.1, 23.99, "3M", 2);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Caderno 10 matérias", 0.6, 33.49, "Grafon's", 2);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Planner 2021", 1.5, 59.89, "Tilibra", 2);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Iphone 12", 0.4, 6329.99, "Apple", 3);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Samsung A31", 0.4, 2029.99, "Samsung", 3);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("MotoG Plus", 0.6, 1899.99, "Motorola", 3);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Office 365", 0.1, 189.99, "Microsoft", 4);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Fifa 2020", 0.1, 259.88, "EA Sports", 4);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("CS", 0.1, 189.99, "Valve", 4);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Notebook Asus", 1.2, 3290.99, "Asus", 5);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Notebook Dell", 1.3, 3890.78, "Dell", 5);
insert into tb_produto (nome, peso, preco, marca, id_codigo) values ("Notebook Lenovo", 1.8, 2670.90, "Lenovo", 5);

select * from tb_produto where preco > 2000.00;

select * from tb_produto where preco > 1000 and preco < 2000; 

select * from tb_produto where nome like "C%";

select tb_produto.nome, tb_produto.codigo from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_codigo;

select tb_produto.nome, tb_categoria.categ from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.id_codigo
where categ = "Papelaria";
