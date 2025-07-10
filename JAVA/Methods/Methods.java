import java.util.Scanner;
class Methods{
	int a=20,b=30;
	public void add()
	{
		System.out.println(a+b);
	}
	public int sub()
	{
		return a-b;
	}
	public void mul(int a , int b)
	{
		System.out.println(a*b);
	}
	public int div(int a , int b)
	{
		return a/b;
	}
	public static void main(String[] args){
		Methods m = new Methods();
		m.add();
		System.out.println(m.sub());
		int a = 20,b=10;
		m.mul(a,b);
		System.out.println(m.div(a,b));
	}
}
