public class Transaction {
    private String noFaktur;
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBeli;

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double calculateTotal() {
        return hargaBarang * jumlahBeli;
    }

    public void printReceipt() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.println("TOTAL             : " + calculateTotal());
        System.out.println("+-----------------------------------------------------+");
    }
}
