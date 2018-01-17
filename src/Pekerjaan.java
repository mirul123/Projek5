/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Muhammad Muizuddin
 */
public class Pekerjaan {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        String nama,kerja;
        double gaji;
        
    System.out.println("Masukkan nama anda: ");
    nama = input.nextLine();
    
    System.out.println("Masukkan pekerjaan anda: ");
    kerja = input.nextLine();
    
    System.out.println("Masukkan bilangan gaji anda: ");
    gaji = input.nextDouble();
    
    System.out.println("============================================");
    System.out.println("BIODATA PEKERJA");
    System.out.println("NAMA: "+nama);
    System.out.println("GAJI: "+gaji);
    System.out.println("PEKERJAAN: "+kerja);
    
    }
    
}
