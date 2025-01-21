package recursividade;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(0));
        System.out.println(fib(6));
        System.out.println(fib(45));
    }

    public static int fib(int n) {
        return fibTailRecursive(n, 0 ,1);
    }

    public static int fibTailRecursive(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibTailRecursive(n - 1, b, a + b);
    }
}
