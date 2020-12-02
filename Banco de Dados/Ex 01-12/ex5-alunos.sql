-- create database db_escola;

/* use db_escola;
create table tb_alunes(
	ra int (8) auto_increment,
    nome varchar (50) not null,
    serie varchar (2) not null,
    periodo varchar (7) not null,
    nota_final float not null,
    
    primary key (ra)
); */

-- insert into tb_alunes (nome, serie, periodo, nota_final) values ("Maria Tereza", "1A", "Int", 8.3);
/* insert into tb_alunes (nome, serie, periodo, nota_final) values ("Ana Letícia", "2B", "Mat", 9.2);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Paula Cristina", "3C", "Tar", 7.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Tiago Augusto", "1B", "Mat", 8.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Julia Maria", "1A", "Tar", 8.6);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Larissa Cristina", "3C", "Mat", 8.9);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Camila Coutinho", "3B", "Int", 9.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Julia Kemp", "2A", "Int", 7.8);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Gabriel Souza", "1B", "Mat", 8.6);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Ana Lúcia", "3A", "Int", 7.5);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Maria Beatriz", "2B", "Mat", 7.7);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Pedro Augusto", "2B", "Tar", 6.5);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Caio Augusto", "1C", "Int", 8.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Felipe Teixeira", "1C", "Tar", 9.4);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Sandro Pereira", "2A", "Int", 7.5);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Ricardo Souza", "3A", "Int", 8.2);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Aline Cristina", "3B", "Mat", 8.2);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Sabrina Couto", "3C", "Int", 8.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Ana Couto", "2B", "Tar", 5.7);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Yuri Dias", "2C", "Mat", 6.3);
insert into tb_alunes (nome, serie, periodo, nota_final) values ("Vinicius Fernandes", "1B", "Mat", 7.5); */

-- select * from tb_alunes where nota_final > 7.0
-- select * from tb_alunes where nota_final < 7.0

-- delete from tb_alunes where ra = 2;

-- update tb_alunes set nota_final = 7.8 where ra = 21;