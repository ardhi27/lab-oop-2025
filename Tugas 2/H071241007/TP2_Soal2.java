
class Barang{

   private  String id;
    String nama;
    int stok;
    double harga;
    
    public boolean isTersedia() {
        return stok > 0;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }
    public double getharga (double harga) {
        return harga;
    }
    public void setStok(int stok) {
        this.stok= stok;
    }
    public int getStok (int stok) {
        return stok;
    }
    public void setID(String id) {
        this.id=id;
    }
    public String getID (String id) {
        return id;
    }
    public void setNama(String nama) {
        this.nama=nama;
    }
    public String getNama (String nama) {
        return nama;
    }
    public void tampilData() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Tersedia: " + (isTersedia() ? "Ya" : "Tidak"));
    }

}

public class TP2_Soal2 {
   
    public static void main(String[] args) {
        Barang p = new Barang();
        p.setID("001");
        p.setNama("KTP");
        p.setStok(100);
        p.setharga(3000);
        
        p.tampilData();

        // Barang q = new Barang();
        // q.id = "002";
        // q.nama = "KTP";
        // q.stok = 0;
        // q.harga = 3000;
        
        // q.tampilData();

        // Barang z = new Barang();
        // z.id = "003";
        // z.nama = "SIM";
        // z.stok = 999;*
        // z.harga = 400000;
        
        // z.tampilData();
    }
}
