package TypeRacer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> rareStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    // Bisa diganti sesuai keinginan masing-masing
    private String[] wordsToTypeList = {
        "Di Bikini Bottom ada Spongebob Squarepants, dia memang keren suka main drumband",
        "Dia jadi koki masaknya krabby patty, menjalani hari hidup bersama Garry",
        "Ayo sama-sama sebutkan nama-nama makhluk dalam sana di Bikini Bottom jaya",
        "Namun ada juga namanya Patrick Star, walau dia cetar tapi hidupnya liar",
        "Tinggal dalam batu tapi suka membantu, sayang hanya satu otaknya itu buntu"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4) - Menambahkan hasil ke klasemen
    public synchronized void addResult(Typer typer) {
        long durationInSeconds = (typer.getEndTime() - typer.getStartTime()) / 1000;
        rareStanding.add(new Result(typer.getBotName(), durationInSeconds));
    }

    // TODO (5) - Menampilkan klasemen akhir
    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        Collections.sort(rareStanding, Comparator.comparingLong(Result::getDuration));

        int position = 1;
        for (Result result : rareStanding) {
            System.out.println(position + ". " + result.getName() + " = " + result.getDuration() + " detik");
            position++;
        }
    }

    // TODO (6) - Menjalankan perlombaan
    public void startRace() {
        for (Typer typer : rareContestant) {
            typer.setWordsToType(wordsToType);
            typer.start(); // gunakan start() karena Typer adalah Thread
        }
    }

    // TODO (7) dan (8) - Menampilkan progres dan klasemen akhir
    public void displayRaceStandingPeriodically() throws InterruptedException {
        boolean allFinished = false;

        while (!allFinished) {
            System.out.println("\nTyping Progress ...");
            System.out.println("===================");

            for (Typer typer : rareContestant) {
                System.out.println(typer.getBotName() + " => " + typer.getWordsTyped());
            }

            Thread.sleep(2000); // tunggu 2 detik

            allFinished = rareContestant.stream().allMatch(Typer::isFinished);
        }

        // Setelah semua selesai, tampilkan klasemen akhir
        printRaceStanding();
    }
}
