CREATE DATABASE  IF NOT EXISTS `bancobarbearia` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bancobarbearia`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bancobarbearia
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamento`
--

DROP TABLE IF EXISTS `agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendamento` (
  `id` int NOT NULL,
  `cliente` varchar(45) DEFAULT NULL,
  `data` varchar(45) DEFAULT NULL,
  `horario` varchar(45) DEFAULT NULL,
  `servico` varchar(45) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `profissional` varchar(45) DEFAULT NULL,
  `Observacao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamento`
--

LOCK TABLES `agendamento` WRITE;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
INSERT INTO `agendamento` VALUES (10,'Otavio','25/05',' 09:00','Proteses','380','Andre','Grande'),(20,'Manual','26/05',' 10:00','Cortar Cabelo','50','Math',NULL),(30,'Lais','27/05',' 11:00','Progressiva','250','Jhonny',NULL),(40,'Felipe','28/05',' 13:00','Fazer a Barba','45','Math','Na maquina'),(50,'Lucas','29/05',' 09:00','Proteses','380','Andre','Pequena'),(60,'Bruno','30/05',' 14:00','Botox','25','Jhonny',NULL),(70,'Carlos','31/05',' 12:00','Fazer a Barba','45','Math','Com navalha'),(80,'Priscila','01/05',' 10:00','Corta Cabelo','50','Jhonny',NULL),(90,'Gustavo','02/05',' 13:00','Proteses','380','Andre','Media'),(100,'Pedro','03/05',' 09:00','Fazer a Barba','45','Math','Na maquina');
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sexo` varchar(15) DEFAULT NULL,
  `nascimento` varchar(10) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `telefone` varchar(16) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  PRIMARY KEY (`idcliente`,`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Otavio','Masculino','16/04','AV Brasil','987654345','o@email','234565456'),(2,'Manual','Masculino','15/09','AV Paulista','909877656','m@email','454345676'),(3,'Lais','Feminino','17/01','AV Rio','923453678','l@email','343234567'),(4,'Felipe','Masculino','10/05','Rua Jardim ','987676765','f@email','343987678'),(5,'Lucas','Masculino','31/07','AV Europa','909876765','lu@email','567543234'),(6,'Bruno','Masculino','24/09','Rua Flores','987676564','b@email','898765654'),(7,'Carlos','Masculino','25/09','AV São Paulo','987656567','c@email','343256780'),(8,'Priscila','Feminino','31/03','Rua Aurora','987565434','p@email','234345667'),(9,'Gustavo','Masculino','28/01','Av Portugal ','987654545','g@email','324675678'),(10,'Pedro','Masculino','14/07','AV Europa ','987876565','pe@email','234576567');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `idprodutos` int NOT NULL,
  `nome` varchar(80) NOT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `quantidade` varchar(45) DEFAULT NULL,
  `fornecedor` varchar(45) DEFAULT NULL,
  `descrição` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idprodutos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'Shampoo','',5,'50','Wella',''),(2,'Condicionador',NULL,5,'50','Wella',NULL),(3,'Maquinha Para Cortar Cabelo',NULL,450,'5','Philco',NULL),(4,'Maquinha Para Fazer a Barba',NULL,700,'5','Philco',NULL),(5,'Protese Feminina',NULL,9,'7','Eternus Hair',NULL),(6,'Protese Masculina ',NULL,6.75,'9','Eternus Hair',NULL),(7,'Cola Capilar ',NULL,370,'10','L200',NULL),(8,'Peruca Feminina',NULL,3.94,'20','Loja Rivera',NULL),(9,'Escova',NULL,640,'20','Ricca',NULL),(10,'Navalha',NULL,129,'10','Enox',NULL),(11,'Pente',NULL,80,'50','Lux Hail',NULL),(12,'Gel',NULL,380,'4','Loja FL',NULL),(13,'Secador',NULL,499,'5','Philco',NULL),(14,'Prancha de Cabelo',NULL,549,'5','Philco',NULL),(15,'Tesouras',NULL,290,'10','Enox',NULL),(16,'Presilhas',NULL,193,'15','Beleza Web',NULL),(17,'Mascara Higratante',NULL,429,'20','Mans Market',NULL);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servico`
--

DROP TABLE IF EXISTS `servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servico` (
  `idservico` int NOT NULL,
  `nomeservico` varchar(45) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idservico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servico`
--

LOCK TABLES `servico` WRITE;
/*!40000 ALTER TABLE `servico` DISABLE KEYS */;
INSERT INTO `servico` VALUES (1,'Proteses','380','Visagista Andre'),(2,'Cortar Cabelo','50','Barbeiro Jhonny'),(3,'Progressiva','250','Cabeleireiro Math'),(4,'Fazer a Barba','45','Barbeiro Jhonny'),(5,'Botox','25','Cabeleireiro Math');
/*!40000 ALTER TABLE `servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` int NOT NULL,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `nascimento` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `rg` varchar(45) DEFAULT NULL,
  `niveldeacesso` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (0,'Vinny','1234','Masculino','1603','987676565','v@email','342564738','Gerente'),(1,'Caio','1234','Masculino','2805','98765645','c@email','253674536','Gerente'),(2,'Andre','1234','Masculino','1809','956805432','andre@icloud','594315678','Visagista'),(4,'Math','1234','Masculino','1008','907564532','math@email','389765467','Cabeleireiro/Barbeiro'),(6,'Jhonny','1234','Masculino','2304','908765436','jhonny@hotmail','765806523','Cabeleireiro/Barbeiro'),(8,'Camy','1234','Feminino','2507','90867543','camy@icloud','867565434','Recepcionista'),(10,'Bruna','1234','Feminino','1605','908768909','bruna@outlook','345678901','Contabilidade');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-18 20:44:06
