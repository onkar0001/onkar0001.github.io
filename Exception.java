import java.util.Scanner;

class Exception
{
    public static void main(String[]args)
    {
        try{
            int num1,num2;
            System.out.println("enter the number");
            Scanner sc=new Scanner(System.in);
            num1=Integer.parseInt(sc.next());
            num2=Integer.parseInt(sc.next());
            System.out.println(num2/num1);
        }
        catch(ArithmeticException e)
        {
            System.out.println("num cant be divided by zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("invalid..its not a integer Number");
        }
        try{
            int array[]={10,30,20,40,50};
            System.out.println("Array element:"+array[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("beyond the array index please check?");
        }
        System.out.println("end of Exception");
    }
}
