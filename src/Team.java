public class Team {
    private String school;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!";
    public Team(String school, String sport, String mascot)
    {
        this.school = school;
        this.sport = sport;
        this.mascot = mascot;
    }
    public String getSchool(){
        return school;
    }

    public String getSport(){
        return sport;
    }

    public String getMascot(){
        return mascot;
    }

    }

