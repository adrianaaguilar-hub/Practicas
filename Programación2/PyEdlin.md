## PyEdlin

Necesitamos abordar un problema donde se le muestre al usuario un editor de texto, estilo terminal, dentro de el deberemos poner las opciones de linea activa, definirla y editarla, borrar linea, intercambiar linea, deshacer lo ultimo hecho(tipo control z), y salir
Abordaremos cada caso con un do {} while y un switch que nos va a permitir las interacciones.

### Variables a utilizar:
- String [] lineas = new.String[10]; Esto nos permitira guardar la informacion de las 10 lineas, de la 0 a la 9, aca guardaremos primero los mensajes inicales, luego el usuario los podra mover

```
String [] lineas = new String [10];
        lineas[0] = "Bienvenidos al editor EDLIN";
        lineas[1] = "Utilice el menu inferior para editar el texto";
        lineas[2] = "------";
        lineas[3] = "[L] permite definir la linea activa";
        lineas[4] = "[E] permite editar la linea activa";
        lineas[5] = "[I] permite intercambiar dos lineas";
        lineas[6] = "[B] borra el contenido de la linea activa";
        lineas[7] = "[D] deshace la última acción realizada";
        lineas[8] = "[S] sale del programa";
        lineas[9] = "";

```
- Boolean usuarioActivo; definira dentro de el do while cuando el sistema este activo
- int linea activa, el numero de la liena activa que se le asignara luego a el indice de el array
-