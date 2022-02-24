package SeaBattle;

public enum FieldPiece {
    EMPTY("⬜"), HALO("▫️"), SHIP("⛵"), CAUGHT("❌"), MISS("◼️");

    private String picture;

    FieldPiece(String picture){
        this.picture=picture;
    }

    public String getPicture() {return picture;}
}
