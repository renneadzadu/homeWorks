package projects;

public class Multiply extends Calculator {
    @Override
    public void calcNumb() {
        System.out.println(this.getNumbers() * getSecondNumb());
    }
}
