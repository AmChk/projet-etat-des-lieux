package yrekass.chk;

import java.util.List;

public class PieceBuilder {
    private String type;
    private int surface;
    private String etat;
    private String commentaire;
    private Bien bien;
    private List<Pj> pjs;

    public PieceBuilder type(String type) {
        this.type = type;
        return this;
    }

    public PieceBuilder surface(int surface) {
        this.surface = surface;
        return this;
    }

    public PieceBuilder etat(String etat) {
        this.etat = etat;
        return this;
    }

    public PieceBuilder commentaire(String commentaire) {
        this.commentaire = commentaire;
        return this;
    }

    public PieceBuilder bien(Bien bien) {
        this.bien = bien;
        return this;
    }

    public PieceBuilder pjs(List<Pj> pjs) {
        this.pjs = pjs;
        return this;
    }
    public Piece build() {
        return new Piece(type, surface, etat, commentaire, bien, pjs);
    }
}
