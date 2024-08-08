-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.30 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para viajaseguro
CREATE DATABASE IF NOT EXISTS `viajaseguro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `viajaseguro`;

-- Volcando estructura para tabla viajaseguro.tickets_reservados
CREATE TABLE IF NOT EXISTS `tickets_reservados` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `Identificacion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Apellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Aerolinea` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Destino` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Hora_de_salida` varchar(50) COLLATE utf8mb3_bin DEFAULT NULL,
  `Hora_de_llegada` varchar(50) COLLATE utf8mb3_bin DEFAULT NULL,
  `Estado` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- Volcando datos para la tabla viajaseguro.tickets_reservados: ~8 rows (aproximadamente)
DELETE FROM `tickets_reservados`;
INSERT INTO `tickets_reservados` (`ID`, `Identificacion`, `Nombre`, `Apellido`, `Aerolinea`, `Destino`, `Hora_de_salida`, `Hora_de_llegada`, `Estado`) VALUES
	(1, '40290483729', 'Alfonso', 'Mendez', 'Spirit', 'Buenos Aires', '2024-08-05 02:45:00', '2024-08-06 06:45:00', 'Reservado'),
	(2, '402345483729', 'Andris', 'Rosa', 'Sleva', 'Madrid', '12:00 AM 08/05/24', '8:00 AM 08/05/24', 'Reservado'),
	(3, 'Identificacion', 'Perla', 'Lopez', 'Spirit', 'Santo Domingo', '6:00 AM 08/05/24', '04:00 PM 08/05/24', 'Canselada'),
	(5, 'Identificacion', 'Perla', 'Lopez', 'Spirit', 'Santo Domi', '6:00 AM 08/05/24', '04:00 PM 08/05/24', 'Canselado '),
	(6, '', '', '', '', '', '', '', ''),
	(7, '40290483729', 'Alfonso', 'Mendez', 'Spirit', 'Buenos Aires', '2024-08-05 02:45:00', '2024-08-06 07:45:00', 'Reservada'),
	(8, '', '', '', '', '', '', '', ''),
	(9, '', 'Diorkys', '', '', '', '', '', '');

-- Volcando estructura para tabla viajaseguro.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Usuario` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Contrasena` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla viajaseguro.usuarios: ~4 rows (aproximadamente)
DELETE FROM `usuarios`;
INSERT INTO `usuarios` (`id`, `Nombre`, `Apellido`, `Usuario`, `Contrasena`) VALUES
	(1, 'Andrius', 'Rosa', 'admin', 'admin'),
	(2, '', '', 'Ingresa el usuario ', 'Ingresa la contraseña'),
	(3, 'Andrius ', 'Rosa', 'admin', 'admin123'),
	(4, 'Ingresa el usuario ', 'Ingresa la contraseña', 'ada', 'ad');

-- Volcando estructura para tabla viajaseguro.vuelos
CREATE TABLE IF NOT EXISTS `vuelos` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `Aerolinea` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Destino` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci NOT NULL,
  `Hora_de_salida` varchar(50) COLLATE utf8mb3_bin NOT NULL,
  `Hora_de_llegada` varchar(50) COLLATE utf8mb3_bin NOT NULL,
  `Costo` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- Volcando datos para la tabla viajaseguro.vuelos: ~6 rows (aproximadamente)
DELETE FROM `vuelos`;
INSERT INTO `vuelos` (`ID`, `Aerolinea`, `Destino`, `Hora_de_salida`, `Hora_de_llegada`, `Costo`) VALUES
	(1, '', '', '', '', '1'),
	(12, '', '', '', '', '12'),
	(13, '', '', '', '', ''),
	(17, '', '', '', '', '12.12'),
	(18, '', '', '', '', '122.2'),
	(19, 'Colobia', 'Mexico', '', '', '12.12');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
