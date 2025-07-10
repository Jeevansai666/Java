class Bank
{
	private int accno;
	private int password;
	Bank(int a, int p)
	{
		accno = a;
		password = p;
	}

	int getAcc()
	{
		return accno;
	}
	int getPass()
	{
		return password;
	}
}
class Encapsulation_constructor
{
	public static void main(String[] args)
	{
		Bank b = new Bank(123,456);

		System.out.println("Account : "+b.getAcc());
		System.out.println("Password : "+b.getPass());
	}
}