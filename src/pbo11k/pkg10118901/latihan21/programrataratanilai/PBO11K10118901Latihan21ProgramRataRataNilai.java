/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung rata rata nilai dengan banyak nilai tidak pasti
 */
public class PBO11K10118901Latihan21ProgramRataRataNilai {
    public static Scanner input = new Scanner(System.in);
    public static void hitungRataRata(int i) {
        int jumlah = 0, n;
        double rataRata;  
        for(int j = 1; j <= i;j++) {
            System.out.print("Nilai Mahasiswa Ke-"+j+" ");
            n = input.nextInt();
            jumlah = jumlah + n;
        }
        rataRata = (double) jumlah / i;
        System.out.println("Maka, Rata-rata Nilainya adalah "+ rataRata);
        System.out.println("Developed by : Dedi Cahya");
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        hitungRataRata(n);
        
    }
    
}
