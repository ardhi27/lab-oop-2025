public class Main {
    public static void main(String[] args) {
        Shoe proRunningShoe = new Shoe("Pro Running Shoe", 15);
        Shoe fastShoe = new Shoe("Fast Shoe", 20);
        Shoe superShoe = new Shoe("Super Shoe", 25);
        Shoe regularShoe = new Shoe("Regular Shoe", 5);

        Runner runnerA1 = new Runner("Budi", 12, proRunningShoe);
        Runner runnerA2 = new Runner("Ani", 14, fastShoe);

        Runner runnerB1 = new Runner("Dedi", 10, superShoe);
        Runner runnerB2 = new Runner("Cici", 13, regularShoe);

        Team teamA = new Team("Team A", runnerA1, runnerA2);
        Team teamB = new Team("Team B", runnerB1, runnerB2);

        System.out.println("\n=== Stage 1 : Initial Status ===");
        teamA.showTeamStatus();
        teamB.showTeamStatus();

        System.out.println("\n=== Stage 2 : Exchange shoes between team members ===");
        teamA.exchangeShoesBetweenMembers();
        teamB.exchangeShoesBetweenMembers();

        System.out.println("\n=== Stage 3 : Status after shoe exchange ===");
        teamA.showTeamStatus();
        teamB.showTeamStatus();

        System.out.println("\n=== Stage 4 : Final Score ===");
        Team.showWinner(teamA,teamB);
    }
}
