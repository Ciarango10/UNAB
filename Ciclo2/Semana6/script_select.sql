SELECT codempleado, nombreempleado, celularempleado
FROM empleados;

SELECT nombreempleado, celularempleado, codempleado
FROM empleados;

SELECT *
FROM empleados;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
ORDER BY codempleado ASC;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
ORDER BY codempleado DESC;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
ORDER BY nombreempleado ASC;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado = 1;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado IN(1,3,5);

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado NOT IN (2);

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado = 2 AND celularempleado = "3163338891";

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado = 2 OR celularempleado = "316333889";

SELECT CONCAT(codempleado,"-",nombreempleado,"-",celularempleado) AS nomcel
FROM empleados;

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE nombreempleado LIKE "%car%";

SELECT codempleado, nombreempleado, celularempleado
FROM empleados
WHERE codempleado BETWEEN 1 AND 3;
