package tugas.praktikum.modul3;
import java.util.Scanner;

public class modul3_soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("***SEQUENTIAL SEARCH***"+"/n" );
       int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
       int key = 4;
       Scanner scan = new Scanner (System.in);
       System.out.println("isi data adalah: ");
       for (int i = 0; i < data.length; i++) {
           System.out.println(data[i] + " ");
       }
       System.out.println("");
       
       for (int i = 0; i <= data.length; i++) {
           if (key == data[i]) {
               System.out.println("Data "+key+" berada pada index ke - "+i);
               break;
           }
       }
       System.out.println("/n");
       System.out.println();
       System.out.println("***TERIMA KASIH***");      
    } 
}