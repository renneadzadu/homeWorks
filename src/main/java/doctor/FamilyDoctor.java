package doctor;

public class FamilyDoctor extends Doctor{
    private String makeHouseCalls;
    public String givesAdvice;

    public String getMakeHouseCalls(){
        return this.makeHouseCalls;
    }
    public void setMakeHouseCalls(String makeHouseCalls){
        this.makeHouseCalls = makeHouseCalls;
    }

    public String getGivesAdvice() {
        return this.givesAdvice;
    }
    public void setGivesAdvice(String givesAdvice){
        this.givesAdvice = givesAdvice;
    }
}

