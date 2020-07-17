# Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios

## Programacion Orientada a Objetos

## Titulo de la Practica: 

 Desarrollo de una aplicación informática que permita manejar archivos binarios para persistir información de objetos

## Objetivos:

* Desarrollar aplicaciones con capacidad de persistir datos en archivos.

* Implementar control de excepciones en el desarrollo de aplicaciones.

**Version de las Herramientas**

* IDE Apache NetBeans 11.3

* Java = JDK 14

### Actividades a Desarrollar

### 1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 08: Agenda Telefónica con MVC y DAO con Archivos Binarios”

A continuación, se presentará el repositorio para la encriptación de esta práctica, y el link de enlace:

![Github](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/Github.png)

### 2. Desarrollar una aplicación en Java para gestionar una agenda telefónica según los requerimientos planteados en las instrucciones de la práctica.

Para esta práctica nos basamos en la práctica de la creación de una agenda telefónica, pero esta vez teníamos que hacerlo con archivos binarios. Para comenzar esta práctica, creamos los siguientes paquetes y clases:

![paquetes](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/paquetes.png)

Lo primero que se hizo fue implementar atributos y métodos a la clase Usuario. A continuación, su link de la clase en GitHub:

![Usuario](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/modelo/Usuario.java)

Luego, lo que se hizo fue implementar atributos y métodos a la clase Teléfono. A continuación, su link de la clase en GitHub:

![Telefono](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/modelo/Telefono.java)

Luego, lo que se hizo fue implementar métodos a la interfaz ITelefonoDAO. A continuación, su link de la clase en GitHub:

![ITelefonoDAO](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/idao/ITelefonoDAO.java)

Luego, lo que se hizo fue implementar métodos a la interfaz IUsuarioDAO. A continuación, su link de la clase en GitHub:

![IUsuarioDAO](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/idao/IUsuarioDAO.java)

Luego, lo que se hizo fue implementar métodos a la interfaz ITelefonoDAO en la clase TelefonoDAOImpl. A continuación, su link de la clase en GitHub:

![TelefonoDAOImpl](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/dao/TelefonoDAOImpl.java)

Luego, lo que se hizo fue implementar métodos a la interfaz IUsuarioDAO en la clase UsuarioDAOImpl. A continuación, su link de la clase en GitHub:

![UsuarioDAOImpl](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/dao/UsuarioDAOImpl.java)

Luego, lo que se hizo fue implementar métodos a la clase ControladorUsuario. A continuación, su link de la clase en GitHub:

![ControladorUsuario](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/controlador/ControladorUsuario.java)

Luego, lo que se hizo fue implementar métodos a la clase ControladorTelefono. A continuación, su link de la clase en GitHub:

![ControladorTelefono](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/controlador/ControladorTelefono.java)

Luego, se procedió a crear la vista de esta aplicación, por lo que creamos una VentanaPrincipal. A continuación, su link de la clase en GitHub:

![VentanaPrincipal](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaPrincipal.java)

Luego, de la VentanaPrincipal, creamos la VentanaRegistrarUsuario. A continuación, su link de la clase en GitHub:

![VentanaRegistrarUsuario](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaRegistrarUsuario.java)

Luego, de la VentanaRegistrarUsuario, creamos la VentanaInicioSesion. A continuación, su link de la clase en GitHub:

![VentanaInicioSesion](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaInicioSesion.java)

Luego, de la VentanaInicioSesion, creamos la VentanaGestionTelefonos. A continuación, su link de la clase en GitHub:

![VentanaGestionTelefonos](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaGestionTelefonos.java)

Luego, de la VentanaGestionTelefonos, creamos la VentanaGestionUsuario. A continuación, su link de la clase en GitHub:

![VentanaGestionUsuario](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaGestionUsuario.java)

Luego, de la VentanaGestionUsuario, creamos la VentanaBuscarUsuario. A continuación, su link de la clase en GitHub:

