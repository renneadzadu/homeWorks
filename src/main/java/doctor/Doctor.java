package doctor;

public class Doctor {
    private boolean worksAtHospital;


    public void treatPatient(){
        System.out.println("mark");
    }
    public boolean getWorksAtHospital(){
        return this.worksAtHospital;
    }
     public void setWorksAtHospital(boolean worksAtHospital){
        this.worksAtHospital =worksAtHospital;
     }
}
