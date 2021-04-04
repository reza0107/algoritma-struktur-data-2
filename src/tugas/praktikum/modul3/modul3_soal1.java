/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikum.modul3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class modul3_soal1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("***SEQUENTIAL SEARCH***"+"/n" );
       String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Telsa"};
       String key;
       Scanner scan = new Scanner (System.in);
       System.out.print("Masukkan data yang di  cari: ");
       key = scan.nextLine();
       System.out.println("isi data adalah: ");
       for (int i = 0; i < data.length; i++) {
           System.out.println(data[i] + " ");
       }
       System.out.println("");
       
       for (int i = 0; i <= data.length; i++) {
           if (key.equalsIgnoreCase(data[i])) {
               System.out.println("Data "+key+" berada pada index ke - "+i);
               break;
           }
       }
       System.out.println("/n");
       System.out.println();
       System.out.println("***TERIMA KASIH***");      
    } 
}
