create table users(
	username VARCHAR(50) not null primary key,
    password VARCHAR(100) not null,
    enabled boolean not null
);

-- Authority is something like ROLE_ADMIN or ROLE_USER
create table authorities(
	username VARCHAR(50) not null,
    authority VARCHAR(50) not null,
    constraint fk_user_authorities foreign key(username) references users(username)
);