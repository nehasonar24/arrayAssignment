//missing no.
import java.util.*;
public class InterSect
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
		
		//second array
		System.out.println("Enter your array size");
		int n1=sc.nextInt();
		int b[]=new int[n];
		int j;
		System.out.println("enter your elements");
		for(j=0;i<n;i++)
		{
			b[j]=sc.nextInt();
		}
				
		//sorting
		Arrays.sort(a);
		Arrays.sort(b);
		
	
		//comparing no.
		int c0=(n>n1)?n:n1;
		int c1=(n<n1)?n:n1;
		for(i=0;i<c0;i++)
		{
			for(j=0;j<c1;j++)
			if((a[i]-b[i]) == 0)
			{
				int rep=a[i];
				System.out.print(" "+rep);
			}
		}
	}
}	