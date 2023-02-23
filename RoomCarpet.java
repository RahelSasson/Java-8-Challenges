//BS'D
/*
Carpet Calculator
The Westfield Carpet Company has asked you to write an application that calculates the
price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the
floor (width times length) by the price per square foot of carpet. For example, the area of
floor that is 12 feet long and 10 feet wide is 120 square feet. To cover that floor with carpet
that costs $8 per square foot would cost $960. (12 3 10 3 8 5 960.)
First, you should create a class named RoomDimension that has two fields: one for the length
of the room and one for the width. The RoomDimension class should have a method that
returns the area of the room. (The area of the room is the room’s length multiplied by the
room’s width.)
Next you should create a RoomCarpet class that has a RoomDimension object as a field. It
should also have a field for the cost of the carpet per square foot. The RoomCarpet class
should have a method that returns the total cost of the carpet
 */
public class RoomCarpet {
    private RoomDimension dimension;
    private double costPerSqFt;

    public RoomCarpet(RoomDimension dimension, double costPerSqFt) {
        this.dimension = dimension;
        this.costPerSqFt = costPerSqFt;
    }
    public double totalCost() {
        return dimension.Area() * costPerSqFt;
    }

    public double getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

    public String toString() {
        return dimension.toString() + "Cost per Sq Ft: $" + this.costPerSqFt + " Total Cost: $" + this.totalCost();
    }
}
