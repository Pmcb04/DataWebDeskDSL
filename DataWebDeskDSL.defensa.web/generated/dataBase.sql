
CREATE TABLE Titulo(
	id_nombre_titulo VARCHAR2(255) NOT NULL,
	creditos INT,
	PRIMARY KEY (id_nombre_titulo)
);

CREATE TABLE Asignatura(
	id_nombre_asignatura VARCHAR2(255) NOT NULL,
	Semestre INT,
	obligatoria BOOLEAN,
	titulo VARCHAR2(255) NOT NULL,
	PRIMARY KEY (id_nombre_asignatura)
	CONSTRAINT PK_Titulo PRIMARY KEY (id_nombre_titulo, titulo)
);

CREATE TABLE Alumno(
	id_nombre_alumno VARCHAR2(255) NOT NULL,
	evaluacion_continua BOOLEAN,
	edad INT,
	PRIMARY KEY (id_nombre_alumno)
);

CREATE TABLE Matricula(
	id_nombre_matricula VARCHAR2(255) NOT NULL,
	asignatura VARCHAR2(255) NOT NULL,
	alumno VARCHAR2(255) NOT NULL,
	PRIMARY KEY (id_nombre_matricula)
	CONSTRAINT PK_Asignatura PRIMARY KEY (id_nombre_asignatura, asignatura)
	CONSTRAINT PK_Alumno PRIMARY KEY (id_nombre_alumno, alumno)
);

