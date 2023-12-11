import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
        Team team1 = setTeamData();
        display(team1);
    }
    public static Team setTeamData(){
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
    public static void display(Team s){
        System.out.print("School: " + s.getSchool());
        System.out.print("\n\nMascot: " + s.getMascot());
        System.out.print("\n\nSport: " + s.getSport());
    }
    }


