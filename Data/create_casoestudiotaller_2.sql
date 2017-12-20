DROP DATABASE IF EXISTS `taller`;

CREATE DATABASE `taller`;
USE `taller`;

CREATE TABLE `tipodeservicio` (
  	`Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  	`nombre` varchar(45) DEFAULT NULL,
  	`meses` int(10) unsigned NOT NULL,
  PRIMARY KEY (`Id`)
) 
ENGINE=InnoDB AUTO_INCREMENT=1 
DEFAULT CHARSET=latin1;

CREATE TABLE `vehiculo` (
  	`padron` int(10) unsigned NOT NULL,
  	`chapa` varchar(10) DEFAULT NULL,
  	`nombrePropietario` varchar(45) DEFAULT NULL,
  	`marca` varchar(45) DEFAULT NULL,
	`cantidadDePuertas` int(10) unsigned DEFAULT NULL,
  	`cilindrada` int(10) unsigned DEFAULT NULL,
  	`anio` int(10) unsigned DEFAULT NULL,
  	`tipo` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`padron`)
) 
ENGINE=InnoDB
DEFAULT CHARSET=latin1;
