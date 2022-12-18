-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: krish11
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ipl_players`
--

DROP TABLE IF EXISTS `ipl_players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ipl_players` (
  `player_id` int(11) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(45) NOT NULL,
  `player_type` varchar(45) NOT NULL,
  `player_credit` varchar(5) NOT NULL,
  `player_team` varchar(45) NOT NULL,
  `player_points` varchar(20) DEFAULT NULL,
  `team_id` int(11) NOT NULL,
  PRIMARY KEY (`player_id`),
  KEY `Fk_team_id_idx` (`team_id`),
  CONSTRAINT `Fk_team_id` FOREIGN KEY (`team_id`) REFERENCES `ipl_teams` (`team_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipl_players`
--

LOCK TABLES `ipl_players` WRITE;
/*!40000 ALTER TABLE `ipl_players` DISABLE KEYS */;
INSERT INTO `ipl_players` VALUES (1,'L Rahul','WK','10','KXLP','84',4),(2,'A Tye','BOWL','9','KXLP','0',4),(3,'H Brar','AR','7.5','KXLP','0',4),(5,'Simran Singh','WK','8','KXLP','0',4),(6,'C Gayle','BAT','10.5','KXLP','0',4),(7,'M Agarwal','BAT','9','KXLP','0',4),(8,'D Miller','BAT','9','KXLP','0',4),(9,'N Poornan','BAT','8.5','KXLP','0',4),(10,'S Khan','BAT','8.5','KXLP','0',4),(11,'K Nair','BAT','8.5','KXLP','0',4),(12,'M Singh','BAT','8','KXLP','0',4),(13,'S Curran','AR','8.5','KXLP','0',4),(14,'R Ashwin','AR','8.5','KXLP','0',4),(15,'M Henriques','AR','8.5','KXLP','0',4),(16,'Mujeeb','BOWL','8.5','KXLP','0',4),(17,'H Vijloen','BOWL','8.5','KXLP','0',4),(18,'A Rajpoot','BOWL','8.5','KXLP','0',4),(19,'M Shami','BOWL','8.5','KXLP','0',4),(20,'D Nalkane','BOWL','8','KXLP','0',4),(21,'V chakravarthy','BOWL','8','KXLP','0',4),(22,'M Ashwin','BOWL','8','KXLP','0',4),(23,'A Singh','BOWL','7.5','KXLP','0',4),(24,'A Ayachi','BOWL','7.5','KXLP','0',4),(25,'N Jagadheesan','WK','7.5','CSK','0',3),(26,'M Dhoni','WK','9','CSK','0',3),(27,'S Watson','BAT','10','CSK','0',3),(28,'S Raina','BAT','9.5','CSK','0',3),(29,'F D Pleesie','BAT','9','CSK','0',3),(30,'A Rayudu','BAT','9','CSK','0',3),(31,'S Billing','BAT','8.5','CSK','0',3),(32,'K Jadhav','BAT','8.5','CSK','0',3),(33,'R Gaikawad','BAT','8','CSK','0',3),(34,'D SHorey','BAT','8','CSK','0',3),(35,'M Vijay','BAT','8','CSK','0',3),(36,'C Bhisoni','BAT','7.5','CSK','0',3),(37,'D Bravo','AR','9.5','CSK','0',3),(38,'R Jadeja','AR','8.5','CSK','0',3),(39,'M Satnner','AR','8','CSK','0',3),(40,'I Tahir','BOWL','9','CSK','0',3),(41,'S Thakur','BOWL','8.5','CSK','0',3),(42,'D Chahar','BOWL','8.5','CSK','0',3),(43,'K Asif','BOWL','8','CSK','0',3),(44,'M Sharma','BOWL','8','CSK','0',3),(45,'Karan Sharma','BOWL','8','CSK','0',3),(46,'H Singh','BOWL','8','CSK','0',3);
/*!40000 ALTER TABLE `ipl_players` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-20 16:10:44
