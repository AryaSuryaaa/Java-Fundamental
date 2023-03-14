/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kelas.dan.object;

/**
 *
 * @author surya
 */
public class Orang {

    // Atribut
    private String nama;
    private int umur;
    private int tinggi;
    
    //constructor 0 parameter
    public Orang() {
        // Constructor
        nama = "I Kadek Arya Surya Saputra";
        umur = 0;
        tinggi = 0;
        
        System.out.println("Constructor dengan 0 parameter dijalankan");
    }

    public Orang(String nama, int umur, int tinggi) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
        
        System.out.println("Constructor " + nama + " dijalankan");
    }
    
    public void bermain(){
        System.out.println(nama + " ssedang bermain");
    }
    
    
    
}
