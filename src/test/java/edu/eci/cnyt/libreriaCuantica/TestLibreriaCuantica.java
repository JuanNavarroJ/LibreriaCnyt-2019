package edu.eci.cnyt.libreriaCuantica;


import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestLibreriaCuantica {
    
    
    //Capitulo 3.1
    @Test
    // Example 3.1.3 - Quantum Computing for Computer Scientists
    public void SistemaDeterministicoClasico() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,0,0,0},
                              {0,1,0,0,0,1},
                              {0,0,0,1,0,0},
                              {0,0,1,0,0,0},
                              {1,0,0,0,1,0}};
        int[] estadoInicial = {6,2,1,5,3,10};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 1);
        int[] res = {0,0,12,5,1,9};
        for(int i=0;i<res.length;i++){
            assertTrue(res[i]==sol[i]);
        }
    }
    
    @Test
    // Example 3.1.3 - Quantum Computing for Computer Scientists
    // Con dos Clicks.
    public void SistemaDeterministicoClasico2() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,0,0,0},
                              {0,1,0,0,0,1},
                              {0,0,0,1,0,0},
                              {0,0,1,0,0,0},
                              {1,0,0,0,1,0}};
        int[] estadoInicial = {6,2,1,5,3,10};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 2);
        int[] res = {0,0,9,5,12,1};
        for(int i=0;i<res.length;i++){
            assertTrue(res[i]==sol[i]);
        }
    }
    
    @Test
    // Exercise 3.1.1 - Quantum Computing for Computer Scientists
    public void SistemaDeterministicoClasicoExercice311() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,0,0,0},
                              {0,1,0,0,0,1},
                              {0,0,0,1,0,0},
                              {0,0,1,0,0,0},
                              {1,0,0,0,1,0}};
        int[] estadoInicial = {5,5,0,2,0,15};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 1);
        int[] res = {0,0,20,2,0,5};
        for(int i=0;i<res.length;i++){
            assertTrue(res[i]==sol[i]);
        }
    }
    
    // Quiz #4 - CNYT 2019-2 
    @Test
    // Exercise 1
    public void SistemaDeterministicoClasicoExercise1() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,1,0,0},
                              {0,1,0,0,0,1},
                              {0,0,1,0,0,0},
                              {0,0,0,0,1,0},
                              {1,0,0,0,0,0}};
        int[] estadoInicial = {0,0,0,0,0,1};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 2019);
        int[] res = {0,1,0,0,0,0};
        for(int i=0;i<res.length;i++){
        	assertTrue(res[i]==sol[i]);
        }
    }
    
    @Test
    // Exercise 2
    public void SistemaDeterministicoClasicoExercise2() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,1,0,0},
                              {0,1,0,0,0,1},
                              {0,0,1,0,0,0},
                              {0,0,0,0,1,0},
                              {1,0,0,0,0,0}};
        int[] estadoInicial = {6,0,3,5,3,8};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 5000);
        int[] res = {0,3,11,8,3,0};
        for(int i=0;i<res.length;i++){
        	assertTrue(res[i]==sol[i]);
        }
    }
    
    @Test
    // Exercise 3
    public void SistemaDeterministicoClasicoExercise3() {
        int[][] matrizBool = {{0,0,0,0,0,0},
                              {0,0,0,1,0,0},
                              {0,1,0,0,0,1},
                              {0,0,1,0,0,0},
                              {0,0,0,0,1,0},
                              {1,0,0,0,0,0}};
        int[] estadoInicial = {6,5,4,3,2,1};
        int[] sol = LibreriaCuantica.sistemaDeterministicoClasico(matrizBool, estadoInicial, 3000);
        int[] res = {0,6,4,9,2,0};
        for(int i=0;i<res.length;i++){
        	assertTrue(res[i]==sol[i]);
        }
    }
    
    
}
