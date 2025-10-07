package Day5;

public class Rectangle 
{
	
	/*int area(int l,int b)
	{
		return l*b;
	}
	
	public static void main(String[] args) 
	{
		Rectangle rl= new Rectangle();
//		int R=rl.area(5,2);
//		System.out.println("Area is: "+R);
		
		System.out.println("Area is: "+rl.area(5,2));
	} */
	
	int l;
	int b;
	static float res;
	public Rectangle(int x, int y)
	{
		l=x;
		b=y;
	}
	
	float area()
	{
		 return l*b;
	}

	public static void main(String[] args) 
	{
		Rectangle rl=new Rectangle(5,4);
		System.out.println("Area is : " +rl.area());
		
	}
}
