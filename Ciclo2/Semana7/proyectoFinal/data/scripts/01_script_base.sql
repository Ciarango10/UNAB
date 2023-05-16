create table productos
(
	codproducto bigint not null auto_increment,
    nombre varchar(200) not null,
    id varchar(30) not null,
    temperatura numeric(10,2) not null,
    valorbase numeric(10,2) not null,
    primary key (codproducto)
);