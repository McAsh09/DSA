import java.util.Scanner;

public class reverseArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter size of array: ");
		//take input 
		n = sc.nextInt();
		
		//create array with the input taken
		
		int a[] = new int[n];
		
		//take inputs in the array
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//reversing the array
		
		System.out.println("Reversed array is: ");
		
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}

}
