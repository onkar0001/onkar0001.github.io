//ABSTRACT CLASS
import java.util.*;
abstract class Shape
{
abstract public void Compute_Area(int a,int b);
public void Calculate_Area()
{
}
}
class Traingle extends Shape
{
public int base;
public int height;
public void Compute_Area(int base,int height)
{
this.base=base;
this.height=height;
}
public void Calculate_Area()
{
System.out.println("Area of Traingle is:-"+(0.5*(base*height)));
}
}
class Rectangle extends Shape
{
public int length;
public int breadth;
public void Compute_Area(int length,int breadth)
{
this.breadth=breadth;
this.length=length;
}
public void Calculate_Area()
{
System.out.println("Area of Rectangle is:-"+(length*breadth));
}
}
class Abstract1
{
public static void main(String [] args)
{
int base,height;
int length,breadth;
Shape obj1=new Traingle();
System.out.println("Base of traingle is:-");
Scanner sc=new Scanner(System.in);
base=sc.nextInt();
System.out.println("Height of traingle is:-");
height=sc.nextInt();obj1.Compute_Area(base,height);
obj1.Calculate_Area();
System.out.println("length of Rectangle is:-");
length=sc.nextInt();
System.out.println("Breadth of Rectangle is:-");
breadth=sc.nextInt();
Shape obj2=new Rectangle();
obj2.Compute_Area(length,breadth);
obj2.Calculate_Area();
}
}

