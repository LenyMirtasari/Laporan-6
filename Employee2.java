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
    private int totalgaji;
    static final int gaji = 5000000;

    public Employee2(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        this.nama = nama;
        this.idkerja = idkerja;
        this.jabatan = jabatan;
        this.Status = Status;
        this.istri = istri;
        this.anak = anak;
        this.tasuk = tasuk;

    }

    public double masakerja() {
        int masakerja=2016-tasuk;
        double bonus=0;
        double tunjangan=0;
        if (masakerja>10){
            bonus= 0.1*gaji*masakerja;
            tunjangan=  0.1*gaji*masakerja;
            System.out.println("bonus masa kerja        : "+bonus);
            System.out.println("tunjangan masa kerja    : "+tunjangan);
        }
        else if(masakerja>=6&&masakerja<=10){
            bonus=0.05*gaji*masakerja;
            System.out.println("bonus masa kerja        : "+bonus);
        }
        return tunjangan+bonus;

    }

    public double anak() {
        double tunjangananak;
        if (anak >= 3) {
            tunjangananak = 0.45 * gaji;
            System.out.println("tunjangan anak adalah   : " + tunjangananak);
        } else if (anak == 2) {
            tunjangananak = 0.30 * gaji;
            System.out.println("tunjangan anak adalah   : " + tunjangananak);
        } else {
            tunjangananak = 0.15 * gaji;
            System.out.println("tunjangan anak adalah   : " + tunjangananak);
        }
        return tunjangananak;
    }

    public double istri() {
        double tunjanganistri;
        if (istri.equalsIgnoreCase("ada")) {
            tunjanganistri = 0.15 * gaji;
            System.out.println("tunjangan istri adalah  : " + tunjanganistri);
        } else {
            tunjanganistri = 0;
            System.out.println("tunjangan istri adalah  : " + tunjanganistri);
        }
        return tunjanganistri;
    }

    public double gettotalgaji() {
        int gajitotal = (int) (istri() + anak() + masakerja() + gaji);
        return 0;
    }

    public void tampil() {
        double gajitot = istri() + anak() + masakerja() + gaji;

        System.out.println("gaji total                  : " + gajitot);

    }

}
