-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2020 a las 13:10:33
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `rapifood`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `id_detalle` int(11) NOT NULL,
  `cantidad_productos` int(11) NOT NULL,
  `costo` double DEFAULT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`id_detalle`, `cantidad_productos`, `costo`, `id_pedido`, `id_producto`) VALUES
(4, 0, NULL, 11, 16),
(5, 0, NULL, 11, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `id_mesa` int(11) NOT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`id_mesa`, `capacidad`, `estado`) VALUES
(1, 4, 0),
(2, 4, 1),
(3, 10, 1),
(4, 4, 0),
(5, 10, 1),
(6, 4, 1),
(7, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `id_mesero` int(11) NOT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `cuit` bigint(11) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`id_mesero`, `apellido`, `nombre`, `cuit`, `estado`, `dni`) VALUES
(1, 'Sosa', 'Lucas', 20355689890, 1, 35568989),
(2, 'Velazquez', 'Mario', 20375659790, 1, 37565979),
(3, 'Suarez', 'Martin', 20416655560, 1, 41665556),
(4, 'Alvarez', 'Juan', 20193368890, 0, 19336889);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `fecha_pedido` date DEFAULT current_timestamp(),
  `id_mesa` int(11) NOT NULL,
  `id_mesero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `estado`, `fecha_pedido`, `id_mesa`, `id_mesero`) VALUES
(11, 1, '2020-10-29', 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `codigo`, `nombre`, `precio`, `estado`) VALUES
(16, 5512366, 'parillada', 550, 1),
(17, 5516332, 'pastas', 350, 1),
(18, 5366889, 'ensalada cesar', 220, 1),
(19, 5122366, 'coca-cola', 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `comensales` int(11) DEFAULT NULL,
  `fecha_hora` datetime DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 1,
  `fecha_actual` date NOT NULL DEFAULT current_timestamp(),
  `id_mesa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`id_reserva`, `apellido`, `nombre`, `dni`, `comensales`, `fecha_hora`, `estado`, `fecha_actual`, `id_mesa`) VALUES
(7, 'Giannelli', 'Ariel', 36227267, 4, '2020-10-30 21:05:44', 0, '2020-10-29', 2),
(8, 'Teveiz', 'Ariel', 36227267, 4, '2020-11-04 00:00:00', 1, '2020-11-04', 1),
(11, 'Riquelme', 'Roman', 36227267, 4, '2020-11-04 00:00:00', 0, '2020-11-04', 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `menu_ibfk_1` (`id_pedido`),
  ADD KEY `menu_ibfk_2` (`id_producto`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`id_mesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`id_mesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_mesero` (`id_mesero`),
  ADD KEY `id_mesa` (`id_mesa`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_mesa` (`id_mesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `id_mesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `id_mesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `detalle_pedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_pedido_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_mesero`) REFERENCES `mesero` (`id_mesero`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
