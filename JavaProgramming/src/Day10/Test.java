package Day10;

interface Test1
{
	int a=5;									//	by default variables in interface is static 
    final static int X=10;
    public abstract void meth1();				// 	by default methods in interface is public abstract 
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test1
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println(Test1.X);			//	static variables/methods can be accessed through only class Name or reference of that class
        Test1.meth3();
        
        Test1 t1=new My();
        System.out.println(t1.X);          		//	static variables/methods can be accessed through only class Name or reference of that class
        										// if we access it through reference then it should be in printing statement
        
        t1.meth1();
        System.out.println(t1.a);
        
        Test2 t2=new My();
        t2.meth4();
        
    }
    
}