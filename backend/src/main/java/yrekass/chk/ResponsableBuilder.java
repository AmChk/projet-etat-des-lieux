package yrekass.chk;

import java.util.List;

public class ResponsableBuilder {
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private List<Bien> biens;
    public ResponsableBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }
    public ResponsableBuilder prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }
    public ResponsableBuilder email(String email) {
        this.email = email;
        return this;
    }
    public ResponsableBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public ResponsableBuilder biens(List<Bien> biens) {
        this.biens = biens;
        return this;
    }
    public Responsable build() {
        return new Responsable(nom, prenom, email, phone, biens);
    }

}
