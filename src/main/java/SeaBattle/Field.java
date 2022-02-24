package SeaBattle;

public class Field {
    private int id;
    private FieldPiece [][] field;
    public Field(int id){
        this.id=id;
        field = new FieldPiece[10][10];
        this.fillEmpty();
    }

    public FieldPiece[][] getField() {return field;}

    public void addShip(Ship ship){
        for (int i=0; i<ship.array.length; i++){
            field[ship.array[i].getX()][ship.array[i].getY()]=FieldPiece.SHIP;
        }
        for (int i=0; i<ship.halo().length; i++){
            field[ship.halo()[i].getX()][ship.halo()[i].getY()]=FieldPiece.HALO;
        }
    }

    public void fillEmpty(){
        for(int i=0; i< field.length; i++){
            for(int j=0; j<field[i].length; j++){
                field[i][j]=FieldPiece.EMPTY;
            }
        }
    }

    public void printField(){
        System.out.println("        field "+id);
        for(FieldPiece [] i: field){
            for(FieldPiece j: i){
                System.out.print(j.getPicture() +" ");
            }
            System.out.println();
        }
    }

}
