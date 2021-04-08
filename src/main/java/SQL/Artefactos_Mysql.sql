CREATE DATABASE  bdartefacto;

USE  bdartefacto;

#creacion de tablas

CREATE TABLE Linea(
	Lin_cod char (2) NOT NULL Primary key,
	Lin_nom varchar (20) NULL 
	 ); 

 
CREATE TABLE Artefacto (
	art_cod char (5) NOT NULL Primary key,
         Lin_cod char(2), 
	art_nom varchar (30) NULL ,
	art_pre numeric(10, 2) NULL ,
	art_img varchar(30) ) ;

CREATE TABLE venta (
	nro_pro  int  Primary Key auto_increment ,
	cli_cod char (5) not NULL ,
	art_cod char(5)  ,
	meses int
 )auto_increment=10001; 

 
CREATE TABLE Clientes (
	cli_cod char (5) NOT NULL Primary Key ,
	cli_nom varchar (25) NULL ,
	cli_tel numeric(7, 0) NULL ,
	cli_ruc numeric(11, 0) NULL ,
	cli_dir varchar (30) NULL ) ;


insert into Linea values('01','Televisores'); 
insert into Linea values('02','Cocinas'); 
insert into Linea values('03','Refrigeradoras'); 
insert into Linea values('04','Otros'); 

insert into artefacto values('A0001','01','televisor Sansumg 19 pg',890,'tele01.jpg'); 
insert into artefacto values('A0002','01','televisor Sony 24 pg',1200,'tele02.jpg'); 
insert into artefacto values('A0003','01','televisor Panasonic 29 pg',1890,'tele03.jpg'); 
insert into artefacto values('A0004','01','televisor Sansumg 27 pg',1560,'tele04.jpg'); 
insert into artefacto values('A0005','01','televisor Sansumg 21 pg',1790,'tele05.jpg'); 
insert into artefacto values('A0006','01','televisor Sansumg 29 pg',2890,'tele06.jpg'); 
insert into artefacto values('A0007','02','Cocina Solgas de 4 Hornillas',390,'cocina01.jpg'); 
insert into artefacto values('A0008','02','Cocina Inresa 2 Hornillas',190,'cocina02.jpg'); 
insert into artefacto values('A0009','02','Cocina de 6 Hornillas',1290,'cocina03.jpg'); 
insert into artefacto values('A0010','02','Cocina Inresa 4 Hornillas',590,'cocina04.jpg'); 
insert into artefacto values('A0011','02','Cocinar Sansumg 6 Hornillas',790,'cocina05.jpg'); 

insert into artefacto values('A0012','03','Refrigeradora Inresa 14 pc',790,'refri01.jpg'); 
insert into artefacto values('A0013','03','Refrigeradora Alfa 16 pc',890,'refri02.jpg'); 
insert into artefacto values('A0014','03','Refrigeradora Sansung 17 pc',1290,'refri03.jpg'); 
insert into artefacto values('A0015','03','Refrigeradora Alfa 19 pc',690,'refri04.jpg'); 
insert into artefacto values('A0016','03','Refrigeradora LG 14 pc',570,'refri05.jpg'); 
insert into artefacto values('A0017','03','Refrigeradora Miray  14 pc',1200,'refri06.jpg'); 

insert into artefacto values('A0018','04','Camara digital Kodak',1290,'arte01.jpg'); 
insert into artefacto values('A0019','04','Jarra Electrica de 2 litros',290,'arte02.jpg'); 
insert into artefacto values('A0020','04','Licuadora de 12 vc.',420,'arte03.jpg'); 
insert into artefacto values('A0021','04','Telefono inalambrico',260,'arte04.jpg'); 
insert into artefacto values('A0022','04','DVD panasonic',270,'arte05.jpg'); 

insert into venta values(null,'C0001','A0002',6);
insert into venta values(null,'C0002','A0004',12);
insert into venta values(null,'C0003','A0003',18);
insert into venta values(null,'C0003','A0001',6);
insert into venta values(null,'C0004','A0005',12);
insert into venta values(null,'C0002','A0006',18);
insert into venta values(null,'C0002','A0008',6);

 


INSERT INTO Clientes VALUES ('C0001','Chuquiara Sulla,Ana',1234567,54336725321,'Av. La Marina 1234'); 
INSERT INTO Clientes VALUES ('C0002','Perla Inafuku, carlos',6584503,56325236234,'Av. Pardo 456'); 
INSERT INTO Clientes VALUES ('C0003','Cuba Rocillo, Luis',6584503,56325236234,'Av. Pardo 456'); 

INSERT INTO Clientes VALUES ('C0004','CLAUDIA LEE',5674566,67836768957,'Av. Principal 123 '); 
INSERT INTO Clientes VALUES ('C0005','PERCY OBANDO',6789453,34532523458,'Calle San Pedro 134'); 
INSERT INTO Clientes VALUES ('C0006','ALEJANDRO TURBINA',6584503,56325236234,'Av. Pardo 456'); 

INSERT INTO Clientes VALUES ('C0007','MIGUEL NARVA',5678356,45622462572,'Jr. Naranjos 5689'); 
INSERT INTO Clientes VALUES ('C0008','CLAUDIO PARDO',7894568,56632545357,'Av. Habich 543'); 
INSERT INTO Clientes VALUES ('C0009','MONICA  NZALES',7894073,67233674566,'Av. Iquitos 228'); 
INSERT INTO Clientes VALUES ('C0010','ALEJANDRO MENDEZ',6584503,56325236234,'Av. Pardo 456'); 

INSERT INTO Clientes VALUES ('C0011','JHON MORALES',7685704,64223253459,'Calle Cueva 432'); 
INSERT INTO Clientes VALUES ('C0012','FERNANDO REDONDO',6789456,24623325742,'Av. Javier Prado 114'); 
INSERT INTO Clientes VALUES ('C0013','GABRIELA ZAPATA',5678466,72313254560,'Jr. Pio XII 112'); 
INSERT INTO Clientes VALUES ('C0014','ALEJANDRO ZOSA',6584503,56325236234,'Av. Pardo 456'); 

INSERT INTO Clientes VALUES ('C0015','SANDRA CAMPOS',4563457,67362577361,'Jr. Dominico 554'); 
INSERT INTO Clientes VALUES ('C0016','MIGUEL RAMIREZ',7460647,45632573556,'Jr. Salavery 876'); 
INSERT INTO Clientes VALUES ('C0017','LUCIA RAMIREZ',6584503,56325236234,'Av. Pardo 456'); 

INSERT INTO Clientes VALUES ('C0018','RAUL MORIENTES',8975783,65362533671,'Av. Habich 4567'); 
INSERT INTO Clientes VALUES ('C0019','EUGENIO CAMPOS',9583569,54673356250,'Av. Wilson 678'); 
INSERT INTO Clientes VALUES ('C0020','LUCILA PARDO',6546534,53476250977,'Av. Pardo 567'); 
INSERT INTO Clientes VALUES ('C0021','ROBERTO BAGGIO',2678958,87662554325,'Av. Wilson 1267'); 


 