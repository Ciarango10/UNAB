CREATE TABLE empleados
(
	codempleado BIGINT NOT NULL AUTO_INCREMENT,
    nombreempleado VARCHAR(30) NOT NULL,
    celularempleado VARCHAR(13) NOT NULL,
    PRIMARY KEY(codempleado)    
);

CREATE TABLE puestos
(
	codpuesto BIGINT NOT NULL AUTO_INCREMENT,
	codempleado BIGINT NOT NULL,
	nombrepuesto VARCHAR(50) NOT NULL,
	valorsalario NUMERIC(12,2)NOT NULL,
    PRIMARY KEY(codpuesto)
);

CREATE TABLE emails
(
	codemail BIGINT NOT NULL AUTO_INCREMENT,
	codempleado BIGINT NOT NULL,
    email VARCHAR(30) NOT NULL,
    PRIMARY KEY (codemail)
);

ALTER TABLE puestos ADD CONSTRAINT fk_puestos_ref_empleados FOREIGN KEY (codempleado)
	REFERENCES empleados (codempleado) ON DELETE CASCADE ON UPDATE CASCADE;
    
ALTER TABLE emails ADD CONSTRAINT fk_emails_ref_empleados FOREIGN KEY (codempleado)
	REFERENCES empleados (codempleado) ON DELETE CASCADE ON UPDATE CASCADE;    