//missing no.
import java.util.*;
public class RepeatNo
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
		
		
				
		//sorting
		Arrays.sort(a);
		
		//comparing no.
		for(i=0;i<(n-1);i++)
		{
			for(int j=1;j<n;j++)
			if((a[i]-a[j]) == 0)
			{
				int rep=a[i];
				System.out.print(" "+rep);
			}
		}
	}
}	