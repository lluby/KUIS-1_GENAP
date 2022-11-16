/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.quis1_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class penduduk_3060 {
    //atribut
    protected String nik_3060,nama_3060,alamat_3060;
    protected int umur_3060;
    
    //konstruktor tanpa parameter
    public penduduk_3060(){
        this.nik_3060 = nik_3060;
        this.nama_3060 = nama_3060;
        this.umur_3060 = umur_3060;
        this.alamat_3060 = alamat_3060;   
    }
    
    //konstruktor dengan parameter
    public penduduk_3060(String nik_3060, String nama_3060, int umur_3060, String alamat_3060){
        this.nik_3060 = nik_3060;
        this.nama_3060 = nama_3060;
        this.umur_3060 = umur_3060;
        this.alamat_3060 = alamat_3060;
    }
    
    public void tampilPenduduk(){
        System.out.println("NIK                      : "+nik_3060);
        System.out.println("Nama                     : "+nama_3060);
        System.out.println("Umur                     : "+umur_3060);
        System.out.println("Alamat                   : "+alamat_3060);
    }
}

