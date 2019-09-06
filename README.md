# Librería computación Cuántica

Esta libreria esta diseñada para operar numeros y matrices complejas con esto podremos empezar a entender espacios vectoriales complejos.

## ¿Como instalar y probar?

Debemos tener un editor java instalado y git, es opcional tener instalado el uso de maven que permitira un mejor control sobre el proyecto.

1. Entramos la terminal del dispositivo y accedemos a la carpeta en la cual queremos guardar el proyecto. 

![Prueba1](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso1.PNG?raw=true)

2. Usando los comandos de git empezamos con : **$ git clone** https://github.com/JuanNavarroJ/LibreriaCnyt-2019.git 

![parte2](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso2.PNG?raw=true)

3. Ingresamos a la carpeta que descargamos desde Github.

![parte3](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso3.PNG?raw=true)

4. Usando maven podemos en la linea de comandos compilar y ejecutar el proyecto con el codigo **$ mvn package**

![parte4](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso4.PNG?raw=true)

![parte4b](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso5.PNG?raw=true)

5. Si solo deseas correr las pruebas podemos ejecutar el comando maven **$ mvn test**

![testMaven](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso6.PNG?raw=true)

6. Si deseas conocer a profundidad el funcionamiento del codigo, podemos abrir el proyecto en un editor java.

![image](https://github.com/JuanNavarroJ/LibreriaCnyt-2019/blob/master/ImagenesDeInstalacion/Paso7.PNG?raw=true)

## Operaciones con números complejos:

### Suma
	
La **suma** de números complejos se realiza sumando partes reales entre sí y partes imaginarias entre sí.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28A%20&plus;%20B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20&plus;%20%28C%20&plus;%20D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%28A%20&plus;%20C%29%20&plus;%20%28B%20&plus;%20D%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D)

Ejemplo:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%283%20&plus;%202%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20&plus;%20%286%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%283%20&plus;%206%29%20&plus;%20%282%20&plus;%203%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%20%7D%20%24%24%20%24%24%20%7B%5Ccolor%7BDarkBlue%7D%209%20&plus;%205%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite la suma entre dos numeros complejos.
	 * @param number1	Es el primer numero complejo.
	 * @param number2	Es el segundo numero complejo.
	 * @return	Retorna la suma entre los dos numeros complejos.
	 */
	public static NumeroComplejo suma(NumeroComplejo number1, NumeroComplejo number2) {
		double sumI = number1.getImaginario() + number2.getImaginario();
		double sumR = number1.getReal() + number2.getReal();
		return new NumeroComplejo(sumR,sumI);
	}
```
---
	
### Resta

La **resta** de números complejos se realiza sumando partes reales entre sí y partes imaginarias entre sí.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28A%20&plus;%20B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20-%20%28C%20&plus;%20D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%28A%20-%20C%29%20&plus;%20%28B%20-%20D%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)


Ejemplo:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%283%20&plus;%202%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20-%20%286%20&plus;%203%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%29%20%3D%20%283%20-%206%29%20&plus;%20%282%20-%203%29%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)
![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%3D%20%7D%20%7B%5Ccolor%7BDarkBlue%7D%20-3%20-%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%20%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite la resta entre dos numeros complejos.
	 * @param number1	Es el primer numero complejo.
	 * @param number2	Es el segundo numero complejo.
	 * @return	Retorna la resta entre los dos numeros complejos.
	 */
	public static NumeroComplejo resta(NumeroComplejo number1, NumeroComplejo number2) {
		double resI = number1.getImaginario() - number2.getImaginario();
		double resR = number1.getReal() - number2.getReal();
		return new NumeroComplejo(resR, resI);
	}
```

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

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite el producto entre dos numeros complejos.
	 * @param number1	Es el primer numero complejo.
	 * @param number2	Es el segundo numero complejo.
	 * @return	Retorna el producto entre los dos numeros complejos.
	 */
	public static NumeroComplejo producto(NumeroComplejo number1, NumeroComplejo number2) {
		NumeroComplejo firstP = new NumeroComplejo(number1.getReal() * number2.getReal() , number1.getReal() * number2.getImaginario());
		NumeroComplejo secondP = new NumeroComplejo((number1.getImaginario() * number2.getImaginario()) * -1 , number1.getImaginario() * number2.getReal());
		return suma(firstP,secondP);
	
```

---

### División

Para dividir números complejos se multiplica numerador y denominador por el conjugado del denominador y se realiza el producto que explicamos en la parte anterior.
Es decir:

![equation](http://latex.codecogs.com/gif.latex?%24%24%7B%5Ccolor%7BDarkBlue%7D%20%5Cfrac%7BA&plus;B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%20%3D%20%3E%5Cfrac%7BA&plus;B%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%20%5Ccdot%20%5Cfrac%7B%5Coverline%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7D%7B%5Coverline%7BC&plus;D%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%7D%7D%7D%24%24)

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite la division entre dos numeros complejos.
	 * @param number1	Es el primer numero complejo.
	 * @param number2	Es el segundo numero complejo.
	 * @return	Retorna la division entre los dos numeros complejos.
	 */
	public static NumeroComplejo division(NumeroComplejo number1, NumeroComplejo number2) {
		NumeroComplejo dividendo = producto(number1,number2.conjugado());
		NumeroComplejo divisor = producto(number2,number2.conjugado());
		NumeroComplejo res = new NumeroComplejo(dividendo.getReal()/divisor.getReal() ,dividendo.getImaginario()/divisor.getReal());
		return res;
	}
```

---

### Módulo

Se llama módulo de un número complejo a la distancia del origen de coordenadas al afijo de dicho número. 

Es decir: 

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Csqrt%7BA%5E%7B2%7D&plus;B%5E%7B2%7D%7D%7D)

