import java.util.Scanner;
class Large_num{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int	a = s.nextInt();
		System.out.println("Enter 2nd Number : ");
		int	b = s.nextInt();
		System.out.println("Enter 3rd Number : ");
		int	c = s.nextInt();
		System.out.println("Given numbers are : "+a+" "+b+" "+c);
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is larger Number among three numbers");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b+" is larger Number among three numbers");
		}
		else if((c>b)&&(c>a))
		{
			System.out.println(c+" is larger Number among three numbers");
		}
		else if((a==b)&&(a!=c))
		{
			if(a>c)
			{
				System.out.println(a+" is larger Number among three numbers");
			}
			else
			{
				System.out.println(c+" is larger Number among three numbers");
			}
		}
		else if((a==c)&&(a!=b))
		{
			if(a>b)
			{
				System.out.println(a+" is larger Number among three numbers");
			}
			else
			{
				System.out.println(b+" is larger Number among three numbers");
			}
		}	
		else if((b==c)&&(b!=a))
		{
			if(b>a)
			{
				System.out.println(b+" is larger Number among three numbers");
			}
			else
			{
				System.out.println(a+" is larger Number among three numbers");
			}
		}		
		else if(a==b&&c==a)
		{
			System.out.println("All three numbers are equal numbers");
		}
	}
}
