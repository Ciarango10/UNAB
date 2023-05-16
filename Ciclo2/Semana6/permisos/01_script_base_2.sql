CREATE TABLE usuarios
(
	idusuario BIGINT NOT NULL AUTO_INCREMENT,
	nombreusuario VARCHAR(50) NOT NULL,
    primerapellidousuario VARCHAR(50) NOT NULL,
    segundoapellidousuario VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    clave VARCHAR(10) NOT NULL,
    PRIMARY KEY(idusuario)
);

CREATE TABLE permisos
(
	idpermiso BIGINT NOT NULL AUTO_INCREMENT,
	nombrepermiso VARCHAR(100) NOT NULL,
	tipopermiso SMALLINT NOT NULL,
    PRIMARY KEY(idpermiso)
);

CREATE TABLE relusuarusuariosusuariosiospermisos 
(
	idrelusuariopermiso BIGINT NOT NULL AUTO_INCREMENT,
	idusuario BIGINT NOT NULL, 
    idpermiso BIGINT NOT NULL,
    PRIMARY KEY (idrelusuariopermiso)
);

ALTER TABLE relusuariospermisos ADD CONSTRAINT fk_relusuariospermisos_ref_usuarios FOREIGN KEY (idusuario)
	REFERENCES usuarios (idusuario) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE relusuariospermisos ADD CONSTRAINT fk_relusuariospermisos_ref_permisos FOREIGN KEY (idpermiso)
	REFERENCES permisos (idpermiso) ON DELETE CASCADE ON UPDATE CASCADE;