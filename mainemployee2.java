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
public class mainemployee2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String pil;
        do {
            System.out.print("apakah anda ingin mengisi data? (Y/T) : ");
            pil = a.next();
            System.out.print("Nama                  : ");
            String nama = a.next();
            System.out.print("id kerja              : ");
            String idkerja = a.next();
            System.out.print("jabatan (PNS/NON-PNS) : ");
            String jabatan = a.next();
            System.out.print("status (Manager/Pegawai Tetap(PT)/Pegawai Tidak Tetap(PTT))    : ");
            String status = a.next();
            System.out.print("istri (ADA/TIDAK)     : ");
            String istri = a.next();
            System.out.print("jumlah anak           : ");
            int anak = a.nextInt();
            System.out.print("Tahun masuk           : ");
            int tasuk = a.nextInt();
            System.out.println("===============================================================");
            if (status.equalsIgnoreCase("manager")) {
                manager c = new manager(nama, idkerja, jabatan, status, istri, anak, tasuk);
                c.tampil();
                c.tampil2();
            }
            if (status.equalsIgnoreCase("PT")) {
                pegawaitetap d = new pegawaitetap(nama, idkerja, jabatan, status, istri, anak, tasuk);
                d.tampil();
                d.tampil3();
            }
            if (status.equalsIgnoreCase("PTT")) {
                pegawaitidaktetap e = new pegawaitidaktetap(nama, idkerja, jabatan, status, istri, anak, tasuk);               
                e.tampil4();
            }
        } while (pil.equalsIgnoreCase("t"));
    }
    
}
