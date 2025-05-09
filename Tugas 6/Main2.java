import Models.*;

public class Main2 {
    public static void main(String[] args){


        // Mobil
        Mobil mobil = new Mobil("BMW", "4-Wheels Drive");
        mobil.setColor("Black");
        mobil.setDoorTotal(4);
        mobil.setFuel("Electric Vehicle");
        mobil.setKecepatan(100.2);
        mobil.setSeatTotal(4);
        mobil.setYearProduction(2002);
        mobil.setMachineCapacity(200.1);
        mobil.setId("U123");
        mobil.setCondition(true); 
        mobil.calculateServicePrice(4000.2);

        System.out.println("KENDARAAN MOBIL");
        System.out.println("==============================================");
        System.out.println("Nama Kendaraan : " + mobil.merk);
        System.out.println("Nama Model : " + mobil.model);
        System.out.println("Warna Kendaraan : " + mobil.getColor());
        System.out.println("Jumlah Pintu : " + mobil.getDoorTotal());
        System.out.println("Jenis Bahan Bakar : " + mobil.getFuel());
        System.out.println("ID Kendaraan : " + mobil.id);
        System.out.println("Kecepatan Mobil : " + mobil.getKecepatan());
        System.out.println("Condition : " + (mobil.getCondition() ? "Mobil Baik-Baik Saja" : "Mobil Kurang Baik"));
        mobil.doService();
        System.out.println("Service Price : " + mobil.servicePrice);
        System.out.println("Next Service : " + mobil.getNextService());

        // Motor
        Motor motor = new Motor("Kawasaki", "H2R");
        motor.setColor("Green");
        motor.setJenisMotor("Sport");
        motor.setKapasitasTangki(17.0);
        motor.setKecepatan(100.2);
        motor.setYearProduction(2002);
        motor.setJenisSuspensi("Inverted Fork");
        motor.setId("U123");
        motor.checkCondition(true);
        motor.calculateServicePrice(4000.2);

        System.out.println("KENDARAAN Motor");
        System.out.println("==============================================");
        System.out.println("Nama Kendaraan : " + motor.merk);
        System.out.println("Nama Model : " + motor.model);
        System.out.println("Jenis Suspensi Motor : " + motor.getTipeSuspensi());
        System.out.println("Kapasitas Tangki Motor : " + motor.getKapasitasTangki());
        System.out.println("Condition : " + (motor.getCondition() ? "Motor Baik-Baik Saja" : "Motor Kurang Baik"));
        motor.doService();
        System.out.println("Service Price : " + motor.servicePrice);
        System.out.println("Next Service : " + motor.getNextService());
        System.out.println("Kecepatan " + motor.merk + " adalah " + motor.getKecepatan());

        //Sepeda
        Sepeda sepeda = new Sepeda("Polygon", "BMX");
     sepeda.setJenisMotor("Casual");
     sepeda.checkCondition(true);
     sepeda.calculateServicePrice(4000.2);

        System.out.println("KENDARAAN Sepeda");
        System.out.println("==============================================");
        System.out.println("Nama Kendaraan : " + sepeda.merk);
        System.out.println("Nama Model : " + sepeda.model);
        System.out.println("Jenis Sepeda : " + sepeda.getJenisSepeda());
        System.out.println("Condition" + (sepeda.getCondition() ? "Sepeda dalam kondisi yang baik" : "Sepeda dalam kondisi yang kurang baik"));
        sepeda.doService();       
        System.out.println("Service Price : " + sepeda.servicePrice);
        System.out.println("Next Service : " + sepeda.getNextService());

    }
}