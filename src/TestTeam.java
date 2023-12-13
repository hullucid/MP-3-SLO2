import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) { //main method
        Team team1 = setTeamData();
        display(team1);
    }
    public static Team setTeamData(){ //method for getting teams info
        Scanner inputDevice= new Scanner(System.in);


        System.out.println("Enter school: ");
        String school = inputDevice.nextLine();

        System.out.println("Enter sport: ");
        String sport = inputDevice.nextLine();

        System.out.println("Enter mascot: ");
        String mascot = inputDevice.nextLine();

        Team s = new Team(school, mascot, sport);
        return s;
    }
    public static void display(Team s){ //method for school info display 
        System.out.print("School: " + s.getSchool());
        System.out.print("\n\nMascot: " + s.getMascot());
        System.out.print("\n\nSport: " + s.getSport());
    }
    }


