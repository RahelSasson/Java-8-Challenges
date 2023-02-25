//BS'D
/*
Write a CashRegister class that can be used with the RetailItem class that you wrote in
Chapter 6’s Programming Challenge 4. The CashRegister class should simulate the sale of
a retail item. It should have a constructor that accepts a RetailItem object as an argument.
The constructor should also accept an integer that represents the quantity of items being
purchased. In addition, the class should have the following methods:
•	 The getSubtotal method should return the subtotal of the sale, which is the quantity
multiplied by the price. This method must get the price from the RetailItem object
that was passed as an argument to the constructor.
•	 The getTax method should return the amount of sales tax on the purchase. The sales
tax rate is 6 percent of a retail sale.
•	 The getTotal method should return the total of the sale, which is the subtotal plus the
sales tax.
 */
public class CashRegister {
    private RetailItem item;
    private int quantity;

    public CashRegister(RetailItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        double subtotal = 0;
        if(item.getUnitsOnHand() >= this.quantity)
            subtotal = this.quantity * item.getPrice();
        else {
            System.out.println("Amount requested unavailable, filling order for " + this.item.getUnitsOnHand());
            this.quantity = item.getUnitsOnHand();
            subtotal = item.getUnitsOnHand();
        }
        return subtotal;
    }

    public double getTax() {
        return this.getSubtotal() * .06;
    }

    public double getTotal() {
        return this.getSubtotal() + this.getTax();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return item.toString() + "Quantity: " + this.quantity + " Total cost with 6% sales tax: " + this.getTotal();
    }
}
