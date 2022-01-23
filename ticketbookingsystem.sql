-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 23, 2022 at 08:46 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ticketbookingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `auditorium`
--

CREATE TABLE `auditorium` (
  `AuditoriumNumber` int(11) NOT NULL,
  `AuditoriumCapacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `auditorium`
--

INSERT INTO `auditorium` (`AuditoriumNumber`, `AuditoriumCapacity`) VALUES
(1, 20),
(2, 30),
(3, 25),
(4, 50),
(5, 100);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `CustomerSurname` varchar(30) DEFAULT NULL,
  `CustomerEmail` varchar(50) NOT NULL,
  `CustomerAge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustomerName`, `CustomerSurname`, `CustomerEmail`, `CustomerAge`) VALUES
('Arber', 'Jashari', 'arbist@gmail.com', 34),
('Aurora', 'Topojani', 'auroratopojani47@gmail.com', 20),
('Aurora', 'Topojani', 'auroratopojani@gmail.com', 20),
('Florina', 'Ramadani', 'florinar@gmail.com', 24),
('Jon', 'Java', 'jonjava@gmail.com', 21),
('Kan', 'Misini', 'kanmisini@gmail.com', 20),
('Lejla', 'Ramadani', 'lejlaramadani@gmail.com', 15),
('Sara', 'Jashari', 'sj28619@seeu.edu.mk', 21),
('Sulejma', 'Kurtishi', 'sulejmakur@gmail.com', 20),
('Taulant', 'Avdili', 'tavdili@gmail.com', 21);

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `MovieName` varchar(30) NOT NULL,
  `MovieCategory` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`MovieName`, `MovieCategory`) VALUES
('Avengers: Endgame', 'Action'),
('Don\'t Look Up', 'Comedy'),
('Frozen', 'Cartoon'),
('Harry Potter', 'Fantasy'),
('Interstellar', 'Sci-Fi'),
('Spiderman: No Way Home', 'Action/Adventure'),
('The Godfather', 'Crime'),
('The Notebook', 'Romance'),
('The Pianist', 'Drama'),
('Titanic', 'Romance/Drama');

-- --------------------------------------------------------

--
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
  `SeatNumber` int(11) NOT NULL,
  `AuditoriumNumber` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seat`
--

INSERT INTO `seat` (`SeatNumber`, `AuditoriumNumber`) VALUES
(10, 1),
(13, 1),
(29, 2),
(9, 3),
(36, 3),
(41, 4),
(26, 5),
(48, 5),
(53, 5),
(87, 5);

-- --------------------------------------------------------

--
-- Table structure for table `streams`
--

CREATE TABLE `streams` (
  `SAuditoriumNr` int(11) NOT NULL,
  `SMovieName` varchar(30) NOT NULL,
  `StreamsDate` date DEFAULT NULL,
  `StreamsTime` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `streams`
--

INSERT INTO `streams` (`SAuditoriumNr`, `SMovieName`, `StreamsDate`, `StreamsTime`) VALUES
(2, 'The Godfather', '2021-06-15', '15:15:00'),
(3, 'The Notebook', '2021-06-20', '19:15:00'),
(3, 'The Pianist', '2021-06-19', '14:20:00'),
(4, 'Avengers: Endgame', '2021-06-15', '20:00:00'),
(4, 'Harry Potter', '2021-06-20', '20:45:00'),
(4, 'Interstellar', '2021-06-18', '15:50:00'),
(5, 'Interstellar', '2021-06-10', '18:00:00'),
(5, 'The Notebook', '2021-07-07', '22:30:00'),
(5, 'Titanic', '2021-06-07', '21:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `TicketID` varchar(15) NOT NULL,
  `TicketDate` date DEFAULT NULL,
  `TicketTime` time DEFAULT NULL,
  `TicketFee` float DEFAULT NULL,
  `TicketSeatNr` int(11) DEFAULT NULL,
  `TMovieName` varchar(30) DEFAULT NULL,
  `TCustomerEmail` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`TicketID`, `TicketDate`, `TicketTime`, `TicketFee`, `TicketSeatNr`, `TMovieName`, `TCustomerEmail`) VALUES
('14785', '2022-01-25', '22:00:00', 15, 41, 'Avengers: Endgame', 'auroratopojani47@gmail.com'),
('15478', '2021-07-07', '19:15:00', 5, 9, 'The Notebook', 'lejlaramadani@gmail.com'),
('19112', '2021-06-07', '21:00:00', 5, 87, 'Titanic', 'sulejmakur@gmail.com'),
('19529', '2021-06-07', '21:00:00', 5, 48, 'Titanic', 'kanmisini@gmail.com'),
('19557', '2021-06-15', '15:15:00', 5, 29, 'The GodFather', 'kanmisini@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `auditorium`
--
ALTER TABLE `auditorium`
  ADD PRIMARY KEY (`AuditoriumNumber`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerEmail`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`MovieName`);

--
-- Indexes for table `seat`
--
ALTER TABLE `seat`
  ADD PRIMARY KEY (`SeatNumber`),
  ADD KEY `auditoriumNr_FK` (`AuditoriumNumber`);

--
-- Indexes for table `streams`
--
ALTER TABLE `streams`
  ADD PRIMARY KEY (`SAuditoriumNr`,`SMovieName`),
  ADD KEY `SMovieName_FK` (`SMovieName`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`TicketID`),
  ADD KEY `TicketSeat_FK` (`TicketSeatNr`),
  ADD KEY `TicketMovie_FK` (`TMovieName`),
  ADD KEY `TicketEmail_FK` (`TCustomerEmail`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `seat`
--
ALTER TABLE `seat`
  ADD CONSTRAINT `auditoriumNr_FK` FOREIGN KEY (`AuditoriumNumber`) REFERENCES `auditorium` (`AuditoriumNumber`);

--
-- Constraints for table `streams`
--
ALTER TABLE `streams`
  ADD CONSTRAINT `SAuditoriumNr_FK` FOREIGN KEY (`SAuditoriumNr`) REFERENCES `auditorium` (`AuditoriumNumber`),
  ADD CONSTRAINT `SMovieName_FK` FOREIGN KEY (`SMovieName`) REFERENCES `movie` (`MovieName`);

--
-- Constraints for table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `TicketEmail_FK` FOREIGN KEY (`TCustomerEmail`) REFERENCES `customer` (`CustomerEmail`),
  ADD CONSTRAINT `TicketMovie_FK` FOREIGN KEY (`TMovieName`) REFERENCES `movie` (`MovieName`),
  ADD CONSTRAINT `TicketSeat_FK` FOREIGN KEY (`TicketSeatNr`) REFERENCES `seat` (`SeatNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
