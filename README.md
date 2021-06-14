# Examen UD4: Optimización y documentación. Junio 2021
1.  Realiza un clone del repositorio. Las instrucciones están en este README, así como los códigos java (debidamente empaquetados) para trabajar desde Eclipse.  
   
2.  La entrega la harás en este mismo repositorio. Trabajarás con git con los comandos desde **gitBash** y con el flujo de trabajo **GitFlow**. Comienza creando la rama "desarrollo" a partir de la master/main. Trabajarás en ella los cambios del código.


## Issue
3. A continuación aparecen distintos commits. En cualquiera de ellos ha de cerrarse un issue desde el mensaje. 
4. Para ello abre en este repositorio un nuevo issue con el mensaje/descripción adecuado. Debes indicar la **línea del código** a la que afecta. Etiqueta el issue con la **etiqueta** adecuada. Usa las menciones para que me llegue una notificación (**@lmagarin**). Lo cerrarás directamente desde el mensaje del commit.

## Refactorización (SÓLO QUIEN LO TENGA)
5. Crea la **rama "refactoring"** a partir de la rama "desarrollo". Trabajarás en ella la refactorización
6. En la clase Empleado haz las refactorizaciones que necesites para que 40 sea un campo estático de la clase. Deja el nombre propuesto

7. Realiza un commit con el mensaje "refactor: 40 - Nombre y Apellidos" 

8. Encapsula todos los campos de Empleado. En cada refactorización deben usarse los getters y los setters en vez de mantenerse las referencias del campo

9. Realiza un commit con el mensaje "refactor: encapsulamiento - Nombre y Apellidos"
10. Fusiona la rama "refactoring" en la rama "desarrollo" 

## Documentación (SÓLO QUIEN LO TENGA)
11. Crea la **rama "documentation"** a partir de la rama "desarrollo". Trabajarás en ella la documentación.
12. Escribe los comentarios Javadoc. Recuerda que debes documentar debidamente todos:

- Los paquetes 
- Las clases (incluidas las excepciones)
- Los constructores
- Los métodos
 
13. Realiza un commit con el mensaje "docs: comentarios javadoc - Nombre y Apellidos" 

12. En Eclipse, genera la documentación Javadoc en la carpeta **docs**

12. Realiza un commit con el mensaje "docs: documentación javadoc - Nombre y Apellidos" 

12. Fusiona la rama "documentation" en la rama "desarrollo". 

12. Fusiona la rama "desarrollo" en la rama maestra. 

## GitHub Pages

18. Sube el repositorio a GitHub y activa el hosting (GitHub Pages). Selecciona la carpeta docs como inicio

## BitBucket

19. Crea en tu servidor Bitbucket una copia del repositorio actual. Añade aquí la url. El mismo repositorio ha de estar en ambos servidores 
