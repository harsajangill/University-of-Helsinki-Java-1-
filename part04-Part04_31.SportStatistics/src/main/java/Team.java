public class Team {
    private int games;
    private int wins;
    private int losses;
    private String name;

    public Team (String nameOfTeam) {
        this.name = nameOfTeam;
        this.games = 0;
        this.wins = 0;
        this. losses = 0;
    }

    public void increaseWin(){
        wins++;
    }

    public void increaseGames(){
        games++;
    }

    public void increaseLosses(){
        losses++;
    }

    public int getGames() {
        return games;
    }

    public int getWins(){
        return wins;
    }

    public int getLosses(){
        return losses;
    }

    public String getName(){
        return name;
    }
}
