package recursividade;

public class SumNaturals {
    public static void main(String[] args) {

        System.out.println(sumNaturals(0));
        System.out.println(sumNaturals(2));
        System.out.println(sumNaturals(4));
    }

    public static int sumNaturals(int n) {
        if(n == 0) return 0;
        return n + sumNaturals(n - 1);
    }
}
