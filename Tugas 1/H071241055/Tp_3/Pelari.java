public class Pelari {
    String nama;
    int kecepatanDasar;
    Sepatu sepatuUtama;
    
    Pelari(){
        this.nama = "Unknown";
        this.kecepatanDasar = 10;
        this.sepatuUtama = new Sepatu();
    }

    Pelari(String nama, int kecepatanDasar, Sepatu sepatuUtama){
        this.nama = nama;
        this.kecepatanDasar = kecepatanDasar;
        this.sepatuUtama = sepatuUtama;
    }

    int getKecepatanTotal(){
            return kecepatanDasar + sepatuUtama.kecepatanBonus;
    }

    void lari(){
        System.out.println(nama + " sedang berlari dengan kecepatan total: "+ getKecepatanTotal());
    }

    void tukarSepatu(Pelari teman){
        System.out.println(this.nama + " menukar sepatu dengan " + teman.nama);
        Sepatu temp = this.sepatuUtama;
        this.sepatuUtama = teman.sepatuUtama;
        teman.sepatuUtama = temp;
    }
}

