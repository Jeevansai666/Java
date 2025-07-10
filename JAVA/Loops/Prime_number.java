import java.util.Scanner;
public class Prime_number {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int i, n , temp=0;
		System.out.println("Enter a Number");
		n = s.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp==2){
           System.out.println(n+" is a prime Number"); 
        }
        else
        {
            System.out.println(n+" is not a prime Number");
        }
	}
}

