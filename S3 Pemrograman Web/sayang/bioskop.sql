-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 28 Des 2017 pada 11.25
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bioskop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`nama`, `password`) VALUES
('admin', 'manual');

-- --------------------------------------------------------

--
-- Struktur dari tabel `film`
--

CREATE TABLE `film` (
  `id_film` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `gambar` varchar(30) NOT NULL,
  `durasi` varchar(20) NOT NULL,
  `harga` int(11) NOT NULL,
  `tanggal_rilis` datetime NOT NULL,
  `sutradara` varchar(50) NOT NULL,
  `sinopsis` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `film`
--

INSERT INTO `film` (`id_film`, `nama`, `gambar`, `durasi`, `harga`, `tanggal_rilis`, `sutradara`, `sinopsis`) VALUES
(2, 'one fine day', 'gambar/c6.jpg', '110', 35000, '2017-10-12 00:00:00', 'Asep Kusdinar', 'Pertemuan tidak terduga antara Mahesa ( Jefri Nichol ) dan Alana ( Michelle Ziudith ) di Barcelona membuat keduanya menjadi akrab. Namun keakraban ini disalah gunakan oleh Mahesa. Ternyata cara pandang Alana dan Mahesa jauh berbeda. Akankah pertemuan itu menjadi sebuah cerita cinta antara Alana dan Mahesa? Danu ( Maxime Bouttier ) adalah kekasih Alana di Barcelona. Danu selalu memberikan perhatian yg sangat istimewa kepada Alana, melalui barang-barang mewah. Danu berfikir itu cukup untuk Alana. Suatu ketika Danu bertemu dengan Mahesa juga Alana. Danu mengingatkan Alana, untuk berhati-hati dengan Mahesa karena dia seorang penipu.'),
(3, 'Tiger Zenda Hai', 'gambar/c9.jpg', '100', 45000, '2017-10-22 00:00:00', 'Ali Abbas Zafar', '‘Tiger Zinda Hai’ (2017) yang merupakan sekuel ‘Ek Tha Tiger’ (2012) yang dibintangi Salman Khan dan Katrina Kaif ini ceritanya bergenre aksi komedi. Namun hingga saat ini masih dirahasiakan sinopsisnya.  Salman Khan akan kembali seperti harimau.\r\n\r\n						Sedangkan Katrina Kaif memerankan karakter Zoya, banyak melakukan adegan laga, termasuk pertarungan dengan ilmu bela diri juga akan dilakoni Katrina Kaif.'),
(4, 'My Stupid Boss', 'gambar/c4.jpg', '108', 25000, '2016-05-19 00:00:00', 'Upi Avianto', 'Film Komedi "My Stupind Boss" bercerita tentang seorang boss yang bekerja bersama karyawannya. Bossman sebuah bos yang mempunyai sebuah perusahaan di Kuala Lumpur, malaisya. Bossman berasal dari Indonesia. Tidak adanya peraturan yang jelas dan sistem yang mengaturnya membuat perusahaan itu sering kali terjadi kekacauan. Tetapi kekacauan tersebut merupakan ulah dari bossman sendiri.\r\n\r\n						Bossman memiliki sebuah prinsip yaitu Bossman Always Right dan setiap keinginan yang dia ingingkan itu harus tercapai, tanpa sekecualipun. Selain itu Bossman juga berprinsip Impossible We Do Miracle We Try. Bossman memiliki seorang Karyawan bernama Diana, Diana selalu direpotkan oleh permintaan yang tak lazim oleh Bosnya. Tentunya Diana harus menguji kesabarannya menghadapi Boss nya itu.'),
(5, 'Dil Wale', 'gambar/c7.jpg', '154', 55000, '2015-12-18 00:00:00', 'Rohit Shetty', 'Veer (Varun Dhawan) membuat ulah dengan merusak mobil client kakaknya Raj (Shahrukh Khan) setelah memberikan tumpangan kepada Ishita (Kriti Sanon) yang motornya mengalami mogok. Suatu hari Veer mengajak Ishita untuk merayakan ulang tahun pacar Sidhu (varun sharma) yaitu Jenny (Chetna Pande) di cafe. \r\n\r\n						Ketika berada di cafe Ishita dan Veer berusaha menghalangi anak buah dari King (Boman Irani) yang berusaha mengancam pemilik cafe yaitu paman Joel untuk menjual Narkoba. Sehingga membuat anak buah King marah lalu terjadi perkelahian antara Veer dengan anak buah King. Keesokan harinya Veer dilarikan di rumah sakit dan Raj meminta Veer untuk memberitahunya siapa yang telah memukulinya. Veer tidak mau menjawab. \r\n\r\n						Raj kemudian mendapatkan informasi dari tangan kanannya bahwa anak buah King yang telah melukai Veer. Raj menuntut balas dengan mendatangi anak buah Raja lalu menghajar mereka satu per satu. Keesokan harinya King datang ke kediaman Raj yang berusaha mengancamnya. Raj menjelaskan nama gangsternya yaitu Kaali sehingga membuat dia merasa takut dan berjanji akan membawa seluruh mobilnya di bengkel Raj.'),
(6, 'From London To Bali', 'gambar/c1.jpg', '100', 65000, '2018-02-02 00:00:00', 'Angling Sagaran', 'Film ‘From London To Bali’ kisahnya menceritakan tentang Lukman (Ricky Harun) yang ditinggal pergi oleh kekasihnya, Dewi (Jessica Mila) untuk kuliah di London. Demi cintanya pada Dewi, Lukman kerja serabutan agar bisa berangkat ke London.\r\n\r\n						Hingga akhirnya Lukman tiba di Bali untuk kerja dengan koboi (Gary Iskak).  Penampilan Lukman dirubah. Setelah di make over Lukman dikenalkan dengan teman seangkatannya, Bambang (Fico Fachriza) dan Sodikin (Muhadkly Acho).\r\n\r\n						Disisi lain, Dewi di London bersahabat dengan Suzan (Kimberly Ryder) dan berkenalan dengan Sean (Max Palmer). Suzan mempengaruhi Dewi, bahwa London beda dari Indonesia, dan kesetiaan Dewi ke Lukman adalah kebodohan.\r\n\r\n						Pekerjaan yang dikerjakan Lukman ternyata rumit.  Lukman akhirnya tahu kalau Dewi sudah punya pacar bule. Hingga Lukman berkenalan dengan Putu (Nikita Willy), dan perkenalan tersebut membuka hati Lukman untuk berhenti dari Koboi. Tapi bukan hal mudah untuk bisa keluar dari Koboi. Lukman dicederai oleh Koboi.\r\n\r\n						Dewi yang akhirnya sadar melihat Sean selingkuh dengan Suzan, segera menyusul Lukman ke Bali. Sementara Putu begitu telaten merawat Lukman.'),
(7, 'Warkop DKI Reborn', 'gambar/c2.jpg', '120', 45000, '2018-09-08 00:00:00', 'Anggy Umbara', 'WARKOP DKI Reborn : Jangkrik Boss Part 2, meneruskan pertualangan Dono (Abimana Aryasatya), Kasino (Vino G Bastian) dan Indro (Tora Sudiro) dalam mencari harta karun untuk membayar hutang, agar mereka tidak masuk ke dalam penjara. Negri Jiran, Malaysia menjadi destinasi awal perjalanan mereka di film ini.\r\n\r\n						Tas berisi kode harta karun yang tertukar dengan tas milik wanita cantik asal Malaysia bernama Nadia (Fazura) pun akhirnya membawa mereka ke berbagai macam tempat yang tak pernah terpikirkan, sampai akhirnya mereka berada di sebuah pulau angker tak berpenghuni.\r\n\r\n						Di pulau tersebut mereka terpaksa berpisah dan harus berhadapan dengan hantu-hantu menyeramkan namun menggelikan. Kejadian dan peristiwa lucu yang memecahkan tawa terus terjadi mengiringi aksi mereka, di mana twist demi twist tidak terduga akan terkuak dalam petualangan Mencari Harta Karun yang kocak nan seru dari sekuel Warkop DKI Reborn : Jangkrik Boss Part 2 ini.'),
(8, 'My Trip My Adventure', 'gambar/c8.jpg', '115', 60000, '2018-08-25 00:00:00', 'Kiki Broki', 'Film ‘My Trip My Adventure: The Lost Paradise’ akan menceritakan perjalanan sekelompok remaja di alam bebas yang melakukan kegiatan pengambilan gambar. Dalam perjalannya tersebut mereka banyak menghadapi berbagai kendala di alam bebas. Serta didalam film ini akan bercerita mengenai perjalanan di balik pengambilan gambar pada My Trip My Adventure.  \r\n\r\n						Movie akan digarap, dan diproduksi oleh sebuah perusahaan yang berjalan dibidang perfilman, dan cukup terkenal, yaitu Rumah Produksi Film Transinema Pictures. Film ini akan direncanakan rilis pada tahun 2016 ini. Namun, sampai saat ini kami belum memperoleh info secara pasti kapan untuk tanggal rilisnya.\r\n\r\n						Adapun para pemain film yang akan bermain dan membintangi didalam film Adventure My Trip My Adventure: The Lost Paradise (2016) ini yaitu diantaranya seperti Denny Sumargo, David John Schaap, Rizky Hanggono, Nadine Chandrawinata, Marshall Sastra, Cathy Sharon, Alya Putri dan Rikas Harsa.'),
(9, 'Komedi Moderen Gokil', 'gambar/c5.jpg', '95', 50000, '2018-09-11 00:00:00', 'Cuk FK', 'Film Comedy Indonesia “Komedi Moderen Gokil” menceritakan tentang 2 sahabat yang bernama Dodit (Dodit Mulyanto) dan Boris (Boris Bokir) yang bertemu lagi di Jakarta. mereka tinggal di kost milik Tante Maya (Maya Wulan), istri dari Om Indro (Indro Warkop). Boris dekat dengan salah satu cewek penghuni kost yang bernama Sasha (Nadine Alexandra). Sasha juga bersahabat dengan Karin (Kartika Putri), ia adalah putri semata wayang Om Indro dan Tante Maya.\r\n\r\n						Karena kebutuhan hidup di ibukota yang cukup mahal, 2 sahabat tersebut memutuskan untuk mencari pekerjaan. dan akhirnya mereka mendapat pekerjaan tapi sebagai Biro detektif. Tanpa menjalani training sebagai detektif, mereka langsung di beri tugas memecahkan sebuah kasus.\r\n\r\n						Ternyata, clien pertama mereka adalah Tante Maya pemilik kos, yang curiga kalau Om Indro punya pacar. Dengan berbekal sok tahu-an, mereka menangkap Bu Ratna (Ria Winata), yang mereka curigai sebagai pacar gelap Om Indro.\r\n\r\n						Inilah awal dari masalah yang akan mereka hadapi. Ternyata Bu Ratna yang mereka culik tadi adalah istri baru Pak Goen (Tarzan). Pak Goen adalah Kepala biro detektif tempat Dodit dan Boris bekerja. dan juga sahabat Om Indro. Penasaran kelanjutan nasib mereka? Saksikan aja film “Komedi Moderen Gokil” di bioskop kesayangan mu.'),
(32, 'udin mencari ikan', 'manaada', '9000', 3999, '1998-12-09 00:00:00', 'rizal si wakwaw', 'adadadada\r\ndada\r\nda\r\ndad\r\nad\r\nad\r\na\r\nda\r\nd\r\na');

-- --------------------------------------------------------

--
-- Struktur dari tabel `genre`
--

CREATE TABLE `genre` (
  `id_genre` int(20) NOT NULL,
  `jenis` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `genre`
--

INSERT INTO `genre` (`id_genre`, `jenis`) VALUES
(2, 'Romans'),
(3, 'Horor'),
(6, 'Adventure'),
(7, 'Komedi'),
(8, 'Fantasi'),
(9, 'Action'),
(10, 'Kartun');

-- --------------------------------------------------------

--
-- Struktur dari tabel `genrefilm`
--

CREATE TABLE `genrefilm` (
  `id_genrefilm` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  `id_genre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `genrefilm`
--

INSERT INTO `genrefilm` (`id_genrefilm`, `id_film`, `id_genre`) VALUES
(1, 6, 2),
(2, 6, 3),
(3, 6, 6);

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` int(10) NOT NULL,
  `waktu` datetime NOT NULL,
  `id_film` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `waktu`, `id_film`) VALUES
(1, '2017-12-14 16:30:00', 5),
(2, '2017-12-20 12:00:00', 6),
(3, '2017-12-20 13:00:00', 5),
(4, '0000-00-00 00:00:00', 5),
(5, '2017-05-12 02:15:00', 5),
(7, '2009-10-20 19:00:00', 2);

-- --------------------------------------------------------

--
-- Stand-in structure for view `jadwalfilm`
--
CREATE TABLE `jadwalfilm` (
`nama` varchar(20)
,`waktu` datetime
);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kursi`
--

CREATE TABLE `kursi` (
  `id_kursi` int(11) NOT NULL,
  `kode` varchar(2) NOT NULL,
  `id_jadwal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kursi`
--

INSERT INTO `kursi` (`id_kursi`, `kode`, `id_jadwal`) VALUES
(2, 'B3', 1),
(6, 'F6', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penonton`
--

CREATE TABLE `penonton` (
  `id_penonton` int(12) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `no_ktp` int(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_hp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penonton`
--

INSERT INTO `penonton` (`id_penonton`, `nama`, `password`, `no_ktp`, `alamat`, `no_hp`) VALUES
(1, 'arief', '123', 12345, 'loajanan', '0853'),
(3, 'aldi', 'gendjal', 62626, 'handil', '00000'),
(6, 'septi', 'septian', 992181, 'handil', '0981');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiket`
--

CREATE TABLE `tiket` (
  `id_tiket` int(11) NOT NULL,
  `id_penonton` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  `id_kursi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tiket`
--

INSERT INTO `tiket` (`id_tiket`, `id_penonton`, `id_film`, `id_kursi`) VALUES
(7, 6, 5, 6);

-- --------------------------------------------------------

--
-- Struktur untuk view `jadwalfilm`
--
DROP TABLE IF EXISTS `jadwalfilm`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `jadwalfilm`  AS  select `film`.`nama` AS `nama`,`jadwal`.`waktu` AS `waktu` from (`film` join `jadwal` on((`film`.`id_film` = `jadwal`.`id_film`))) order by `jadwal`.`waktu` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id_film`);

--
-- Indexes for table `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`id_genre`);

--
-- Indexes for table `genrefilm`
--
ALTER TABLE `genrefilm`
  ADD PRIMARY KEY (`id_genrefilm`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD UNIQUE KEY `waktu` (`waktu`);

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`id_kursi`);

--
-- Indexes for table `penonton`
--
ALTER TABLE `penonton`
  ADD PRIMARY KEY (`id_penonton`),
  ADD UNIQUE KEY `no_ktp` (`no_ktp`),
  ADD UNIQUE KEY `no_hp` (`no_hp`),
  ADD UNIQUE KEY `nama` (`nama`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id_tiket`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `id_film` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `genre`
--
ALTER TABLE `genre`
  MODIFY `id_genre` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `genrefilm`
--
ALTER TABLE `genrefilm`
  MODIFY `id_genrefilm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `id_jadwal` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
  MODIFY `id_kursi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `penonton`
--
ALTER TABLE `penonton`
  MODIFY `id_penonton` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id_tiket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
