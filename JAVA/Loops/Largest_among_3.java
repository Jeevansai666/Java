import java.util.Scanner;
class Largest_among_3 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the value of : "+(i+1));
            arr[i] = s.nextInt();
        }
		int	a = arr[0];
		int	b = arr[1];
		int	c = arr[2];
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

