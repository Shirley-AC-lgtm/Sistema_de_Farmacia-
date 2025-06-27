USE sgSistemafarmacia;

CREATE TABLE Proveedor (
iD_Proveedor INT,
nombre VARCHAR(50),
direccion VARCHAR(100),
correo VARCHAR(100),
numero_Telefono VARCHAR(20),
pagina_Web VARCHAR(100),
productos VARCHAR(100),
PRIMARY KEY (iD_Proveedor)
);

CREATE TABLE Producto (
iD_Producto INT,
nombre VARCHAR(50),
descripcion TEXT,
fecha_Vencimiento DATE,
precio DECIMAL(10,2),
stock_Minimo INT,
requiere_Receta boolean, 
iD_Categoria INT,
PRIMARY KEY (iD_Producto)
);

CREATE TABLE Lote (
iD_Lote INT,
iD_Producto INT,
cantidad INT,
fecha_Ingreso DATE,
fecha_Vencimiento DATE,
iD_Sucursal INT,
PRIMARY KEY (iD_Lote)
);

CREATE TABLE Sucursal (
iD_Sucursal INT,
nombre VARCHAR(50),
direccion VARCHAR(100),
telefono VARCHAR(20),
correo VARCHAR(100),
PRIMARY KEY (iD_Sucursal)
);

CREATE TABLE Cliente (
iD_Cliente INT,
nombre VARCHAR(50),
telefono VARCHAR(20),
correo VARCHAR(100),
sistemaPuntos INT,
es_Frecuente boolean,
PRIMARY KEY (iD_Cliente)
);

CREATE TABLE Factura (
iD_Factura INT,
fecha DATE,
iD_Cliente INT,
total float,
descuento float,
es_Electronica boolean,
iD_Rol INT,
iD_Sucursal INT,
SAT_Integrado boolean,
fechaEnvioSAT DATETIME,
PRIMARY KEY (iD_Factura)
);

CREATE TABLE Detalle_Factura (
iD_Detalle INT,
iD_Factura INT,
iD_Producto INT,
cantidad INT,
total_Venta float,
PRIMARY KEY (iD_Detalle)
);

CREATE TABLE Receta (
iD_Receta INT,
iD_Cliente INT,
fecha_Emision DATE,
medico VARCHAR(100),
iD_Producto INT,
iD_Rol INT,
PRIMARY KEY (iD_Receta)
);

CREATE TABLE Rol (
iD_Rol INT,
nombre_Rol VARCHAR(50),
permisos TEXT,
PRIMARY KEY (iD_Rol)
);

CREATE TABLE Usuario (
iD_Usuario INT,
nombre VARCHAR(50),
correo VARCHAR(100),
contrasena VARCHAR(100),
rol VARCHAR(20),
iD_Rol INT,
sucursal_Asignada INT,
PRIMARY KEY (iD_Usuario)
);

CREATE TABLE Equipo (
iD_Equipo INT,
tipo VARCHAR(50),
marca VARCHAR(50),
precio float,
asignado_a VARCHAR(50),
PRIMARY KEY (iD_Equipo)
);

CREATE TABLE Capacitacion (
iD_Capacitacion INT,
tema VARCHAR(100),
fecha DATE,
iD_Usuario INT,
PRIMARY KEY (iD_Capacitacion)
);

CREATE TABLE Seguridad (
iD_Registro INT,
iD_Usuario INT,
accion VARCHAR(255),
fechaHora DATETIME,
PRIMARY KEY (iD_Registro)
);

CREATE TABLE CopiaSeguridad (
iD_Copia INT,
fecha DATETIME,
tipo VARCHAR(20),
resultado VARCHAR(20),
PRIMARY KEY (iD_Copia)
);