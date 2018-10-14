# psptarea1
Tarea 1 del modulo Programación de Servicios y Procesos.

## Descripción
Programación de Servicios y Procesos
Unidad 1. 
Práctica a entregar
Teniendo en cuenta que los comandos para arrancar y para un servidor Tomcat son los siguientes:

Arrancar: %CATALINA_HOME/startup.bat

Parar: %CATALINA_HOME/shutdown.bat

Crear una aplicación que tenga un menú que permita realizar las siguientes tareas:

1. Arrancar un servidor Tomcat.
2. Parar un servidor Tomcat.
3. Comprobar el estado de un servidor Tomcat.

Nota: Para comprobar el estado del Tomcat hacer uso de la siguiente librería de la API de Java:
java.net.HttpURLConnection1 Ejemplo de uso de la librería java.net.HttpURLConnection:
https://stackoverflow.com/questions/6467848/how-to-get-http-response-code-for-a-url-in-java

Opcional: Añadir una opción al menú que copie la aplicación web de una ubicación de nuestro sistema dentro
de la carpeta webapps del servidor Tomcat.

Al principio quería abrir una consola y conectarnos con el servidor de Linux virtual que teníamos hecho. Por temas de seguridad
(tendríamos saber la contraseña para conectarnos e introducirlo, se podría hacer una conexion con confianza con claves publicas entre
mi PC y la maquina virtual, pero no se podría comprobar en otra maquina)
Por lo tanto he instalado el servidor Tomcat en Windows localmente y para la tarea 
he optado por un pequeño menu en consola para las acciones que se piden que se ve de la siguiente manera:
```
1	 Arrancar Tomcat
2	 Parar Tomcat
3	 Ver estado Tomcat
4	 Salir
 Por favor elige una opcion:
```
- Para arrancar, abrir una ventana CMD en Windows y ejecutar ``` D:\apache-tomcat-9.0.12\bin\startup.bat ```
Se verá de la siguiente manera:
<img src="http://i66.tinypic.com/2l9ldhw.jpg" >

- Para ver el estado, conectarnos a la url "http://localhost:8080" que sería la pagina por defecto cuando arrancamos el servidor Tomcat
si nos da respuesta, por ejemplo 200ms es que la conexion está establecido.
en caso contrario no nos dará respuesta.
Servidor arrancado dará:

<img src="http://i68.tinypic.com/35b5kkw.jpg">

- Para parar, abrir una ventana CMD en Windows y ejecutar D:\apache-tomcat-9.0.12\bin\shutdown.bat

<img src="http://i65.tinypic.com/ddj05f.jpg">

En el codio está todo comentado para entender que hacemos.
