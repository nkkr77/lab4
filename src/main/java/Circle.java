
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
public class Circle 
{
	private double radius;
	private final double PI = 3.14159;
 
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public Circle() 
	{
		this.radius = 0.0;
	}
 
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
 
	public double getRadius() 
	{
		return radius;
	}
 
	public double getArea() 
	{
		return PI * Math.pow(radius, 2);
	}
 
	public double getDiameter() 
	{
		return radius * 2;
	}
 
	public double getCircumference() 
	{
		return 2 * PI * radius;
	}
 
	public static void main(String[] args) 
	{
	
		
	Scanner reader = new Scanner(System.in); 
   	System.out.println("Please enter Radius of Circle: ");
   	double r = reader.nextDouble();
		
  		Circle c = new Circle(r);
		
		System.out.println("The circle's area is: " + c.getArea());
                
		System.out.println("The circle's diameter is: " + c.getDiameter());
                
		System.out.println("The circle's circumference is: " + c.getCircumference());
 
		
	}
}