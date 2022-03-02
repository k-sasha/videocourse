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
        this.printField();
    }

    public void fillEmpty(){
        for(int i=0; i< field.length; i++){
            for(int j=0; j<field[i].length; j++){
                field[i][j]=FieldPiece.EMPTY;
            }
        }
    }

    public void printField(){
        String[] array = {"0️⃣","1️⃣","2️⃣","3️⃣","4️⃣","5️⃣","6️⃣","7️⃣","8️⃣","9️⃣"};
        int counter=0;
        System.out.println("x        field "+id);
        System.out.println("⬆️");
        for(FieldPiece [] i: field){
            System.out.print(array[counter++]+" ");
            for(FieldPiece j: i){
                System.out.print(j.getPicture() +" ");
            }
            System.out.println();
        }
        System.out.println("⏹️ 0️⃣ 1️⃣ 2️⃣ 3️⃣ 4️⃣ 5️⃣ 6️⃣ 7️⃣ 8️⃣ 9️⃣ ➡️ y");
    }

    public void printFieldEnemy(){
        String[] array = {"0️⃣","1️⃣","2️⃣","3️⃣","4️⃣","5️⃣","6️⃣","7️⃣","8️⃣","9️⃣"};
        int counter=0;
        System.out.println("x        field "+id);
        System.out.println("⬆️");
        for(FieldPiece [] i: field){
            System.out.print(array[counter++]+" ");
            for(FieldPiece j: i){
                if(j==FieldPiece.HALO || j==FieldPiece.SHIP){
                    System.out.print(FieldPiece.EMPTY.getPicture() +" ");
                }else{System.out.print(j.getPicture() +" ");}
            }
            System.out.println();
        }
        System.out.println("⏹️ 0️⃣ 1️⃣ 2️⃣ 3️⃣ 4️⃣ 5️⃣ 6️⃣ 7️⃣ 8️⃣ 9️⃣ ➡️ y");
    }

}
