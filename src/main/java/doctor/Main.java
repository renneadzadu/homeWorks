package doctor;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.setMakeIncision("yike!");
        surgeon.treatPatient();
        System.out.println(surgeon.getMakeIncision());

        Doctor doctor = new Doctor();
        doctor.setWorksAtHospital(true);
        doctor.treatPatient();
        System.out.println(doctor.getWorksAtHospital());

        FamilyDoctor familyDoctor = new FamilyDoctor();{
            familyDoctor.setMakeHouseCalls("Hello, this is Doctor mark,i am calling to let you know that you must");
            familyDoctor.setGivesAdvice("take three vitamins per day");
            System.out.println(familyDoctor.getMakeHouseCalls() + " " + familyDoctor.getGivesAdvice());


        }
    }
}
