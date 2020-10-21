
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Kartupelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, jeniskelamin, nisdannisn, ttl, alamat;
        
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masuukan Jenis kelamin : ");
        jeniskelamin = input.nextLine();
        System.out.print("Masukkan NIS/NISN : ");
        nisdannisn = input.nextLine();
        System.out.print("Masukkan Tempat,Tanggal Lahir : ");
        ttl = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        
        
        System.out.println("------------------KARTU PELAJAR SISWA------------------");
        
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + jeniskelamin);
        System.out.println("NIS/NISN : " + nisdannisn);
        System.out.println("Tempat, Tgl Lahir : " + ttl);
        System.out.println("Alamat : " + alamat);
        System.out.println("-------------BERLAKU SELAMA MENJADI SISWA--------------");
        
        
        
        
        
    }
    
}
