
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        System.out.println("File name:");
        String file = scan.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {

            while(reader.hasNextLine()) {

                String row = reader.nextLine();
                String[] pieces = row.split(",");

                String teamOne = pieces[0];
                String teamTwo = pieces[1];

                //search if team exists
                boolean teamOneExists = false;
                boolean teamTwoExists = false;

                for (Team organization : teams) {
                    if (organization.getName().equals(teamOne)) {
                        teamOneExists = true;
                    }

                    if (organization.getName().equals(teamTwo)) {
                        teamTwoExists = true;
                    }
                }

                //if team(s) don't exist then create and add to list
                if (teamOneExists == false) {
                    teams.add(new Team(teamOne));
                }
                if (teamTwoExists == false) {
                    teams.add(new Team(teamTwo));
                }

                //Now teams exists, lets update their stats
                for (Team organization : teams) {
                    if (organization.getName().equals(teamOne)) {
                        organization.increaseGames();

                        if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                            organization.increaseWin();
                        } else {
                            organization.increaseLosses();
                        }
                    }

                    if (organization.getName().equals(teamTwo)) {
                        organization.increaseGames();

                        if (Integer.valueOf(pieces[3]) > Integer.valueOf(pieces[2])) {
                            organization.increaseWin();
                        } else {
                            organization.increaseLosses();
                        }
                    }

                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String teamName = scan.nextLine();

        //if user inputs team that is not on file
        boolean onFile = false;

        for (Team organization : teams) {
            if (organization.getName().equals(teamName)) {
                System.out.println("Games: " + organization.getGames());
                if (organization.getGames() > 0) {
                    System.out.println("Wins: " + organization.getWins());
                    System.out.println("Losses: " + organization.getLosses());
                    onFile = true;
                    break;
                }
            } 
        }

        if (onFile == false) {
            System.out.println("Games: 0");
        }

    }
}
