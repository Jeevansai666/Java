import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int n , temp,rem,rev=0;
		System.out.println("Enter a Number");
		n = s.nextInt();
        temp=n;
        while (n>0)
        {
            rem=n%10;
            rev = rev*10+rem;
            n = n / 10;
        }
        if(temp == rev)
        {
            System.out.println(temp+" is an Armong Number.");
        }
        else
        {
            System.out.println(temp+" is not an Armong Number.");
        }
	}
}


