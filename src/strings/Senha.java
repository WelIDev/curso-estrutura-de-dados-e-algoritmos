package strings;

public class Senha {

    public static void main(String[] args) {
        String senha = "amerca1@";
        String senha2 = "amrca154682";

        System.out.println(validatePassword(senha) ? "Valida" : "Invalida");
        System.out.println(validatePassword(senha2) ? "Valida" : "Invalida");

        System.out.println(validatePassword2(senha) ? "Valida" : "Invalida");
        System.out.println(validatePassword2(senha2) ? "Valida" : "Invalida");
    }

    public static boolean validatePassword(String str){
        String regex1 = ".{8,}";
        String regex2 = ".*[a-zA-Z].*";
        String regex3 = ".*\\d.*";
        String regex4 = ".*[&@#].*";
        return str.matches(regex1) && str.matches(regex2) && str.matches(regex3) && str.matches(regex4);
    }

    public static boolean validatePassword2(String str){
        if(str.length() < 8){
           return false;
        }
        if(!hasLetter(str)){
            return false;
        }
        if(!hasDigit(str)){
            return false;
        }
        if(!hasSpecialChar(str)){
            return false;
        }

        return true;
    }

    public static boolean hasLetter(String str){
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String str){
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialChar(String str){
        for(char c : str.toCharArray()){
            if(c == '&' || c == '@' || c == '#'){
                return true;
            }
        }
        return false;
    }
}
