package Day5;

public class Eclass 
	{

		int l;  
		int b;  
		void setData(int x, int y)  
		{  
			l=x;  
			b=y;  
		}  
		  
		int area()  
		{  
			return l*b;  
		}  

		public static void main(String[] args) 
		{  
			// TODO Auto-generated method stub  
			  
			Eclass r1 = new Eclass();  
			  
			r1.setData(2, 3);  
			int a=r1.area();
			System.out.println("Area is: "+a);  
			  
			  
		}
}
