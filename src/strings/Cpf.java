package strings;

public class Cpf {

    public static void main(String[] args) {

        System.out.println(removeNonDigits("87409217293"));
        System.out.println(removeNonDigits("874092172-93"));
        System.out.println(removeNonDigits("874.092.172-93"));
    }

    public static String removeNonDigits(String string){
        var regex = "\\D";
        return string.replaceAll(regex, "");
    }
}