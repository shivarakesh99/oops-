/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex01i;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Oopslabex01i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A,B;
        System.out.println("enter a");
        A=obj.nextInt();
        System.out.println("enter b");
        B=obj.nextInt();
        if(A>B)
            System.out.println("min no:"+B);
        else if(B>A)
            System.out.println("min no:"+A);
        else
            System.out.println("equal");
    }
    
}
