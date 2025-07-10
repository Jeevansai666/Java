
class A
{
	void method1()
	{
		System.out.println("Class A : Method 1.");
	}
	void method2()
	{
		System.out.println("Class A : Method 2.");
	}
	void method3()
	{
		System.out.println("Class A : Method 3.");
	}
}
class B extends A
{
	void method4()
	{
		System.out.println("Class B : Method 4.");
	}
	void method5()
	{
		System.out.println("Class B : Method 5.");
	}
	void method3()
	{
		System.out.println("Class B : Method 3.");
	}
}
class C extends B
{
	void method6()
	{
		System.out.println("Class C : Method 6.");
	}
	void method7()
	{
		System.out.println("Class C : Method 7.");
	}
	void method3()
	{
		System.out.println("Class C : Method 3.");
	}
}
class Method_Access
{
	void access(A v)
	{
		v.method3();
	}
}


class Inheritance_Tasks
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		Method_Access ma = new Method_Access();
		a.method1();
		a.method2();
		b.method4();
		b.method5();
		c.method6();
		c.method7();
		ma.access(a);
		ma.access(b);
		ma.access(c);
	}
}
