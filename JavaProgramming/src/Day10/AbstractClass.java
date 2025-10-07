package Day10;

abstract class Super
{
    public Super() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class Sub extends Super
{
	@Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
    
    public void meth3()
    {
    	System.out.println("Sub meth3");
    }
}
public class AbstractClass 
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.meth1();
        s.meth2();
        Sub sb=new Sub();
        sb.meth3();
    }    
}