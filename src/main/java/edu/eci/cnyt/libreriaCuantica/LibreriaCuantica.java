package edu.eci.cnyt.libreriaCuantica;

/**
 *
 * @author Juan David
 */
public class LibreriaCuantica {
    
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
}
