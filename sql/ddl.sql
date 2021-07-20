drop table if exists member cascade;

create table member(
                       id bigint auto_increment,
                       name varchar(25),
                       primary key(id)
);