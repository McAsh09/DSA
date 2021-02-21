import java.util.Scanner;

public class stack {

    // need to declare top here in global or else in every function it gets reset to 0
    static int top=-1;
     static void push(int a[],int size){

        Scanner sc = new Scanner(System.in);
        int pushValue;
//        int top = 0;

        System.out.println("Enter value to PUSH: ");
        pushValue = sc.nextInt();


        if(top!=(size-1)){

            System.out.println("Pushed!");
            a[++top] = pushValue;
        }

        else
            System.out.println("STACK OVERFLOW!");


    }



    static void pop(){

        if(top == -1){
            System.out.println("STACK UNDERFLOW!");
        }
        else {
            top--;
            System.out.println("Popped");
        }
    }

    static void display(int a[], int top){

        for(int i=0; i<=top; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size,choice;

//        int topInMain;

        System.out.println("Enter size of array: ");
        size = sc.nextInt();

        //declare array with the given size

        int a[] = new int[size];

        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println(" Hit 0 to EXIT ");

//            System.out.println("Top Val: "+top);
            choice = sc.nextInt();

            if(choice == 1){
                push(a,size);
            }

            else
                if(choice == 2 ){

                    pop();
                }

            else
                if(choice == 3){
                    display(a,top);
                }
        }while(choice!=0);
    }
}
