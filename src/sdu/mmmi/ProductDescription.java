package sdu.mmmi;

public class ProductDescription {
    private int productID;
    private String description;
    private double price;
    private int defaultAmount;
    private int amountAvailable;

    public ProductDescription (int ID, String description, double price, int defaultAmount, int amountAvailable){
        this.productID = ID;
        this.description = description;
        this.price = price;
        this.defaultAmount = defaultAmount;
        this.amountAvailable = amountAvailable;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDefaultAmount() {
        return defaultAmount;
    }

    public void setDefaultAmount(int defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
}
