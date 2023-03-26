-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-03-2023 a las 19:26:39
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equiposdefutbol`
--

CREATE TABLE `equiposdefutbol` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `entrenador` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equiposdefutbol`
--

INSERT INTO `equiposdefutbol` (`id`, `nombre`, `entrenador`) VALUES
(1, 'LosMessilover', 'PapaDeMessi'),
(2, 'Junior', 'Juan Quintero'),
(3, 'Malambo F.C', 'Luis Perez'),
(7, 'LosGoleadores', 'Luisma');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `fecha` date NOT NULL,
  `nombreLocal` varchar(30) DEFAULT NULL,
  `golesLocal` int(11) DEFAULT NULL,
  `vs` varchar(10) DEFAULT NULL,
  `golesVisitante` int(11) DEFAULT NULL,
  `nombreVisitante` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partidos`
--

INSERT INTO `partidos` (`fecha`, `nombreLocal`, `golesLocal`, `vs`, `golesVisitante`, `nombreVisitante`) VALUES
('2020-12-22', 'Junior', 2, 'VS', 3, 'Malambo F.C'),
('2023-05-10', 'Junior', 10, 'VS', 1, 'Malambo F.C'),
('2023-05-11', 'Junior', 2, 'VS', 3, 'Malambo F.C'),
('2023-05-12', 'Malambo F.C', 3, 'VS', 1, 'Junior'),
('2023-06-12', 'LosGoleadores', 4, 'VS', 1, 'Junior');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`) VALUES
('0202', 'Elias'),
('1', 'LuisPerez'),
('123', 'Luis'),
('2', 'Messi'),
('3', 'Juan Noruega');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_admin`
--

CREATE TABLE `usuario_admin` (
  `id` varchar(11) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario_admin`
--

INSERT INTO `usuario_admin` (`id`, `nombre`) VALUES
('1', 'Luis');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equiposdefutbol`
--
ALTER TABLE `equiposdefutbol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`fecha`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario_admin`
--
ALTER TABLE `usuario_admin`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
