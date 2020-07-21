drop table if exists users, authorities;
-- Таблица user содержит пользователей, authorities - это роли.
CREATE TABLE if not exists users
(
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    enabled  boolean default true,
    PRIMARY KEY (username)
);

CREATE TABLE if not exists authorities
(
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users (username)
);
-- insert static user with password
INSERT INTO users (username, password, enabled)
values ('7',
        '$2a$10$fJ8kUgDGkc9aeZLkb.M9kOR0BPRBlOKQdC7LuMVWI6YZPjFXRvRTq',
        true);

INSERT INTO authorities (username, authority)
values ('7', 'ROLE_USER');