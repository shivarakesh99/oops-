/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex02ii;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Oopslabex02ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customerdata ob = new Customerdata();
        ob.getdata();
        ob.calc();
        ob.display();
    }
}
class Customerdata
{
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String name;
    int no,type;
    double current,prev,total,units;
    void getdata()
    {
        System.out.print ("\n Enter consumer no. ");
        no = in.nextInt();
        System.out.print ("\n Enter consumer name ");
        name = ins.nextLine();
        System.out.print ("\n Enter previous month reading ");
        prev= in.nextDouble();
        System.out.print ("\n Enter current month reading ");
        current= in.nextDouble();
        System.out.print ("\n Enter Type of connection (0 for Domestic or 1 for Commercial) ");
        type = ins.nextInt();
        
    }
    void calc()
    {
        units=current-prev;
        if(type==0)
        {
            if (units<=100)
                total=1 * units;
            else if (units>100 && units<=200)
                total=2.50*units;
            else if(units>200 && units<=500)
                total= 4*units;
            else
                total= 6*units;
        }
        else
        {
            if (units<=100)
                total= 2 * units;
            else if(units>100 && units<=200)
                total=4.50*units;
            else if(units>200 && units<=500)
                total= 6*units;
            else
                total= 7*units;
        }
    }
    void display()
    {
        System.out.println("\n Consumer number = "+no);
        System.out.println ("\nConsumer name = "+name);
        if(type==0)
            System.out.println ("\nconnection:DOMESTIC ");
        else
            System.out.println ("\nconnection:COMMERCIAL ");
        System.out.println ("\n Current Month Reading = "+current);
        System.out.println ("\n Previous Month Reading = "+prev);
        System.out.println ("\n Total units = "+units);
        System.out.println ("\n Total bill = RS "+total);
    }
        // TODO code application logic here
}    
    

