package products;

public class Car extends Vehicle {
    @Override
    public void calcTotal(){
        System.out.println(this.getPrice()* this.getQty());
    }
}
