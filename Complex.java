
import java.util.*;
class Complex
{
int real,imag;
Complex()
{
this.real=0;
this.imag=0;
}
Complex(int real,int imag)
{
this.real=real;
this.imag=imag;
}
static void addition(Complex complex1, Complex complex2)
{
Complex complex3=new Complex(0,0);
complex3.real=complex1.real+complex2.real;
complex3.imag=complex1.imag+complex2.imag;
System.out.println(complex3.real+"+"+complex3.imag+"i");
}
static void substraction(Complex complex1, Complex complex2)
{
Complex complex3=new Complex(0,0);
complex3.real=complex1.real-complex2.real;
complex3.imag=complex1.imag-complex2.imag;
System.out.println(complex3.real+"-"+complex3.imag+"i");
}
static void multiplication(Complex complex1, Complex complex2)
{
Complex complex3=new Complex(0,0);
complex3.real=complex1.real*complex2.real;
complex3.imag=complex1.imag*complex2.imag;
System.out.println(complex3.real+"*"+complex3.imag+"i");
}
static void division(Complex complex1, Complex complex2)
{
Complex complex3=new Complex(0,0);
complex3.real=complex1.real/complex2.real;
complex3.imag=complex1.imag/complex2.imag;
System.out.println(complex3.real+"/"+complex3.imag+"i");
}
public static void main (String[] args)
{ int choice;
Complex complex1=new Complex(10,20);
Complex complex2=new Complex(5,10);
System.out.println("Enter your choice");
System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice)
{case 1: addition(complex1,complex2);
break;
case 2: substraction(complex1,complex2);
break;
case 3: multiplication(complex1,complex2);
break;
case 4: division(complex1,complex2);
break;
}
}
}

