package projects;

public class Add extends Calculator {

    @Override
    public void calcNumb() {
        System.out.println(this.getNumbers() + this.getNumbers());
    }

}