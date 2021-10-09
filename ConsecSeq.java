//missing no.
import java.util.*;
public class ConsecSeq
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
		int count=0;
		int length=0;
		for(i=0,j=1;i<(n-1);i++,j++)
		{
			if((a[i]-a[j])==1 || (a[i]-a[j])==-1)
			{
				count++;
			}
			length=(length>count)?length:count;
		}
		System.out.println("\n"+length);
		
	}
}	