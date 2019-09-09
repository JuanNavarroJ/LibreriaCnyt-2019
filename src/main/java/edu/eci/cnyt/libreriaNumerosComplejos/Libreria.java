
import java.util.ArrayList;

/**
 * Clase libreria que contiene algunas operaciones entre numeros complejos.
 * @author Juan David
 * @version	2
 *
 */
public class Libreria {
	
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
	}
	
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
	
	/**
	 * Metodo que permite realiza la suma de dos Vectores de numeros complejos.
	 * @param vector1	Es el primer vector a sumar.
	 * @param vector2	Es el segundo vector a sumar.
	 * @return	Retorna el vector resultante.
	 */
	public static NumeroComplejo[] sumaVectoresComplejos(NumeroComplejo[] vector1, NumeroComplejo[] vector2) {
		int longitud = Math.max(vector1.length, vector2.length);
		NumeroComplejo[] res = new NumeroComplejo[longitud];
		for(int i=0; i<longitud;i++) {
			if(vector1.length>i && vector2.length>i) {
				res[i] = suma(vector1[i],vector2[i]);
			}else if(vector1.length>i && vector2.length<=i) {
				res[i] = vector1[i];
			}else{
				res[i] = vector2[i];
			}
		}
		return res;
	}
	
	/**
	 * Metodo que permite calcular el inverso de un vector.
	 * @param vector1	Es el primer vector del cual se quiere conseguir su inverso.
	 * @return	Retorna el vector inverso.
	 */
	public static NumeroComplejo[] inversoVector(NumeroComplejo[] vector1) {
		NumeroComplejo[] res = new NumeroComplejo[vector1.length];
		for(int i=0; i<vector1.length;i++) {
			res[i] = vector1[i].opuesto();
		}
		return res;
	}
	
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
	
	/**
	 * Metodo que permite la resta de dos Matrices Complejas.
	 * @param matriz1	Es la primera matriz compleja que se quiere sumar.
	 * @param matriz2	Es la segunda matriz compleja que se quiere sumar.
	 * @return	Retorna la suma de las dos Matrices Complejas.
	 */
	public static NumeroComplejo[][] restaMatricesComplejas(NumeroComplejo[][] matriz1, NumeroComplejo[][] matriz2){
		NumeroComplejo[][] res = new NumeroComplejo[matriz1.length][matriz1[0].length];
		for(int i=0; i<matriz1.length;i++) {
			for(int j=0; j<matriz1[0].length;j++) {
				res[i][j] = resta(matriz1[i][j],matriz2[i][j]);
			}
		}
		return res;
	}
	
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
	
	/**
	 * Metodo que calcula el Producto Tensor entre dos matrices.
	 * @param matriz1	Es la matriz 1 que se le quiere hacer el producto tensor.
	 * @param matriz2	Es la matriz 2 que se le quiere hacer el producto tensor.
	 * @return	Retorna Una matriz que es el producto tensor entre la matriz1 y la matriz2.
	 */
	public static NumeroComplejo[][] productoTensor(NumeroComplejo[][] matriz1, NumeroComplejo[][] matriz2){
		NumeroComplejo[][] res = new NumeroComplejo[matriz1.length*matriz2.length][matriz1[0].length*matriz2[0].length];
		int fila = 0;
		for(int i=0; i<matriz1.length;i++) {
			fila-=1;
			for(int j=0; j<matriz1[0].length;j++) {
				int columna = 0;
				fila +=1;
				for(int m=0; m<matriz2.length;m++) {
					for(int n=0; n<matriz2[0].length;n++) {
						res[fila+i][columna] = producto(matriz1[i][m],matriz2[j][n]);
						columna +=1;
					}
				}
			}
		}
		return res;
	}
}
