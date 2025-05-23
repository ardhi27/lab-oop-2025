package TypeRacer;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    private long startTime;
    private long endTime;
    private boolean finished = false;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped.trim();
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO (1): Hitung waktu per kata dalam milidetik
        long howLongToType = (long) ((60.0 / wpm) * 1000); // ms per kata

        startTime = System.currentTimeMillis();

        // TODO (2): Ketik setiap kata dengan jeda howLongToType
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.addWordsTyped(word);
        }

        this.addWordsTyped("(Selesai)");
        endTime = System.currentTimeMillis();
        finished = true;

        // TODO (3): Tambahkan hasil ke klasemen
        typeRacer.addResult(this);
    }
}
