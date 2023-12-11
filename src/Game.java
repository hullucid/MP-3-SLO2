public class Game {
    private String school1;
    private String sport1;
    private String mascot1;
    private String school2;
    private String sport2;
    private String mascot2;

    private String time;
    public final static String MOTTO = "Sportsmanship!";
    public Game(String school1, String sport1, String mascot1, String school2, String mascot2, String sport2, String time)
    {
        this.school1 = school1;
        this.sport1 = sport1;
        this.mascot1 = mascot1;
        this.school2 = school2;
        this.sport2 = sport2;
        this.mascot2 = mascot2;
        this.time = time;
    }
    public String getSchool1(){
        return school1;
    }

    public String getSport1(){
        return sport1;
    }

    public String getMascot1(){
        return mascot1;
    }
    public String getSchool2(){
        return school2;
    }

    public String getSport2(){
        return sport2;
    }

    public String getMascot2(){
        return mascot2;
    }
    public String getTime(){
        return time;
    }

}


