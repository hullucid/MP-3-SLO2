import java.util.Scanner;
public class TestGame {
    public static void main(String[] args) {
        Game team2 = setTeamData();
        displayGame(team2);
    }
        public static Game setTeamData(){
            Scanner inputDevice= new Scanner(System.in);


            System.out.println("Enter school for team 1: ");
            String school1 = inputDevice.nextLine();

            System.out.println("Enter sport for team 1: ");
            String sport1 = inputDevice.nextLine();

            System.out.println("Enter mascot for team 1: ");
            String mascot1 = inputDevice.nextLine();

            System.out.println("Enter school for team 2: ");
            String school2 = inputDevice.nextLine();

            System.out.println("Enter sport for team 2: ");
            String sport2 = inputDevice.nextLine();

            System.out.println("Enter mascot for team 2: ");
            String mascot2 = inputDevice.nextLine();

            System.out.println("Enter game time: ");
            String time = inputDevice.nextLine();

            Game a = new Game(school1, mascot1, sport1, school2, mascot2, sport2,time);
            return a;
        }

        public static void displayGame(Game a){
            System.out.print("The first team is from: \n" + a.getSchool1());
            System.out.print("\n\nTheir mascot is: \n" + a.getMascot1());
            System.out.print("\n\nThey are playing: \n" + a.getSport1());
            System.out.print("\n\nThe second school is from: \n" + a.getSchool2());
            System.out.print("\n\nTheir mascot is: \n" + a.getMascot2());
            System.out.print("\n\nThey are playing: \n" + a.getSport2());
            System.out.print("\n\nThe game time for the two team is: \n" + a.getTime());
        }
    }

