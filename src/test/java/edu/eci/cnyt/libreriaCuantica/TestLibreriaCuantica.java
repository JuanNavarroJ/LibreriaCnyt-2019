package edu.eci.cnyt.libreriaCuantica;

import edu.eci.cnyt.libreriaNumerosComplejos.NumeroComplejo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLibreriaCuantica {

    //Capitulo 3.1
    @Test
    // Example 3.1.3 - Quantum Computing for Computer Scientists
    public void SistemaDeterministicoClasico() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0}};
        int[] estadoInicial = {6, 2, 1, 5, 3, 10};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 1);
        int[] res = {0, 0, 12, 5, 1, 9};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Example 3.1.3 - Quantum Computing for Computer Scientists
    // Con dos Clicks.
    public void SistemaDeterministicoClasico2() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0}};
        int[] estadoInicial = {6, 2, 1, 5, 3, 10};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 2);
        int[] res = {0, 0, 9, 5, 12, 1};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Exercise 3.1.1 - Quantum Computing for Computer Scientists
    public void SistemaDeterministicoClasicoExercice311() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0}};
        int[] estadoInicial = {5, 5, 0, 2, 0, 15};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 1);
        int[] res = {0, 0, 20, 2, 0, 5};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    // Quiz #4 - CNYT 2019-2 
    @Test
    // Exercise 1
    public void SistemaDeterministicoClasicoExercise1() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0}};
        int[] estadoInicial = {0, 0, 0, 0, 0, 1};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 2019);
        int[] res = {0, 1, 0, 0, 0, 0};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Exercise 2
    public void SistemaDeterministicoClasicoExercise2() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0}};
        int[] estadoInicial = {6, 0, 3, 5, 3, 8};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 5000);
        int[] res = {0, 3, 11, 8, 3, 0};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Exercise 3
    public void SistemaDeterministicoClasicoExercise3() {
        int[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0}};
        int[] estadoInicial = {6, 5, 4, 3, 2, 1};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 3000);
        int[] res = {0, 6, 4, 9, 2, 0};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Exercise 3.2.3 - Quantum Computing for Computer Scientists
    public void SistemaProbabilisticoExercise223() {
        double[][] matrizBool = {{0, 1 / 3, 2 / 3},
        {1 / 6, 1 / 2, 1 / 3,},
        {5 / 6, 1 / 6, 0}};
        double[] estadoInicial = {1 / 3, 0, 2 / 3};
        double[] sol = LibreriaCuantica.sistemaProbabilistico(matrizBool, estadoInicial, 1);
        double[] res = {4 / 9, 5 / 18, 5 / 18};
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == sol[i]);
        }
    }

    @Test
    // Exercise 3.2.3 - Quantum Computing for Computer Scientists
    public void DeberiaMostrarLaMatrizCuandoHay2Rendijas() {
        String[][] res = LibreriaCuantica.experimentoRendijaDoble(2);
        String[][] ans = {{"0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/2", "0", "0", "0", "0", "0", "0", "0"},
        {"1/2", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "0", "1", "0", "0", "0", "0"},
        {"0", "1/3", "0", "0", "1", "0", "0", "0"},
        {"0", "1/3", "1/3", "0", "0", "1", "0", "0"},
        {"0", "0", "1/3", "0", "0", "0", "1", "0"},
        {"0", "0", "1/3", "0", "0", "0", "0", "1"},};
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                assertTrue(ans[i][j].equals(res[i][j]));
            }
        }
    }

    @Test
    public void DeberiaMostrarLaMatrizCuandoHay3Rendijas() {
        String[][] res = LibreriaCuantica.experimentoRendijaDoble(3);
        String[][] ans = {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/3", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/3", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/3", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "0", "0", "1", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "0", "0", "0", "1", "0", "0", "0", "0", "0"},
        {"0", "1/3", "1/3", "0", "0", "0", "1", "0", "0", "0", "0"},
        {"0", "0", "1/3", "0", "0", "0", "0", "1", "0", "0", "0"},
        {"0", "0", "1/3", "1/3", "0", "0", "0", "0", "1", "0", "0"},
        {"0", "0", "0", "1/3", "0", "0", "0", "0", "0", "1", "0"},
        {"0", "0", "0", "1/3", "0", "0", "0", "0", "0", "0", "1"},};
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                assertTrue(ans[i][j].equals(res[i][j]));
            }
        }
    }

    @Test
    public void DeberiaMostrarLaMatrizCuandoHay4Rendijas() {
        String[][] res = LibreriaCuantica.experimentoRendijaDoble(4);
        String[][] ans = {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "1/3", "1/3", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "1/3", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0"},
        {"0", "0", "1/3", "1/3", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0"},
        {"0", "0", "0", "1/3", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0"},
        {"0", "0", "0", "1/3", "1/3", "0", "0", "0", "0", "0", "0", "1", "0", "0"},
        {"0", "0", "0", "0", "1/3", "0", "0", "0", "0", "0", "0", "0", "1", "0"},
        {"0", "0", "0", "0", "1/3", "0", "0", "0", "0", "0", "0", "0", "0", "1"},};
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                assertTrue(ans[i][j].equals(res[i][j]));
            }
        }
    }

    @Test
    // Example 3.49 - Quantum Computing for Computer Scientists
    public void DeberiaMostrarLaMatrizCuandoHay2RendijasConNumerosComplejos() {
        String[][] res = LibreriaCuantica.experimentoRendijaDobleNumerosComplejos(2);
        String[][] ans = {{"0", "0", "0", "0", "0", "0", "0", "0"},
        {"1/?2", "0", "0", "0", "0", "0", "0", "0"},
        {"1/?2", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "-1+i/?6", "0", "1", "0", "0", "0", "0"},
        {"0", "-1-i/?6", "0", "0", "1", "0", "0", "0"},
        {"0", "1-i/?6", "-1+i/?6", "0", "0", "1", "0", "0"},
        {"0", "0", "-1-i/?6", "0", "0", "0", "1", "0"},
        {"0", "0", "1-i/?6", "0", "0", "0", "0", "1"},};
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                assertTrue(ans[i][j].equals(res[i][j]));
            }
        }
    }

    //Capitulo 4.1
    @Test
    // Example 4.1.1 - Quantum Computing for Computer Scientists
    public void DeberiaCalcularLaProbabilidadDeEncontrarUnaParticulaEnUnaPosicion() {
        NumeroComplejo c1 = new NumeroComplejo(-3, -1);
        NumeroComplejo c2 = new NumeroComplejo(0, -2);
        NumeroComplejo c3 = new NumeroComplejo(0, 1);
        NumeroComplejo c4 = new NumeroComplejo(2, 0);

        NumeroComplejo[] estado = {c1, c2, c3, c4};

        double res = LibreriaCuantica.probabilidadDeUnaParticulaEnUnaPosicionEnParticular(estado, 2);
        double ans = (Math.pow(1, 2) / Math.pow(4.3589, 2));
        BigDecimal res1 = new BigDecimal(res);
        res1 = res1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal ans1 = new BigDecimal(ans);
        ans1 = ans1.setScale(2, RoundingMode.HALF_UP);
        assertTrue(ans1.equals(res1));
    }

    @Test
    // Example 4.1.7 - Quantum Computing for Computer Scientists
    public void DeberiaCalcularLaProbabilidadDeTransitarDeUnVectorAOtro() {
        NumeroComplejo c1 = new NumeroComplejo(1, -1);
        NumeroComplejo c2 = new NumeroComplejo(1, 1);

        NumeroComplejo[] ket = new NumeroComplejo[1];
        ket[0] = c1;
        NumeroComplejo[] bra = new NumeroComplejo[1];
        bra[0] = c2;

        NumeroComplejo res = LibreriaCuantica.probabilidadDeTransitarDeUnVectorAOtro(ket, bra);
        NumeroComplejo ans = new NumeroComplejo(1, -1);

        assertTrue(ans.equals(res));
    }

    //Capitulo 4
    @Test
    public void deberiaSacarLaMedia() {
        NumeroComplejo[] vect1 = {new NumeroComplejo(1, 0), new NumeroComplejo(0, -1)};
        NumeroComplejo[] vect2 = {new NumeroComplejo(0, 1), new NumeroComplejo(2, 0)};
        NumeroComplejo[][] obs1 = {vect1, vect2};
        NumeroComplejo[] ket1 = {new NumeroComplejo(Math.sqrt(2) / 2, 0), new NumeroComplejo(0, Math.sqrt(2) / 2)};
        NumeroComplejo valorMedioRta = LibreriaCuantica.calcularLaMedia(obs1, ket1);
        assertTrue(0 == valorMedioRta.getReal());
        assertTrue(0 == valorMedioRta.getImaginario());
    }

    @Test
    public void deberiaCalcularLaVarianza() {
        NumeroComplejo[] v1 = {new NumeroComplejo(1, 0), new NumeroComplejo(0, -1)};
        NumeroComplejo[] v2 = {new NumeroComplejo(0, 1), new NumeroComplejo(2, 0)};
        NumeroComplejo[][] observable = {v1, v2};
        NumeroComplejo[] ket = {new NumeroComplejo(Math.sqrt(2) / 2, 0), new NumeroComplejo(0, Math.sqrt(2) / 2)};
        NumeroComplejo res = LibreriaCuantica.calcularVarianza(observable, ket);
        
        assertTrue(res.getReal() == 0);
        assertTrue(res.getImaginario() == 0);
    }

}
