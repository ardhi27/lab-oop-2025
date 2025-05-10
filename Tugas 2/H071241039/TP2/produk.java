public class produk {
     int idProduk;
     String nama;
     int stok;
     double harga;

    public void setId(int inputIdProduk){
        idProduk = inputIdProduk;
    }

    public void setName(String inputName){
        nama = inputName;
    }

    public void setStok(int inputStok){
        stok = inputStok;
    }

    public void setPrice(double inputPrice){
        harga = inputPrice;
    }

    public String getName(){
        return nama;
    }

    public int getIdProduct(){
        return idProduk;
    } 

    public double getPrice(){
        return harga;
    }

    public int getStock(){
        return stok;
    }

    public boolean cekStok() {
        return stok > 0;
    }
    public String tampilkanInfo() {
        String status = cekStok() ? "tersedia kakak" : "habis kakak";
        return "ID: " + idProduk + ", nama: " + nama + ", stok: "+ stok + ", harga: " + harga + ", status: " + status;
    }

    public static void main(String[] args) {
        produk produk1 = new produk();
        produk produk2 = new produk();

        produk1.setName("laptop");
        produk1.setId(123);
        produk1.setStok(2);
        produk1.setPrice(7000);
        System.out.println(produk1.tampilkanInfo());
        System.out.println(produk2.tampilkanInfo());
    }
}

