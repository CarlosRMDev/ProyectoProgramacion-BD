-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8mb3 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  `primerApellido` VARCHAR(20) NOT NULL,
  `segundoApellido` VARCHAR(20) NOT NULL,
  `correoElectronico` VARCHAR(45) NOT NULL,
  `nombreUsuario` VARCHAR(15) NOT NULL,
  `contraseña` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idUsuarios`),
  UNIQUE INDEX `nombreUsuario_UNIQUE` (`nombreUsuario` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 28
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`AcTrivial`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AcTrivial` (
  `idEstadisticasJuego3` INT NOT NULL AUTO_INCREMENT,
  `NotaMaxima` INT NULL DEFAULT NULL,
  `NumeroIntentos` INT NULL DEFAULT '0',
  `TiempoNotaMax` INT NULL DEFAULT '0',
  `Usuarios_idUsuarios` INT NOT NULL,
  PRIMARY KEY (`idEstadisticasJuego3`, `Usuarios_idUsuarios`),
  INDEX `fk_EstadisticasJuego3_Usuarios1_idx` (`Usuarios_idUsuarios` ASC) VISIBLE,
  CONSTRAINT `fk_EstadisticasJuego3_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `mydb`.`Usuarios` (`idUsuarios`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`AimBot`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AimBot` (
  `idEstadisticasPelota` INT NOT NULL AUTO_INCREMENT,
  `PuntosMax` INT NULL DEFAULT '0',
  `MaxTiempo` INT NULL DEFAULT NULL,
  `UltimaPuntuacion` INT NULL DEFAULT '0',
  `NumPartidas` INT NULL DEFAULT '0',
  `Usuarios_idUsuarios` INT NOT NULL,
  PRIMARY KEY (`idEstadisticasPelota`, `Usuarios_idUsuarios`),
  INDEX `fk_EstadisticasPelota_Usuarios_idx` (`Usuarios_idUsuarios` ASC) VISIBLE,
  CONSTRAINT `fk_EstadisticasPelota_Usuarios`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `mydb`.`Usuarios` (`idUsuarios`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`Boom`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Boom` (
  `idEstadisticasJuego2` INT NOT NULL AUTO_INCREMENT,
  `RecordIntentos` INT NULL DEFAULT NULL,
  `PartidasJugadas` INT NULL DEFAULT '0',
  `UltimaPuntuacion` INT NULL DEFAULT NULL,
  `Usuarios_idUsuarios` INT NOT NULL,
  PRIMARY KEY (`idEstadisticasJuego2`, `Usuarios_idUsuarios`),
  INDEX `fk_EstadisticasJuego2_Usuarios1_idx` (`Usuarios_idUsuarios` ASC) VISIBLE,
  CONSTRAINT `fk_EstadisticasJuego2_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `mydb`.`Usuarios` (`idUsuarios`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
