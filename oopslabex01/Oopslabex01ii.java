/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex01ii;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Oopslabex01ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number,n,sum=0,product=1;
       Scanner b=new Scanner(System.in);
       System.out.println("enter no:");
       number=b.nextInt();
       while(number>0)
       {
           n=number%10;
           sum=sum+n;
           product=product*n;
           number=number/10;
       }
       System.out.println("sum of digits:"+sum);
       System.out.println("product of digits:"+product);
    }
    
}
