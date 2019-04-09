package pkgShape;

import java.util.Scanner;

public abstract class Shape{ 
	
	
	public abstract double area(); 
	public abstract double perimeter();

public class Rectangle extends Shape{
	private double width, length;
	public Rectangle() {
		this.width=1;
		this.length=1;
	}
public Rectangle(double width, double length) {
	this.width=width;
	this.length=length;
}
	public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
	public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width *length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}
	public void width(double newwidth) {
		if (newwidth<=0) {
			throw new IllegalArgumentException();
		}
		this.width=newwidth;
	}
	public void length(double newlength) {
		if (newlength<=0) {
			throw new IllegalArgumentException();
		}
		this.length=newlength;
	}
	public class Rectangle implements Comparable <Rectangle>{
		public double compareTo(Rectangle other) {
			if (area<other.area) {
				return -1;
			}
			else if(area>other.area) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}

public class Cuboid extends Rectangle{
	public Cuboid(double width, double length) {
		super(width, length);
		// TODO Auto-generated constructor stub
	}
	private double width, length, depth;
	public Cuboid() {
		this.width=1;
		this.length=1;
		this.depth=1;
	}
public Cuboid(double width, double length, double depth) {
	this.width=width;
	this.length=length;
	this.depth=depth;
}
public double getDepth() {
	return depth;
}
public void setDepth(double depth) {
	this.depth = depth;
}


public void depth(double newdepth) {
	if (newdepth<=0) {
		throw new IllegalArgumentException();
	}
	this.depth=newdepth;
}
public double area(double surfacearea) {
	// TODO Auto-generated method stub
	return 2*(length*width+width*depth+length*depth);
}
@Override
public double area() {
	// TODO Auto-generated method stub
	return super.area();
	 double surfaceArea = 2 * (length * depth + depth * width + width * length);
}
public void main(String[] args) {
	Scanner input = new Scanner(System.in);
    double length = 0;
    double depth = 0;
    double width = 0;
 
    double volume = 0;
    System.out.print("Enter the length of Cuboid : "); 
    length = input.nextDouble();
    System.out.print("Enter the depth of Cuboid : "); 
    depth = input.nextDouble();
 
    System.out.print("Enter the width of Cuboid : "); 
    width = input.nextDouble();
    volume = (length * depth * width);
}{
try {
	perimeter();
}
catch(UnsupportedOperationException e) {
	System.out.println("Perimeter Excpetion");
}
 final double SortByArea;
 final double SortByVolume;}
public final class Cuboid implements Comparable <SortByArea>{	
public double compareTo(SortByArea other) {
		if (SortByArea<other.SortByArea) {
			return -1;
		}
		else if(SortByArea>other.SortByArea) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
public final class Cuboid implements Comparable <SortByVolume>{	
public double compareTo(SortByVolume other) {
		if (SortByVolume<other.SortByVolume) {
			return -1;
		}
		else if(SortByVolume>other.SortByVolume) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
}
}}



