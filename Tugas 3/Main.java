public class Main {
    public static void main(String[] args) {
        Equipment gearMikasa = new Equipment("ODM Gear - Mikasa", 80);
        Equipment gearEren = new Equipment("ODM Gear - Eren", 90);

        ScoutMember mikasa = new ScoutMember("Mikasa", 100, gearMikasa);
        ScoutMember eren = new ScoutMember("Eren", 100, gearEren);

        mikasa.attack(eren);

        eren.repairEquipment();
        eren.attack(mikasa);

    }
}
