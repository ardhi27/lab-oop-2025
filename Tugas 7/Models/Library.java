package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    public List<LibraryItem> items;
    public List<Member> members;
    public LibraryLogger logger;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.title + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        for (LibraryItem item : items) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        throw new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan.");
    }

    public String getLibraryStatus() {
        StringBuilder status = new StringBuilder();
        for (LibraryItem item : items) {
            status.append(item.getDescription())
                  .append(" - ")
                  .append(item.isBorrowed ? "Dipinjam" : "Tersedia")
                  .append("\n");
        }
        return status.toString();
    }

    public String getAllLogs() {
        return logger.getLogs();
    }
}
