/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.quis1_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class nelayan_3060 extends penduduk_3060 {
    //atribut
    int jmlhBeratIkan_3060;
    int jmlhSolar_3060;
    
    //kondtruktor tanpa parameter
    public nelayan_3060(){
        this.jmlhBeratIkan_3060 = jmlhBeratIkan_3060;
        this.jmlhSolar_3060 = jmlhSolar_3060;
        
    }
    
    //kondtruktor dengan parameter
    public nelayan_3060(String nik_3060, String nama_3060, int umur_3060, String alamat_3060, int jmlhBeratIkan_3060, int jmlhSolar_3060){
        super(nik_3060, nama_3060, umur_3060, alamat_3060);//pemanggilan konstruktor dari kelas induk
        this.jmlhBeratIkan_3060 = jmlhBeratIkan_3060;
        this.jmlhSolar_3060 = jmlhSolar_3060;
    }
    
    //fungsi getter
    public double getTotalPendapatanNelayan(){
        return (jmlhBeratIkan_3060 * 8000) - (jmlhSolar_3060 * 10000);
    }

    public void tampilDataNelayan(){
        System.out.println("Jumlah Berat Ikan        : "+jmlhBeratIkan_3060);
        System.out.println("Jumlah Pakai Solar       : "+jmlhSolar_3060);
        System.out.println("Total Pendapatan Nelayan : "+getTotalPendapatanNelayan());
    }
    
}
