import java.util.Scanner;
public class KthMinElement
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
		
		//take 'k' value
		int k,j,min,max,i,minTemp,temp;
	
		//taking input for 'Kth' smallest element
		//Example in 1,2,3,4,5 the '2nd' smallest element here is 2
		System.out.println("Enter K value");
	
		k=sc.nextInt();
		
		for(j=0;j<k;j++)
		{
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
			
			minTemp = a[min];
			
			temp = a[max];
			temp = temp+1;
			
			a[min] = temp;
			if(j==(k-1))
			{
				
			System.out.println("Smallest element: "+minTemp);
			
			}
			
			
			
		}//main concern till here
		
	}

}
