public class MasterSword {
    int damageDasar = 30;
    boolean sudahTercabut = false;

    public boolean apakahTercabut() {
        return sudahTercabut;
    }

    public void cabutPedang(int heartLink) {
        if (heartLink >= 12) {
            this.sudahTercabut = true;
            System.out.println("Sukses! Master Sword berhasil dicabut!");
        } else {
            System.out.println("Gagal! Heart Link kurang dari 12!");
        }
    }

    public int getDamage() {
        return sudahTercabut ? damageDasar : 0;
    }

    public String serang() {
        if (sudahTercabut) {
            return "Menyerang dengan Master Sword! Damage: " + damageDasar;
        }
        return "Master Sword belum tercabut!";
    }

    public String getStatus() {
        return "=== Status Master Sword ===\n" +
               "- Damage: " + damageDasar + "\n" +
               "- Status: " + (sudahTercabut ? "Tercabut" : "Belum Tercabut");
    }
    
}

