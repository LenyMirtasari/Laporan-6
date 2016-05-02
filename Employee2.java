/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee2;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class Employee2 {

    private String nama;
    private String idkerja;
    private String jabatan;
    private String istri;
    private String Status;
    private int anak;
    private int tasuk;
    private int total;
    private double totalgaji,bonus,tunjangan;
    int gaji = 5000000;

    public Employee2(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        this.nama = nama;
        this.idkerja = idkerja;
        this.jabatan = jabatan;
        this.Status = Status;
        this.istri = istri;
        this.anak = anak;
        this.tasuk = tasuk;

    }
    public int getgaji(){
        return gaji=5000000;
    }

    public double masakerja() {
        int masakerja=2016-tasuk;
        return masakerja;
    }
    public double bonus(){
        int masakerja=2016-tasuk;
        if (masakerja>10){
            bonus= 0.1*(gaji*masakerja);
        }else if(masakerja>=6&&masakerja<=10){
            bonus=0.05*(gaji*masakerja);
        
           
            
        }
        return bonus;
    }
        public double tunjangan(){
             int masakerja=2016-tasuk;
            if (masakerja>10){
                tunjangan=0;
            }else if(masakerja>=6&&masakerja<=10){
                 tunjangan=  0.1*(gaji*masakerja);
            }
            return tunjangan;
    }

    public double anak() {
        double tunjangananak;
        if (anak >= 3) {
            tunjangananak = 0.45 * gaji;
        } else if (anak == 2) {
            tunjangananak = 0.30 * gaji;
   
        } else {
            tunjangananak = 0.15 * gaji;
    
        }
        return tunjangananak;
    }

    public double istri() {
        double tunjanganistri;
        if (istri.equalsIgnoreCase("ada")) {
            tunjanganistri = 0.15 * gaji;
        } else {
            tunjanganistri = 0;
        }
        return tunjanganistri;
    
    }
    public void tampil(){
        System.out.println("DATA");
        System.out.println("Tunjangan istri:"+istri());
        System.out.println("Tunjangan anak :"+anak());
        System.out.println("Tunjangan Masa kerja :"+bonus()+tunjangan());
    }
}
