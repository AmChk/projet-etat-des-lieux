package yrekass.chk;

import java.util.List;
import java.util.Optional;

public class Piece {
    private String type;
    private int surface;
    private String etat;
    private Optional<String> commentaire = Optional.empty();
    private Bien bien;
    private List<Pj> pjs;

    Piece(String type, int surface, String etat, String commentaire, Bien bien, List<Pj> pjs) {
        this.type = type;
        this.surface = surface;
        this.etat = etat;
        this.commentaire = Optional.ofNullable(commentaire);
        this.bien = bien;
        this.pjs = pjs;
    }

    public String getType() {
        return type;
    }

    public int getSurface() {
        return surface;
    }

    public String getEtat() {
        return etat;
    }

    public Optional<String> getCommentaire() {
        return commentaire;
    }

    public Bien getBien() {
        return bien;
    }

    public List<Pj> getPjs() {
        return pjs;
    }
}

class Pj {
    private int id;
    private String path;
    private Piece piece;

    public Pj(int id, String path, Piece piece) {
        this.id = id;
        this.path = path;
        this.piece = piece;
    }

    public int getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}