class Tim {
    String namaTim;
    Pelari pelari1;
    Pelari pelari2;

    Tim(String namaTim, Pelari pelari1, Pelari pelari2) {
        this.namaTim = namaTim;
        this.pelari1 = pelari1;
        this.pelari2 = pelari2;
    }

    void tukarSepatuAntarAnggota() {
        System.out.println("\n[" + namaTim + "] Anggota tim sedang menukar sepatu...");
        pelari1.tukarSepatu(pelari2);
        System.out.println("Pergantian sepatu berhasil!");
    }

    void munculkanStatusTim() {
        System.out.println("\n=== Status Tim: " + namaTim + " ===");
        System.out.println(pelari1.nama + " - " + pelari1.getKecepatanTotal() + " kecepatan total");
        pelari1.sepatuUtama.munculkanDetail();
        System.out.println(pelari2.nama + " - " + pelari2.getKecepatanTotal() + " kecepatan total");
        pelari2.sepatuUtama.munculkanDetail();
    }

    int getSkorTim() {
        return (pelari1.getKecepatanTotal() + pelari2.getKecepatanTotal()) / 2;
    }

    //buatlah fungsi untuk menunjukkan status kemenangan tim
    //Fungsi void
    // public void getWinnerStatus(){
    //     if (skorTimA > skorTimB){
    //         System.out.println(timA.namaTim+ " adalah pemenangnya");
    //     }else if(skorTimB > skorTimA){
    //         System.out.println(timB.namaTim+" adalah pemenangnya");
    //     }else{
    //         System.out.println("Hasil seri");
    //     }

    // }

    
}