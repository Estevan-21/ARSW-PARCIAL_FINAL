# PARCIAL FINAL ARSW - CONVERSIÓN TEMPERATURA
En este ejercicio se crea una solución a través de un API que provee servicios de conversión de temperatura de grados Centígrados a Farenheit y viceversa.

[Heroku](https://parcialarsw.herokuapp.com/)

## Arquitectura

El documento de arquitectura se encuentra disponible en el siguiente enlace.

[ARQUITECTURA](https://drive.google.com/open?id=10J3ZKnmFHyaSR7yP7_DvjjpOeA1_JWTL)


## USO

Para utilizar los métodos del API puede utilizarce el siguiente código:

- Si por ejemplo desea convertir 10 grados centígrados a grados Farenheit puede utilizar la función ***celToFar*** de la siquiente manera:

``` 
http://localhost:8080/conversion/celTofar/10
```
Esta función le retornará un objeto JSON que contiene la medida que ingresó y el valor convertido de la siguente manera:

``` 
{"cel":50.0}
```

- Si por ejemplo desea convertir 10 grados Farenheit a grados centígrados puede utilizar la función ***farTocel*** de la siquiente manera:

``` 
http://localhost:8080/conversion/farTocel/10
```
Esta función le retornará un objeto JSON que contiene la medida que ingresó y el valor convertido de la siguente manera:

``` 
{"far":-12.222223}
```

## Estudiante:
Brayam Estevan Vargas Pinzón 

Carne: 2109950

ARSW  2018-2
