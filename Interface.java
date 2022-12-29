interface Vehicles{
public void Speed_Up(int a);
public void Gear_Change(int b);
public void Apply_Break();
}
class Bicycle implements Vehicles
{
private int speed;
int gear;
public int getspeed(){
return this.speed;
}
public void setspeed(int speed){
this.speed=speed;
}
public void Speed_Up(int increment)
{
this.speed=speed+increment;
}
public void Gear_Change(int change)
{
gear=change;
}
public void Apply_Break()
{
speed=speed-speed;
gear=0;
}
public void Display()
{
System.out.println("\n\nBicycle Status: ");
System.out.println("Speed of the Bicycle is: "
+speed+"km/hr");
System.out.println("Gear of the Bicycle is: " + gear);
}
}
class Car implements Vehicles
{
private int speed;
int gear;
public int getspeed(){
return this.speed;
}
public void setspeed(int speed){this.speed=speed;
}
public void Speed_Up(int increment)
{
this.speed=speed+increment;
}
public void Gear_Change(int change)
{
gear=change;
}
public void Apply_Break()
{
speed=speed-speed;
gear=0;
}
public void Display()
{
System.out.println("\n\nBicycle Status: ");
System.out.println("Speed of the Bicycle is: "
+speed+"km/hr");
System.out.println("Gear of the Bicycle is: " + gear);
}
}
class Bike implements Vehicles
{
private int speed;
int gear;
public int getspeed(){
return this.speed;
}
public void setspeed(int speed){
this.speed=speed;
}
public void Speed_Up(int increment)
{
this.speed=speed+increment;
}
public void Gear_Change(int change)
{
gear=change;
}
public void Apply_Break()
{
speed=speed-speed;
gear=0;
}
public void Display()
{
System.out.println("\n\nBicycle Status: ");System.out.println("Speed of the Bicycle is: " +speed+
"km/hr");
System.out.println("Gear of the Bicycle is: " + gear);
}
}
public class Interface
{
public static void main(String[]args)
{
Bicycle obj1 = new Bicycle();
obj1.getspeed();
obj1.Speed_Up(8);
obj1.setspeed(25);
obj1.Gear_Change(4);
obj1.Display();
obj1.Apply_Break();
obj1.Display();
Car obj2 = new Car();
obj2.getspeed();
obj2.Speed_Up(5);
obj2.setspeed(80);
obj2.Gear_Change(3);
obj2.Display();
obj2.Apply_Break();
obj2.Display();
Bike obj3 = new Bike();
obj3.getspeed();
obj3.Speed_Up(8);
obj3.setspeed(45);
obj3.Gear_Change(2);
obj3.Display();
obj3.Apply_Break();
obj3.Display();
}
}
