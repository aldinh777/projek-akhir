-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30 Apr 2018 pada 09.29
-- Versi Server: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pasmbd`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `id` varchar(10) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `deskripsi` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id`, `nama`, `deskripsi`) VALUES
('Kat001', 'A', 'Mass'),
('Kat002', 'B', 'Mass'),
('Kat003', 'C', 'Red'),
('Kat004', 'D', 'Red'),
('Kat005', 'E', 'Red'),
('Kat006', 'F', 'Gold'),
('Kat007', 'G', 'Gold'),
('Kat008', 'H', 'Gold'),
('Kat009', 'I', 'Priority'),
('Kat010', 'J', 'Priority');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kuota`
--

CREATE TABLE `kuota` (
  `id` varchar(10) NOT NULL,
  `masaaktif` date DEFAULT NULL,
  `kuota_sms` int(100) DEFAULT NULL,
  `kuota_telpon` int(100) DEFAULT NULL,
  `kuota_internet` int(100) DEFAULT NULL,
  `id_telpon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kuota`
--

INSERT INTO `kuota` (`id`, `masaaktif`, `kuota_sms`, `kuota_telpon`, `kuota_internet`, `id_telpon`) VALUES
('Kuo001', '2018-12-12', 100, 100, 100, 'Tel001'),
('Kuo002', '2018-12-12', 100, 100, 100, 'Tel002'),
('Kuo003', '2018-12-12', 100, 100, 100, 'Tel003'),
('Kuo004', '2018-12-12', 100, 100, 100, 'Tel004'),
('Kuo005', '2018-12-12', 100, 100, 100, 'Tel005'),
('Kuo006', '2018-12-12', 100, 100, 100, 'Tel006'),
('Kuo007', '2018-12-12', 100, 100, 100, 'Tel007'),
('Kuo008', '2018-12-12', 100, 100, 100, 'Tel008'),
('Kuo009', '2018-12-12', 100, 100, 100, 'Tel009'),
('Kuo010', '2018-12-12', 100, 100, 100, 'Tel010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `paket`
--

CREATE TABLE `paket` (
  `id` varchar(10) NOT NULL,
  `namapaket` varchar(10) DEFAULT NULL,
  `paket_internet` varchar(10) DEFAULT NULL,
  `paket_sms` varchar(10) DEFAULT NULL,
  `paket_telpon` varchar(10) DEFAULT NULL,
  `harga` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `paket`
--

INSERT INTO `paket` (`id`, `namapaket`, `paket_internet`, `paket_sms`, `paket_telpon`, `harga`) VALUES
('Pak001', 'SMS Super1', '0', '1000', '0', 1000),
('Pak002', 'SMS Super2', '0', '2000', '0', 2000),
('Pak003', 'SMS Super3', '0', '3000', '0', 3000),
('Pak004', 'Telepon Su', '0', '0', '1000', 11000),
('Pak005', 'Telepon Su', '0', '0', '2000', 12000),
('Pak006', 'Telepon Su', '0', '0', '3000', 13000),
('Pak007', 'Telepon Su', '0', '0', '4000', 14000),
('Pak008', 'Telepon Su', '0', '0', '5000', 15000),
('Pak009', 'Internet S', '1000', '0', '0', 110000),
('Pak010', 'Internet S', '10000', '0', '0', 210000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` varchar(10) NOT NULL,
  `notelpon` int(12) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `id_telpon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `notelpon`, `username`, `id_telpon`) VALUES
('Pel001', 1, 'A', 'Tel001'),
('Pel002', 2, 'B', 'Tel002'),
('Pel003', 3, 'C', 'Tel003'),
('Pel004', 4, 'D', 'Tel004'),
('Pel005', 5, 'E', 'Tel005'),
('Pel006', 6, 'F', 'Tel006'),
('Pel007', 7, 'G', 'Tel007'),
('Pel008', 8, 'H', 'Tel008'),
('Pel009', 9, 'I', 'Tel009'),
('Pel010', 10, 'J', 'Tel010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `poin`
--

CREATE TABLE `poin` (
  `id` varchar(10) NOT NULL,
  `jumlahpoin` int(100) DEFAULT NULL,
  `id_kategori` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `poin`
--

INSERT INTO `poin` (`id`, `jumlahpoin`, `id_kategori`) VALUES
('Poi001', 100, 'Kat001'),
('Poi002', 100, 'Kat002'),
('Poi003', 100, 'Kat003'),
('Poi004', 100, 'Kat004'),
('Poi005', 100, 'Kat005'),
('Poi006', 100, 'Kat006'),
('Poi007', 100, 'Kat007'),
('Poi008', 100, 'Kat008'),
('Poi009', 100, 'Kat009'),
('Poi010', 100, 'Kat010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pulsa`
--

