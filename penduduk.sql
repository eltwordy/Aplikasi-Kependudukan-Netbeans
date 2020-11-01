-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 14 Des 2017 pada 18.11
-- Versi Server: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `penduduk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL,
  `ussername` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `ussername`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kartukeluarga`
--

CREATE TABLE IF NOT EXISTS `kartukeluarga` (
  `nokk` varchar(16) NOT NULL,
  `namakk` varchar(35) NOT NULL,
  `rt` char(1) NOT NULL,
  `kodepos` int(6) NOT NULL,
  PRIMARY KEY (`nokk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kartukeluarga`
--

INSERT INTO `kartukeluarga` (`nokk`, `namakk`, `rt`, `kodepos`) VALUES
('1', 'Bapak', '1', 45574),
('2', 'Men', '2', 54545),
('3', 'Cora', '1', 434343),
('4', 'Saya Rudi', '1', 767687),
('5', 'Eltwo', '4', 543213);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelahiran`
--

CREATE TABLE IF NOT EXISTS `kelahiran` (
  `nokk` varchar(16) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `namalengkap` varchar(30) NOT NULL,
  `jk` varchar(11) NOT NULL,
  `statusmerital` varchar(15) NOT NULL,
  `tempatlahir` varchar(15) NOT NULL,
  `tanggallahir` date NOT NULL,
  `umur` int(11) NOT NULL,
  `pendidikanterakhir` varchar(15) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  `statusdalamkeluarga` varchar(11) NOT NULL,
  `rt` int(1) NOT NULL,
  `statuspenduduk` char(5) NOT NULL,
  PRIMARY KEY (`nik`),
  KEY `kelahiran_ibfk_1` (`nokk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kelahiran`
--

INSERT INTO `kelahiran` (`nokk`, `nik`, `namalengkap`, `jk`, `statusmerital`, `tempatlahir`, `tanggallahir`, `umur`, `pendidikanterakhir`, `pekerjaan`, `statusdalamkeluarga`, `rt`, `statuspenduduk`) VALUES
('1', '2012', 'Eltwo Rdy', 'L', 'Belum Menikah', 'Kuningan', '2017-12-08', 17, 'SMP', 'Pelajar', 'Anak', 4, 'Aktif'),
('2', '2014', 'Yogi Susan', 'L', 'Belum Menikah', 'Kuningan', '2017-12-08', 17, 'SMA', 'Pelajar', 'Anak', 1, 'Aktif'),
('5', '2015', 'Sukmana R', 'L', 'Belum Menikah', 'Jakarta', '2017-12-08', 44, 'SMA', 'Pedagang', 'KK', 1, 'Pasif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kematian`
--

CREATE TABLE IF NOT EXISTS `kematian` (
  `nokk` varchar(16) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `namalengkap` varchar(30) NOT NULL,
  `jk` varchar(11) NOT NULL,
  `statusmerital` varchar(15) NOT NULL,
  `tempatlahir` varchar(15) NOT NULL,
  `tanggallahir` date NOT NULL,
  `umur` int(11) NOT NULL,
  `pendidikanterakhir` varchar(15) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  `statusdalamkeluarga` varchar(11) NOT NULL,
  `rt` int(1) NOT NULL,
  `statuspenduduk` char(5) NOT NULL,
  PRIMARY KEY (`nik`),
  KEY `kelahiran_ibfk_1` (`nokk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kematian`
--

INSERT INTO `kematian` (`nokk`, `nik`, `namalengkap`, `jk`, `statusmerital`, `tempatlahir`, `tanggallahir`, `umur`, `pendidikanterakhir`, `pekerjaan`, `statusdalamkeluarga`, `rt`, `statuspenduduk`) VALUES
('1', '123424', 'okelah', 'L', 'Duda', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Pasif'),
('3', '1234567890098765', 'fsfsdfdsd', 'L', 'Menikah', 'asdf', '2017-12-03', 24, 'dfggre', 'rer', 'KK', 1, 'Pasif'),
('4', '134', 'assssssssssssss', 'P', 'Menikah', 'fffffffffff', '2017-12-09', 23, 'aaaaaaaaa', 'ddddddd', 'KK', 1, 'Aktif'),
('1', '14233221', 'okelah', 'L', 'Duda', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Pasif'),
('1', '212121', 'Baik', 'L', 'Janda', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Aktif'),
('1', '23423', 'okelah', 'L', 'Duda', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Pasif'),
('1', '23423423', 'okelah', 'L', 'Duda', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Pasif'),
('3', '43434', 'asfsdfs', 'L', 'Belum Menikah', 'sadfds', '2017-12-09', 21, 'sdds', 'asdfasd', 'KK', 1, 'Pasif'),
('1', '6765443111', 'Setuju', 'L', 'Menikah', 'asdf', '2017-12-03', 12, 'sd', 'asdf', 'KK', 2, 'Pasif'),
('3', '879879', 'Eltwo Rdy', 'L', 'Belum Menikah', 'sasdff', '2017-12-03', 12, 'asdfda', 'asdf', 'Anak', 4, 'Aktif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lahir`
--

CREATE TABLE IF NOT EXISTS `lahir` (
  `nokk` varchar(16) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `namalengkap` varchar(30) NOT NULL,
  `jk` varchar(11) NOT NULL,
  `namaibu` varchar(20) NOT NULL,
  `namaayah` varchar(20) NOT NULL,
  `tempatlahir` varchar(15) NOT NULL,
  `tanggallahir` date NOT NULL,
  `statusdalamkeluarga` varchar(11) NOT NULL,
  `rt` int(1) NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lahir`
--

INSERT INTO `lahir` (`nokk`, `nik`, `namalengkap`, `jk`, `namaibu`, `namaayah`, `tempatlahir`, `tanggallahir`, `statusdalamkeluarga`, `rt`) VALUES
('18', '12', 'Rahmat', 'L', 'Kartini', 'Iman', 'Kuningan', '2017-12-04', 'Anak', 1),
('2', '201504', 'Komar', 'L', 'Mawar', 'Rama', 'Kuningan', '2017-11-06', 'Anak', 2),
('4', '201705', 'Andi', 'L', 'Susanti', 'Andi', 'Kuningan', '2017-12-05', 'Anak', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendatang`
--

CREATE TABLE IF NOT EXISTS `pendatang` (
  `nokk` varchar(16) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `namalengkap` varchar(30) NOT NULL,
  `jk` varchar(11) NOT NULL,
  `statusmerital` varchar(15) NOT NULL,
  `tempatlahir` varchar(15) NOT NULL,
  `tanggallahir` date NOT NULL,
  `umur` int(11) NOT NULL,
  `pendidikanterakhir` varchar(15) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  `statusdalamkeluarga` varchar(11) NOT NULL,
  `rt` int(1) NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pendatang`
--

INSERT INTO `pendatang` (`nokk`, `nik`, `namalengkap`, `jk`, `statusmerital`, `tempatlahir`, `tanggallahir`, `umur`, `pendidikanterakhir`, `pekerjaan`, `statusdalamkeluarga`, `rt`) VALUES
('12', '1998', 'Sukma', 'P', 'Menikah', 'Cirebon', '1999-12-06', 28, 'S1', 'PNS', 'Istri', 2),
('3', '199802', 'Rahmat', 'L', 'Menikah', 'Cirebon', '1999-12-06', 28, 'D3', 'Pedagang', 'KK', 2),
('5', '19982', 'Carkam', 'L', 'Menikah', 'Kuningan', '1998-12-06', 29, 'SMA', 'Pedagang', 'KK', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pindah`
--

CREATE TABLE IF NOT EXISTS `pindah` (
  `nokk` varchar(16) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `namalengkap` varchar(30) NOT NULL,
  `jk` varchar(11) NOT NULL,
  `statusmerital` varchar(15) NOT NULL,
  `tempatlahir` varchar(15) NOT NULL,
  `tanggallahir` date NOT NULL,
  `umur` int(11) NOT NULL,
  `pendidikanterakhir` varchar(15) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL,
  `statusdalamkeluarga` varchar(11) NOT NULL,
  `alamatbaru` varchar(100) NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pindah`
--

INSERT INTO `pindah` (`nokk`, `nik`, `namalengkap`, `jk`, `statusmerital`, `tempatlahir`, `tanggallahir`, `umur`, `pendidikanterakhir`, `pekerjaan`, `statusdalamkeluarga`, `alamatbaru`) VALUES
('11', '1234', 'Samsudin', 'L', 'Menikah', 'Kuningan', '1988-04-03', 29, 'SMA', 'Wiraswasta', 'KK', 'Jl. Sudirman No. 34 Semarang');

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kelahiran`
--
ALTER TABLE `kelahiran`
  ADD CONSTRAINT `kelahiran_ibfk_1` FOREIGN KEY (`nokk`) REFERENCES `kartukeluarga` (`nokk`);

--
-- Ketidakleluasaan untuk tabel `kematian`
--
ALTER TABLE `kematian`
  ADD CONSTRAINT `kematian_ibfk_1` FOREIGN KEY (`nokk`) REFERENCES `kartukeluarga` (`nokk`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
