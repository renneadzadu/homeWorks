package projects;

public class Subtract extends Calculator {
    @Override
    //public void calcNumb() {
       // System.out.println(Math.subtractExact(30, 10));

        public void calcNumb() {
            System.out.println(this.getNumbers() - getSecondNumb());

        }
    }
//}