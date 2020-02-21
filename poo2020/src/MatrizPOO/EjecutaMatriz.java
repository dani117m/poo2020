package MatrizPOO;

import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args){
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        //
        Matriz matriz = new Matriz(matrizA,matrizB);
        //
        Scanner entrada = new Scanner(System.in);

        for (int i= 0; i < matrizA.length; i++){
            for (int j = 0; j< matrizA.length; j++){
                System.out.printf("Ingrese los valores de la matriz A \n",i,j);
                matrizA[i][j] = entrada.nextInt();
            }
        }
        for (int i= 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("Ingrese los valores de la matriz B \n", i, j);
                matrizB[i][j] = entrada.nextInt();

            }
        }
        matriz.sumaMatriz();
        //matriz.obtenereSuma();
        System.out.println("Matriz A");
        matriz.presentacionMatriz(matriz.getMatrizA());
        System.out.println("Matriz B");
        matriz.presentacionMatriz(matriz.getMatrizB());
        System.out.println("Matriz C");
        matriz.presentacionMatriz(matriz.getMatrizC());
    }
}
