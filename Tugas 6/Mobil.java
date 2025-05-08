import java.util.Calendar;
import java.util.Date;

public class Mobil extends Kendaraan implements IBergerak, IServiceable{

    private int doorTotal;
    private double machineCapacity;
    private int seatTotal;
    private String fuel;
    private double speed;
    private boolean condition;
    public double servicePrice;
    
    public Mobil(String merk, String model){
        super(merk, model);
    }

    public void setCondition(boolean condition){
        this.condition = condition;
    }

    public int getDoorTotal() {
        return doorTotal;
    }
    
    public void setDoorTotal(int doorTotal) {
        this.doorTotal = doorTotal;
    }
    
    public double getMachineCapacity() {
        return machineCapacity;
    }
    
    public void setMachineCapacity(double machineCapacity) {
        this.machineCapacity = machineCapacity;
    }
    
    public int getSeatTotal() {
        return seatTotal;
    }
    
    public void setSeatTotal(int seatTotal) {
        this.seatTotal = seatTotal;
    }
    
    public String getFuel() {
        return fuel;
    }
    

    public void setFuel(String fuel) {
        this.fuel = fuel;
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
            System.out.println("Car Is Starting");
        }
    }

    @Override 
    public void berhenti(){
        if(getKecepatan() == 0 ){
            System.out.println("Car is stopping");
        }
    }

    @Override
    public void checkCondition(boolean condition){
        this.condition = condition;
    }

    public boolean getCondition(){
        return this.condition;
    }

    @Override
    public void doService(){
        if(getCondition() == false){
            System.out.println("Car is getting some service!");
        }else{
            System.out.println("Car is good!");

        }
    }

    @Override 
    public void calculateServicePrice(double servicePrice){
        this.servicePrice = servicePrice * 2;
    }

    @Override 
    public Date getNextService(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 5);
        return calendar.getTime();
    }

}