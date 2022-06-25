package Area;

import java.util.Scanner;

public class Area {
	
	private int length;
	private int breadth;

	public  void setDim(int length, int breadth)
	
	{
		this.length = length;
		this.breadth = breadth;
		
	}
	public int getArea() 
	{
		return length * breadth;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter length : ");
		Scanner sc = new Scanner(System.in);
		int length= sc.nextInt();
		System.out.println("Enter Breadth : ");
		int breadth = sc.nextInt();
		Area ar= new Area();
		ar.setDim(length, breadth);
		int area = ar.getArea();
		
		System.out.println("Area of rectangle is :" + area);
		sc.close();
	}

}
