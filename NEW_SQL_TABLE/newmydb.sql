-- MySQL dump 10.13  Distrib 5.5.49, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.5.49-0ubuntu0.14.04.1

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
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendance` (
  `att_year` int(11) NOT NULL,
  `att_month` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `att_count` int(11) NOT NULL,
  `att_salary` float(12,2) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_att_emp` (`emp_id`),
  CONSTRAINT `fk_att_emp` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (2016,1,10001,20,0.00,1),(2016,1,10002,20,0.00,2),(2016,1,10003,20,0.00,3),(2016,1,10004,20,0.00,4),(2016,1,10005,20,0.00,5),(2016,1,10006,20,0.00,6),(2016,1,10007,20,0.00,7),(2016,1,10008,20,0.00,8),(2016,1,10009,20,0.00,9),(2016,2,10001,20,0.00,10),(2016,2,10002,20,0.00,11),(2016,2,10003,20,0.00,12),(2016,2,10004,20,0.00,13),(2016,2,10005,20,0.00,14),(2016,2,10006,20,0.00,15),(2016,2,10007,20,0.00,16),(2016,2,10008,20,0.00,17),(2016,2,10009,20,0.00,18),(2016,3,10001,20,0.00,19),(2016,3,10002,20,0.00,20),(2016,3,10003,20,0.00,21),(2016,3,10004,20,0.00,22),(2016,3,10005,20,0.00,23),(2016,3,10006,20,0.00,24),(2016,3,10007,20,0.00,25),(2016,3,10008,20,0.00,26),(2016,3,10009,20,0.00,27),(2016,4,10001,20,0.00,28),(2016,4,10002,20,0.00,29),(2016,4,10003,20,0.00,30),(2016,4,10004,20,0.00,31),(2016,4,10005,20,0.00,32),(2016,4,10006,20,0.00,33),(2016,4,10007,20,0.00,34),(2016,4,10008,20,0.00,35),(2016,4,10009,20,0.00,36);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `dept_id` int(11) NOT NULL,
  `dept_name` varchar(20) NOT NULL,
  `manager` varchar(20) NOT NULL,
  `depttel` int(11) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (30001,'销售部','广天真',1111111),(30002,'研发部','俞曾琪',2222222),(30003,'人事部','盘乐然',3333333),(30004,'客户管理部','厉文星',4444444);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL,
  `name` varchar(5) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `emptel` varchar(11) DEFAULT NULL,
  `job_id` int(11) NOT NULL,
  `dept_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `fk_employee_job` (`job_id`),
  KEY `fk_employee_dept` (`dept_id`),
  CONSTRAINT `fk_employee_dept` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`),
  CONSTRAINT `fk_employee_job` FOREIGN KEY (`job_id`) REFERENCES `job` (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (10001,'广天真','男',30,'幸福街一号','111111',20001,30001),(10002,'俞曾琪','女',25,'幸福街二号','222222',20002,30002),(10003,'盘乐然','女',26,'幸福街一号','333333',20001,30003),(10004,'厉文星','男',26,'幸福街二号','444444',20002,30004),(10005,'于斯雅','女',40,'幸福街一号','555555',20003,30001),(10006,'王小明','男',32,'幸福街二号','666666',20001,30002),(10007,'李晓华','男',23,'幸福街一号','777777',20002,30003),(10008,'巫行云','男',46,'幸福街二号','888888',20003,30004),(10009,'赵云芳','女',50,'幸福街一号','999999',20004,30001);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job` (
  `job_id` int(11) NOT NULL,
  `job_name` varchar(20) NOT NULL,
  `salary` float(12,2) NOT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
INSERT INTO `job` VALUES (20001,'CEO',20000.00),(20002,'经理',15000.00),(20003,'部门主管',10000.00),(20004,'普通职工',5000.00);
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-30 23:54:56
