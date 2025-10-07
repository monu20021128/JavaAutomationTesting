package Day10;

import java.util.Scanner;

interface Animal
{
	void Cry();
}
interface Vehical
{
	void Move();
}

interface Overideable extends Animal,Vehical
{
	void RideAble();
}
class Horse implements Overideable
{
	public void Cry() 
	{
		System.out.println("Horse cries");
		
	}
	
	public void Move() 
	{
		System.out.println("Horse Moves");
		
	}
	public void RideAble() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rider Name of Horse: ");
		String RiderName=sc.next();
		
		System.out.println(RiderName+" is Riding Horse");
	}
}

public class ABSTRACT 
{
	public static void main(String[] args) 
	{
		Horse hs=new Horse();
		hs.Cry();
		hs.Move();
		hs.RideAble();
	}
}
