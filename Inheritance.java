class Employee
{
protected String Emp_name;
protected String Emp_adress;
protected String Emp_mail;
protected int Emp_ID;
protected long Emp_Mb_no;
public void Emp_Info(String Emp_name, String Emp_adress,String Emp_mail, int Emp_ID, long Emp_Mb_no){
this.Emp_name=Emp_name;
this.Emp_adress=Emp_adress;
this.Emp_mail=Emp_mail;
this.Emp_ID=Emp_ID;
this.Emp_Mb_no=Emp_Mb_no;
}
public void display(){
}
public void Gross_salary(){
}
public void Net_salary(){
}
}
class Programmer extends Employee
{
private double BP;
public double getBP(){
return this.BP;
}public void setBP(double BP){
this.BP=BP;
}
public void display(){
System.out.println("Programmer Information:-");
System.out.println("Name="+Emp_name+","+"Adress:-"+Emp_adress+", "+"Mail:-"+Emp_mail+", "+"ID Number:-"+Emp_ID+","+"Mobilenumber:-"+Emp_Mb_no);
}
public void Gross_salary(){
System.out.println("Gross Salary is:-"+(BP+getBP()*10/100+getBP()*97/100+getBP()*12/100));
}
public void Net_salary(){
System.out.println("Net Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100+getBP()*0.1));
}
}
class Team_Lead extends Employee
{
private double BP;
public double getBP(){return this.BP;
}
public void setBP(double BP){
this.BP=BP;
}
public void display(){
System.out.println("\n\n\nTeam Leader Information:-");
System.out.println("Name="+Emp_name+", "+"Adress:-"+Emp_adress+", "+"Mail:-"+Emp_mail+", "+"ID Number:-"+Emp_ID+","+"Mobilenumber:-"+Emp_Mb_no);
}
public void Gross_salary(){System.out.println("Gross Salary is:-"+(BP+getBP()*10/100+getBP()*97/100+getBP()*12/100));
}
public void Net_salary(){
System.out.println("Net Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100+getBP()*0.1));
}
}
class Assistant_Project_Manager extends Employee
{
private double BP;
public double getBP(){
return this.BP;
}
public void setBP(double BP){
this.BP=BP;
}
public void display(){
System.out.println("\n\n\nAssistant Project Manager Information:-");
System.out.println("Name="+Emp_name+", "+"Adress:-"+Emp_adress+", "+"\nMail:-"+Emp_mail+", "+"\nID Number:-"+Emp_ID+","+"\nMobilenumber:-"+Emp_Mb_no);
}
public void Gross_salary(){
System.out.println("Gross Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100));
}
public void Net_salary(){
System.out.println("Net Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100+getBP()*0.1));
}
}
class Project_Manager extends Employee{
private double BP;public double getBP(){
return this.BP;
}
public void setBP(double BP){
this.BP=BP;
}
public void display(){
System.out.println("\n\n\nProject ManagerInformation:-");
System.out.println("Name="+Emp_name+", "+"\nAdress:-"+Emp_adress+", "+"\nMail:-"+Emp_mail+","+"\nID Number:-"+Emp_ID+","+"\nMobilenumber:-"+Emp_Mb_no);
}
public void Gross_salary(){
System.out.println("Gross Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100));
}
public void Net_salary(){
System.out.println("Net Salary is:-"+ (BP+getBP()*10/100+getBP()*97/100+getBP()*12/100+getBP()*0.1));
}
}
class Inheritance
{
public static void main(String[] args){
Employee obj1 = new Programmer();
obj1.Emp_Info("Ram","Shrirampur","ram123@gmail.com",6,9284543702l);
obj1.display();
Programmer obj2 = new Programmer();
obj2.setBP(9000.20);
obj2.getBP();
obj2.Gross_salary();
obj2.Net_salary();Employee obj3 = new Team_Lead();
obj3.Emp_Info("Sham","Nagar","sham213@gmail.com",7,9112772159l);
obj3.display();
Team_Lead obj4=new Team_Lead();
obj4.setBP(2000.12);
obj4.getBP();
obj4.Gross_salary();
obj4.Net_salary();
Employee obj5= new Assistant_Project_Manager();
obj5.Emp_Info("Sundar","Sangmner","Sundar98@gmail.com",34,9876678959l);
obj5.display();
Assistant_Project_Manager obj6=new
Assistant_Project_Manager();
obj6.setBP(1200.12);
obj6.getBP();
obj6.Gross_salary();
obj6.Net_salary();
Employee obj7= new Project_Manager();
obj7.Emp_Info("Ravi","Pune","ravi8@gmail.com",84,7007657892l);
obj7.display();Project_Manager obj8=new Project_Manager();
obj8.setBP(6765.12);
obj8.getBP();
obj8.Gross_salary();
obj8.Net_salary();
}
}
