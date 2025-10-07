package Day10;


interface Two
{
	void A();
	void B();
}

interface One extends Two
{
	default void A()
	{
		System.out.println("Method A");
	}
	
	void C();
	static void D() // Abstract method do not specify body
	{
		System.out.println("Static Method");
	}
}
class Three implements Two,One
{

	@Override
	public void C() 
	{
		System.out.println("Method C");
		
	}

	@Override
	public void B() 
	{
		System.out.println("Method B");
		
	}
	
}

public class Multiple_interfaces 
{

	public static void main(String[] args) 
	{
		Three t=new Three();
		t.A();
		t.B();
		t.C();
		One.D();
	}

}
