package pkgTestShape;
import static org.junit.Assert.*;
import org.junit.*;

import com.sun.javafx.geom.Rectangle;

import pkgShape.Shape.Rectangle.Cuboid;

public class pkgTestShape {
	//Test construction
	 @Test
	  public void newRectangle_instantiatesCorrectly() {
	    @SuppressWarnings("restriction")
		Rectangle testRectangle = new Rectangle(2, 4);
	    assertEquals(true, testRectangle instanceof Rectangle);
	  }

	  @Test
	  public void newRectangle_getLength_2() {
	    Rectangle testRectangle = new Rectangle(2, 4);
	    assertEquals(2, testRectangle.getLength());
	    
	  }
	  //Test getters and setters
public void Rectangle(double Length, double Width) {
	
}
@Test
public double getLength(double Length) {
	if(Length>0)
	return 1;
	else
		return 0;
}

public double getWidth(double Width) {
	if (Width>0)
	return 1;
	else
		return 0;
}
// Test Area
@Test
public double area(double Length,double Width) {
double length=2;
double width=5;
double Area=length*width;
return Area;

}
public Class<Double> area() {
	double length=-1;
	try {
	area();
	}
	catch(Exception e) {
		return double .class;
	}
	finally {
		System.out.println("Not a Rectangle");
	}
	return null;
}
// Test Perimeter
@Test
public double perimeter(double getLength,double getWidth) {
	double length=8;
	double width=7;
	double perimeter=2*(length+width);
	return perimeter;

try {
	double width=-1;
	
}
catch(Exception e) {
	return perimeter;
}
finally {
	System.out.println("Invalid Perimeter");
}}
// Test Compare To
@Test
public void Rectangle() {
	double [] area= {2,5,6};
	double [] other.area = {5,3,1};
	assertEquals(false,Rectangle.compare(area, other.area));
	
}
@Test
public void Rectangle() {
	double [] area= {2,5,6};
	double [] other.area = {2,5,6};
	assertEquals(true,Rectangle.compare(area, other.area));
	
}
// Test illegalargumentexception
@Test
public void perimeter() {
	try {
		double newwidth>0 && double newlength>0;
	}
	catch(Exception e) {
		fail("Should not have thrown any exception");
	}
	try {
		 newwidth<0 &&  newlength>0;
		
	}
	catch(Exception e) {
		System.out.println("Should throw an exception");
	}
} 
//Test construction for cuboid
public void newCuboid_instantiatesCorrectly() {
    @SuppressWarnings("restriction")
	Cuboid testCuboid = new Cuboid(2, 4);
    assertEquals(true, testCuboid instanceof Cuboid);
  }

  @Test
  public void newCuboid_getLength_2() {
    Cuboid testCuboid = new Cuboid(2, 4);
    extracted(testCuboid);
    
  }

@SuppressWarnings("deprecation")
private void extracted(Cuboid testCuboid) {
	assertEquals(2, testCuboid.getLength());
}

//Test getters and setters
public void Cuboid(double length, double width, double depth) {
	
}
@Test
public double getLength(double length) {
	if(length>0)
	return 1;
	else
		return 0;
}
@Test
public double getWidth(double width) {
	if (width>0)
	return 1;
	else
		return 0;
}
@Test
public double getDepth(double depth) {
	if (depth>0)
	return 1;
	else
		return 0;
}
@Test
public double setLength(double length) {
	if (length>0)
		return 1;
	else
		return 0;
}
@Test
public double setWidth(double width) {
	if(width>0)
		return 1;
	else 
		return 0;
	
}
@Test
public double setDepth(double depth) {
	if (depth>0)
		return 1;
	else
		return 0; 
}
/// Test Area
@Test
public void surfacearea() {
	int width=7;
	int depth=6;
	int length=5;
	final int surfacearea=2*(width*depth+width*length+depth*length);
	System.out.println(surfacearea);
}
@Test
public void surfacearea1() {
try 
	{
		int width=-1;
		int depth=6;
		int length=5;
		final int surfacearea=2*(width*depth+width*length+depth*length);
		System.out.println(surfacearea);}
		

	void Catch(Exception e){
	System.out.println("Illegal Area");
	}


//Test Perimeter
@Test
public void perimeter1() {
try {
perimeter();	
}
catch(UnsupportedOperationException e){
	System.out.println("Perimeter Excpetion");
	}
finally {
	System.out.println("Exception works");
}

}
@Test
public void Cuboidperimeter() {
int length;
int width;
int depth;
int perimeter=length*width*depth;
System.out.println(perimeter);
int x=perimeter;
if (x>0)
	System.out.println("Error perimeter should not exist");
}}
//Testing illegalarguments
@Test
public Illegalarguments{
	if (depth>0)
		System.out.println(depth);
	else if (depth<0) {
		throw new IllegalArgumentException();
		}
}}
//SortByArea
@Test
public SortByArea{
	if (area1>area2)
		return 1;
	else if(area2<area1)
		return -1;
	else
		return 0;

	
}}
public SortByArea{
	if (area2>area1)
		return 1;
	else if(area1>area2)
		return -1;
	else
		return 0;
}}
//SortByVolume
@Test
public SortByVolume{
	if (volume1>volume2)
		return 1;
	else if(volume2<volume1)
		return -1;
	else
		return 0;

	
}}
public SortByVolume{
	if (volume2>volume1)
		return 1;
	else if(volume1>volume2)
		return -1;
	else
		return 0;
}}







