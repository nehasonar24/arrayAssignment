//missing no.
import java.util.*;
public class RepeatInTwo
{
	public static void main(String args[])
	{
		//1st array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("enter your elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int j;
		for(i=0;i<(n-1);i++)
		{
			System.out.println("\n"+a[i]);
			for(j=(i+1);j<n;j++)
			{
				System.out.print(a[j]);
				if(a[i]-a[j]==0)
				{
					System.out.println("first repetative no unsorted is "+a[i]);
					break;
				}
			}
		}
		
		
		//sorting
		Arrays.sort(a);
		
		//comparing no.
		for(i=0;i<(n-1);i++)
		{

			if((a[i]-a[i+1]) == 0)
			break;
		}
		System.out.println("first repetative no by sorting is "+a[i]);
	}
}	