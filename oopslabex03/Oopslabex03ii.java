/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex03ii;

/**
 *
 * @author pc
 */
public class Oopslabex03ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,2,1};
        System.out.println(eq(a,b));
        
        // TODO code application logic here
    }

    public static boolean eq(int[] a, int[] b) {
        if(a.length!=b.length)
            return false;
        for( int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;

    }
    
}

