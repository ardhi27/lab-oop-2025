class Sepatu {
    String merkSepatu;
    int kecepatanBonus;
    
    Sepatu(){
        this.merkSepatu = "Sepatu Biasa";
        this.kecepatanBonus = 5;
    }

    Sepatu(String merkSepatu, int kecepatanBonus){
        this.merkSepatu = merkSepatu;
        this.kecepatanBonus = kecepatanBonus;
    }

    void munculkanDetail(){
        System.out.println("Merk Sepatu: "+merkSepatu+", Bonus Kecepatan "+kecepatanBonus);
    }
}