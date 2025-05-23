package Models;
import java.util.Calendar;
import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable{
    private String jenisSepeda;

    public Sepeda(String merk, String model){
        super(merk, model);
    }

    public void setJenisSepeda(String jenisSepeda){
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda(){
        return this.jenisSepeda;
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
            System.out.println("Sepeda melaju");
        }else{
            berhenti();
        }
    }

    @Override 
    public void berhenti(){
        System.out.println("Berhenti");
    }

    public void setJenisMotor(String jenisSepeda){
        this.jenisSepeda = jenisSepeda;
    }
    
    public String getJenisMotor(){
        return this.jenisSepeda;
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
            System.out.println("Sepeda diservis");
        }else{
            System.out.println("Sepeda diservis");
        }
   }

   @Override
   public void calculateServicePrice(double servicePrice){
        this.servicePrice = servicePrice;
   }

   @Override
   public Date getNextService(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        return calendar.getTime();
   }

}