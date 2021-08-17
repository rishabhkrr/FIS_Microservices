use task;

drop table user;
drop table role;

create table user(us_id int, us_username varchar(255), us_password varchar(255));

create table role(ro_id int, ro_name varchar(255));

create table user_role(us_ro_id int , us_us_id int);

Alter table user_role change us_us_id ur_us_id int;