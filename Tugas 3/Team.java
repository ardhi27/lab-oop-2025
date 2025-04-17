class Team {
    String teamName;
    Runner runner1;
    Runner runner2;

    Team(String teamName, Runner runner1, Runner runner2) {
        this.teamName = teamName;
        this.runner1 = runner1;
        this.runner2 = runner2;
    }

    void exchangeShoesBetweenMembers() {
        System.out.println("\n[" + teamName + "] Team members are exchanging shoes...");
        runner1.exchangeShoes(runner2);
        System.out.println("Shoe exchange successful!");
    }

    void showTeamStatus() {
        System.out.println("\n=== Team Status: " + teamName + " ===");
        System.out.println(runner1.name + " - " + runner1.getTotalSpeed() + " total speed");
        runner1.mainShoe.showDetails();
        System.out.println(runner2.name + " - " + runner2.getTotalSpeed() + " total speed");
        runner2.mainShoe.showDetails();
    }

    int getTeamScore() {
        return (runner1.getTotalSpeed() + runner2.getTotalSpeed()) / 2;
    }

    static void showWinner(Team teamA, Team teamB) {
        int scoreA = teamA.getTeamScore();
        int scoreB = teamB.getTeamScore();
    
        System.out.println("Score " + teamA.teamName + ": " + scoreA);
        System.out.println("Score " + teamB.teamName + ": " + scoreB);
    
        if (scoreA > scoreB) {
            System.out.println(teamA.teamName + " is the winner!");
        } else if (scoreB > scoreA) {
            System.out.println(teamB.teamName + " is the winner!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    
}
