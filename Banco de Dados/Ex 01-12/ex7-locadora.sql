-- create database db_locadora;

/* use db_locadora;
create table tb_filmes (
	id int (4) auto_increment,
    nome varchar (30) not null,
    anolanc int (4) not null,
    categoria varchar (40) not null,
    disponivel boolean,
    
    primary key (id)
); */

/* insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("A estrada 47", 2005, "Suspense", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Beira-Mar", 2005, "Romance", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Cássia Eller", 2005, "Documentário", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Geraldinos", 2005, "Comédia", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Meu passado me condena", 2005, "Comédia", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Que horas ela volta?", 2005, "Suspense", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Roma", 2018, "Suspense", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("O irlândes", 2019, "Suspense", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("História de um casamento", 2019, "Romance", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("My happy family", 2017, "Suspense", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Em busca dos corais", 2017, "Documentário", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Rolling Thunder Revue", 2019, "Documentário", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Strong Island", 2017, "Documentário", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Cam", 2018, "Terror", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Desesperados", 2020, "Comédia", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Beleza Oculta", 2016, "Drama", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Polar", 2019, "Ficção", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Megarromântico", 2019, "Comédia", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Black Mirror", 2018, "Ficção", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Vingadores", 2019, "Ficção", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Inovacação do Mal 2", 2013, "Terror", false);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("Batman: Cavaleiros das Trevas", 2019, "Suspense", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e a Pedra Filosofal", 2001, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e a Câmara Secreta", 2002, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e o Prisioneiro de Azkaban", 2004, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e o Cálice de Fogo", 2005, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e a Ordem da Fênix", 2007, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e o Enigma do Princípe", 2009, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e as Relíquias 1", 2010, "Melhores", true);
insert into tb_filmes (nome, anolanc, categoria, disponivel) values ("HP e as Relíquias 2", 2011, "Melhores", true); */

-- select * from tb_filmes where nome like "S%"

-- select nome from tb_filmes where categoria = "Melhores"

-- delete from tb_filmes where id = 1;
-- delete from tb_filmes where id = 25;

-- update tb_filmes set disponivel = false where id = 24;