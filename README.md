# naruto_daniel_rincon

El aplicativo tiene como objetivo la gestion de un sistema de misiones que se realizan en una aldea ninja (konoha). Entonces de la aldea ninja se requiere gestionar los datos de los ninjas junto con sus habilidades y las misiones que tienen disponibles, asignadas o completadas.

## base de datos

> A continuación se muestra el diagrama y los scripts de la base de datos. La base de datos es utilizada para la persistencia de los datos, es decir, para evitar la perdida de los mismos.

![Base de datos](/narutoDanielRincon/SQL/modelo.png)
 
***Script de creación de la base de datos `naruto_daniel_rincon`*** 

```java

CREATE DATABASE IF NOT EXISTS naruto_daniel_rincon;
USE naruto_daniel_rincon;
CREATE TABLE mision(
    id INT NOT NULL PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    rango VARCHAR(255) NOT NULL,
    recompensa VARCHAR(255) NOT NULL
);
CREATE TABLE mision_ninja(
    id_ninja INT NOT NULL,
    id_mision INT NOT NULL,
    fecha_inicio DATE,
    fecha_fin DATE
);
CREATE TABLE ninja(
    id INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    rango VARCHAR(255) NOT NULL,
    aldea VARCHAR(255) NOT NULL
);
CREATE TABLE habilidad(
    id_ninja INT NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);
ALTER TABLE
    mision_ninja ADD CONSTRAINT mision_ninja_id_mision_foreign FOREIGN KEY(id_mision) REFERENCES mision(id);
ALTER TABLE
    habilidad ADD CONSTRAINT habilidad_id_ninja_foreign FOREIGN KEY(id_ninja) REFERENCES ninja(id);
ALTER TABLE
    mision_ninja ADD CONSTRAINT mision_ninja_id_ninja_foreign FOREIGN KEY(id_ninja) REFERENCES ninja(id);

```

***Script de inserción de la base de datos `naruto_daniel_rincon`*** 

```java

INSERT INTO ninja VALUES (1,'Nicolas','amateur','Konoha');
INSERT INTO ninja VALUES (2,'Andres','amateur','Konoha');
INSERT INTO ninja VALUES (3,'Cristian','intermedio','Konoha');
INSERT INTO ninja VALUES (4,'Santiago','profesional','Konoha');
INSERT INTO ninja VALUES (5,'David','intermedio','Konoha');


INSERT INTO mision VALUES (1,'recorrer el bosque muy rápido','completada','5 monedas');
INSERT INTO mision VALUES (2,'romper todos los obstaculos','asignada','10 monedas');
INSERT INTO mision VALUES (3,'recorre el circuito sin ser capturado por la luz','disponible','entrenamiento personalizado');
INSERT INTO mision VALUES (4,'lucha de manera ofensiva','asignada','7 monedas');
INSERT INTO mision VALUES (5,'lucha de manera defensiva','completada','5 monedas');


INSERT INTO habilidad VALUES (1,'velocidad','ser rápido en los desplazamientos');
INSERT INTO habilidad VALUES (2,'defensa','no toma iniciativa en los combates');
INSERT INTO habilidad VALUES (3,'fuerza','fortaleza máxima para realizar una acción');
INSERT INTO habilidad VALUES (4,'agilidad','rápido y discreto');
INSERT INTO habilidad VALUES (5,'ataque','toma iniciativa en los combates');


INSERT INTO mision_ninja VALUES (1,1,'2024-01-24','2024-01-29');
INSERT INTO mision_ninja VALUES (2,5,'2024-01-23','2024-01-27');
INSERT INTO mision_ninja VALUES (3,2,'2024-01-25',NULL);
INSERT INTO mision_ninja VALUES (4,3,NULL,NULL);
INSERT INTO mision_ninja VALUES (5,4,'2024-01-24',NULL);

```

## diagrama de clases

> A continuacion se presenta el diagrama de clases utilizado en la realización del aplicativo.

![Diagrama de clases](/narutoDanielRincon/Diagrama%20de%20clases/diagramadeclases.png)

## autor

> ***Daniel Felipe Rincón Guerrero***