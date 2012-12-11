create table users(id serial, name varchar(255), current_user_schema varchar(255));
create schema one;
create schema two;
create table one.fields(id serial, name varchar(255));
create table two.fields(id serial, name varchar(255));

insert into users(name, current_user_schema) values('rodrigo', 'one');
