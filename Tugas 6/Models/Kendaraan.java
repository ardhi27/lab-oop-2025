package Models;
import java.time.Year;

public abstract class Kendaraan {
    public String id;
    public String merk;
    public String model;
    private int tahunProduksi;
    private String warna;
    protected double speed;
    public   double servicePrice;
    protected boolean condition;
    // private boolean condition;

    public Kendaraan(String merk, String model){
        this.merk = merk;
        this.model = model;
    }

    // public void setCondition(boolean condition){
    //     this.condition = condition;
    // }

    // public boolean getCondition(){
    //     return this.condition;
    // }

    public void setId(String id){
        this.id = id;
    }

    public void setYearProduction(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public void setColor(String warna){
        this.warna = warna;
    }

    public String getId(){
        return this.id;
    }

    public String getColor(){
        return this.warna;
    }

    public Double calculateTax(){

        int yearNow = Year.now().getValue();
        int year = yearNow - tahunProduksi;

        if(year >= 15){
            return 1.5;
        }else if(year >= 10){
            return 1.0;
        }else if(year >= 5){
            return 0.5;
        }else{
            return 0.0;
        }

    }

    //What is getTipeKendaraan???????

    public String getTipeKendaraan(){
        return "vehicle";
    }
}