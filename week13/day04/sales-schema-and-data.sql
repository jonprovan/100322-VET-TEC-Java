CREATE DATABASE  IF NOT EXISTS `sales` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sales`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: sales
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Temporary view structure for view `customer_order_details`
--

DROP TABLE IF EXISTS `customer_order_details`;
/*!50001 DROP VIEW IF EXISTS `customer_order_details`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `customer_order_details` AS SELECT 
 1 AS `full_name`,
 1 AS `date`,
 1 AS `item`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `employee_id` int NOT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `manager_id` int DEFAULT NULL,
  `department_name` varchar(20) DEFAULT NULL,
  `department_number` int DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Erin','Hicks','Physical Therapist',NULL,'Sports Medicine',1),(987,'Erica','Hicks','Litter box cleaner',2233,'\'Home\'',0),(1234,'Boots','Patel','Bug Patrol',987,'\'Home\'',0),(2233,'Pinky','Patel','Seat warmer',NULL,'\'Home\'',0);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `item_id` int unsigned NOT NULL AUTO_INCREMENT,
  `item_name` varchar(50) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,'Alize Gold Passion'),(2,'Parsnip'),(3,'Cleaner - Comet'),(4,'Thyme - Fresh'),(5,'Versatainer Nc - 9388'),(6,'Mint - Fresh'),(7,'Lettuce - Sea / Sea Asparagus'),(8,'Compound - Passion Fruit'),(9,'Bread - Pain Au Liat X12'),(10,'Cheese - Cheddar With Claret'),(11,'Appetizer - Spring Roll, Veg'),(12,'Appetizer - Cheese Bites'),(13,'Allspice - Jamaican'),(14,'Potatoes - Purple, Organic'),(15,'Canada Dry'),(16,'Temperature Recording Station'),(17,'Sauce - Oyster'),(18,'Coriander - Seed'),(19,'Bread - White, Unsliced'),(20,'Pasta - Tortellini, Fresh'),(21,'EGGS');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `item_id` int unsigned DEFAULT NULL,
  `order_id` int unsigned DEFAULT NULL,
  KEY `fk_item_order` (`order_id`),
  KEY `fk_items_inventory` (`item_id`),
  CONSTRAINT `fk_item_order` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `fk_items_inventory` FOREIGN KEY (`item_id`) REFERENCES `inventory` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (11,10),(16,16),(4,15),(5,9),(10,19),(18,7),(15,17),(8,3),(8,12),(15,1),(16,9),(11,2),(3,2),(4,20),(13,7),(12,2),(4,2),(2,2),(14,14),(12,3);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int unsigned NOT NULL AUTO_INCREMENT,
  `customer` varchar(20) NOT NULL,
  `date_ordered` date NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `customer_ix` (`customer`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Westbrooke Trusslove','2022-09-27'),(2,'Spence Rackstraw','2022-01-23'),(3,'Efren Cronk','2022-01-14'),(4,'Laina Filyushkin','2022-08-11'),(5,'Roxine Cremer','2022-04-30'),(6,'Matt Paolino','2022-04-03'),(7,'Othilie Nuzzetti','2022-05-23'),(8,'Zita Hallet','2022-05-19'),(9,'Jo Layhe','2022-11-09'),(10,'Suzanna Wesson','2022-06-09'),(11,'Hamil Kubicka','2022-10-16'),(12,'Rodrigo Ateggart','2022-03-17'),(13,'Elmo Churchill','2022-06-26'),(14,'Kirstyn Andrusyak','2022-09-20'),(15,'Burt Russen','2022-02-16'),(16,'Cortie Bretton','2022-12-11'),(17,'Kermit Giacopelo','2022-09-08'),(18,'Chevalier Demelt','2022-09-06'),(19,'Christie Gogerty','2022-06-12'),(20,'Schuyler Lipmann','2022-08-23'),(21,'Elmo# Churchill','2022-12-22'),(22,'elmo churchill','2022-12-22');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sales'
--
/*!50003 DROP PROCEDURE IF EXISTS `get_customers` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_customers`()
BEGIN
   SELECT customer
   FROM orders;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `get_customer_order_info` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_customer_order_info`()
BEGIN

  -- I can declare variables
  DECLARE first_customer VARCHAR(20);
  DECLARE my_variable VARCHAR(20); -- declares a variable
  SET my_variable = 'Hello!'; -- assigns the value to a variable
  
  
  SELECT customer
  INTO first_customer -- assigns the value to a variable
  FROM orders
  ORDER BY customer ASC
  LIMIT 1;
  
  
  SELECT customer, date_ordered, item_name
FROM
   orders o    
      INNER JOIN
   items it ON it.order_id = o.order_id 
      INNER JOIN
   inventory inv ON inv.item_id = it.item_id
WHERE customer = first_customer;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `customer_order_details`
--

/*!50001 DROP VIEW IF EXISTS `customer_order_details`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `customer_order_details` (`full_name`,`date`,`item`) AS select `o`.`customer` AS `customer`,`o`.`date_ordered` AS `date_ordered`,`inv`.`item_name` AS `item_name` from ((`orders` `o` join `items` `it` on((`it`.`order_id` = `o`.`order_id`))) join `inventory` `inv` on((`inv`.`item_id` = `it`.`item_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-05 11:56:43
