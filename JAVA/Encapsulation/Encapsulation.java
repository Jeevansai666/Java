class Bank
{
	private int accno;
	private int password;
	void setAcc(int a)
	{
		accno = a;
	}
	void setPass(int p)
	{
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
class Encapsulation
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		b.setAcc(123);
		b.setPass(456);
		System.out.println("Account : "+b.getAcc());
		System.out.println("Password : "+b.getPass());
	}
}