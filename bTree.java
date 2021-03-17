import java.util.Scanner;

class Node{
    int key;
    Node left,right;

    public Node(int data){
        key = data;
    }
}


public class bTree{

    static Node createTree(){

        Scanner sc = new Scanner(System.in);
        Node root = null;
        int data;

        System.out.println("Enter data: ");
        data = sc.nextInt();

        if(data == 0)
            return null;

        else
            root = new Node(data);

        System.out.println("Enter left of "+data);
        root.left = createTree();

        System.out.println("Enter right of "+data);
        root.right = createTree();

        return root;

    }

    static void preOrder(Node root){

        if(root == null)
            return;

        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void inOrder(Node root){

        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);

    }

    static void postOrder(Node root){

        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");



    }

    public static void main(String args[]){

        Node root = createTree();

        preOrder(root);
        inOrder(root);
        postOrder(root);


    }


}
