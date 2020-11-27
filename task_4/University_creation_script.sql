-- MySQL Script generated by MySQL Workbench
-- Fri Nov 27 02:21:26 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema University
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema University
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `University` DEFAULT CHARACTER SET utf8 ;
USE `University` ;

-- -----------------------------------------------------
-- Table `University`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `University`.`Course` (
  `idCourse` INT NOT NULL AUTO_INCREMENT,
  `course_title` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idCourse`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `University`.`Group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `University`.`Group` (
  `idGroup` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGroup`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `University`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `University`.`Student` (
  `idStudent` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `id_group` INT NOT NULL,
  PRIMARY KEY (`idStudent`),
  INDEX `id_group_idx` (`id_group` ASC) VISIBLE,
  CONSTRAINT `id_group`
    FOREIGN KEY (`id_group`)
    REFERENCES `University`.`Group` (`idGroup`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `University`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `University`.`Teacher` (
  `idTeacher` INT NOT NULL,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idTeacher`),
  CONSTRAINT `idTeacher`
    FOREIGN KEY (`idTeacher`)
    REFERENCES `University`.`Course` (`idCourse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `University`.`Marks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `University`.`Marks` (
  `idStudent` INT NOT NULL,
  `idCourse` INT NOT NULL,
  `mark` INT NOT NULL,
  INDEX `idStudent_idx` (`idStudent` ASC) VISIBLE,
  INDEX `idCourse_idx` (`idCourse` ASC) VISIBLE,
  CONSTRAINT `idStudent`
    FOREIGN KEY (`idStudent`)
    REFERENCES `University`.`Student` (`idStudent`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `idCourse`
    FOREIGN KEY (`idCourse`)
    REFERENCES `University`.`Course` (`idCourse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
