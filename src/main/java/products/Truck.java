package products;

public class Truck extends Vehicle{
    @Override
    public void calcTotal(){
        System.out.println(this.getPrice()* this.getQty());
    }

}
