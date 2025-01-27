package complexidadeDeAlgoritmos;

public class FibExponential {
    public static void main(String[] args) {

        System.out.println(fib(8));
    }

    // Complexidade de Tempo: O (2^N)
    // Complexidade de Espaço: O (N)
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
