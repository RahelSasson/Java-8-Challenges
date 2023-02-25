public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public String toString() {
        return this.description + "\nUnits on hand: " + this.unitsOnHand + " Price: " + this.price + "\n";
    }
}
