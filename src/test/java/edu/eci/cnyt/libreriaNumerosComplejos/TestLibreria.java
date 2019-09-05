import static org.junit.Assert.*;

import org.junit.Test;

public class TestLibreria {

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
	
	@Test
	public void deberiaHacerProductoDeDosNumerosComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(6,3);
		NumeroComplejo res = Libreria.producto(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(12,21);
		assertTrue(res.equals(sol));
	}
	
	@Test
	public void deberiaRestarDosNumerosComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(1,-3);
		NumeroComplejo numC2 = new NumeroComplejo(8,2);
		NumeroComplejo res = Libreria.resta(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(-7,-5);
		assertTrue(res.equals(sol));
		
	}
	
	@Test
	public void deberiaDividirDosNumerosComplejos2() {
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(-1,2);
		NumeroComplejo res = Libreria.division(numC1, numC2);
		NumeroComplejo sol = new NumeroComplejo(0.2,-1.6);
		assertTrue(res.equals(sol));
	}
	
	@Test
	public void deberiaObtenerElModulo() {
		NumeroComplejo numC = new NumeroComplejo(1,-3);
		assertEquals(numC.modulo(),Math.sqrt(10),1.0);
	}
	
	@Test
	public void deberiaObtenerElConjugado() {
		NumeroComplejo numC = new NumeroComplejo(1,-3);
		NumeroComplejo res = numC.conjugado();
		NumeroComplejo sol = new NumeroComplejo(1,3);
		assertTrue(res.equals(sol));
	}
	
	@Test
	public void deberiaPasarDeCoordenadasPolaresACartesianas() {
		double r = 5;
		double ang = 30;
		NumeroComplejo res = Libreria.cartesiano(r, ang);
		NumeroComplejo sol = new NumeroComplejo(4.330127018922194,2.4999999999999996);
		assertTrue(res.equals(sol));
	}
	
	@Test
	public void deberiaPasarDeCoordenadasCartesianasAPolares() {
		NumeroComplejo numC = new NumeroComplejo(-7,3);
		double[] res = Libreria.polar(numC);
		assertEquals(res[0],Math.sqrt(58),1.0);
		assertEquals(res[1],156.80140948635182,1.0);
	}
	
	@Test
	public void deberiaSumarDosVectoresComplejos() {
		NumeroComplejo numC1 = new NumeroComplejo(1,2);
		NumeroComplejo numC2 = new NumeroComplejo(8,2);
		NumeroComplejo numC3 = new NumeroComplejo(3,-3);
		NumeroComplejo numC4 = new NumeroComplejo(2,1);
		NumeroComplejo numC5 = new NumeroComplejo(7,3);
		NumeroComplejo numC6 = new NumeroComplejo(1,1);
		NumeroComplejo[] vector1 = {numC1,numC2,numC3,numC4};
		NumeroComplejo[] vector2 = {numC5,numC6};
		NumeroComplejo[] res = Libreria.sumaVectoresComplejos(vector1, vector2);
		NumeroComplejo[] sol = {new NumeroComplejo(8,5),new NumeroComplejo(9,3),new NumeroComplejo(3,-3),new NumeroComplejo(2,1)};
		for(int i=0; i<sol.length; i++) {
			assertTrue(sol[i].equals(res[i]));
		}
	}
	
	@Test
	public void deberiaObtenerElInversoDelVector() {
		NumeroComplejo numC1 = new NumeroComplejo(1,2);
		NumeroComplejo numC2 = new NumeroComplejo(8,2);
		NumeroComplejo numC3 = new NumeroComplejo(3,-3);
		NumeroComplejo numC4 = new NumeroComplejo(2,1);
		NumeroComplejo[] vector1 = {numC1,numC2,numC3,numC4};
		NumeroComplejo[] res = Libreria.inversoVector(vector1);
		NumeroComplejo[] sol = {new NumeroComplejo(-1,-2),new NumeroComplejo(-8,-2),new NumeroComplejo(-3,3),new NumeroComplejo(-2,-1)};
		for(int i=0; i<sol.length; i++) {
			assertTrue(sol[i].equals(res[i]));
		}
	}
	
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
	
