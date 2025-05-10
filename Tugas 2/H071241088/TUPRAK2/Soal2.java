public class Soal2 {
    public static void main(String[] args) {
        Produk produk = new Produk ();
        produk.setID(3);
        produk.setName("gula");
        produk.setStok(2);
        produk.setHarga(10000.231);

        produk.displayInfo();
    
        
    }
}

class Produk{
    int ID;
    String nama;
    int stok;
    double harga;

    public void setName (String name){
        this.nama = name;
    }
    public void setID (int ID){
        this.ID = ID;
    }
    public void setStok (int stok){
        this.stok = stok;
    }
    public void setHarga (double harga){
        this.harga = harga;
    }
    public int getID (){
        return ID;
    }

    public String getnama(){
        return nama;
    }

    public int getstok(){
        return stok;
    }

    public double getharga(){
        return  harga;
    }

    public void setstok(int stok){
        this.stok=stok;
    }

    public boolean isAvailable(){
        return stok >0;
    }

    public void displayInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println("Tersedia: " + (isAvailable() ? "Ya" : "Tidak"));

        if (isAvailable()) {
            System.out.println("Produk tersedia di stok.");
        } else {
            System.out.println("Produk tidak tersedia di stok.");
        }
    }
}