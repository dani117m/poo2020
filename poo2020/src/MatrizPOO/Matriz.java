package MatrizPOO;

public class Matriz {
    private int[][] matrizA= new int[3][3];
    private int[][] matrizB= new int[3][3];
    private int[][] matrizC= new int[3][3];

    public Matriz(int[][] matrizA, int[][] matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }

    public void sumaMatriz(){
        for (int i = 0;i< matrizA.length; i = i +1){
            for (int j = 0; j< matrizA[i].length; j = j+1){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

    }

    public void presentacionMatriz(int matrizN[][]){
        for (int i=0; i< matrizN.length; i=i+1){
            for (int j = 0; j<matrizN[i].length; j=j+1){
                System.out.print(matrizN[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
