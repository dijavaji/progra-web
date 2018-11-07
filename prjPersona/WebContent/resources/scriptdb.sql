SHOW TABLES;

DROP TABLE PERSONA;
CREATE TABLE PERSONA(
PERSONA_ID INTEGER NOT NULL AUTO_INCREMENT,
CEDULA VARCHAR(10)  NOT NULL,
NOMBRE VARCHAR(256) NOT NULL,
APELLIDO VARCHAR(256),
SEXO VARCHAR(1),
CONSTRAINT PERSONAPK PRIMARY KEY (PERSONA_ID)
);

SELECT * FROM PERSONA;

INSERT INTO PERSONA (NOMBRE,CEDULA, SEXO) VALUES ('Marcos','1234567890', 'M');
INSERT INTO PERSONA (NOMBRE,CEDULA, SEXO) VALUES ('Veronica','0134567890', 'F');
INSERT INTO PERSONA (NOMBRE,CEDULA, SEXO) VALUES ('Gabriela','1734567890', 'F');
INSERT INTO PERSONA (NOMBRE,CEDULA, SEXO) VALUES ('Jamilet','1734569890', 'F');

COMMIT;