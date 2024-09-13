CREATE DATABASE  IF NOT EXISTS `inventory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `inventory`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: inventory
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `idcategories` int NOT NULL,
  `categoryname` varchar(45) NOT NULL,
  PRIMARY KEY (`idcategories`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1001,'Water'),(1103,'Juice'),(1888,'Cigarette'),(3847,'Candy'),(5454,'Potato chips'),(5555,'Soft Drinks'),(8988,'Chocolate');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1112,'Tyler Chung','Bridgeport','68456543'),(1113,'John Wood','Han Lane','23234222'),(1145,'Jonathan Tree','Downhill Drive','8767645'),(3222,'Emily Smith','Austin','+32 23876555'),(4355,'Bob Stone','Aberdeen','43434333'),(4542,'Jason Chow','Lookout Link','76325235'),(9999,'Matthew Larkins','Dragon peak','278395765');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `pid` int NOT NULL,
  `productname` varchar(45) NOT NULL,
  `costprice` double NOT NULL,
  `productcat` varchar(45) DEFAULT NULL,
  `productsup` varchar(45) DEFAULT NULL,
  `productqty` int NOT NULL,
  `restockqty` int NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (317,'Soda Water',9,'Water','Schweppes ',76,15),(318,'Tonic Water',9,'Water','Schweppes ',13,15),(1111,'Fiji Water',6,'Water','Adrian',67,40),(1121,'Evian Water',33,'Water','Schweppes ',203,12),(1122,'Ginger Ale',9,'Soft Drinks','Schweppes ',10,6),(1123,'Ginger Beer',9,'Soft Drinks','Schweppes ',10,6),(1124,'Lemonade',17,'Soft Drinks','Schweppes ',50,15),(1125,'Grape Juice',19,'Soft Drinks','Schweppes ',500,15),(1126,'Tomato Chips',19,'Potato chips','Adrian',20,15),(1127,'Super Spicy Chips',19,'Potato chips','Calbee',80,15),(1128,'Cheese Chips',19,'Potato chips','Calbee',80,15),(1129,'BBQ Chips',19,'Potato chips','Calbee',80,15),(1130,'Sour Cream Chips',19,'Potato chips','Calbee',80,15),(1131,'Salty Chips',19,'Potato chips','Calbee',80,15),(2382,'Doritos Chips',12,'Potato chips','Frito Lay',66,5),(2383,'Sea Salt Chips',12,'Potato chips','Frito Lay',80,5),(3222,'Tonic Water',6,'Water','Schweppes ',67,40),(3273,'Perrier Water',9,'Water','Schweppes ',23,10),(3279,'Perrier Water',9,'Water','Schweppes ',23,10),(3333,'Sprite',9,'Soft Drinks','Schweppes ',123,12),(5555,'Coca Cola',8,'Soft Drinks','Schweppes ',3,5),(6745,'Chili Chip',12,'Potato chips','Calbee',3,10),(6746,'Potato Chips',15,'Potato chips','Calbee',16,20),(8764,'Twix Bar',8,'Candy','Mars',7,15),(8765,'Mars Bar',12,'Candy','Mars',16,15),(8766,'Snickers Bar',12,'Candy','Mars',55,15);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesinfo`
--

DROP TABLE IF EXISTS `salesinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salesinfo` (
  `salesid` int NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `quantity` int NOT NULL,
  `revenue` double NOT NULL,
  PRIMARY KEY (`salesid`)
) ENGINE=InnoDB AUTO_INCREMENT=2037 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesinfo`
--

LOCK TABLES `salesinfo` WRITE;
/*!40000 ALTER TABLE `salesinfo` DISABLE KEYS */;
INSERT INTO `salesinfo` VALUES (2013,'7 Dec 2022','1111','301',6,198),(2014,'7 Dec 2022','1111','301',4,132),(2015,'8 Dec 2022','1121','301',10,330),(2017,'23 Jan 2023','5555','1112',5,40),(2018,'23 Jan 2023','5555','1112',30,240),(2019,'23 Jan 2023','5555','1112',8,64),(2020,'23 Jan 2023','5555','1112',2,16),(2023,'23 Jan 2023','1121','1112',4,132),(2026,'23 Jan 2023','1121','1112',4,132),(2029,'26 Jan 2023','318','1113',10,90),(2030,'1 Feb 2023','1126','1113',10,190),(2031,'23 Jan 2023','1126','1113',20,380),(2035,'11 Mar 2023','3375','3222',5,40),(2036,'12 Mar 2023','8765','4355',4,48);
/*!40000 ALTER TABLE `salesinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=65466 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (401,'Schweppes ','Tsing Yi','5654345633','schweppes@com.com'),(403,'Calbee','Nessle Road','674426432','calbee@company.com'),(555,'Adrian','Hank Lane','95313330','alexander.luedi16@sec.ycis-hk.com'),(556,'Frito Lay','New Orleans','97658769','fritolay@lays.com'),(5432,'Mars','Austria','9876443','marsco@co.com');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (56,'Cesar','Raffles Street','34222235','Employee','Employee1','EMPLOYEE'),(70,'Alex','Wilker Street','65456333','Admin','1234567Xa','ADMINISTRATOR');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-16 14:31:18
