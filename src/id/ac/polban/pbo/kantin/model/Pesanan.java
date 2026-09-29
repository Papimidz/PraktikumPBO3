package id.ac.polban.pbo.kantin.model;

public class Pesanan {
    private static int nextNumber = 1;

    private int nomor;
    private Mahasiswa pemesan;
    private MenuItem menu;
    private int jumlah;

    public Pesanan(Mahasiswa pemesan, MenuItem menu, int jumlah) {
        this.nomor = nextNumber++;
        this.pemesan = pemesan;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public boolean dapatDiproses() {
        return jumlah > 0 && menu.isTersedia();
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public int getNomor() {
        return nomor;
    }
    public static int getJumlahPesananDibuat() {
    return nextNumber - 1;
    }
    public String ringkasan() {
    return "Pesanan #" + nomor
            + " | Pemesan: " + pemesan.getNama()
            + " | Menu: " + menu.getNama()
            + " | Jumlah: " + jumlah
            + " | Total: Rp" + hitungTotal();
    }
}