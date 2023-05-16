DELETE FROM puestos;

DELETE FROM puestos WHERE codpuesto IN (6,7,8);

DELETE FROM puestos WHERE codpuesto NOT IN (9);

DELETE FROM empleados
WHERE codempleado = (SELECT codempleado FROM emails WHERE email='jhon@live.com');