package projects;

public class Divide extends Calculator{
    @Override
    public void calcNumb() {
        System.out.println(this.getNumbers() / getSecondNumb());
}
}