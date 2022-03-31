package products;

public class Horse extends Vehicle implements IRideable{
    @Override
    public void calcTotal(){
        System.out.println(this.getPrice()* this.getQty());
    }

@Override
public void printExperience(){
        System.out.println("fast and slow");

    }
}

