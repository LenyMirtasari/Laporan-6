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
public class pegawaitetap extends Employee2{
double totalgaji,total,gajiPT;
    public pegawaitetap(String nama, String idkerja, String jabatan, String Status, String istri, int anak, int tasuk) {
        super(nama, idkerja, jabatan, Status, istri, anak, tasuk);
    }

   public double total(){
        total=gaji+masakerja();
        return total;
    }
   public double totalgaji() {
        totalgaji = gaji+istri()+anak();
        return totalgaji;
    }
public double getgajiPT(){
        double gajiPT = totalgaji()+total;
        return gajiPT;
     }
    public void tampil3(){
    System.out.println("        Data       ");
        System.out.println("gaji :"+gaji);
        System.out.println("Gaji total :"+getgajiPT());
    }
}
