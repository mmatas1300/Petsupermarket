-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_petsupermarket` DEFAULT CHARACTER SET utf8 ;
USE `db_petsupermarket` ;

-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Roles` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Usuarios` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `direccion` VARCHAR(300) NOT NULL,
  `telefono` VARCHAR(30) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `fecha_nacimiento` TIMESTAMP NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `cp` VARCHAR(10) NOT NULL,
  `Rol_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Usuario_Rol_idx` (`Rol_id` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Rol`
    FOREIGN KEY (`Rol_id`)
    REFERENCES `db_petsupermarket`.`Roles` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Animales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Animales` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Categorias` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Productos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `contenido` VARCHAR(45) NOT NULL,
  `precio` DECIMAL NOT NULL,
  `descuento` INT NOT NULL,
  `existencia` BIGINT NOT NULL,
  `imagen` VARCHAR(500) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `Animales_id` BIGINT NOT NULL,
  `Categorias_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Productos_Animales1_idx` (`Animales_id` ASC) VISIBLE,
  INDEX `fk_Productos_Categorias1_idx` (`Categorias_id` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_Animales1`
    FOREIGN KEY (`Animales_id`)
    REFERENCES `db_petsupermarket`.`Animales` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Productos_Categorias1`
    FOREIGN KEY (`Categorias_id`)
    REFERENCES `db_petsupermarket`.`Categorias` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Comentarios` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `fecha` TIMESTAMP NOT NULL,
  `comentario` VARCHAR(100) NULL,
  `calificacion` INT NOT NULL,
  `Usuarios_id` BIGINT NOT NULL,
  `Productos_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Comentarios_Usuario1_idx` (`Usuarios_id` ASC) VISIBLE,
  INDEX `fk_Comentarios_Productos1_idx` (`Productos_id` ASC) VISIBLE,
  CONSTRAINT `fk_Comentarios_Usuario1`
    FOREIGN KEY (`Usuarios_id`)
    REFERENCES `db_petsupermarket`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comentarios_Productos1`
    FOREIGN KEY (`Productos_id`)
    REFERENCES `db_petsupermarket`.`Productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Ordenes` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `fecha_pago` TIMESTAMP NULL,
  `esta_pagado` TINYINT NULL,
  `Usuario_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Ordenes_Usuario1_idx` (`Usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_Ordenes_Usuario1`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `db_petsupermarket`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`Ordenes_has_Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`Ordenes_has_Productos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `Productos_id` BIGINT NULL,
  `Ordenes_id` BIGINT NOT NULL,
  `cantidad` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Ordenes_has_Productos_Productos1_idx` (`Productos_id` ASC) VISIBLE,
  INDEX `fk_Ordenes_has_Productos_Ordenes1_idx` (`Ordenes_id` ASC) VISIBLE,
  CONSTRAINT `fk_Ordenes_has_Productos_Productos1`
    FOREIGN KEY (`Productos_id`)
    REFERENCES `db_petsupermarket`.`Productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ordenes_has_Productos_Ordenes1`
    FOREIGN KEY (`Ordenes_id`)
    REFERENCES `db_petsupermarket`.`Ordenes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
