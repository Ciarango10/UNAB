SELECT e.codempleado,e.nombreempleado,e.celularempleado,
(SELECT nombrepuesto FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS nombrepuesto,
(SELECT valorsalario FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS valorsalario
FROM empleados e;

SELECT e.codempleado,e.nombreempleado,e.celularempleado,
(SELECT nombrepuesto FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS nombrepuesto,
(SELECT valorsalario FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS valorsalario
FROM empleados e
WHERE e.codempleado = 1;

SELECT e.codempleado,e.nombreempleado,e.celularempleado,
(SELECT nombrepuesto FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS nombrepuesto,
(SELECT valorsalario FROM puestos WHERE codempleado=e.codempleado LIMIT 1) AS valorsalario
FROM empleados e
WHERE e.codempleado = (SELECT codempleado FROM emails WHERE email = "carlosarango3101@gmail.com");

