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
public class soal3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int u = a;
        int s = a;

        System.out.println("Matriks segitiga siku ke bawah");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1 + i; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            s = s - u;
            System.out.println(" ");

            System.out.println("Jumlah Deret Aritmatikanya adalah " + s);

        }
    }
}
