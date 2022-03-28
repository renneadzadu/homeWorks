package projects;

public class Square extends Calculator{
    @Override
    public void calcNumb() {
        System.out.println(this.getNumbers() * this.getNumbers());
    }
}
