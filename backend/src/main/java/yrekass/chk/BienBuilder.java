package yrekass.chk;

import java.util.List;

public class BienBuilder {
    private String type;
    private int surface;
    private List<Piece> pieces;
    private int cp_eau_av;
    private int cp_eau_ap;
    private int cp_el_av;
    private int cp_el_ap;
    private Responsable responsable;
    private Client client;

    public BienBuilder type(String type) {
        this.type = type;
        return this;
    }
    public BienBuilder surface(int surface) {
        this.surface = surface;
        return this;
    }
    public BienBuilder pieces(List<Piece> pieces) {
        this.pieces = pieces;
        return this;
    }
    public BienBuilder cp_eaux_av(int cp_eau_av) {
        this.cp_eau_av = cp_eau_av;
        return this;
    }
    public BienBuilder cp_eaux_ap(int cp_eau_ap) {
        this.cp_eau_ap = cp_eau_ap;
        return this;
    }
    public BienBuilder cp_el_av(int cp_el_av) {
        this.cp_el_av = cp_el_av;
        return this;
    }
    public BienBuilder responsable(Responsable responsable) {
        this.responsable = responsable;
        return this;
    }
    public BienBuilder cp_el_ap(int cp_el_ap) {
        this.cp_el_ap = cp_el_ap;
        return this;
    }
    public BienBuilder client(Client client) {
        this.client = client;
        return this;
    }
    public Bien build() {
        return new Bien(type, surface, pieces, cp_eau_av, cp_eau_ap, cp_el_av, cp_el_ap, responsable, client);
    }
}
