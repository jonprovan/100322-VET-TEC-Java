INSERT INTO users VALUES ('username', '$2a$10$9mR9cB/lDudMvpPx2CJ65O/mkauMd3O/Qz2zjcApT2f/k1Ra9fT5C', true);
INSERT INTO users VALUES ('sean', '$2a$10$VIcjxCDIZV8kPcsSJ54BKejpPnkviCSUF5G6fQcebgUPxTbLsxQAq', true);
INSERT INTO users VALUES ('root', '$2a$10$XgG3vhDlvzX6g9zvY1McJ.OKkZHqezxGvmj2xRX3NUYOVVlnr3u4C', true);

INSERT INTO authorities VALUES ('sean', 'ROLE_ADMIN');
INSERT INTO authorities VALUES ('sean', 'ROLE_USER');
INSERT INTO authorities VALUES ('username', 'ROLE_USER');
INSERT INTO authorities VALUES ('root', 'ROLE_USER');
INSERT INTO authorities VALUES ('root', 'ROLE_ADMIN');