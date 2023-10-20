package yrekass.chk;

import java.util.List;
import java.util.Optional;

public class Responsable extends User{
    Optional<List<Bien>> biens = Optional.empty();

    public Optional<List<Bien>> getBiens() {
        return biens;
    }

    Responsable(String nom, String prenom, String email, String phone, List<Bien> biens) {
        super(nom, prenom, email, phone);
        this.biens = Optional.ofNullable(biens);
    }

}
