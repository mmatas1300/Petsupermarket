-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_petsupermarket
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_petsupermarket` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `db_petsupermarket` ;

-- -----------------------------------------------------
-- Table `db_petsupermarket`.`animales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`animales` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`categorias` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`productos` (
  `descuento` INT NOT NULL,
  `precio` FLOAT NOT NULL,
  `animal_id` BIGINT NOT NULL,
  `categoria_id` BIGINT NOT NULL,
  `existencia` BIGINT NOT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `contenido` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `imagen` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK8cyyhi0ewpm4j4iayscm0ta9i` (`animal_id` ASC) VISIBLE,
  INDEX `FK2fwq10nwymfv7fumctxt9vpgb` (`categoria_id` ASC) VISIBLE,
  CONSTRAINT `FK2fwq10nwymfv7fumctxt9vpgb`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `db_petsupermarket`.`categorias` (`id`),
  CONSTRAINT `FK8cyyhi0ewpm4j4iayscm0ta9i`
    FOREIGN KEY (`animal_id`)
    REFERENCES `db_petsupermarket`.`animales` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`roles` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`usuarios` (
  `fecha_nacimiento` DATETIME(6) NOT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `rol_id` BIGINT NOT NULL,
  `cp` VARCHAR(10) NOT NULL,
  `telefono` VARCHAR(30) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(70) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `direccion` VARCHAR(300) NOT NULL,
  `password` VARCHAR(300) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKqf5elo4jcq7qrt83oi0qmenjo` (`rol_id` ASC) VISIBLE,
  CONSTRAINT `FKqf5elo4jcq7qrt83oi0qmenjo`
    FOREIGN KEY (`rol_id`)
    REFERENCES `db_petsupermarket`.`roles` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`comentarios` (
  `calificacion` INT NOT NULL,
  `fecha` DATETIME(6) NOT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `producto_id` BIGINT NOT NULL,
  `usuario_id` BIGINT NOT NULL,
  `comentario` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK6vkhmonbxnjd9obsfwtkm9ehi` (`producto_id` ASC) VISIBLE,
  INDEX `FKdts62yj83qe3k748cgcjvm48r` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `FK6vkhmonbxnjd9obsfwtkm9ehi`
    FOREIGN KEY (`producto_id`)
    REFERENCES `db_petsupermarket`.`productos` (`id`),
  CONSTRAINT `FKdts62yj83qe3k748cgcjvm48r`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `db_petsupermarket`.`usuarios` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`ordenes` (
  `esta_pagado` BIT(1) NOT NULL,
  `fecha_pago` DATETIME(6) NULL DEFAULT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `usuario_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKsqu43gsd6mtx7b1siww96324` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `FKsqu43gsd6mtx7b1siww96324`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `db_petsupermarket`.`usuarios` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_petsupermarket`.`ordenes_has_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_petsupermarket`.`ordenes_has_productos` (
  `cantidad` BIGINT NULL DEFAULT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `orden_id` BIGINT NOT NULL,
  `producto_id` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK42qeqhm6glv6thsvi5sgxgakh` (`orden_id` ASC) VISIBLE,
  INDEX `FK93g7qsx0ewlcu3cdx4j1pyiga` (`producto_id` ASC) VISIBLE,
  CONSTRAINT `FK42qeqhm6glv6thsvi5sgxgakh`
    FOREIGN KEY (`orden_id`)
    REFERENCES `db_petsupermarket`.`ordenes` (`id`),
  CONSTRAINT `FK93g7qsx0ewlcu3cdx4j1pyiga`
    FOREIGN KEY (`producto_id`)
    REFERENCES `db_petsupermarket`.`productos` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
