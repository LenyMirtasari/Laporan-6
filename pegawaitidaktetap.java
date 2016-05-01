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
public class pegawaitidaktetap extends Employee2 {

    private int gajilembur;
    private int jamkerja;

    public pegawaitidaktetap(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        super(nama, idkerja, jabatan, Status, istri, anak, tasuk);
    }

    public int gajilembur() {
        if (jamkerja > 10) {
            gajilembur = jamkerja * 10000;
            System.out.println("gaji lembur = " + gajilembur);
        } else {
            int gajilembur1 = gaji;
            System.out.println("gaji lembur = " + gajilembur1);
        }
        return 0;
    }

    public String ampil4() {
        super.tampil();
        gajilembur();
        int totalgaji= (int) (super.gettotalgaji()+gajilembur());
        return null;
    }
}
