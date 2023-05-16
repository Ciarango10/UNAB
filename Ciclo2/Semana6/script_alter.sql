/*Agregar un campo a la tabla*/
ALTER TABLE usuarios ADD COLUMN documento BIGINT;

/*Actualizar un campo de la tabla*/
UPDATE usuarios SET documento = 0;

/*Modificar un campo de la tabla*/
ALTER TABLE usuarios MODIFY COLUMN documento BIGINT NOT NULL;

/*eliminar una llave foranea*/
ALTER TABLE relusuariospermisos DROP CONSTRAINT fk_relusuariospermisos_ref_permisos;

/*agregar una llave foranea*/
ALTER TABLE relusuariospermisos ADD CONSTRAINT fk_relusuariospermisos_ref_permisos FOREIGN KEY (idpermiso)
	REFERENCES permisos (idpermiso) ON DELETE CASCADE ON UPDATE CASCADE;
/*eliminar campo de una tabla*/
ALTER TABLE usuarios DROP COLUMN documento;

/*modificar un campo de la tabla*/
ALTER TABLE usuarios MODIFY COLUMN documento VARCHAR(20) NOT NULL;