	@Test
	public void deberiaSerUnaMatrizUnitaria() {
		NumeroComplejo numC1 = new NumeroComplejo(0,0);
		NumeroComplejo numC2 = new NumeroComplejo(1,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC2},{numC2,numC1}};
		boolean res = Libreria.esUnitaria(matriz1);
		assertTrue(res);
		double num1 = 1/Math.sqrt(2);
		double num2 = -1*num1;
		NumeroComplejo numC3 = new NumeroComplejo(num1,0);
		NumeroComplejo numC4 = new NumeroComplejo(num2,0);
		NumeroComplejo[][] matriz2 = {{numC3,numC3},{numC3,numC4}};
		boolean res1 = Libreria.esUnitaria(matriz2);
		assertTrue(res1);
	}
	
	@Test
	public void deberiaSerUnaMatrizHermitian() {
		//Ejemplo 2.6.1
		NumeroComplejo numC1 = new NumeroComplejo(5,0);
		NumeroComplejo numC2 = new NumeroComplejo(4,5);
		NumeroComplejo numC3 = new NumeroComplejo(6,-16);
		NumeroComplejo numC4 = new NumeroComplejo(4,-5);
		NumeroComplejo numC5 = new NumeroComplejo(13,0);
		NumeroComplejo numC6 = new NumeroComplejo(7,0);
		NumeroComplejo numC7 = new NumeroComplejo(6,16);
		NumeroComplejo numC8 = new NumeroComplejo(7,0);
		NumeroComplejo numC9 = new NumeroComplejo(-2.1,0);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC6},{numC7,numC8,numC9}};
		boolean res = Libreria.esHermitian(matriz1);
		assertTrue(res);
	}
	
	@Test
	public void deberiaObtenerElProductoTensor() {
		//Ejercicio 2.7.3
		NumeroComplejo numC1 = new NumeroComplejo(3,2);
		NumeroComplejo numC2 = new NumeroComplejo(5,-1);
		NumeroComplejo numC3 = new NumeroComplejo(0,2);
		NumeroComplejo numC4 = new NumeroComplejo(0,0);
		NumeroComplejo numC5 = new NumeroComplejo(12,0);
		NumeroComplejo numC6 = new NumeroComplejo(6,-3);
		NumeroComplejo numC7 = new NumeroComplejo(2,0);
		NumeroComplejo numC8 = new NumeroComplejo(4,4);
		NumeroComplejo numC9 = new NumeroComplejo(9,3);
		NumeroComplejo numC10 = new NumeroComplejo(1,0);
		NumeroComplejo numC11 = new NumeroComplejo(3,4);
		NumeroComplejo numC12 = new NumeroComplejo(5,-7);
		NumeroComplejo numC13 = new NumeroComplejo(10,2);
		NumeroComplejo numC14 = new NumeroComplejo(6,0);
		NumeroComplejo numC15 = new NumeroComplejo(2,5);
		NumeroComplejo numC16 = new NumeroComplejo(0,0);
		NumeroComplejo numC17 = new NumeroComplejo(1,0);
		NumeroComplejo numC18 = new NumeroComplejo(2,9);
		NumeroComplejo[][] matriz1 = {{numC1,numC2,numC3},{numC4,numC5,numC6},{numC7,numC8,numC9}};
		NumeroComplejo[][] matriz2 = {{numC10,numC11,numC12},{numC13,numC14,numC15},{numC16,numC17,numC18}};
		NumeroComplejo[][] res = Libreria.productoTensor(matriz1, matriz2);
		NumeroComplejo[][] sol = {{new NumeroComplejo(3,2),new NumeroComplejo(1,18),new NumeroComplejo(29,-11),new NumeroComplejo(5,-1),new NumeroComplejo(19,17),new NumeroComplejo(18,-40),new NumeroComplejo(0,2),new NumeroComplejo(-8,6),new NumeroComplejo(14,10)},
								  {new NumeroComplejo(26,26),new NumeroComplejo(18,12),new NumeroComplejo(-4,19),new NumeroComplejo(52,0),new NumeroComplejo(30,-6),new NumeroComplejo(15,23),new NumeroComplejo(-4,20),new NumeroComplejo(0,12),new NumeroComplejo(-10,4)},
								  {new NumeroComplejo(0,0),new NumeroComplejo(3,2),new NumeroComplejo(-12,31),new NumeroComplejo(0,0),new NumeroComplejo(5,-1),new NumeroComplejo(19,43),new NumeroComplejo(0,0),new NumeroComplejo(0,2),new NumeroComplejo(-18,4)},
								  {new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(12,0),new NumeroComplejo(36,48),new NumeroComplejo(60,-84),new NumeroComplejo(6,-3),new NumeroComplejo(30,15),new NumeroComplejo(9,-57)},
								  {new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(120,24),new NumeroComplejo(72,0),new NumeroComplejo(24,60),new NumeroComplejo(66,-18),new NumeroComplejo(36,-18),new NumeroComplejo(27,24)},
								  {new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(0,0),new NumeroComplejo(12,0),new NumeroComplejo(24,108),new NumeroComplejo(0,0),new NumeroComplejo(6,-3),new NumeroComplejo(39,48)},
								  {new NumeroComplejo(2,0),new NumeroComplejo(6,8),new NumeroComplejo(10,-14),new NumeroComplejo(4,4),new NumeroComplejo(-4,28),new NumeroComplejo(48,-8),new NumeroComplejo(9,3),new NumeroComplejo(15,45),new NumeroComplejo(66,-48)},
								  {new NumeroComplejo(20,4),new NumeroComplejo(12,0),new NumeroComplejo(4,10),new NumeroComplejo(32,48),new NumeroComplejo(24,24),new NumeroComplejo(-12,28),new NumeroComplejo(84,48),new NumeroComplejo(54,18),new NumeroComplejo(3,51)},
								  {new NumeroComplejo(0,0),new NumeroComplejo(2,0),new NumeroComplejo(4,18),new NumeroComplejo(0,0),new NumeroComplejo(4,4),new NumeroComplejo(-28,44),new NumeroComplejo(0,0),new NumeroComplejo(9,3),new NumeroComplejo(-9,87)}};								  
		for(int i=0; i<sol.length; i++) {
			for(int j=0; j<sol[0].length; j++) {
				assertTrue(res[i][j].equals(sol[i][j]));
			}
		}
	}
}
