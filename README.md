# Librer�a computaci�n Cu�ntica

Esta libreria esta dise�ada para operar numeros y matrices complejas con esto podremos empezar a entender espacios vectoriales complejos.

## �Como instalar y probar?

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

## Operaciones con n�meros complejos:

### Suma
	
La **suma** de n�meros complejos se realiza sumando partes reales entre s� y partes imaginarias entre s�.
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
Y su respectiva prueba en java seria:

``` java
	@Test
	public void deberiaSumarDosNumerosComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(1,-3);
		NumeroComplejo numC2 = new NumeroComplejo(8,2);
		NumeroComplejo res = Libreria.suma(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(9,-1);
		NumeroComplejo badsol = new NumeroComplejo(9,1);
		assertTrue(res.equals(sol));
		assertFalse(res.equals(badsol));
	}
```

---
	
### Resta

La **resta** de n�meros complejos se realiza sumando partes reales entre s� y partes imaginarias entre s�.
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaRestarDosNumerosComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(1,-3);
		NumeroComplejo numC2 = new NumeroComplejo(8,2);
		NumeroComplejo res = Libreria.resta(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(-7,-5);
		assertTrue(res.equals(sol));
	}
```

---
	
### Producto

El **producto** de los n�meros complejos se realiza aplicando la propiedad distributiva del producto respecto de la suma y teniendo en cuenta que ![equation](http://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BDarkBlue%7D%20%5Cboldsymbol%7B%5Cmathit%7Bi%7D%7D%5E%7B2%7D%20%3D%20-1%20%7D)

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaHacerProductoDeDosNumerosComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(6,3);
		NumeroComplejo res = Libreria.producto(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(12,21);
		assertTrue(res.equals(sol));
	}
```
---

### Divisi�n

