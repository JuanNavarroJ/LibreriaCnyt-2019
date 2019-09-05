# Librería computación Cuántica

Esta libreria esta diseñada para operar numeros y matrices complejas con esto podremos empezar a entender espacios vectoriales complejos.

## ¿Como instalar y probar?

Debemos tener un editor java instalado y git, es opcional tener instalado el uso de maven que permitira un mejor control sobre el proyecto.

1. Entramos la terminal del dispositivo y accedemos a la carpeta en la cual queremos guardar el proyecto. 
2. Usando los comandos de git empezamos con : **$ git clone** https://github.com/JuanNavarroJ/LibreriaCnyt-2019.git 
3. Ingresamos a la carpeta que descargamos desde Github.
4. Usando maven podemos en la linea de comandos compilar y ejecutar el proyecto con el codigo **$ mvn package**
5. Si solo deseas correr las pruebas podemos ejecutar el comando maven **$ mvn test**
6. Si deseas conocer a profundidad el funcionamiento del codigo, podemos abrir el proyecto en un editor java.

## Operaciones con números complejos:

### Suma
	
La **suma** de números complejos se realiza sumando partes reales entre sí y partes imaginarias entre sí.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28A%20&plus;%20B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20&plus;%20%28C%20&plus;%20D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%28A%20&plus;%20C%29%20&plus;%20%28B%20&plus;%20D%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D)

Ejemplo:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%283%20&plus;%202%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20&plus;%20%286%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%283%20&plus;%206%29%20&plus;%20%282%20&plus;%203%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%20%7D%20%24%24%20%24%24%20%7B%5Ccolor%7BDarkBlue%7D%209%20&plus;%205%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)


---
	
### Resta

La **resta** de números complejos se realiza sumando partes reales entre sí y partes imaginarias entre sí.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28A%20&plus;%20B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20-%20%28C%20&plus;%20D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%28A%20-%20C%29%20&plus;%20%28B%20-%20D%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)


Ejemplo:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%283%20&plus;%202%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20-%20%286%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%283%20-%206%29%20&plus;%20%282%20-%203%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%20%7D%20%7B%5Ccolor%7BDarkBlue%7D%20-3%20-%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)


---
	
### Producto

El **producto** de los números complejos se realiza aplicando la propiedad distributiva del producto respecto de la suma y teniendo en cuenta que ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%5E%7B2%7D%20%3D%20-1%20%7D)

Es decir:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28A%20&plus;%20B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%5Ccdot%20%28C%20&plus;%20D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20AC%20&plus;AD%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%20BC%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%20BD%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%5E%7B2%7D%7D)


Ejemplo: 

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%282%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%5Ccdot%20%281%20&plus;%204%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%202%5Ccdot1%20&plus;2%5Ccdot%204%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%203%5Ccdot1%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%203%5Ccdot%204%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%5E%7B2%7D%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%202%20&plus;%206%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%2012%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%5E%7B2%7D%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%202%20&plus;%206%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%2012%5Ccdot%28-1%29%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%202%20&plus;%206%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20-%2012%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%20-10%20&plus;%209%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D)
	
---

### División

Para dividir números complejos se multiplica numerador y denominador por el conjugado del denominador y se realiza el producto que explicamos en la parte anterior.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%24%24%7B%5Ccolor%7BDarkBlue%7D%20%5Cfrac%7BA&plus;B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%20%3D%20%3E%5Cfrac%7BA&plus;B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%20%5Ccdot%20%5Cfrac%7B%5Coverline%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7D%7B%5Coverline%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7D%7D%24%24)


---

### Módulo

Se llama módulo de un número complejo a la distancia del origen de coordenadas al afijo de dicho número. 

Es decir: 

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Csqrt%7BA%5E%7B2%7D&plus;B%5E%7B2%7D%7D%7D)

Y es representado por :  ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Cleft%20%7C%20z%20%5Cright%20%7C%7D)

---

### Conjugado

Se llama conjugado de un número complejo_ al número complejo que se obtiene por simetría del dado respecto del eje de la parte imaginaria.
Se obtiene al cambiar el signo de la parte imaginaria de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA&plus;Bi%20%7D%20%3D%20A-Bi%7D)

---

### Conversión entre representaciones polar y cartesiano

Los números complejos pueden representarse gráficamente, al igual que los números reales. Ahora bien, si aquellos los representábamos en una recta (la recta real), los complejos tenemos que representarlos en un plano (el plano complejo), ya que tienen parte real y parte imaginaria.
	
Asociamos el eje X del plano a los números reales, y el eje Y a los imaginarios, de modo que cada número complejo viene representado por un punto de ese plano.
	
Eso es dar los puntos en coordenadas cartesianas, pero también podemos expresar un punto en coordenadas polares, es decir, dando la distancia hasta el origen (módulo) y el ángulo que forma con el eje X (fase):

![equation]()

---

### Multiplicación escalar de vectores complejos.

Para la multiplicacion entre vectores complejos tenemos que multiplicar termino a termino.

![equation]()

---

### Adición de matrices complejos.

Para la adicion entre numeros complejos debemos sumar termino a termino.
![equation]()

---

### Inversa de matrices complejos.

El inverso de una matriz compleja se obtine mediante el cambio de signo tanto de la parte real como su parte imaginaria de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28-A%29%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20-%28A%29%5Cleft%20%28%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%5Cright%20%29%7D)

---

### Multiplicación escalar de matrices complejas.

Para la multiplicacion de matrices complejas debemos tener en cuenta que se debe multiplicar por cada elemento de la primera matriz recorremos en fila y por cada elemento de la segunda matriz recorremos en columna.

![equation]()

---

### Matriz transpuesta

La matriz transpuesta se denota como ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20A%5E%7BT%7D%7D) 
Y es definida por un cambio de de filas y columnas de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20A%5E%7BT%7D%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20A%5Cleft%20%5B%20k%2Cj%20%5Cright%20%5D%7D)

---

### Matriz conjugada

La matriz conjugada se denota como ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA%7D%7D)
Y esta definida como el conjugado de cada numero complejo que se encuentra en la matriz de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA%7D%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20%5Coverline%7BA%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%7D%7D)

---

### Matriz adjunta

Para obtener la matriz adjunta debemos primero sacar la matriz trasnpuesta y luego hacer a esa matriz su conjugada de la siguiente forma:

![equation]()

---

### Función para calcular la "acción" de una matriz sobre un vector.

![equation]()

---

### Norma de matrices

La norma de una matriz es poder obetener su distancia para hacer esta operacion seguimos la siguiente ecuacion.
![equation]()

---

### Distancia entrematrices

La distancia entre matrices es un real que nos indica la distacia entre dos matrices complejas diferentes.
![equation]()

---

### Revisar si es unitaria

Una matriz unitaria es aquella que al multiplicarla por su adjunta la matriz resultante es una matrix unitaria es decir que la diagonal de la matriz esta compuesta por 1 y el resto.
![equation]()

---

### Revisar si es Hermitian

Una matriz hermitain es si la posicion j,k es igual a su posicion k,j conjugado de la siguiente manera:
![equation]()

---

### Producto tensor.

El producto tensor entre matrices es aquel que por cada elemento de la matriz A multiplico cada elemento de la matriz B de la siguiente manera.

![equation]()

---