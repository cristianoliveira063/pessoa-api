CREATE TABLE pessoa(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL ,
email VARCHAR(50) NOT NULL ,
idade INT NOT NULL ,
ativo BOOLEAN NOT NULL,
UNIQUE (email(50))) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_general_ci;
