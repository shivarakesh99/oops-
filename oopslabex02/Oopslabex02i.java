/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex02i;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Oopslabex02i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee emp=new employee();
        emp.getid();
        emp.getfname();
        emp.getlname();
        emp.getname();
        emp.getsalary();
        emp.setsalary();
        emp.getansalary();
        emp.raisesalary();
        emp.tostring();
                
        // TODO code application logic here
    }
    
}
class employee
{
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String fname,lname,name;
    int id,setsalary,salary,newsalary,percent;
    int getid()
    {
        System.out.print ("\n Enter employee id. ");
        id = in.nextInt();
        return id;
    }
    String getfname()
    {
        System.out.print ("\n Enter first name. ");
        fname = ins.nextLine();
        return fname;
    }
    String getlname()
    {
        System.out.print ("\n Enter last name. ");
        lname = ins.nextLine();
        return lname;
    }
    String getname()
    {
       
        name = fname+lname;
        return name;
    }
    int getsalary()
    {
        System.out.print ("\n Enter employee salary. ");
        id = in.nextInt();
        return salary;
    }
    void setsalary()
    {
        System.out.print ("\n set salary percent. ");
        setsalary = in.nextInt();
    }
    int getansalary()
    {
        int ansalary=salary*12;
        return ansalary;
    }
    int raisesalary()
    {        
         newsalary=(setsalary/100)*salary;
        return newsalary;
    }
    void tostring()
    {
            System.out.print ("\n employee id "+id);
            System.out.print ("\n employee name "+name);
            System.out.print ("\n employee salary "+newsalary);    
        
    }

    
 }
