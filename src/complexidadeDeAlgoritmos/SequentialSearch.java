package complexidadeDeAlgoritmos;

public class SequentialSearch {

    public static void main(String[] args) {

        int[] vetor = {15,82,79,32,41,28};
        System.out.println(sequentialSearch(32,vetor));
        System.out.println(sequentialSearch(82,vetor));
        System.out.println(sequentialSearch(22,vetor));
    }

    // Complexidade de Tempo: O (N)
    // Complexidade de Espaço: O (1)
    public static int sequentialSearch(int valor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
