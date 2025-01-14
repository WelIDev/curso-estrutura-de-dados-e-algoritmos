package strings;

public class DominioEmail {

    public static void main(String[] args) {

        Email email = extractEmailInformation("joao.silva23@yahoo.com.br");
        System.out.println("Usuário: " + email.username);
        System.out.println("Domínio: " + email.domain);
        System.out.println("Brasileiro: " + email.brazilian);

        Email email2 = extractEmailInformation("maria123@gmail.com");
        System.out.println("Usuário: " + email2.username);
        System.out.println("Domínio: " + email2.domain);
        System.out.println("Brasileiro: " + email2.brazilian);
    }

    public static Email extractEmailInformation(String email){
        var username = email.substring(0, email.indexOf('@'));
        var domain = email.substring(email.indexOf('@') + 1);
        var brazilian = email.endsWith("br");
        return new Email(username, domain, brazilian);
    }
}

class Email{
    String username;
    String domain;
    boolean brazilian;

    public Email(String username, String domain, boolean brazilian) {
        this.username = username;
        this.domain = domain;
        this.brazilian = brazilian;
    }
}