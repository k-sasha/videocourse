package day18;

public class Node {
    int value;
    Node leftSon;
    Node rightSon;
    public Node(int value){
        this.value=value;
        leftSon=null;
        rightSon=null;
    }
    public void insert(int i, Node root){
        if(i<root.value){
            if(root.leftSon==null){
                root.leftSon= new Node(i);
            } else{ insert(i, root.leftSon);}
        }
        else{
            if(root.rightSon==null){
                root.rightSon= new Node(i);
            } else{ insert(i, root.rightSon);}
        }
    }
}
