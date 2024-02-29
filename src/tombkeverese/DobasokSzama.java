/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombkeverese;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author KovácsIstvánGábor(SZ
 */
public class DobasokSzama {
    
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();    
    public static void main(String[] args) {
        System.out.println("Hányszor szeretne dobni a dobokockával?");
        int dobas = sc.nextInt();
        int[] dobasok = new int[7];
        
        while(dobas <= 1){
            System.out.println("Csak pozitív számot fogadok el!");
            dobas = sc.nextInt();
        }
        
        for (int i = 1; i < dobas; i++) {
            int szam = rnd.nextInt(6)+1;
            dobasok[0] = szam + 1;
            dobasok[1] = szam + 1;
            dobasok[2] = szam + 1;
            dobasok[3] = szam + 1;
            dobasok[4] = szam + 1;
            dobasok[5] = szam + 1;
            System.out.println(dobasok[i] + " ");
        }
        System.out.println("");
        
    }
}