Para dividir n�meros complejos se multiplica numerador y denominador por el conjugado del denominador y se realiza el producto que explicamos en la parte anterior.
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaDividirDosNumerosComplejos2() {
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(-1,2);
		NumeroComplejo res = Libreria.division(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(0.2,-1.6);
		assertTrue(res.equals(sol));
	}
```

---

### M�dulo

Se llama m�dulo de un n�mero complejo a la distancia del origen de coordenadas al afijo de dicho n�mero. 

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerElModulo() {
		NumeroComplejo numC = new NumeroComplejo(1,-3);
		assertEquals(numC.modulo(),Math.sqrt(10),1.0);
	}
```

---

### Conjugado

Se llama conjugado de un n�mero complejo_ al n�mero complejo que se obtiene por simetr�a del dado respecto del eje de la parte imaginaria.
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerElConjugado() {
		NumeroComplejo numC = new NumeroComplejo(1,-3);
		NumeroComplejo res = numC.conjugado();
		NumeroComplejo sol = new NumeroComplejo(1,3);
		assertTrue(res.equals(sol));
	}
```

---

### Conversi�n entre representaciones polar y cartesiano

Los n�meros complejos pueden representarse gr�ficamente, al igual que los n�meros reales. Ahora bien, si aquellos los represent�bamos en una recta (la recta real), los complejos tenemos que representarlos en un plano (el plano complejo), ya que tienen parte real y parte imaginaria.
	
Asociamos el eje X del plano a los n�meros reales, y el eje Y a los imaginarios, de modo que cada n�mero complejo viene representado por un punto de ese plano.
	
Eso es dar los puntos en coordenadas cartesianas, pero tambi�n podemos expresar un punto en coordenadas polares, es decir, dando la distancia hasta el origen (m�dulo) y el �ngulo que forma con el eje X (fase):

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaPasarDeCoordenadasPolaresACartesianas() {
		double r = 5;
		double ang = 30;
		NumeroComplejo res = Libreria.cartesiano(r, ang);
		NumeroComplejo sol = new NumeroComplejo(4.330127018922194,2.4999999999999996);
		assertTrue(res.equals(sol));
	}
```
``` java
	@Test
	public void deberiaPasarDeCoordenadasCartesianasAPolares() {
		NumeroComplejo numC = new NumeroComplejo(-7,3);
		double[] res = Libreria.polar(numC);
		assertEquals(res[0],Math.sqrt(58),1.0);
		assertEquals(res[1],156.80140948635182,1.0);
	}
```

---

### Multiplicaci�n escalar de vectores complejos.

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaMultiplicarUnEscalarPorUnVector() {
		NumeroComplejo escalar = new NumeroComplejo(3,2);
		NumeroComplejo numC1 = new NumeroComplejo(6,3);
		NumeroComplejo numC2 = new NumeroComplejo(0,0);
		NumeroComplejo numC3 = new NumeroComplejo(5,1);
		NumeroComplejo numC4 = new NumeroComplejo(4,0);
		NumeroComplejo[] vector1 = {numC1,numC2,numC3,numC4};
		NumeroComplejo[] res = Libreria.multiplicacionEscalarPorVector(vector1, escalar);
		NumeroComplejo[] sol = {new NumeroComplejo(12,21),new NumeroComplejo(0,0),new NumeroComplejo(13,13),new NumeroComplejo(12,8)};
		for(int i=0; i<sol.length; i++) {
			assertTrue(sol[i].equals(res[i]));
		}
	}
```

---

### Adici�n de matrices complejos.

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
Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaSumarMatricesComplejas() {
		NumeroComplejo numC1 = new NumeroComplejo(6,3);
		NumeroComplejo numC2 = new NumeroComplejo(0,0);
		NumeroComplejo numC3 = new NumeroComplejo(5,1);
		NumeroComplejo numC4 = new NumeroComplejo(4,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC2},{numC3,numC4}};
		NumeroComplejo[][] matriz2 = {{numC4,numC3},{numC2,numC1}};
		NumeroComplejo[][] res = Libreria.sumaMatricesComplejas(matriz1, matriz2);
		NumeroComplejo[][] sol = {{new NumeroComplejo(10,3),new NumeroComplejo(5,1)},{new NumeroComplejo(5,1),new NumeroComplejo(10,3)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaMatrizInversa() {
		NumeroComplejo numC1 = new NumeroComplejo(6,3);
		NumeroComplejo numC2 = new NumeroComplejo(0,0);
		NumeroComplejo numC3 = new NumeroComplejo(5,1);
		NumeroComplejo numC4 = new NumeroComplejo(4,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC2},{numC3,numC4}};
		NumeroComplejo[][] res = Libreria.inversoMatrizCompleja(matriz1);
		NumeroComplejo[][] sol = {{new NumeroComplejo(-6,-3),new NumeroComplejo(0,0)},{new NumeroComplejo(-5,-1),new NumeroComplejo(-4,0)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
	}
```

---

### Multiplicaci�n escalar de matrices complejas.

Para la multiplicacion de matrices complejas debemos tener en cuenta que se debe multiplicar por cada elemento de la primera matriz recorremos en fila y por cada elemento de la segunda matriz recorremos en columna.

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaMultiplicarMatrices() {
		// Ejercicio 2.2.7
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(1,0);
		NumeroComplejo numC3 = new NumeroComplejo(4,-1);
		NumeroComplejo numC4 = new NumeroComplejo(0,0);
		NumeroComplejo numC5 = new NumeroComplejo(4,2);
		NumeroComplejo numC6 = new NumeroComplejo(5,-6);
		NumeroComplejo numC7 = new NumeroComplejo(0,1);
		NumeroComplejo numC8 = new NumeroComplejo(4,0);
		NumeroComplejo numC9 = new NumeroComplejo(5,0);
		NumeroComplejo numC10 = new NumeroComplejo(7,-4);
		NumeroComplejo numC11 = new NumeroComplejo(2,-1);
		NumeroComplejo numC12 = new NumeroComplejo(4,5);
		NumeroComplejo numC13 = new NumeroComplejo(2,7);
		NumeroComplejo numC14 = new NumeroComplejo(6,-4);
		NumeroComplejo numC15 = new NumeroComplejo(2,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC4,numC6},{numC2,numC5,numC7},{numC3,numC4,numC8}};
		NumeroComplejo[][] matriz2 = {{numC9,numC11,numC14},{numC4,numC12,numC15},{numC10,numC13,numC4}};
		NumeroComplejo[][] res = Libreria.multiplicacionDeMatrices(matriz1, matriz2);
		NumeroComplejo[][] sol = {{new NumeroComplejo(26,-52),new NumeroComplejo(60,24),new NumeroComplejo(26,0)},{new NumeroComplejo(9,7),new NumeroComplejo(1,29),new NumeroComplejo(14,0)},{new NumeroComplejo(48,-21),new NumeroComplejo(15,22),new NumeroComplejo(20,-22)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaMatrizTranspuesta() {
		//Ejercicio 2.2.5
		NumeroComplejo numC1 = new NumeroComplejo(6,-3);
		NumeroComplejo numC2 = new NumeroComplejo(2,12);
		NumeroComplejo numC3 = new NumeroComplejo(0,-19);
		NumeroComplejo numC4 = new NumeroComplejo(0,0);
		NumeroComplejo numC5 = new NumeroComplejo(5,2.1);
		NumeroComplejo numC6 = new NumeroComplejo(17,0);
		NumeroComplejo numC7 = new NumeroComplejo(1,0);
		NumeroComplejo numC8 = new NumeroComplejo(2,5);
		NumeroComplejo numC9 = new NumeroComplejo(3,-4.5);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC6},{numC7,numC8,numC9}};
		NumeroComplejo[][] res = Libreria.matrizTranspuesta(matriz1);
		NumeroComplejo[][] sol = {{new NumeroComplejo(6,-3),new NumeroComplejo(0,0),new NumeroComplejo(1,0)},{new NumeroComplejo(2,12),new NumeroComplejo(5,2.1),new NumeroComplejo(2,5)},{new NumeroComplejo(0,-19),new NumeroComplejo(17,0),new NumeroComplejo(3,-4.5)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaMatrizConjugada() {
		//Ejercicio 2.2.5
		NumeroComplejo numC1 = new NumeroComplejo(6,-3);
		NumeroComplejo numC2 = new NumeroComplejo(2,12);
		NumeroComplejo numC3 = new NumeroComplejo(0,-19);
		NumeroComplejo numC4 = new NumeroComplejo(0,0);
		NumeroComplejo numC5 = new NumeroComplejo(5,2.1);
		NumeroComplejo numC6 = new NumeroComplejo(17,0);
		NumeroComplejo numC7 = new NumeroComplejo(1,0);
		NumeroComplejo numC8 = new NumeroComplejo(2,5);
		NumeroComplejo numC9 = new NumeroComplejo(3,-4.5);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC6},{numC7,numC8,numC9}};
		NumeroComplejo[][] res = Libreria.matrizConjugada(matriz1);
		NumeroComplejo[][] sol = {{new NumeroComplejo(6,3),new NumeroComplejo(2,-12),new NumeroComplejo(0,19)},{new NumeroComplejo(0,0),new NumeroComplejo(5,-2.1),new NumeroComplejo(17,0)},{new NumeroComplejo(1,0),new NumeroComplejo(2,-5),new NumeroComplejo(3,+4.5)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaMatrizAdjunta() {
		//Ejercicio 2.2.5
		NumeroComplejo numC1 = new NumeroComplejo(6,-3);
		NumeroComplejo numC2 = new NumeroComplejo(2,12);
		NumeroComplejo numC3 = new NumeroComplejo(0,-19);
		NumeroComplejo numC4 = new NumeroComplejo(0,0);
		NumeroComplejo numC5 = new NumeroComplejo(5,2.1);
		NumeroComplejo numC6 = new NumeroComplejo(17,0);
		NumeroComplejo numC7 = new NumeroComplejo(1,0);
		NumeroComplejo numC8 = new NumeroComplejo(2,5);
		NumeroComplejo numC9 = new NumeroComplejo(3,-4.5);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC6},{numC7,numC8,numC9}};
		NumeroComplejo[][] res = Libreria.matrizAdjunta(matriz1);
		NumeroComplejo[][] sol = {{new NumeroComplejo(6,3),new NumeroComplejo(0,0),new NumeroComplejo(1,0)},{new NumeroComplejo(2,-12),new NumeroComplejo(5,-2.1),new NumeroComplejo(2,-5)},{new NumeroComplejo(0,19),new NumeroComplejo(17,0),new NumeroComplejo(3,4.5)}};
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
	}
```

---

### Funci�n para calcular la "acci�n" de una matriz sobre un vector.

Este metodo nos permite multiplicar una matriz por un vector y nos da como resultado un nuevo vector esta operacion es conocida como la Accion de una matriz sobre un vector.

``` java
	/**
	 * Metodo que permite calcular la accion de una matriz sobre un vector
	 * @param matriz	Es la matriz que ejerce la accion
	 * @param vector	Es el vector al cual le ejercen la accion
	 * @return	Retorna un vector que es la accion de la matriz al vector
	 */
	public static NumeroComplejo[] accionDeUnaMatrizSobreUnVector(NumeroComplejo[][] matriz, NumeroComplejo[] vector) {
		NumeroComplejo[] res = null;
		if(matriz[0].length == vector.length) {
			res = new NumeroComplejo[matriz.length];
			for(int i=0; i<matriz.length;i++) {
				NumeroComplejo ans = new NumeroComplejo(0,0);
				for(int j=0; j<matriz[0].length;j++) {
					ans = suma(producto(matriz[i][j],vector[j]),ans);
				}
				res[i]= ans;
			}
		}
		return res;
	}
```

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaAccionDeunaMatrizSobreUnVector() {
		NumeroComplejo numC1 = new NumeroComplejo(2,0);
		NumeroComplejo numC2 = new NumeroComplejo(5,0);
		NumeroComplejo numC3 = new NumeroComplejo(1,0);
		NumeroComplejo numC4 = new NumeroComplejo(4,0);
		NumeroComplejo numC5 = new NumeroComplejo(3,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC3}};
		NumeroComplejo[] vector = {numC4,numC1,numC1};
		NumeroComplejo[] res = Libreria.accionDeUnaMatrizSobreUnVector(matriz1, vector);
		NumeroComplejo[] ans = {new NumeroComplejo(20,0),new NumeroComplejo(24,0)};
		for(int i=0; i<res.length; i++) {
			assertTrue(res[i].equals(ans[i]));	
		}
	}
```

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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaNormaDeLaMatriz() {
		//Ejercicio 2.4.5
		NumeroComplejo numC1 = new NumeroComplejo(4,3);
		NumeroComplejo numC2 = new NumeroComplejo(6,-4);
		NumeroComplejo numC3 = new NumeroComplejo(12,-7);
		NumeroComplejo numC4 = new NumeroComplejo(13,0);
		NumeroComplejo[][] matriz1 = {{numC1},{numC2},{numC3},{numC4}};
		double res = Libreria.normaDeMatriz(matriz1);
		assertEquals(res,Math.sqrt(439),1.0);
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

Y su respectiva prueba en java seria:
``` java
	@Test
	public void deberiaObtenerLaNormaDeLaMatriz() {
		//Ejercicio 2.4.5
		NumeroComplejo numC1 = new NumeroComplejo(4,3);
		NumeroComplejo numC2 = new NumeroComplejo(6,-4);
		NumeroComplejo numC3 = new NumeroComplejo(12,-7);
		NumeroComplejo numC4 = new NumeroComplejo(13,0);
		NumeroComplejo[][] matriz1 = {{numC1},{numC2},{numC3},{numC4}};
		double res = Libreria.normaDeMatriz(matriz1);
		assertEquals(res,Math.sqrt(439),1.0);
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
## Simulaci�n de lo cl�sico a lo cu�ntico

### Programming Drill 3.1.1 - Quantum Computing for Computer Scientists.

Este reto permite el calculo de un sistema deterministico clasico segun la cantidad de clicks. 

Es decir con este reto podemos conocer el estado de las canicas despues de una cantidad de clicks ingresados por el usuario.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 3.1.1 - Quantum Computing for Computer Scientists.
     * Metodo que permite el calculo de un sistema deterministico clasico segun la cantidad de clicks.
     * @param matrizBool    Es la matriz booleana que contiene las relaciones entre los vertices.
     * @param estado Es el estado inicial de cada vertice cuantas bolas tiene.
     * @param cantClicks    Es la cantidad de clicks que indica los movimientos de las bolas.
     * @return  Retorna el estado final segun la cantidad de clicks dados.
     */
    public static int[] sistemaDeterministicoClasico(int[][] matrizBool, int[] estado, int cantClicks){
        int[] estadoMarbleAct = new int[estado.length];
        int[] estadoMarble = new int[estado.length];
        for(int i=0;i<estado.length;i++){
            estadoMarble[i] = estado[i]; 
        }
        if(matrizBool.length == matrizBool[0].length && matrizBool[0].length == estadoMarble.length){
            int cont = 0;
            while(cantClicks > cont){
                for (int i=0; i<matrizBool.length;i++){
                    int marbles =0;
                    for(int j=0; j<matrizBool[0].length;j++){
                        if(matrizBool[i][j]==1){
                            marbles += estadoMarble[j]; 
                        }
                    }
                    estadoMarbleAct[i] = marbles;
                }
                for(int i=0;i<estadoMarbleAct.length;i++){
                    estadoMarble[i] = estadoMarbleAct[i]; 
                }
                cont++;
            }
        }
        return estadoMarbleAct;
    }
```

Gracias a este programa podemos simular los estados de las canicas en base a una matriz booleana que nos indica las relaciones que hay entre los nodos.

### Programming Drill 3.2.1 - Quantum Computing for Computer Scientists.

Este reto permite el calculo de un sistema probabilistico segun la cantidad de clicks. 

Es decir con este reto podemos calcular la probabilidad de que haya una particula en el vector de estado.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 3.2.1 - Quantum Computing for Computer Scientists.
     * Metodo que permite el calculo de un sistema probabilistico segun la cantidad de clicks.
     * @param matrizProb    Es la matriz de probabilidades.
     * @param estado    Es las probabilidades iniciales.
     * @param cantClicks    Son la cantida de estados T que el usuario quiere simular.
     * @return  Retorna el estado de las probabilidades segun la cantidad de clicks.
     */
    public static double[] sistemaProbabilistico(double[][] matrizProb, double[] estado, int cantClicks){
        double[] estadoMarbleAct = new double[estado.length];
        double[] estadoMarble = new double[estado.length];
        for(int i=0;i<estado.length;i++){
            estadoMarble[i] = estado[i]; 
        }
        if(matrizProb.length == matrizProb[0].length && matrizProb[0].length == estadoMarble.length){
            int cont = 0;
            while(cantClicks > cont){
                for (int i=0; i<matrizProb.length;i++){
                    int marbles =0;
                    for(int j=0; j<matrizProb[0].length;j++){
                        marbles += matrizProb[i][j]*estadoMarble[j];
                    }
                    estadoMarbleAct[i] = marbles;
                }
                for(int i=0;i<estadoMarbleAct.length;i++){
                    estadoMarble[i] = estadoMarbleAct[i]; 
                }
                cont++;
            }
        }
        return estadoMarbleAct;
    }
```

Gracias a este programa podemos calcular las probabilidades de que una particula se encuentra en algun estado.

### Programming Drill 3.2.2 - Quantum Computing for Computer Scientists.

En este reto nos piden calcular la matriz de probabilidades del experimento de doble rendija para el desarrollo nos dan la cantidad de rendijas que pueden haber en el experimento.

Es decir con este reto podemos calcular la matriz de probabilidades segun la cantidad de rendijas dadas por el usuario.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 3.2.2 - Quantum Computing for Computer Scientists.
     * Metodo que permite el calculo de la matriz de probabilidades del experimento de doble rendija segun la cantidad de rendijas igresadas por el usuario. 
     * @param cantRendijas  Son la cantidad de rendijas iniciales que el usuario desea conocer su probabilidad.
     * @return  Retorna una matriz con las probabilidades.
     */
    public static String[][] experimentoRendijaDoble(int cantRendijas){
        int totalRendijas = (cantRendijas*3)+2;
        String[][] sistema = new String[totalRendijas][totalRendijas];
        String prob = Integer.toString(cantRendijas);
        int contR=0;
        int correc=0;
        for(int i=0;i<sistema.length;i++){
            int cont=0;
            for(int j=0;j<sistema[0].length;j++){
                if(contR==3){
                    contR = 0;
                    correc++;
                }if(i==j && i>cantRendijas){
                    sistema[i][j] = "1";
                }else if(j==0 && i>0 && i<=cantRendijas){
                    sistema[i][j] = "1/"+prob;
                }else if(j>0 && j<=cantRendijas && i>cantRendijas && (cont==0 || contR==0)){
                    if(correc!=0 && contR!=0){
                        sistema[i][j+correc] = "1/3";
                        sistema[i][j] = "0";
                        int guia = correc;
                        while(guia>1){
                            sistema[i][j+guia-1] = "0";
                            guia--;
                        }
                        j+=correc;
                    }else{
                        sistema[i][j] = "1/3";
                    }
                    cont++;
                    contR++;
                }else{
                    sistema[i][j] = "0";
                }
            }
        }
        return sistema;
    }
```

Gracias a este programa podemos calcular la matriz de probabilidades del experimento de rendijas segun la cantidad de rendijas iniciales.

### Programming Drill 3.3.1 - Quantum Computing for Computer Scientists.

En este reto nos piden calcular la matriz de probabilidades del experimento de doble rendija con numeros complejos para el desarrollo nos dan la cantidad de rendijas que pueden haber en el experimento.

Es decir con este reto podemos calcular la matriz de probabilidades de numeros complejos segun la cantidad de rendijas dadas por el usuario.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 3.3.1 - Quantum Computing for Computer Scientists.
     * Metodo que permite el calculo de la matriz de probabilidades del experimento de doble rendija segun la cantidad de rendijas igresadas por el usuario. 
     * @param cantRendijas  Son la cantidad de rendijas iniciales que el usuario desea conocer su probabilidad.
     * @return  Retorna una matriz con las probabilidades.
     */
    public static String[][] experimentoRendijaDobleNumerosComplejos(int cantRendijas){
        int totalRendijas = (cantRendijas*3)+2;
        String[][] sistema = new String[totalRendijas][totalRendijas];
        String prob = Integer.toString(cantRendijas);
        int contR=0;
        int correc=0;
        int contT=0;
        for(int i=0;i<sistema.length;i++){
            int cont=0;
            for(int j=0;j<sistema[0].length;j++){
                if(contR==3){
                    contR = 0;
                    correc++;
                }if(i==j && i>cantRendijas){
                    sistema[i][j] = "1";
                }else if(j==0 && i>0 && i<=cantRendijas){
                    sistema[i][j] = "1/?"+prob;
                }else if(j>0 && j<=cantRendijas && i>cantRendijas && (cont==0 || contR==0)){
                    if(correc!=0 && contR!=0){
                        if(contT==0){
                            sistema[i][j+correc] = "-1+i/?6";
                        }else if (contT==1){
                            sistema[i][j+correc] = "-1-i/?6";
                        }else{
                            sistema[i][j+correc] = "1-i/?6";
                            contT=-1;
                        }
                        //sistema[i][j+correc] = "1/3";
                        sistema[i][j] = "0";
                        int guia = correc;
                        while(guia>1){
                            sistema[i][j+guia-1] = "0";
                            guia--;
                        }
                        j+=correc;
                    }else{
                        if(contT==0){
                            sistema[i][j] = "-1+i/?6";
                        }else if (contT==1){
                            sistema[i][j] = "-1-i/?6";
                        }else{
                            sistema[i][j] = "1-i/?6";
                            contT=-1;
                        }
                        //sistema[i][j] = "1/3";
                    }
                    contT++;
                    cont++;
                    contR++;
                }else{
                    sistema[i][j] = "0";
                }
            }
        }
        return sistema;
    }
```

Gracias a este programa podemos calcular la matriz de probabilidades de numeros complejos del experimento de rendijas segun la cantidad de rendijas iniciales.

---

##  Teor�a Cu�ntica b�sica

---

## Sistema cu�ntico de part�cula en una l�nea

### 1) Probabilidad de encontrar una particula en una posici�n en particular

Gracias a este programa podemos calcular la probabilidad de encontrar una particula en una posicion dada.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 4.1 - Quantum Computing for Computer Scientists.
     * Metodo que permite calcular la probabilidad de encontra una particula en una posici�n en particular.
     * @param estado    Es el estado inicial de la particula.
     * @param posicion  Es la posicion en donde queremos encontrar la probabilidad en esa posicion.
     * @return 
     */
    public double probabilidadDeUnaParticula(NumeroComplejo[] estado, int posicion){
        double res = 0;
        double divisor = 0;
        double dividendo = 0;
        
        for(int i=0;i<estado.length;i++) {
            dividendo += Math.pow(estado[i].getReal(), 2);
            dividendo += Math.pow(estado[i].getImaginario(), 2);
            if(i==posicion){
                divisor += Math.pow(estado[i].getReal(), 2);
                divisor += Math.pow(estado[i].getImaginario(), 2);
            }
        }
        
        res = divisor/dividendo;
        
        return res;
    }
```

### 2) Probabilidad de transitar del primer vector al segundo.

Gracias a este programa podemos calcular la probabilidad de transitar de un vector a otro.

En nuestra libreria cuantica esta operacion la podemos observar con este codigo.
``` java
	/**
     * Programming Drill 4.1 - Quantum Computing for Computer Scientists.
     * Metodo que permite calcular la probabilidad de transitar de un vector a otro.
     * @param ket   Es el primer vector al que queremos transitar.
     * @param bra   Es el segundo vector de donde queremos partir a transitar.
     * @return  Retorna la probabilidad de transitar de un vector a otro.
     */
    public static NumeroComplejo probabilidadDeTransitarDeUnVectorAOtro(NumeroComplejo [] ket, NumeroComplejo [] bra){
        NumeroComplejo res = Libreria.productoInterno(ket, bra);
        return res;
    }
```
---
## Codacy

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0725624b31b842fb8a864d66db4ce31c)](https://www.codacy.com/manual/JuanNavarroJ/LibreriaCnyt-2019?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=JuanNavarroJ/LibreriaCnyt-2019&amp;utm_campaign=Badge_Grade)

---
## Autor:

Juan David Navarro Jimenez

---
