
CREATE TABLE Profesor(
	nombre_profesor VARCHAR2(255),
	id_num_profesor INT NOT NULL,
	alumno VARCHAR2(255) NOT NULL,
	título VARCHAR2(255) NOT NULL,
	PRIMARY KEY (id_num_profesor),
	CONSTRAINT PK_Alumno PRIMARY KEY (id_num_expediente, alumno)
	CONSTRAINT PK_Título PRIMARY KEY (id_nombre_titulo, título)
);

CREATE TABLE Alumno(
	nombre VARCHAR2(255),
	id_num_expediente INT NOT NULL,
	PRIMARY KEY (id_num_expediente)
);

CREATE TABLE Asignatura(
	id_num_asignatura INT NOT NULL,
	nombre_asignatura VARCHAR2(255),
	profesor VARCHAR2(255) NOT NULL,
	PRIMARY KEY (id_num_asignatura),
	CONSTRAINT PK_Profesor PRIMARY KEY (id_num_profesor, profesor)
);

CREATE TABLE Título(
	id_nombre_titulo VARCHAR2(255) NOT NULL,
	num_creditos INT,
	especialidad VARCHAR2(255),
	PRIMARY KEY (id_nombre_titulo)
);

