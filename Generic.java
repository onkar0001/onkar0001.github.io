//Program – Generic
import java.util.*;
import java.lang.*;
import java.io.*;
public class Generic{
static int count = 0;
static void check_palindrome(String x){
StringBuilder s1 = new StringBuilder(x);
if(x.equals(s1.reverse().toString())){
System.out.println(x+" is a Palindrome");
count += 1;
}
else{
System.out.println(x+" is not a Palindrome");
}
}
static void even_odd(int x){
if(x % 2 == 0){
System.out.println(x+" IS EVEN");
count += 1;
}
else{System.out.println(x+" IS ODD");
}
}
static void prime(int x)
{
boolean flag = false;
for(int i = 2; i <= x/2; i++)
{
if(x % i == 0){
flag = true;
break;
}
}
if (!flag)
{
System.out.println(x + " is a prime number.");
count += 1;
}
else{
System.out.println(x + " is not a prime number.");
}
}
static void check(int ch,int x){switch(ch){
case 1:
even_odd(x);
break;
case 2:
prime(x);
break;
default:
System.out.println("ENTER CORRECT OPTION");
}
}
static void number_op(){
int element,n,choice;
Scanner sc = new Scanner(System.in);
ArrayList<Integer> nums = new ArrayList<Integer>();
System.out.println("Enter the number of elements:");
n = sc.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
element = sc.nextInt();
nums.add(element);
}
System.out.println("Enter the Operation to be performed:");System.out.println("1. ODD or EVEN");
System.out.println("2. PRIME OR NOT");
choice = sc.nextInt();
Iterator itr = nums.iterator();
count = 0;
while(itr.hasNext()){
check(choice,(int)itr.next());
}
if(choice == 1){
System.out.println("The number of EVEN numbers is: "+ count);
System.out.println("The number of ODD numbers is: "+ (nums.size()-
count));
}
else{
System.out.println("The number of PRIME numbers is: "+ count);
System.out.println("The number of Non-PRIME numbers is: "+
(nums.size()-count));
}
}
static void string_op(){
int n;
String word;
ArrayList<String> words = new ArrayList<String>();Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements:");
n = sc.nextInt();
System.out.println("Enter elements:");
for(int i=0;i<n;i++){
word = sc.next();
words.add(word);
}
count = 0;
for(String w:words){
check_palindrome(w);
}
System.out.println("The number of PALINDROMES is: "+ count);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Choose Type:");
System.out.println("1. String");
System.out.println("2. Integer");
int ch = sc.nextInt();if(ch == 2)
number_op();
else
string_op();
}
}
