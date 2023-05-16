SELECT *
FROM empleados AS e INNER JOIN puestos AS p ON e.codempleado = p.codempleado
INNER JOIN emails AS em ON e.codempleado = em.codempleado;

SELECT e.nombreempleado, e.celularempleado, p.nombrepuesto,p.valorsalario
FROM empleados AS e INNER JOIN puestos AS p ON e.codempleado = p.codempleado
INNER JOIN emails AS em ON e.codempleado = em.codempleado;

SELECT e.codempleado,p.codempleado,em.codempleado
FROM empleados AS e INNER JOIN puestos AS p ON e.codempleado = p.codempleado
INNER JOIN emails AS em ON e.codempleado = em.codempleado;

SELECT e.nombreempleado, e.celularempleado, p.nombrepuesto,p.valorsalario
FROM empleados AS e INNER JOIN puestos AS p ON e.codempleado = p.codempleado
INNER JOIN emails AS em ON e.codempleado = em.codempleado
WHERE em.email = "carlosarango3101@gmail.com";

SELECT DISTINCT e.nombreempleado, e.celularempleado, p.nombrepuesto,p.valorsalario
FROM empleados AS e INNER JOIN puestos AS p ON e.codempleado = p.codempleado
INNER JOIN emails AS em ON e.codempleado = em.codempleado
WHERE e.codempleado = 1;
