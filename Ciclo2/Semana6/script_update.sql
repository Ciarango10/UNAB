UPDATE empleados
SET celularempleado = "123456";

UPDATE empleados
SET celularempleado = "123456", nombreempleado = "Pepe";

UPDATE empleados
SET celularempleado = "3163338892"
WHERE codempleado = 1;

UPDATE empleados
SET celularempleado = "3163338892"
WHERE codempleado IN(1,2,3);

UPDATE empleados
SET celularempleado = "3163338892"
WHERE codempleado NOT IN(5);

UPDATE empleados
SET celularempleado = "1122334455"
WHERE codempleado = (SELECT codempleado FROM emails WHERE email="carlosarango3101@gmail.com");

