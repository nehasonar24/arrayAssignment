// missing no.
// How to find the missing number in an integer array of 1
// to 100?
import java.util.*;
public class MissingNo
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
		for(i=0;i<(n-1);i++)
		{
			if((a[i]-a[i+1]) != -1)
			{
				int missing=a[i]+1;
				System.out.println("missing no"+missing);
			}
		}
	}
}	