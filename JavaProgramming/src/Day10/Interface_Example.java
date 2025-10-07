package Day10;

interface Abc
{
	void A();
	void B();
}

class Xyz implements Abc
{
	public void A()
	{
		System.out.println("First method");
	}
	public void B()
	{
		System.out.println("Second method");
	}
	void C()
	{
		System.out.println("Third method");
	}
}


public class Interface_Example 
{

	public static void main(String[] args) 
	{
		Abc a=new Xyz();
		a.A();
		a.B();
		
		Xyz x=new Xyz();
		x.C();
	}

}
