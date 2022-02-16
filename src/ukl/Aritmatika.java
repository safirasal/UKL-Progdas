/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author sfrsl
 */
public class Aritmatika {
    public static void main(String []args){
        int a = 18;
        int b = 3;
        int c = 11;
        int d;
        int total = 0;
        System.out.println("Deret Aritmatika :");
        
        for (int i = 2; i <= c; i++) {
            d = a + (2-1) * b;
            a += b;
            
            System.out.println("suku ke-"+i+" = "+d);
            
            total += d;
            
        }
        System.out.println("Total nilai deret aritmatika = "+total);
    }
}
