import java.util.Scanner;
public class allNegativeOneSide 
{

	static void sortNow(int a[],int size)
	{
		int l=0;
		int m=0;
		int h=size-1;
		
		while(m<=h)
		{
			if(a[m]<0)
			{
				int temp1;
				temp1=a[m];
				a[m]=a[l];
				a[l]=temp1;
				
				l++;
				m++;
			}
			
			else
				if(a[m]>=0)
				{
					m++;
				}
		
			
			
		}
		System.out.println("Sorted array is: ");
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter array size: ");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		sortNow(a,n);
	}

}