![VentanaBuscarUsuario](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/blob/master/src/ec/ups/edu/vista/VentanaBuscarUsuarios.java)

### 3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin.

Los commits realizados por ambos integrantes del grupo se encuentran a continuación en el siguiente enlace:

![commits](https://github.com/adolfojara10/Practica-de-laboratorio-08-Agenda-Telefonica-con-MVC-y-DAO-con-archivos-binarios/commits/master)

### 4. Generar el informe de la práctica con el desarrollo de cada uno de los puntos descritos anteriormente.

Al iniciar este programa, este es la ventana que aparece al inicio:

![1](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/1.png)

Procedemos a aplastar el botón de Menú y creamos un usuario:

![2](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/2.png)

![3](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/3.png)

Ahora procedemos a iniciar sesión:

![4](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/4.png)

Ahora damos click en el botón Gestión:

![5](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/5.png)

Ahora vamos a crear un teléfono:

![6](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/6.png)

![7](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/7.png)

Ahora procedemos a dar click en un teléfono para editarlo y automáticamente se cargan los datos:

![8](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/8.png)

![9](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/9.png)

![10](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/10.png)

Ahora procedemos a eliminar un teléfono:

![11](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/11.png)

![12](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/12.png)

Ahora procedemos a editar los datos del usuario:

![13](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/13.png)

Ahora para comprobar los datos actualizados, vamos a la ventana Buscar Usuario:

![14](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/14.png)

Ahora procedemos a listar todos los teléfonos del sistema(por conveniencia, creamos más usuarios y teléfonos para mostrarlos aquí):

![15](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/15.png)

Por último, buscamos un usuario por su email:

![16](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/16.png)

### 5. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica (incluidas las imágenes y versiones de las herramientas).

### 6. Subir al AVAC el informe del proyecto en formato .pdf. El informe debe contar con conclusiones apropiadas y la firma de cada estudiante

## RESULTADO(S) OBTENIDO(S):

*	Un correcto uso de los archivos binarios, y además una gran comprensión sobre el manejo de este tipo de archivos en Java.
*	Aprender a manejar la clase “RandomAccessFile”, para lograr manipular archivos de tipo binarios, ya que son de acceso aleatorio y esta clase nos permite hacerlo.
*	Implementación de la clase Exception en muchas partes de esta tarea ya que hacia lo requería la práctica para poder ser desarrollada exitosamente.
*	Desarrollar esta aplicación con persistencia de datos en un archivo de tipo binario.

## CONCLUSIONES:

*	En conclusión, esta práctica ha sido de mucha ayuda para lograr entender mucho más a fondo sobre los archivos binarios y su correcto manejo. Para esto usamos la clase “RandomAccessFile” que nos ayuda a leer y escribir datos en un archivo de tipo binario, y así lograr la persistencia de datos a pesar de que el programa se haya cerrado. Esto nos sirvió primero para ya no tener que crear cada vez que iniciamos el programa un nuevo usuario, sino que ya lo teníamos creado, por lo que las pruebas fueron muchos más rápidas. Y segundo porque se logró guardar los addtos y volverlos a utilizar.
*	Otra conclusión es, que reutilizamos una práctica que lo habíamos realizado, por lo que fue mucho más rápido de hacerlo y lo que nos ayudó a entender mucho más sobre el manejo de archivos binarios y la clase Exception al ser implementada en esta práctica por lo que practicamos y aprendimos muchas cosas con mi compañero acerca de estos temas.

## RECOMENDACIONES:

*	No tenemos ninguna recomendación, ya que las instrucciones fueron claras para el desarrollo de esta práctica.

#### Firma Romel Avila

![Romel](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica08/firma%20romel.jpeg)

#### Firma Adolfo Jara

![Adolfo](https://github.com/adolfojara10/Images-practicas/blob/master/imagenes%20practica05/firma%20electronica.jpg)







