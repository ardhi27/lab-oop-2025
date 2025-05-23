package DownloadFile;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    static int successfulDownloads = 0;
    static int completedDownloads = 0;
    static int totalFiles;
    static boolean allDone = false;
    static ArrayList<Result> results = new ArrayList<>();

    // TODO (1) - Merekam hasil download
    public static synchronized void recordResult(int fileId, int duration, String threadName) {
        String status = duration <= 2 ? "Success" : "Timeout";
        if (status.equals("Success")) {
            successfulDownloads++;
        }
        completedDownloads++;
        results.add(new Result(fileId, duration, threadName, status));
    }

    public static void main(String[] args) {

        // TODO (2) - Minta input jumlah file dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of files to download: ");
        totalFiles = scanner.nextInt();
        scanner.close();

        // TODO (3) - Buat executor
        ExecutorService downloadExecutor = Executors.newFixedThreadPool(3);
        ExecutorService uiExecutor = Executors.newSingleThreadExecutor();

        // Mencatat waktu mulai
        long startTime = System.currentTimeMillis();

        // TODO (4) - Menampilkan progres download tiap detik
        uiExecutor.submit(() -> {
            int time = 0;
            while (!allDone) {
                System.out.println("Downloading files... (" + time + "s)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
                time++;
            }
        });

        // TODO (5) - Simulasi download untuk setiap file
        Random rand = new Random();
        for (int i = 1; i <= totalFiles; i++) {
            int fileId = i;
            downloadExecutor.submit(() -> {
                int duration = rand.nextInt(3) + 1; // durasi 1-3 detik
                try {
                    Thread.sleep(duration * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String threadName = Thread.currentThread().getName();
                recordResult(fileId, duration, threadName);
            });
        }

        // TODO (6) - Tutup downloadExecutor agar tidak menerima tugas baru
        downloadExecutor.shutdown();

        // TODO (7) - Tunggu semua tugas download selesai
        try {
            downloadExecutor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO (8) - Tandai semua selesai dan tutup uiExecutor
        allDone = true;
        uiExecutor.shutdown();
        try {
            uiExecutor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hitung waktu total
        long endTime = System.currentTimeMillis();
        int totalTime = (int) ((endTime - startTime) / 1000);

        // Header tabel
        System.out.println("--------------------------------------------------");
        System.out.println("                  Detailed Report                 ");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s | %-18s | %-8s | %-8s%n",
                "File ID", "Thread", "Duration", "Status");
        System.out.println("--------------------------------------------------");

        // Urutkan hasil berdasarkan fileId
        results.sort(Comparator.comparingInt(r -> r.fileId));

        for (Result r : results) {
            System.out.printf("%-8d | %-18s | %-8s | %-8s%n",
                    r.fileId, r.threadName, r.duration + "s", r.status);
        }

        // Ringkasan
        System.out.println("--------------------------------------------------");
        System.out.println("                     Summary                      ");
        System.out.println("--------------------------------------------------");
        System.out.println("Successful downloads : " + successfulDownloads);
        System.out.println("Failed downloads     : " + (totalFiles - successfulDownloads));
        System.out.printf("Total time           : %ds%n", totalTime);
    }
}
