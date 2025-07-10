import java.util.Scanner;
class Even_odd_arr
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a[] = {10,20,30,5,7,1,9,56};
		int even=0,odd=0;
		for (int i=1;i<=a.length-1;i++)
		{
		if(a[i]%2==0){
			even++;
		}

		else
		{
			odd++;
		}
		}
		
		System.out.print("No of Even numbers : "+even+"\nNo of Odd Numbers : "+odd);
	}
}