package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        List<Member> members = new ArrayList<>();
        List<LibraryItem> items = new ArrayList<>();

        while (true) {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");

            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Jenis item (book/dvd): ");
                    String type = scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Is Borrowed (true/false): ");
                    boolean isBorrowed = Boolean.parseBoolean(scanner.nextLine());

                    if (type.equalsIgnoreCase("book")) {
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        Book book = new Book(title, id, isBorrowed, author);
                        items.add(book);
                        System.out.println(library.addItem(book));
                    } else if (type.equalsIgnoreCase("dvd")) {
                        System.out.print("Durasi (menit): ");
                        int duration = Integer.parseInt(scanner.nextLine());
                        DVD dvd = new DVD(title, id, isBorrowed, duration);
                        items.add(dvd);
                        System.out.println(library.addItem(dvd));
                    }
                    break;

                case 2:
                    System.out.print("Nama anggota: ");
                    String name = scanner.nextLine();
                    System.out.print("ID anggota: ");
                    String memberId = scanner.nextLine();
                    Member member = new Member(name, memberId);
                    members.add(member);
                    System.out.println("Anggota berhasil ditambahkan");
                    break;

                case 3:
                    System.out.print("ID Anggota: ");
                    String borrowMemberId = scanner.nextLine();
                    Member borrowMember = findMemberById(members, borrowMemberId);
                    if (borrowMember == null) {
                        System.out.println("Anggota tidak ditemukan. Silakan coba lagi.");
                        break;
                    }

                    System.out.print("ID Item: ");
                    int borrowItemId = Integer.parseInt(scanner.nextLine());
                    LibraryItem borrowItem = findItemById(items, borrowItemId);
                    if (borrowItem == null) {
                        System.out.println("Item tidak ditemukan. Silakan coba lagi.");
                        break;
                    }

                    System.out.print("Durasi peminjaman (hari): ");
                    int days = Integer.parseInt(scanner.nextLine());
                    try {
                        System.out.println(borrowMember.borrow(borrowItem, days));
                        library.logger.logActivity(borrowItem.getDescription() + " dipinjam oleh " + borrowMember.getName());
                    } catch (IllegalStateException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("ID Anggota: ");
                    String returnMemberId = scanner.nextLine();
                    Member returnMember = findMemberById(members, returnMemberId);
                    if (returnMember == null) {
                        System.out.println("Anggota tidak ditemukan. Silakan coba lagi.");
                        break;
                    }

                    System.out.print("ID Item: ");
                    int returnItemId = Integer.parseInt(scanner.nextLine());
                    LibraryItem returnItem = findItemById(items, returnItemId);
                    if (returnItem == null) {
                        System.out.println("Item tidak ditemukan. Silakan coba lagi.");
                        break;
                    }

                    System.out.print("Hari keterlambatan: ");
                    int daysLate = Integer.parseInt(scanner.nextLine());
                    try {
                        System.out.println(returnMember.returnItem(returnItem, daysLate));
                        library.logger.logActivity(returnItem.getDescription() + " dikembalikan oleh " + returnMember.getName());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println(library.getLibraryStatus());
                    break;

                case 6:
                    System.out.println(library.getAllLogs());
                    break;

                case 7:
                    System.out.print("ID Anggota: ");
                    String listMemberId = scanner.nextLine();
                    Member listMember = findMemberById(members, listMemberId);
                    if (listMember == null) {
                        System.out.println("Anggota tidak ditemukan. Silakan coba lagi.");
                        break;
                    }
                    System.out.println(listMember.getBorrowedItems());
                    break;

                case 8:
                    System.out.println("Keluar...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Menu tidak valid");
            }
        }
    }

    public static Member findMemberById(List<Member> members, String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public static LibraryItem findItemById(List<LibraryItem> items, int itemId) {
        for (LibraryItem item : items) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        return null;
    }
}