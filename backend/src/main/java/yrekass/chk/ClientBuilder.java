package yrekass.chk;

public class ClientBuilder {
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private Bien bien;

    public ClientBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }
    public ClientBuilder prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }
    public ClientBuilder email(String email) {
        this.email = email;
        return this;
    }
    public ClientBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public ClientBuilder bien(Bien bien) {
        this.bien = bien;
        return this;
    }
    public Client build() {
        return new Client(nom, prenom, email, phone, bien);
    }
}
