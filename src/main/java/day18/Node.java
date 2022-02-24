package day18;

public class Node {
    private int value;
    private Node leftSon;
    private Node rightSon;
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

    public static void dfs(Node root){
        if(root!=null){
            if(root.leftSon!=null){
                dfs(root.leftSon);}
            System.out.print(root.value+" ");
            if(root.rightSon!=null){ dfs(root.rightSon);}
        }
    }
}
