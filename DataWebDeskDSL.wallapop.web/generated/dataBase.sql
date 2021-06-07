
CREATE TABLE Producto(
	precio INT,
	nombre VARCHAR2(255),
	categoria VARCHAR2(255),
	id_identificador INT NOT NULL,
	PRIMARY KEY (id_identificador)
);

CREATE TABLE Usuario(
	id_identificador INT NOT NULL,
	nombre VARCHAR2(255),
	PRIMARY KEY (id_identificador)
);

