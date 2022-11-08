-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdbanco
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdbanco
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdbanco` DEFAULT CHARACTER SET latin1 ;
USE `bdbanco` ;

-- -----------------------------------------------------
-- Table `bdbanco`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdbanco`.`usuarios` (
  `dni` VARCHAR(8) NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `cuil` VARCHAR(45) NOT NULL,
  `sexo` CHAR(1) NULL DEFAULT NULL,
  `fechaNac` DATE NULL DEFAULT NULL,
  `direc` VARCHAR(45) NULL DEFAULT NULL,
  `nacionalidad` VARCHAR(45) NULL DEFAULT NULL,
  `localidad` VARCHAR(45) NULL DEFAULT NULL,
  `provincia` VARCHAR(45) NULL DEFAULT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `activo` BIT(1) NOT NULL DEFAULT b'1',
  `admin` BIT(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`dni`),
  UNIQUE INDEX `usuario_UNIQUE` (`usuario` ASC),
  UNIQUE INDEX `cuil_UNIQUE` (`cuil` ASC),
  UNIQUE INDEX `mail_UNIQUE` (`mail` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bdbanco`.`cuentas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdbanco`.`cuentas` (
  `idCuenta` BIGINT(20) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  `numCuenta` BIGINT(20) NOT NULL,
  `cbu` BIGINT(20) NOT NULL,
  `fechaCreacion` DATE NULL DEFAULT NULL,
  `saldo` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idCuenta`, `dni`),
  UNIQUE INDEX `numCuenta_UNIQUE` (`numCuenta` ASC),
  UNIQUE INDEX `cbu_UNIQUE` (`cbu` ASC),
  INDEX `idUsuario_idx` (`dni` ASC),
  CONSTRAINT `idUsuario`
    FOREIGN KEY (`dni`)
    REFERENCES `bdbanco`.`usuarios` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bdbanco`.`movimientos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdbanco`.`movimientos` (
  `idMov` BIGINT(20) NOT NULL,
  `idCuenta` BIGINT(20) NOT NULL,
  `tipo` INT(11) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `detalle` VARCHAR(75) NULL DEFAULT NULL,
  `importe` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idMov`),
  INDEX `idCuenta_idx` (`idCuenta` ASC),
  CONSTRAINT `idCuenta`
    FOREIGN KEY (`idCuenta`)
    REFERENCES `bdbanco`.`cuentas` (`idCuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bdbanco`.`prestamos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdbanco`.`prestamos` (
  `idPrestamo` BIGINT(20) NOT NULL,
  `dniUsuario` VARCHAR(8) NOT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `plazo` INT(11) NULL DEFAULT NULL,
  `cuotas` INT(11) NULL DEFAULT NULL,
  `importeSolicitado` DOUBLE NULL DEFAULT NULL,
  `importeFinal` DOUBLE NULL DEFAULT NULL,
  `importeMes` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idPrestamo`),
  INDEX `dniUsuario_idx` (`dniUsuario` ASC),
  CONSTRAINT `dniUsuario`
    FOREIGN KEY (`dniUsuario`)
    REFERENCES `bdbanco`.`usuarios` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
