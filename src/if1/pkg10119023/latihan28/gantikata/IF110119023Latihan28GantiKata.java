/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan28.gantikata;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program mengganti kata dati sebuah kalimat yang user 
 *                     berikan
 *
 */
import java.util.Scanner;
public class IF110119023Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    String kalimat,ganti,jadi;
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        
        /**nextLine dapat membaca keseluruhan kalimat sementara next hanya sampai
         * spasi pertama
         */
        kalimat = scan.nextLine();
        System.out.print("Ganti kata\t : ");
        ganti = scan2.next();
        System.out.print("Menjadi kata\t : ");
        jadi = scan3.next();
    }
    
    public void replace(){
        //deklarasi string.replaceAll(Sting regex, String replace)
        String tukar = kalimat.replaceAll(ganti, jadi);
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+tukar);
    }
    
    public static void main(String[] args) {
        IF110119023Latihan28GantiKata kelas = new IF110119023Latihan28GantiKata();
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====");
        System.out.println();
        kelas.input();
        kelas.replace();
    }

}