CREATE TABLE `pulsa` (
  `id` varchar(10) NOT NULL,
  `harga` int(100) DEFAULT NULL,
  `kode` varchar(10) DEFAULT NULL,
  `poin` int(10) DEFAULT NULL,
  `id_telpon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pulsa`
--

INSERT INTO `pulsa` (`id`, `harga`, `kode`, `poin`, `id_telpon`) VALUES
('Pul001', 1100, 'P1000', 1, 'Tel001'),
('Pul002', 2100, 'P2000', 2, 'Tel002'),
('Pul003', 3100, 'P3000', 3, 'Tel003'),
('Pul004', 4100, 'P4000', 4, 'Tel004'),
('Pul005', 5100, 'P5000', 5, 'Tel005'),
('Pul006', 6100, 'P6000', 6, 'Tel006'),
('Pul007', 7100, 'P7000', 7, 'Tel007'),
('Pul008', 8100, 'P8000', 8, 'Tel008'),
('Pul009', 9100, 'P9000', 9, 'Tel009'),
('Pul010', 10100, 'P10000', 10, 'Tel010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tcash`
--

CREATE TABLE `tcash` (
  `id` varchar(10) NOT NULL,
  `saldo` int(100) DEFAULT NULL,
  `id_telpon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tcash`
--

INSERT INTO `tcash` (`id`, `saldo`, `id_telpon`) VALUES
('Tca001', 1000, 'Tel001'),
('Tca002', 1000, 'Tel002'),
('Tca003', 1000, 'Tel003'),
('Tca004', 1000, 'Tel004'),
('Tca005', 1000, 'Tel005'),
('Tca006', 1000, 'Tel006'),
('Tca007', 1000, 'Tel007'),
('Tca008', 1000, 'Tel008'),
('Tca009', 1000, 'Tel009'),
('Tca010', 1000, 'Tel010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `telepon`
--

CREATE TABLE `telepon` (
  `id` varchar(10) NOT NULL,
  `kuota_sms` int(100) DEFAULT NULL,
  `kuota_telpon` int(100) DEFAULT NULL,
  `kuota_internet` int(100) DEFAULT NULL,
  `notelpon` int(12) DEFAULT NULL,
  `pulsa` int(100) DEFAULT NULL,
  `masaaktif` date DEFAULT NULL,
  `id_poin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `telepon`
--

INSERT INTO `telepon` (`id`, `kuota_sms`, `kuota_telpon`, `kuota_internet`, `notelpon`, `pulsa`, `masaaktif`, `id_poin`) VALUES
('Tel001', 100, 100, 100, 1, 5000, '2018-12-12', 'Poi001'),
('Tel002', 200, 200, 200, 2, 5000, '2018-12-12', 'Poi002'),
('Tel003', 300, 300, 300, 3, 5000, '2018-12-12', 'Poi003'),
('Tel004', 300, 300, 300, 4, 5000, '2018-12-12', 'Poi004'),
('Tel005', 300, 300, 300, 5, 5000, '2018-12-12', 'Poi005'),
('Tel006', 300, 300, 300, 6, 5000, '2018-12-12', 'Poi006'),
('Tel007', 300, 300, 300, 7, 5000, '2018-12-12', 'Poi007'),
('Tel008', 300, 300, 300, 8, 5000, '2018-12-12', 'Poi008'),
('Tel009', 300, 300, 300, 9, 5000, '2018-12-12', 'Poi009'),
('Tel010', 300, 300, 300, 10, 5000, '2018-12-12', 'Poi010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `telepon_paket`
--

CREATE TABLE `telepon_paket` (
  `id` varchar(10) NOT NULL,
  `id_paket` varchar(10) DEFAULT NULL,
  `id_telpon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `telepon_paket`
--

INSERT INTO `telepon_paket` (`id`, `id_paket`, `id_telpon`) VALUES
('TP001', 'Pak001', 'Tel001'),
('TP002', 'Pak002', 'Tel002'),
('TP003', 'Pak003', 'Tel003'),
('TP004', 'Pak004', 'Tel004'),
('TP005', 'Pak005', 'Tel005'),
('TP006', 'Pak006', 'Tel006'),
('TP007', 'Pak007', 'Tel007'),
('TP008', 'Pak008', 'Tel008'),
('TP009', 'Pak009', 'Tel009'),
('TP010', 'Pak010', 'Tel010');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kuota`
--
ALTER TABLE `kuota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_telpon` (`id_telpon`);

--
-- Indexes for table `paket`
--
ALTER TABLE `paket`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_telpon` (`id_telpon`);

--
-- Indexes for table `poin`
--
ALTER TABLE `poin`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indexes for table `pulsa`
--
ALTER TABLE `pulsa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_telpon` (`id_telpon`);

--
-- Indexes for table `tcash`
--
ALTER TABLE `tcash`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_telpon` (`id_telpon`);

--
-- Indexes for table `telepon`
--
ALTER TABLE `telepon`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_poin` (`id_poin`);

--
-- Indexes for table `telepon_paket`
--
ALTER TABLE `telepon_paket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_telpon` (`id_telpon`),
  ADD KEY `id_paket` (`id_paket`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kuota`
--
ALTER TABLE `kuota`
  ADD CONSTRAINT `kuota_ibfk_1` FOREIGN KEY (`id_telpon`) REFERENCES `telepon` (`id`);

--
-- Ketidakleluasaan untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_ibfk_1` FOREIGN KEY (`id_telpon`) REFERENCES `telepon` (`id`);

--
-- Ketidakleluasaan untuk tabel `poin`
--
ALTER TABLE `poin`
  ADD CONSTRAINT `poin_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id`);

--
-- Ketidakleluasaan untuk tabel `pulsa`
--
ALTER TABLE `pulsa`
  ADD CONSTRAINT `pulsa_ibfk_1` FOREIGN KEY (`id_telpon`) REFERENCES `telepon` (`id`);

--
-- Ketidakleluasaan untuk tabel `tcash`
--
ALTER TABLE `tcash`
  ADD CONSTRAINT `tcash_ibfk_1` FOREIGN KEY (`id_telpon`) REFERENCES `telepon` (`id`);

--
-- Ketidakleluasaan untuk tabel `telepon`
--
ALTER TABLE `telepon`
  ADD CONSTRAINT `telepon_ibfk_1` FOREIGN KEY (`id_poin`) REFERENCES `poin` (`id`);

--
-- Ketidakleluasaan untuk tabel `telepon_paket`
--
ALTER TABLE `telepon_paket`
  ADD CONSTRAINT `telepon_paket_ibfk_1` FOREIGN KEY (`id_telpon`) REFERENCES `telepon` (`id`),
  ADD CONSTRAINT `telepon_paket_ibfk_2` FOREIGN KEY (`id_paket`) REFERENCES `paket` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
