package recursividade;

public class CountDown {

    public static void main(String[] args) {
        
        countDown(5);
    }

    public static void countDown(int n){
        
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }
    
}
