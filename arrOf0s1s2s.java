import java.util.Scanner;
public class arrOf0s1s2s
{
	
	static void sortNow(int a[],int size)
	{
		int l=0;
		int m=0;
		int h=size-1;
		while(m<=h)
		{
		if(a[m]==0)
		{
			//swap(a[l],a[m]);
			int temp1;
			temp1 = a[l];
			a[l] = a[m];
			a[m] = temp1;
			l++;
			m++;
		}
		
		else
			if(a[m]==1)
			{
				m++;
			}
		
			else
				if(a[m]==2)
				{
					int temp2;
					temp2 = a[h];
					a[h] = a[m];
					a[m] = temp2;
					
					h--;
				}
		}
		System.out.println("Sorted array is: ");
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	
	public static void main(String args[])
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