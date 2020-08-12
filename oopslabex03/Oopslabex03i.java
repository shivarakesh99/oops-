/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex03i;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Oopslabex03i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a,n");
       int a=sc.nextInt();
       int n=sc.nextInt();
       System.out.println(mod(a,n));
        // TODO code application logic here
    }

    private static int mod(int a, int n) {
        
            return a%n;
        
            
    }
    
}
