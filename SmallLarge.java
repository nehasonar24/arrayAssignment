//missing no.
import java.util.*;
public class SmallLarge
{
	public static void main(String args[])
	{
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
		
		//sorting
		Arrays.sort(a);
		
		//comparing no.

			System.out.println("smallest no "+a[0]+" largest no "+a[n-1]);
			

	}
}	