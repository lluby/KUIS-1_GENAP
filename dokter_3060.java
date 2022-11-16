/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.quis1_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class dokter_3060 extends penduduk_3060{
    //atribut
    int jmlhpasien_3060;
    int jmlhobat_3060;
    
    //konstruktor tanpa parameter
    public dokter_3060(){
        this.jmlhpasien_3060 = jmlhpasien_3060;
        this.jmlhobat_3060 = jmlhobat_3060;
    }
    
    // konstruktor dengan parameter
     public dokter_3060(String nik_3060, String nama_3060, int umur_3060, String alamat_3060, int jmlhpasien_3060, int jmlhobat_3060){
        super(nik_3060, nama_3060, umur_3060, alamat_3060);// pemanggilan konstruktor dari kelas induk
        this.jmlhpasien_3060 = jmlhpasien_3060;
        this.jmlhobat_3060 = jmlhobat_3060;
    }
    
    // fungsi getter
    public double getTotalPendapatanDokter(){
        return (jmlhpasien_3060 * 50000) + (jmlhobat_3060 * 10000);
    }
    
    //method
    public void tampilDataDokter(){
        System.out.println("Jumlah Pasien            : "+jmlhpasien_3060);
        System.out.println("Jumlah Obat              : "+jmlhobat_3060);
        System.out.println("Total Pendapatan Dokter  : "+getTotalPendapatanDokter());
    }
}
