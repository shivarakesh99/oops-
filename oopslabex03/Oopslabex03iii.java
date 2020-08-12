/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex03iii;

/**
 *
 * @author pc
 */
public class Oopslabex03iii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        roigi lack =new roigi();
        roigi lack1 =new roigi();
        roigi lack2 =new roigi();
        System.out.println("Counter:"+lack2.counter);
        System.out.println("Ststic Counter:"+lack2.staticcounter);
        // TODO code application logic here
    }
    
}
class roigi
{
public int counter=0;
public static int staticcounter=0;
public roigi(){
    counter++;
    staticcounter++;
}
}