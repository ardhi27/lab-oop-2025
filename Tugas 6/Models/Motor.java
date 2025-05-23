package Models;
import java.util.Calendar;
import java.util.Date;



public class Motor extends Kendaraan implements IBergerak, IServiceable{
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;

    public Motor(String merk, String model){
        super(merk, model);
    }

    @Override
    public void setKecepatan(Double speed){
        this.speed = speed;
    }

    @Override
    public double getKecepatan(){
        return this.speed;
    }

    @Override
    public void mulai(){
        if(getKecepatan() > 0){
            System.out.println("Motor melaju");
        }else{
            berhenti();
        }
    }

    @Override 
    public void berhenti(){
        System.out.println("Berhenti");
    }

    public void setJenisMotor(String jenisMotor){
        this.jenisMotor = jenisMotor;
    }
    
    public String getJenisMotor(){
        return this.jenisMotor;
    }

    public void setKapasitasTangki(double kapasitasTangki){
        this.kapasitasTangki = kapasitasTangki;
    }  

    public double getKapasitasTangki(){
        return this.kapasitasTangki;
    }

    public void setJenisSuspensi(String tipeSuspensi){
        this.tipeSuspensi = tipeSuspensi;
    }

    public String getTipeSuspensi(){
        return this.tipeSuspensi;
    }
    

    public boolean getCondition(){
        return this.condition;
    }

    @Override
   public void checkCondition(boolean condition){
        this.condition = condition;
   }

   @Override
   public void doService(){
        if(getCondition() == true){
            System.out.println("Motor diservis");
        }else{
            System.out.println("Motor diservis");
        }
   }

   @Override
   public void calculateServicePrice(double servicePrice){
        this.servicePrice = servicePrice * 3;
   }

   @Override
   public Date getNextService(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        return calendar.getTime();
   }

}