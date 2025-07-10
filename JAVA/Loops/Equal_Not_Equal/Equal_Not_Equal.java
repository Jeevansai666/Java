import java.util.Scanner;
class Equal_Not_Equal
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = s.nextInt();
		System.out.println("Enter 2nd Number");
		int b = s.nextInt();
		if(a==b)
		{
			System.out.println(a+" & "+b+" are equal numbers.");
		}
		else
		{
			System.out.println(a+" & "+b+" are not equal numbers.");
		}
	}
}