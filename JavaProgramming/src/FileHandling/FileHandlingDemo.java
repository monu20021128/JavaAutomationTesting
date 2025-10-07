package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo 
{

	/*public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("E:\\Java for Automation Testing\\A.txt");
		int n;
		System.out.println("Length of File is: "+fis.available());
		while((n=fis.read())!=-1)
		{
			System.out.print((char)n);
		}
		fis.close();
	}*/
	
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\Java for Automation Testing\\B.txt");
		
		int m;
		System.out.println("Enter your text and then click Ctrl+z for ending");
		
		while((m=System.in.read())!=-1)
		{
			fos.write(m);
		}
		System.out.println("Ended");
		fos.close();
		
	}
}
