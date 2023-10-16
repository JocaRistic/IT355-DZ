DROP TABLE IF EXISTS jelo;
DROP TABLE IF EXISTS restoran;

create table restoran (id bigint generated by default as identity, adresa varchar(255), naziv varchar(255), ocena float(53) not null, telefon varchar(255), primary key (id));
create table jelo (id bigint generated by default as identity, cena float(53) not null, naziv varchar(255), opis varchar(255), id_restorana bigint not null, primary key (id));

alter table if exists jelo add constraint FKme7ggac5pdgkv6c2huo52laom foreign key (id_restorana) references restoran;

insert into restoran (id, adresa, naziv, ocena, telefon) values (1000, 'neka adresa restorana', 'Met restoran', 9, '064535344');
insert into jelo (id, cena, naziv, opis, id_restorana) values (default, 500, 'Naziv jela 1', 'Opis jela 1', 1000);