package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.insert(14,root);
        root.insert(11,root);
        root.insert(5,root);
        root.insert(8,root);
        root.insert(16,root);
        root.insert(15,root);
        root.insert(18,root);
        root.insert(23,root);
        root.insert(22,root);
        root.insert(27,root);
        root.insert(24,root);
        root.insert(150,root);

        dfs(root);

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
