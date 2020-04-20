package sdu.mmmi;

public class Product {
    private int amount;
    private ProductDescription productDescription;

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
