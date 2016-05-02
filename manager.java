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
    private double gajimeneger;
    private double tunjangan,tunjanganjabatan,total,totalgaji;
    static final int gaji = 5000000;
    public manager(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        super(nama, idkerja, jabatan, Status, istri, anak, tasuk);
    }

    public double tunjanganjabatan() {
        tunjanganjabatan =0.1*gaji+bonus()+tunjangan();
        return tunjanganjabatan;
        
    }
    public double total(){
        total=gaji*(bonus()+tunjangan());
        return total;
    }
     public double gettotalgaji() {
        totalgaji = gaji+istri()+anak();
        return totalgaji;
    }
     public double getgajiMeneger(){
        double gajimeneger = totalgaji+total+tunjanganjabatan;
        return gajimeneger;
     }

    public void tampil2() {
        System.out.println("        Data        ");
        System.out.println("Tunjangan jabatan:"+tunjanganjabatan());
        System.out.println("gaji pokok                  : "+gaji);
        System.out.println("gaji total                  : "+getgajiMeneger());
    }

}