Y es representado por :  ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Cleft%20%7C%20z%20%5Cright%20%7C%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite hacer el conjugado al numero complejo.
	 * @return	Retorna El conjugado del numero complejo que es un nuevo numero complejo.
	 */
	public NumeroComplejo conjugado() {
		return new NumeroComplejo(pReal, pImaginario*-1);
	}
```
---

### Conjugado

Se llama conjugado de un número complejo_ al número complejo que se obtiene por simetría del dado respecto del eje de la parte imaginaria.
Se obtiene al cambiar el signo de la parte imaginaria de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA&plus;Bi%20%7D%20%3D%20A-Bi%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
```	java
	/**
	 * Metodo que permite hacer el conjugado al numero complejo.
	 * @return	Retorna El conjugado del numero complejo que es un nuevo numero complejo.
	 */
	public NumeroComplejo conjugado() {
		return new NumeroComplejo(pReal, pImaginario*-1);
	}
```

---

### Conversión entre representaciones polar y cartesiano

Los números complejos pueden representarse gráficamente, al igual que los números reales. Ahora bien, si aquellos los representábamos en una recta (la recta real), los complejos tenemos que representarlos en un plano (el plano complejo), ya que tienen parte real y parte imaginaria.
	
Asociamos el eje X del plano a los números reales, y el eje Y a los imaginarios, de modo que cada número complejo viene representado por un punto de ese plano.
	
Eso es dar los puntos en coordenadas cartesianas, pero también podemos expresar un punto en coordenadas polares, es decir, dando la distancia hasta el origen (módulo) y el ángulo que forma con el eje X (fase):

![equation]()

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite pasar un numero complejo de sus coordenadas cartesianas a sus coordenadas polares.
	 * @param number1	Es el numero complejo el cual se desea obtener sus cordenadas polares
	 * @return	Retorna las coordenadas Polares del numero complejo.
	 */
	public static double[] polar(NumeroComplejo number) {
		double r = number.modulo();
		double ang = number.fase();
		if(ang<0) {
			ang += 180;
		}
		double[] res = new double[2];
		res[0] = r;
		res[1] = ang;
		return res;
	}
```

``` java
	/**
	 * Metodo que permite pasar de coordenadas polares a coordenadas cartesianas.
	 * @param r	Es el modulo.
	 * @param ang	Es el angulo de las coordenadas polares.
	 * @return	Retorna las coordenadas cartesianas, es decir un numero complejo.
	 */
	public static NumeroComplejo cartesiano(double r , double ang) {
		double pReal = r*Math.cos(Math.toRadians(ang));
		double pImaginaria = r*Math.sin(Math.toRadians(ang));
		NumeroComplejo res = new NumeroComplejo (pReal , pImaginaria);
		return res;
	}
```

---

### Multiplicación escalar de vectores complejos.

Para la multiplicacion entre vectores complejos tenemos que multiplicar termino a termino.


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite la multiplicacion de un Escalar y un Vector Complejo.
	 * @param vector1	Es el vector complejo que se va a multiplicar
	 * @param numC1	Es el numero complejo que toma la funcion de escalar.
	 * @return	Retorna un vector complejo producto de la multiplicacion del escalar por el vector inicial.
	 */
	public static NumeroComplejo[] multiplicacionEscalarPorVector(NumeroComplejo[] vector1, NumeroComplejo numC1) {
		NumeroComplejo[] res = new NumeroComplejo[vector1.length];
		for(int i=0; i<vector1.length;i++) {
			res[i] = producto(vector1[i],numC1);
		}
		return res;
	}
