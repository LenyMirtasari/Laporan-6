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
public class manager extends Employee2 {

    private double tunjangan;
    static final int gaji = 5000000;
    public manager(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        super(nama, idkerja, jabatan, Status, istri, anak, tasuk);
    }

    public double tunjanganjabatan() {
        tunjangan = (double) (0.1 * super.gettotalgaji() );
        System.out.println("tunjangan jabatan adalah : " + tunjangan);
        return 0;
        
    }

    public String tampil2() {
        super.tampil();
        tunjanganjabatan();
        int totalgaji= (int) (super.gettotalgaji()+tunjanganjabatan());
        System.out.println("Total Gaji Manager : "+totalgaji);
        return null;
    }

}
