package anudeep;

import java.util.Scanner;

class Employee
{
   String ename;
   int id;
   int salary;
   Employee()
   {
     id=0;
     ename="xxx";
     salary=50000;
   }
   Employee(int i,String nm,int sa)
   {
     id=i;
     ename=nm;
     salary=sa;
   }
  
    public void display()
    {
      System.out.println("employee name ="+ename);
      System.out.println("employee id ="+id);
      System.out.println("Salary="+ salary);
    }
}
public class ConstructorDemo3
{
  public static void main(String args[])
  {
    System.out.println("the employee details are:");
    Employee e1=new Employee(1,"sunmathi",2000);
    Employee e2=new Employee(2,"jessy",1000);
    Employee e3=new Employee(3,"Tejas",2555);
    Employee e4=new Employee();
    e1.display();
    e2.display();
    e3.display();
    e4.display();
   
  }
}
      