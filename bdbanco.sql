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
CREATE TABLE `cuentas` (
  `idCuenta` bigint(20) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `numCuenta` bigint(20) NOT NULL,
  `cbu` bigint(20) NOT NULL,
  `fechaCreacion` date DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCuenta`,`dni`),
  KEY `idUsuario_idx` (`dni`),
  KEY `tipo_idx` (`tipo`),
  CONSTRAINT `idUsuario` FOREIGN KEY (`dni`) REFERENCES `usuarios` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tipoc` FOREIGN KEY (`tipo`) REFERENCES `tipocuenta` (`idTipoCuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `movimientos` (
  `idMov` bigint(20) NOT NULL,
  `idCuenta` bigint(20) NOT NULL,
  `tipo` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `detalle` varchar(75) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idMov`),
  KEY `idCuenta_idx` (`idCuenta`),
  KEY `tipo_idx` (`tipo`),
  CONSTRAINT `idCuenta` FOREIGN KEY (`idCuenta`) REFERENCES `cuentas` (`idCuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tipo` FOREIGN KEY (`tipo`) REFERENCES `tipomoviemiento` (`idtipomoviemiento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `prestamos` (
  `idPrestamo` bigint(20) NOT NULL,
  `dniUsuario` varchar(8) NOT NULL,
  `fecha` date DEFAULT NULL,
  `plazo` int(11) DEFAULT NULL,
  `cuotas` int(11) DEFAULT NULL,
  `importeSolicitado` double DEFAULT NULL,
  `importeFinal` double DEFAULT NULL,
  `importeMes` double DEFAULT NULL,
  PRIMARY KEY (`idPrestamo`),
  KEY `dniUsuario_idx` (`dniUsuario`),
  CONSTRAINT `dniUsuario` FOREIGN KEY (`dniUsuario`) REFERENCES `usuarios` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tipocuenta` (
  `idTipoCuenta` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipoCuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tipomoviemiento` (
  `idtipomoviemiento` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipomoviemiento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `usuarios` (
  `dni` varchar(8) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `cuil` varchar(45) NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  `direc` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `mail` varchar(45) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `admin` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
