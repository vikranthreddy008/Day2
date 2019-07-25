   
package com.lti.ui;
import com.lti.bean.*;
public class Demo1{
public static void main(String args[])
{ Employee emp=new Employee(100,"king",25000.02);
Manager man=new Manager(102,"kaaa",50000.00," ");
Engineer eng=new Engineer(103,"kii",25000,"swiggy");

  String empdata=emp.toString();
  System.out.println(empdata);
  
  String Managerdata=man.toString();
  System.out.println(Managerdata);
  
  String Engineerdata=eng.toString();
  System.out.println(Engineerdata);
  
}
}
