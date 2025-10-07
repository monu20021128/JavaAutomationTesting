package Day10;

class Testing
{
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c)
        	{
        	return a;
        	}
        else if(b>c)
        	{
        	return b;
        	}
        else 
        	{
        	return c;
        	}
    }
}

public class Overloading 
{
    public static void main(String[] args) 
    {
        Testing t=new Testing();
        /*int a=t.max(10,5);					// calls function having 2 parameters
        System.out.println(a);*/
        System.out.println(t.max(20, 30));
        
        /*int b=t.max(10,15,5);  				// calls function having 3 parameters
        System.out.println(b);*/
        System.out.println(t.max(5, 10, 0));
        
    }
    
}
