import java.util.Scanner;
class Even_odd
{
	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		int even[] = new int[n];
		int odd[] = new int[n];
		int c1=0,c2=0;
		for (int i=1;i<=n;i++)
		{
		if(i%2==0){
			even[c1]=i;
			c1++;
		}

		else
		{
			odd[c2]=i;
			c2++;
		}
		}
		
		System.out.print("Even : ");
		for(int i=0;i<c1;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.print("\nOdd : ");
		for(int i=0;i<c2;i++)
		{
			System.out.print(odd[i]+" ");
		}
	}
}