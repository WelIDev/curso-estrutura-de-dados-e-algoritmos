package complexidadeDeAlgoritmos;

import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) {

        int[][] matriz1 = {{1,2,3},
                           {4,5,6}};
        int[][] matriz2 = {{7,8},
                           {9,10},
                           {11,12}};
        System.out.println(Arrays.deepToString(multiply(matriz1, matriz2)));
    }

    // Complexidade de Tempo: O (MxNxP)
    // Complexidade de Espaço: O (MxN)
    public static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int p = A[0].length;
        int n = B[0].length;
        int[][] C = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
