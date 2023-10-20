package yrekass.chk;

public class User {
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    User(String nom, String prenom, String email, String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


}