```

---

### Adición de matrices complejos.

Para la adicion entre numeros complejos debemos sumar termino a termino.


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite la suma de dos Matrices Complejas.
	 * @param matriz1	Es la primera matriz compleja que se quiere sumar.
	 * @param matriz2	Es la segunda matriz compleja que se quiere sumar.
	 * @return	Retorna la suma de las dos Matrices Complejas.
	 */
	public static NumeroComplejo[][] sumaMatricesComplejas(NumeroComplejo[][] matriz1, NumeroComplejo[][] matriz2){
		NumeroComplejo[][] res = new NumeroComplejo[matriz1.length][matriz1[0].length];
		for(int i=0; i<matriz1.length;i++) {
			for(int j=0; j<matriz1[0].length;j++) {
				res[i][j] = suma(matriz1[i][j],matriz2[i][j]);
			}
		}
		return res;
	}
```
---

### Inversa de matrices complejos.

El inverso de una matriz compleja se obtine mediante el cambio de signo tanto de la parte real como su parte imaginaria de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%28-A%29%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20-%28A%29%5Cleft%20%28%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%5Cright%20%29%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.

``` java
	/**
	 * Metodo que permite obetener el opuesto de una Matriz Compleja.
	 * @param matriz	Es la matriz de la cual se quiere obtener su opuesto.
	 * @return	Retorna la Matriz Compleja opuesta.
	 */
	public static NumeroComplejo[][] inversoMatrizCompleja(NumeroComplejo[][] matriz){
		NumeroComplejo[][] res = new NumeroComplejo[matriz.length][matriz[0].length];
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				res[i][j] = matriz[i][j].opuesto();
			}
		}
		return res;
	}
```

---

### Multiplicación escalar de matrices complejas.

Para la multiplicacion de matrices complejas debemos tener en cuenta que se debe multiplicar por cada elemento de la primera matriz recorremos en fila y por cada elemento de la segunda matriz recorremos en columna.

![equation]()

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite la multiplicacion escalar entre dos Matrices Complejas.
	 * @param matriz1	Es la primera matriz que se quiere multiplicar.
	 * @param matriz2	Es la segunda matriz que se quiere multiolicar.
	 * @return	Retorna la matriz que es el producto escalar entre la Matriz1 y la Matriz2.
	 */
	public static NumeroComplejo[][] multiplicacionDeMatrices(NumeroComplejo[][] matriz1, NumeroComplejo[][] matriz2){
		NumeroComplejo[][] res = null;
		if(matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
			res = new NumeroComplejo[matriz1.length][matriz1[0].length];
			for(int fila=0; fila<matriz1.length;fila++) {
				for(int columna=0; columna<matriz1[0].length;columna++) {
					ArrayList<NumeroComplejo> datos = new ArrayList<NumeroComplejo>();
					for(int i=0;i<matriz1.length;i++) {
						NumeroComplejo dato = producto(matriz1[fila][i],matriz2[i][columna]);
						datos.add(dato);
					}
					NumeroComplejo suma = new NumeroComplejo(0,0);
					for(NumeroComplejo num : datos) {
						suma = suma(num,suma);
					}
					res[fila][columna] = suma;
				}
			}
		}
		return res;
	}
```

---

### Matriz transpuesta

La matriz transpuesta se denota como ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20A%5E%7BT%7D%7D) 
Y es definida por un cambio de de filas y columnas de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20A%5E%7BT%7D%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20A%5Cleft%20%5B%20k%2Cj%20%5Cright%20%5D%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite obtener la Matriz Transpuesta.
	 * @param matriz	Es la matriz de la cual queremos obtener su Transpuesta.
	 * @return	Retorna la matriz Transpuesta.
	 */
	public static NumeroComplejo[][] matrizTranspuesta(NumeroComplejo[][] matriz){
		NumeroComplejo[][] res = new NumeroComplejo[matriz.length][matriz[0].length];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				res[i][j] = matriz[j][i];
			}
		}
		return res;
	}
```

---

### Matriz conjugada

La matriz conjugada se denota como ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA%7D%7D)
Y esta definida como el conjugado de cada numero complejo que se encuentra en la matriz de la siguiente forma:

![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Coverline%7BA%7D%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%20%3D%20%5Coverline%7BA%20%5Cleft%20%5B%20j%2Ck%20%5Cright%20%5D%7D%7D)

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite obtener la matriz conjugada.
	 * @param matriz	Es la matriz de la cual se quiere obtener su matriz conjugada.
	 * @return	Retorna la matriz conjugada.
	 */
	public static NumeroComplejo[][] matrizConjugada(NumeroComplejo[][] matriz){
		NumeroComplejo[][] res = new NumeroComplejo[matriz.length][matriz[0].length];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				res[i][j] = matriz[i][j].conjugado();
			}
		}
		return res;
	}
