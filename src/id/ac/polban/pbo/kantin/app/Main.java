package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Pesanan;
public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("251511010", "Dzia Azizi Hamid");
        Mahasiswa m2 = new Mahasiswa("251511011", "Asep Soleh");

        System.out.println(m1.getNim() + " - " + m1.getNama());
        System.out.println(m2.getNim() + " - " + m2.getNama());

        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);

        kopi.tandaiHabis();

        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m1, nasi, 1);

        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());
        System.out.println("Nomor P1: " + p1.getNomor());
        System.out.println("Nomor P2: " + p2.getNomor());
        System.out.println("Nomor P3: " + p3.getNomor());
        System.out.println("Jumlah pesanan dibuat: " + Pesanan.getJumlahPesananDibuat());
        System.out.println(p1.ringkasan());
        System.out.println(p2.ringkasan());
        System.out.println(p3.ringkasan());
        Pesanan p4 = new Pesanan(m1, nasi, 0);

        System.out.println("P4 dapat diproses: " + p4.dapatDiproses());
    }
}
