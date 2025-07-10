class Demo
{
	static
	{
		System.out.println("Demo");
	}
}
class Demo1 extends Demo 
{
	static
	{
		System.out.println("Demo1");
	}
}
class Demo2 extends Demo1
{
	static
	{
		System.out.println("Demo2");
	}
}
class MultiLevelInheritane
{
	public static void main(String[] args)
	{
		Demo2 d = new Demo2();

	}
}