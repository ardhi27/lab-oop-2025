public class Skateboard extends Kendaraan implements IBergerak {
    private String tipeDeck;
    private double panjangDeck;

    public Skateboard(String merek, String model) {
        super(merek, model);
    }

    public String getTipeDeck() {
        return tipeDeck;
    }

    public void setTipeDeck(String tipeDeck) {
        this.tipeDeck = tipeDeck;
    }

    public double getPanjangDeck() {
        return panjangDeck;
    }

    public void setPanjangDeck(double panjangDeck) {
        this.panjangDeck = panjangDeck;
    }

    @Override
    public boolean mulai() {
        this.bergerak = true;
        return bergerak;
    }

    @Override
    public boolean berhenti() {
        bergerak = false;
        return !bergerak;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Skateboard";
    }
}
