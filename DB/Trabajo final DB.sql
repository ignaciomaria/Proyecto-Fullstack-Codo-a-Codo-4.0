DROP SCHEMA IF EXISTS trabajo_final_cac;

CREATE SCHEMA IF NOT EXISTS trabajo_final_cac;

USE trabajo_final_cac;

CREATE TABLE orador (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    tema VARCHAR(255) NOT NULL
);

CREATE TABLE ticket (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    correo VARCHAR(30) NOT NULL,
    cantidad INT NOT NULL,
    categoria VARCHAR(11) NOT NULL,
    valor INT NOT NULL
);