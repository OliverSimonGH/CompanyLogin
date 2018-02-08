-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema evolved
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `evolved` ;

-- -----------------------------------------------------
-- Schema evolved
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `evolved` ;
USE `evolved` ;

-- -----------------------------------------------------
-- Table `evolved`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`account` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email_address` VARCHAR(80) NOT NULL,
  `password_salt` VARCHAR(8) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `date_created` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`assessor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`assessor` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `fk_account` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_assessor_account1_idx` (`fk_account` ASC),
  CONSTRAINT `fk_assessor_account1`
    FOREIGN KEY (`fk_account`)
    REFERENCES `evolved`.`account` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`company`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`company` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `fk_account` INT NOT NULL,
  `fk_assessor` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_company_account1_idx` (`fk_account` ASC),
  INDEX `fk_company_assessor1_idx` (`fk_assessor` ASC),
  CONSTRAINT `fk_company_account1`
    FOREIGN KEY (`fk_account`)
    REFERENCES `evolved`.`account` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_company_assessor1`
    FOREIGN KEY (`fk_assessor`)
    REFERENCES `evolved`.`assessor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`customer` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `fk_account` INT NOT NULL,
  `fk_company` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_customer_account1_idx` (`fk_account` ASC),
  INDEX `fk_customer_company1_idx` (`fk_company` ASC),
  CONSTRAINT `fk_customer_account1`
    FOREIGN KEY (`fk_account`)
    REFERENCES `evolved`.`account` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_company1`
    FOREIGN KEY (`fk_company`)
    REFERENCES `evolved`.`company` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`module`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`module` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`company_module`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`company_module` (
  `fk_company` INT NOT NULL,
  `fk_module` INT NOT NULL,
  `deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`fk_company`, `fk_module`),
  INDEX `fk_company_module_company1_idx` (`fk_company` ASC),
  INDEX `fk_company_module_module1_idx` (`fk_module` ASC),
  CONSTRAINT `fk_company_module_company1`
    FOREIGN KEY (`fk_company`)
    REFERENCES `evolved`.`company` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_company_module_module1`
    FOREIGN KEY (`fk_module`)
    REFERENCES `evolved`.`module` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`question` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(200) NOT NULL,
  `fk_module` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_question_module1_idx` (`fk_module` ASC),
  CONSTRAINT `fk_question_module1`
    FOREIGN KEY (`fk_module`)
    REFERENCES `evolved`.`module` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`comment` (
  `fk_customer` INT NOT NULL,
  `fk_question` INT NOT NULL,
  `score` TINYINT(5) NOT NULL,
  `comment` VARCHAR(200) NULL,
  INDEX `fk_comment_question1_idx` (`fk_question` ASC),
  INDEX `fk_comment_customer1_idx` (`fk_customer` ASC),
  PRIMARY KEY (`fk_customer`, `fk_question`),
  CONSTRAINT `fk_comment_question1`
    FOREIGN KEY (`fk_question`)
    REFERENCES `evolved`.`question` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comment_customer1`
    FOREIGN KEY (`fk_customer`)
    REFERENCES `evolved`.`customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`assessment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`assessment` (
  `id` INT NOT NULL,
  `approved` TINYINT(1) NOT NULL DEFAULT 0,
  `unapproved_qvi_score` TINYINT(100) NOT NULL,
  `approved_qvi_score` TINYINT(100) NULL,
  `date_created` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_assessed` DATETIME NULL,
  `fk_company` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_assessment_company1_idx` (`fk_company` ASC),
  CONSTRAINT `fk_assessment_company1`
    FOREIGN KEY (`fk_company`)
    REFERENCES `evolved`.`company` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `evolved`.`result`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evolved`.`result` (
  `fk_module` INT NOT NULL,
  `fk_assessment` INT NOT NULL,
  `score` TINYINT(100) NOT NULL,
  PRIMARY KEY (`fk_module`, `fk_assessment`),
  INDEX `fk_module_assessment_reult_module1_idx` (`fk_module` ASC),
  INDEX `fk_module_assessment_reult_assessment1_idx` (`fk_assessment` ASC),
  CONSTRAINT `fk_module_assessment_reult_module1`
    FOREIGN KEY (`fk_module`)
    REFERENCES `evolved`.`module` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_module_assessment_reult_assessment1`
    FOREIGN KEY (`fk_assessment`)
    REFERENCES `evolved`.`assessment` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
