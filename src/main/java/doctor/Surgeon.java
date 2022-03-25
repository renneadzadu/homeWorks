package doctor;

public class Surgeon extends Doctor{
    private String makeIncision;
    @Override
    public void treatPatient(){
        System.out.println("April");
    }

    public String getMakeIncision(){
        return this.makeIncision;
    }
    public void setMakeIncision(String makeIncision){
        this.makeIncision = makeIncision;
    }
}
