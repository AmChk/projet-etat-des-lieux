package yrekass.chk;

import java.util.List;
import java.util.Optional;

public class Bien {
    private String type;
    private int surface;
    private List<Piece> pieces;
    private Optional<Integer> cp_eau_av;
    private Optional<Integer> cp_eau_ap;
    private Optional<Integer> cp_el_av;
    private Optional<Integer> cp_el_ap;
    private Responsable responsable;
    private Optional<Client> client;

    public String getType() {
        return type;
    }

    public int getSurface() {
        return surface;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public Optional<Integer> getCp_eau_av() {
        return cp_eau_av;
    }

    public Optional<Integer> getCp_eau_ap() {
        return cp_eau_ap;
    }

    public Optional<Integer> getCp_el_av() {
        return cp_el_av;
    }

    public Optional<Integer> getCp_el_ap() {
        return cp_el_ap;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public Optional<Client> getClient() {
        return client;
    }

    Bien(String type, int surface, List<Piece> pieces, int cp_eau_av,
         int cp_eau_ap, int cp_el_av, int cp_el_ap, Responsable responsable, Client client) {
        this.type = type;
        this.surface = surface;
        this.pieces = pieces;
        this.cp_eau_av = Optional.ofNullable(cp_eau_av);
        this.cp_eau_ap = Optional.ofNullable(cp_eau_ap);
        this.cp_el_av = Optional.ofNullable(cp_el_av);
        this.cp_el_ap = Optional.ofNullable(cp_el_ap);
        this.responsable = responsable;
        this.client = Optional.ofNullable(client);

    }
}
