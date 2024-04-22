-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: db
-- Tiempo de generación: 22-04-2024 a las 12:51:49
-- Versión del servidor: 8.3.0
-- Versión de PHP: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mydb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadisticasJuego2`
--

CREATE TABLE `EstadisticasJuego2` (
  `idEstadisticasJuego2` int NOT NULL,
  `Puntos` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadisticasJuego3`
--

CREATE TABLE `EstadisticasJuego3` (
  `idEstadisticasJuego3` int NOT NULL,
  `Puntos` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadisticasPelota`
--

CREATE TABLE `EstadisticasPelota` (
  `idEstadisticasPelota` int NOT NULL,
  `Puntos` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE `Usuarios` (
  `idUsuarios` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidos 1` varchar(45) NOT NULL,
  `apellidos 2` varchar(45) NOT NULL,
  `correoElectronico` varchar(45) NOT NULL,
  `nombreUsuario` varchar(15) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `EstadisticasPelota_idEstadisticasPelota` int NOT NULL,
  `EstadisticasJuego2_idEstadisticasJuego2` int NOT NULL,
  `EstadisticasJuego3_idEstadisticasJuego3` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `EstadisticasJuego2`
--
ALTER TABLE `EstadisticasJuego2`
  ADD PRIMARY KEY (`idEstadisticasJuego2`);

--
-- Indices de la tabla `EstadisticasJuego3`
--
ALTER TABLE `EstadisticasJuego3`
  ADD PRIMARY KEY (`idEstadisticasJuego3`);

--
-- Indices de la tabla `EstadisticasPelota`
--
ALTER TABLE `EstadisticasPelota`
  ADD PRIMARY KEY (`idEstadisticasPelota`);

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  ADD PRIMARY KEY (`idUsuarios`,`EstadisticasPelota_idEstadisticasPelota`,`EstadisticasJuego2_idEstadisticasJuego2`,`EstadisticasJuego3_idEstadisticasJuego3`),
  ADD UNIQUE KEY `nombreUsuario_UNIQUE` (`nombreUsuario`),
  ADD UNIQUE KEY `correoElectronico_UNIQUE` (`correoElectronico`),
  ADD KEY `fk_Usuarios_EstadisticasPelota1_idx` (`EstadisticasPelota_idEstadisticasPelota`),
  ADD KEY `fk_Usuarios_EstadisticasJuego21_idx` (`EstadisticasJuego2_idEstadisticasJuego2`),
  ADD KEY `fk_Usuarios_EstadisticasJuego31_idx` (`EstadisticasJuego3_idEstadisticasJuego3`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `EstadisticasJuego2`
--
ALTER TABLE `EstadisticasJuego2`
  MODIFY `idEstadisticasJuego2` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `EstadisticasJuego3`
--
ALTER TABLE `EstadisticasJuego3`
  MODIFY `idEstadisticasJuego3` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `EstadisticasPelota`
--
ALTER TABLE `EstadisticasPelota`
  MODIFY `idEstadisticasPelota` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  MODIFY `idUsuarios` int NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  ADD CONSTRAINT `fk_Usuarios_EstadisticasJuego21` FOREIGN KEY (`EstadisticasJuego2_idEstadisticasJuego2`) REFERENCES `EstadisticasJuego2` (`idEstadisticasJuego2`),
  ADD CONSTRAINT `fk_Usuarios_EstadisticasJuego31` FOREIGN KEY (`EstadisticasJuego3_idEstadisticasJuego3`) REFERENCES `EstadisticasJuego3` (`idEstadisticasJuego3`),
  ADD CONSTRAINT `fk_Usuarios_EstadisticasPelota1` FOREIGN KEY (`EstadisticasPelota_idEstadisticasPelota`) REFERENCES `EstadisticasPelota` (`idEstadisticasPelota`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