```

---

### Matriz adjunta

Para obtener la matriz adjunta debemos primero sacar la matriz trasnpuesta y luego hacer a esa matriz su conjugada de la siguiente forma:


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite obtener la matriz Adjunta, recordemos que una matriz adjunta es una matriz que es transpuesta y conjugada.
	 * @param matriz	Es la matriz de la cual se quiere obtener su matriz adjunta.
	 * @return	Retorna la matriz adjunta.
	 */
	public static NumeroComplejo[][] matrizAdjunta(NumeroComplejo[][] matriz){
		NumeroComplejo[][] res = new NumeroComplejo[matriz.length][matriz[0].length];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				res[i][j] = matriz[j][i].conjugado();
			}
		}
		return res;
	}
```

---

### Función para calcular la "acción" de una matriz sobre un vector.

![equation]()

---

### Norma de matrices

La norma de una matriz es poder obetener su distancia para hacer esta operacion seguimos la siguiente ecuacion.


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite obtener la norma o distancia de una matriz.
	 * @param matriz	Es la matriz de la cual se quiere obtener su norma.
	 * @return	Retorna la norma de la matriz dada.
	 */
	public static double normaDeMatriz(NumeroComplejo[][] matriz) {
		double res=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				res += Math.pow(matriz[i][j].getReal(), 2);
				res += Math.pow(matriz[i][j].getImaginario(), 2);
			}
		}
		return Math.sqrt(res);
	}
```

---

### Distancia entrematrices

La distancia entre matrices es un real que nos indica la distacia entre dos matrices complejas diferentes.


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que permite calcular la distancia entre dos matrices 
	 * @param matriz1	Es la matriz1 a la cual se quiere saber su distancia
	 * @param matriz2	Es la matriz2 a la cual se quiere saber su distancia
	 * @return	Retorna la distancia entre las dos matrices.
	 */
	public static double distanciaEntreMatrices(NumeroComplejo[][] matriz1, NumeroComplejo[][] matriz2) {
		NumeroComplejo[][] ans = restaMatricesComplejas(matriz1,matriz2);
		return normaDeMatriz(ans);
	}
```

---

### Revisar si es unitaria

Una matriz unitaria es aquella que al multiplicarla por su adjunta la matriz resultante es una matrix unitaria es decir que la diagonal de la matriz esta compuesta por 1 y el resto.

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que revisa si una matriz es unitaria.
	 * @param matriz	Es la matriz que vamos a revisar si es unitaria
	 * @return	Retorna si la matriz es unitaria.
	 */
	public static boolean esUnitaria(NumeroComplejo[][] matriz) {
		boolean res = true;
		NumeroComplejo[][] ans = multiplicacionDeMatrices(matriz,matrizAdjunta(matriz));
		for(int i=0; i<ans.length;i++) {
			for(int j=0; j<ans[0].length;j++) {
				double pReal = ans[i][j].getReal();
				if(i==j) {
					if(!((Math.round(pReal*100)/100) ==1 && ans[i][j].getImaginario()==0)) {
						res = false;
					}
				}else{
					if(!(ans[i][j].getReal()==0 && ans[i][j].getImaginario()==0)) {
						res = false;
					}
				}
			}
		}
		return res;
	}
```

---

### Revisar si es Hermitian

Una matriz hermitain es si la posicion j,k es igual a su posicion k,j conjugado de la siguiente manera:


En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que me verifica si una matriz es Hermitian.
	 * @param matriz	Es la matriz que se quiere verificar.
	 * @return	Retorna true si la matriz es Hermitian, False de lo contrario.
	 */
	public static boolean esHermitian(NumeroComplejo[][] matriz) {
		boolean res = true;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(i!=j) {
					if(!(matriz[i][j].conjugado().equals(matriz[j][i])) ) {
						res = false;
					}
				}
			}
		}
		return res;
	}
```

---

### Producto tensor.

El producto tensor entre matrices es aquel que por cada elemento de la matriz A multiplico cada elemento de la matriz B de la siguiente manera.

En nuestra libreria esta operacion la podemos observar con este codigo.
``` java
	/**
	 * Metodo que me verifica si una matriz es Hermitian.
	 * @param matriz	Es la matriz que se quiere verificar.
	 * @return	Retorna true si la matriz es Hermitian, False de lo contrario.
	 */
	public static boolean esHermitian(NumeroComplejo[][] matriz) {
		boolean res = true;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(i!=j) {
					if(!(matriz[i][j].conjugado().equals(matriz[j][i])) ) {
						res = false;
					}
				}
			}
		}
		return res;
	}
```

---
