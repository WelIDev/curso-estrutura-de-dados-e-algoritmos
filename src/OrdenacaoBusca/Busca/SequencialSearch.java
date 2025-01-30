package OrdenacaoBusca.Busca;

public class SequencialSearch {
    public static void main(String[] args) {

        System.out.println(sequencialSearch(new int[]{28, 6, -2, 9, 16, 20, 23, 8}, 20));
        System.out.println(sequencialSearch(new int[]{4, 6, -3, 21, 55, 91, 2}, 11));
    }

    // O (N)
    public static int sequencialSearch(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
