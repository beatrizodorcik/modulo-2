-- create database db_RH2

use db_RH2;
create table tb_cargo (
	id bigint auto_increment,
	cargo varchar (30) not null,
    nivel varchar (30) not null,
    
    primary key (id)
);

-- use db_RH2;
create table tb_funcionario (
	id bigint auto_increment,
	nome varchar (30) not null,
    admindata date,
	ativo boolean,
    salario double (10,2), 
    id_cargo bigint,
    
	foreign key(id_cargo) references tb_cargo(id),
    primary key (id)
);

insert into tb_cargo (cargo, nivel) values ("DEV Front", "Júnior");
insert into tb_cargo (cargo, nivel) values ("DEV Back", "Sênior");
insert into tb_cargo (cargo, nivel) values ("DEV Front", "Júnior");
insert into tb_cargo (cargo, nivel) values ("DEV Back", "Sênior");
insert into tb_cargo (cargo, nivel) values ("DevOps", "Sênior");
insert into tb_cargo (cargo, nivel) values ("Scrum Master", "Sênior");

insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Beatriz", "2020-01-12", true, 4300.00, 3);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Laura", "2020-01-12", false, 2800.00, 2);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Thiago", "2020-01-12", true, 2900.00, 1);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Larissa", "2020-01-12", true, 4300.00, 4);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Julia", "2020-01-12", true, 5200.00, 5);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Paulo", "2020-01-12", true, 5300.00, 6);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Ana Laura", "2020-01-12", true, 2900.00, 1);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Leticia", "2020-01-12", false, 2800.00, 2);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Bruno", "2020-01-12", true, 4300.00, 3);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Caio", "2020-01-12", true, 4300.00, 4);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Cinthia", "2020-01-12", true, 2900.00, 1);
insert into tb_funcionario (nome, admindata, ativo, salario, id_cargo) values ("Vanessa", "2020-01-12", true, 2800.00, 2);

select * from tb_funcionario where salario > 2000.00;

select * from tb_funcionario where salario > 1000.00 and salario < 2000.00;

select * from tb_funcionario where nome like "C%";

select * from tb_funcionario where id_cargo = 1;

select tb_funcionario.nome,tb_cargo.cargo from tb_funcionario
inner join tb_cargo on tb_cargo.id = tb_funcionario.id_cargo;

select tb_funcionario.nome, tb_funcionario.salario, tb_cargo.cargo, tb_cargo.nivel from tb_funcionario 
inner join tb_cargo on tb_cargo.id = tb_funcionario.id_cargo
where cargo = "DEV Júnior";

