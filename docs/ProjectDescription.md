# Descripción técnica del proyecto
***
Este proyecto cuenta con 3 elementos diferentes:

* Las clases para Pokémon genérico y Pokémon Legendario
* Una clase que se encargue de la lista de la Pokédex y los métodos para manejarla
* El ejecutable del programa, donde se encuentra el menú desde el cual se accederá a la Pokédex
***
### Plantillas para los Pokémon
El proyecto cuenta con dos plantillas: una clase Pokémon genérica y una que hereda de esta para los Pokémon legendarios. 

La clase Pokémon cuenta con atributos para:
* Nombre
* Tipo
* Descripción
* Peso
* Altura
* Un booleano para controlar si el Pokémon ha sido capturado o no

La clase de Pokémon Legendario cuenta con los mismos atributos más un atributo adicional de localización.

Así mismo, estas dos clases cuentan con:
* Dos constructores, uno que acepte sólo Nombre y Tipo para usarlo a la hora de avistar un Pokémon; y otro que inicialice todos los atributos una vez se ha capturado el Pokémon
* Métodos de acceso para los atributos
* Un método para cambiar el estado de Pokémon a "capturado"
* Una sobreescritura del toString para enseñar las propiedades del Pokémon en un formato visualmente atractivo
***

### Lista de Pokémon
En el paquete Utilities se podrá encontrar una clase que controlará las listas de objetos Pokémon de la Pokédex. Esta lista tendrá un tamaño por defecto de 1, e irá aumentando o decreciendo según se añaden o eliminan Pokémon.

Esta lista cuenta con métodos para:
* Añadir Pokémon
* Eliminar Pokémon
* Mostrar todos los Pokémon de la lista
* Buscar un Pokémon por nombre y retornar ese Pokémon
***

### Menú del programa
En el ejecutable del programa se encontrará el menú desde el cual se podrá acceder a esta Pokédex personalizable. El programa cuenta con dos listas: una para Pokémon avistados y otra para Pokémon capturados.

El menú se usará desde consola, y se controlará a través de números para elegir las diferentes funcionalidades del programa.
