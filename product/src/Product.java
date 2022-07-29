public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price*quantity;
    }
    
    public void addProducts(int quantity_){
        quantity += quantity_;
    }

    public void removeProducts(int quantity_){
        quantity -= quantity_;
    }

    public String toString(){
        return name + ", R$ "+ String.format("%.2f", price) + ", " + quantity + " units, Total: R$ " + String.format("%.2f", totalValueInStock());
    }

}
