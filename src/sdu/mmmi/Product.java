package sdu.mmmi;

public class Product {
    public ProductDescription productDescription;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double calcPrice(){
        return amount * productDescription.getPrice();
    }
}
