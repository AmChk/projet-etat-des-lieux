package yrekass.chk;

public class Client extends User{
    private Bien bien;
    Client(String nom, String prenom, String email, String phone, Bien bien) {
        super(nom, prenom, email, phone);
        this.bien = bien;
    }
}
