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
