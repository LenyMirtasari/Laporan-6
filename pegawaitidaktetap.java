/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee2;

/**
 *
 * @author LENY
 */
import java.util.*;
public class pegawaitidaktetap extends Employee2 {
Scanner a=new Scanner(System.in);
    private int gajilembur,totalgaji;
    private int jamkerja;
    private double gajiPTT;

    public pegawaitidaktetap(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        super(nama, idkerja, jabatan, Status, istri, anak, tasuk);
    }

    public int gajilembur() {
     System.out.print("jam kerja = ");
        int jamkerja = a.nextInt();
        if (jamkerja > 10) {
            gajilembur = jamkerja * 10000;
        } else {
            System.out.println("Gaji total:"+gaji);
        }
        return gajilembur;
    }
    public double getgajiPTT(){
        gajiPTT=gajilembur()+gaji;
        return gajiPTT;
    }
    public void tampil4() {
        System.out.println("        Data        ");
        System.out.println("Gaji :"+gaji);
        System.out.println("Gaji Total :"+getgajiPTT());
    }
}
