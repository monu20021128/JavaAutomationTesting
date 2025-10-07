package Day9;

class Tv
{
	void display()
	{
		System.out.println("Display 1");
	}
	void Clear()
	{
		System.out.println("Clear Screen");
	}
}
class SmartTv extends Tv
{
	void display()
	{
		System.out.println("Display 2");
	}
	void run()
	{
		System.out.println("Run");
	}
}

public class Overriding 
{
	static void Sprint()
	{
		System.out.println("Sprint Fast");
	}
	public static void main(String[] args) 
	{
		Tv t=new SmartTv();
		t.display();
		t.Clear();
//		t.run();  Reference of Parent Class can not call Function in child class even though object is of child class
		Sprint();
	}

}
