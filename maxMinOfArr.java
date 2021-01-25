import java.util.Scanner;

public class maxMinOfArr 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//take input and create array
		int n;
		System.out.println("Enter size of array: ");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//we initialize min and max to the first 2 elements of the array and then proceed from the 3rd element
		//Ex: a[]    0 1 2 3 4 5
		//elements-->8 5 9 4 2 6
		// min=0(a[0]=8), max=a[1](a[1]=5) and i=2(a[2]=9)
		
		int min,max,i;
		
		min = 0;
		max = 1;
		
		//swapping positions of max and min just in case if they are the only '2' elements present in the array
		
		if(a[min]>a[max])
		{
			min = 1;
			max = 0;
		}
		
		for(i=2;i<n;i++)
		{
						
			if(a[i]>a[max])
			{
				max = i;		// max element found from here
			}
			
			else
				if(a[i]<a[min])
				{
					min = i;	// min element found from here
				}
		}
		
		//printing max and min
		
		System.out.println("Minimum element of array is: "+a[min]);
		System.out.println("Maximum element of array is: "+a[max]);
		
		
		
		

	}

}
