-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: db
-- Tiempo de generación: 02-05-2024 a las 10:27:07
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
  `Puntos` int DEFAULT NULL,
  `Usuarios_idUsuarios` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadisticasJuego3`
--

CREATE TABLE `EstadisticasJuego3` (
  `idEstadisticasJuego3` int NOT NULL,
  `Puntos` int DEFAULT NULL,
  `Usuarios_idUsuarios` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadisticasPelota`
--

CREATE TABLE `EstadisticasPelota` (
  `idEstadisticasPelota` int NOT NULL,
  `Puntos` int DEFAULT NULL,
  `MaxTiempo` int DEFAULT NULL,
  `Usuarios_idUsuarios` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE `Usuarios` (
  `idUsuarios` int NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `primerApellido` varchar(20) NOT NULL,
  `segundoApellido` varchar(20) NOT NULL,
  `correoElectronico` varchar(45) NOT NULL,
  `nombreUsuario` varchar(15) NOT NULL,
  `contraseña` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `EstadisticasJuego2`
--
ALTER TABLE `EstadisticasJuego2`
  ADD PRIMARY KEY (`idEstadisticasJuego2`,`Usuarios_idUsuarios`),
  ADD KEY `fk_EstadisticasJuego2_Usuarios1_idx` (`Usuarios_idUsuarios`);

--
-- Indices de la tabla `EstadisticasJuego3`
--
ALTER TABLE `EstadisticasJuego3`
  ADD PRIMARY KEY (`idEstadisticasJuego3`,`Usuarios_idUsuarios`),
  ADD KEY `fk_EstadisticasJuego3_Usuarios1_idx` (`Usuarios_idUsuarios`);

--
-- Indices de la tabla `EstadisticasPelota`
--
ALTER TABLE `EstadisticasPelota`
  ADD PRIMARY KEY (`idEstadisticasPelota`,`Usuarios_idUsuarios`),
  ADD KEY `fk_EstadisticasPelota_Usuarios_idx` (`Usuarios_idUsuarios`);

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  ADD PRIMARY KEY (`idUsuarios`),
  ADD UNIQUE KEY `nombreUsuario_UNIQUE` (`nombreUsuario`);

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
  MODIFY `idUsuarios` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `EstadisticasJuego2`
--
ALTER TABLE `EstadisticasJuego2`
  ADD CONSTRAINT `fk_EstadisticasJuego2_Usuarios1` FOREIGN KEY (`Usuarios_idUsuarios`) REFERENCES `Usuarios` (`idUsuarios`);

--
-- Filtros para la tabla `EstadisticasJuego3`
--
ALTER TABLE `EstadisticasJuego3`
  ADD CONSTRAINT `fk_EstadisticasJuego3_Usuarios1` FOREIGN KEY (`Usuarios_idUsuarios`) REFERENCES `Usuarios` (`idUsuarios`);

--
-- Filtros para la tabla `EstadisticasPelota`
--
ALTER TABLE `EstadisticasPelota`
  ADD CONSTRAINT `fk_EstadisticasPelota_Usuarios` FOREIGN KEY (`Usuarios_idUsuarios`) REFERENCES `Usuarios` (`idUsuarios`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
