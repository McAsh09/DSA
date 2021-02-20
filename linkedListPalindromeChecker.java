import java.util.Scanner;

public class linkedListPalindromeChecker {

    int count = 0;
   static class Node{

        int data;
        Node next;
    }

    Node head = null;
    Node temp;

     void addNode(){

        Scanner sc = new Scanner(System.in);
        Node add = new Node();

        System.out.println("Enter data: ");

        add.data = sc.nextInt();

        if(head == null){
            head = add;
            temp = head;
        }

        else{
            temp.next = add;
            temp = add;
        }

        temp.next = null;

    }




    void displayNode(){

         Node ptr = head;
         Node ptr2 = head;

         Node checker = head;
         int count = 0;
        int counter = 0;

         while(ptr!=null){
             System.out.print(ptr.data+"--->");
             ptr = ptr.next;
             count++;
         }
        System.out.println(" ");
        System.out.println("Total Nodes: "+count);

        int a[] = new int[count];

        for(int i=0; i<count; i++){
            a[i] = ptr2.data;

            ptr2 = ptr2.next;
        }

        System.out.println("Array elements are");
        for(int i=0; i<count; i++){


            System.out.print(a[i]+" ");
        }

        System.out.println(" ");

        int start,end;

        start = 0;
        end = count-1;

//        int counter = 0;

        while(start<=end){

            if(a[start] == a[end]){

                start++;
                end--;
                counter++;
                
            }

            else {
                break;
            }

        }

        if(count%2 == 0){

            if(counter == (count/2)){
                System.out.println("Palindrome");
            }

            else
                System.out.println("Not Palindrome");
        }

        else

            if(count%2!=0){

                count = count + 1;

                if(counter == (count/2)){
                    System.out.println("Palindrome");
                }

                else
                    System.out.println("Not Palindrome");
            }



    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        linkedListPalindromeChecker obj = new linkedListPalindromeChecker();
        int choice;

        do{

            System.out.println("1. Enter a NODE");
            System.out.println("2. Display");
            choice = sc.nextInt();

            if(choice == 1){

                obj.addNode();
            }

            else
                if(choice == 2){
                    obj.displayNode();
                }
        }while(choice!=0);

        System.out.println("Outside do-while loop");


    }

}
