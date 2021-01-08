/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbola;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Luasbola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hasil;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung luas permukaan bola");
        System.out.print("Masukkan r : ");
        int jari = input.nextInt();
        System.out.println();
        System.out.println("Luas permukaan bola : " +(4*Math.PI*jari*jari));

    }
    
}
