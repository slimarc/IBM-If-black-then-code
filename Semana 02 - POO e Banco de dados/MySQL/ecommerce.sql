-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema farmacia
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema farmacia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `farmacia` DEFAULT CHARACTER SET utf8 ;
USE `farmacia` ;

-- -----------------------------------------------------
-- Table `farmacia`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`Cliente` (
  `idClientes` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `tel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClientes`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) VISIBLE,
  UNIQUE INDEX `tel_UNIQUE` (`tel` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`Departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`Departamento` (
  `codDepartamento` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `descricao` TEXT NULL,
  PRIMARY KEY (`codDepartamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`Produto` (
  `codProduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` TEXT NULL,
  `preco` DOUBLE NULL,
  `estoque` INT NULL,
  `Departamento_codDepartamento` INT NOT NULL,
  PRIMARY KEY (`codProduto`),
  INDEX `fk_Produto_Departamento_idx` (`Departamento_codDepartamento` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_Departamento`
    FOREIGN KEY (`Departamento_codDepartamento`)
    REFERENCES `farmacia`.`Departamento` (`codDepartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`Endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`Endereco` (
  `idEndereco` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NULL,
  `logradouro` VARCHAR(45) NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `cep` VARCHAR(10) NULL,
  `estado` VARCHAR(2) NULL,
  `Cliente_idClientes` INT NOT NULL,
  PRIMARY KEY (`idEndereco`),
  INDEX `fk_Endereco_Cliente1_idx` (`Cliente_idClientes` ASC) VISIBLE,
  CONSTRAINT `fk_Endereco_Cliente1`
    FOREIGN KEY (`Cliente_idClientes`)
    REFERENCES `farmacia`.`Cliente` (`idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`compra` (
  `idCompra` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NULL,
  `valor_bruto` DOUBLE NULL,
  `status` VARCHAR(1) NULL,
  `desconto` DOUBLE NULL,
  `valor_final` DOUBLE NULL,
  `Cliente_idClientes` INT NOT NULL,
  PRIMARY KEY (`idCompra`),
  INDEX `fk_compra_Cliente1_idx` (`Cliente_idClientes` ASC) VISIBLE,
  CONSTRAINT `fk_compra_Cliente1`
    FOREIGN KEY (`Cliente_idClientes`)
    REFERENCES `farmacia`.`Cliente` (`idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`itensPedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`itensPedidos` (
  `num_sequencial` INT NOT NULL,
  `compra_idCompra` INT NOT NULL,
  `Produto_codProduto` INT NOT NULL,
  `quantidade` INT NULL,
  `valor_unico` DOUBLE NULL,
  `valor_total` DOUBLE NULL,
  PRIMARY KEY (`num_sequencial`),
  INDEX `fk_compra_has_Produto_Produto1_idx` (`Produto_codProduto` ASC) VISIBLE,
  INDEX `fk_compra_has_Produto_compra1_idx` (`compra_idCompra` ASC) VISIBLE,
  CONSTRAINT `fk_compra_has_Produto_compra1`
    FOREIGN KEY (`compra_idCompra`)
    REFERENCES `farmacia`.`compra` (`idCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_compra_has_Produto_Produto1`
    FOREIGN KEY (`Produto_codProduto`)
    REFERENCES `farmacia`.`Produto` (`codProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
