create table users(
    id varchar2(10) not null primary key,    
    password varchar2(10),
    name varchar2(10),
    profile varchar2(15),
    reg_date date default sysdate    
);
