package Models;

public class DVD extends LibraryItem {
    private int duration; // Durasi dalam menit

    public DVD(String title, int itemId, boolean isBorrowed, int duration) {
        super(title, itemId, isBorrowed);
        this.duration = duration;
    }

    @Override
    public String getDescription() {
        return "DVD: " + title + ", durasi " + duration + " menit, ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item sudah dipinjam.");
        }
        if (days > 7) {
            throw new IllegalArgumentException("Maksimal peminjaman 7 hari.");
        }
        isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 25000; // Denda 25.000 per hari keterlambatan
    }
}
