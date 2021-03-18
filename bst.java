import java.util.Scanner;

class node{
    int key;
    node left,right;

    public node(int data){
        key = data;
    }
}

public class bst{

    static node initNode(){

        Scanner sc = new Scanner(System.in);
        int data;
        node root = null;
        if(root == null){

            System.out.println("Enter Data ");
            data = sc.nextInt();
            if(data == 0)
                return null;
            else

                root = new node(data);


        }

        return root;
    }

    static void insert(int value,node root){

        if(root.key < value){

            if(root.right == null){
                root.right = new node(value);
                return;
            }
            insert(value,root.right);

        }

        if(root.key > value){

            if(root.left == null){
                root.left = new node(value);
                return;
            }
            insert(value,root.left);
        }
    }

    static void inOrder(node root){

        if(root == null)
            return;
        else

            inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;
        //initialize first element of the node 'root' --> to get ROOT value
        node root = initNode();

        //insert node
        System.out.println("Insert value ");
        n = sc.nextInt();

        //initial call to insert function
        insert(n,root);


        while(n!=0){

            System.out.println("Insert Value /0 to EXIT");
            n = sc.nextInt();

            insert(n,root);

        }


        inOrder(root);

    }
}