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
    
}
