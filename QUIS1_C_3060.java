/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.quis1_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */

import java.io.*;

public class QUIS1_C_3060 {

    public static void main(String[] args) {
        // pembuatan objek dari kelas nelayan dan dokter
        nelayan_3060 b = new nelayan_3060();
        nelayan_3060 b1 = new nelayan_3060();
        dokter_3060 c = new dokter_3060();
        dokter_3060 c1 = new dokter_3060();
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Memasukkan Data Nelayan");
            System.out.println("");
            System.out.println("NIK               : ");
            b.nik_3060 = br.readLine();
            System.out.println("Nama              : ");
            b.nama_3060 = br.readLine();
            System.out.println("Umur              : ");
            b.umur_3060 = Integer.parseInt(br.readLine());
            System.out.println("Alamat            : ");
            b.alamat_3060 = br.readLine();
            System.out.println("Jumlah Berat Ikan : ");
            b.jmlhBeratIkan_3060 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pakai Solar : ");
            b.jmlhSolar_3060 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("Memasukkan Data Nelayan");
            System.out.println("");
            System.out.println("NIK               : ");
            b1.nik_3060 = br.readLine();
            System.out.println("Nama              : ");
            b1.nama_3060 = br.readLine();
            System.out.println("Umur              : ");
            b1.umur_3060 = Integer.parseInt(br.readLine());
            System.out.println("Alamat            : ");
            b1.alamat_3060 = br.readLine();
            System.out.println("Jumlah Berat Ikan : ");
            b1.jmlhBeratIkan_3060 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pakai Solar : ");
            b1.jmlhSolar_3060 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("Memasukkan Data Dokter");
            System.out.println("");
            System.out.println("NIK               : ");
            c.nik_3060 = br.readLine();
            System.out.println("Nama              : ");
            c.nama_3060 = br.readLine();
            System.out.println("Umur              : ");
            c.umur_3060 = Integer.parseInt(br.readLine());
            System.out.println("Alamat            : ");
            c.alamat_3060 = br.readLine();
            System.out.println("Jumlah Pasien     : ");
            c.jmlhpasien_3060 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat       : ");
            c.jmlhobat_3060 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("Memasukkan Data Dokter");
            System.out.println("");
            System.out.println("NIK               : ");
            c1.nik_3060 = br.readLine();
            System.out.println("Nama              : ");
            c1.nama_3060 = br.readLine();
            System.out.println("Umur              : ");
            c1.umur_3060 = Integer.parseInt(br.readLine());
            System.out.println("Alamat            : ");
            c1.alamat_3060 = br.readLine();
            System.out.println("Jumlah Pasien     : ");
            c1.jmlhpasien_3060 = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat       : ");
            c1.jmlhobat_3060 = Integer.parseInt(br.readLine());
            System.out.println("");

            //pemanggilan method
            System.out.println("====== DATA NELAYAN ======");
            b.tampilPenduduk();
            b.tampilDataNelayan();
            b.getTotalPendapatanNelayan();
            System.out.println("");
            
            //pemanggilan method
            b1.tampilPenduduk();
            b1.tampilDataNelayan();
            b1.getTotalPendapatanNelayan();
            System.out.println("");
            
            //pemanggilan method
            System.out.println("====== DATA DOKTER ======");
            c.tampilPenduduk();
            c.tampilDataDokter();
            c.getTotalPendapatanDokter();
            System.out.println("");
            
            //pemanggilan method
            c1.tampilPenduduk();
            c1.tampilDataDokter();
            c1.getTotalPendapatanDokter();
            System.out.println("");
        }
        catch(Exception ex)
        {
        System.out.println("ex");
        }
    }
}
