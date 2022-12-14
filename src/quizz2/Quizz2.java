/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz2;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class Quizz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int harga,pertama,kedua,ketiga,keempat;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Harga Barang Pertama : ");
        pertama = input.nextInt();
        System.out.print("Masukkan Harga Barang Kedua : ");
        kedua = input.nextInt();
        System.out.print("Masukkan Harga Barang Ketiga : ");
        ketiga = input.nextInt();
        System.out.print("Masukkan Harga Barang Keempat : ");
        keempat = input.nextInt();
        harga = pertama + kedua + ketiga + keempat;
        if (harga >= 500.000)
        {
            System.out.println(harga-(30 * harga/100) + " Harga Yang Dibayar");
        } 
        else if (harga < 500.000 && harga >= 300.000 )
        {
            System.out.println(harga-(20 * harga/100) + " Harga Yang Dibayar");
        }
        else if (harga < 300.000 && harga >= 150.00)
        {
            System.out.println(harga-(10 * harga/100) + " Harga Yang Dibayar");
        }
        else if (harga < 150.000)
        {
            System.out.println(harga + " Harga Yang Dibayar");
        }
        else 
        {
            System.out.println(" Maaf Inputan Anda Salah ");
        }
    }
    
}
