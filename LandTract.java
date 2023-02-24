//BS'D
/*
Make a LandTract class that has two fields: one for the tract’s length and one for the width.
The class should have a method that returns the tract’s area, as well as an equals method
and a toString method. Demonstrate the class in a program that asks the user to enter the
dimensions for two tracts of land. The program should display the area of each tract of land
and indicate whether the tracts are of equal size
 */
public class LandTract {
    private double length;
    private double width;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area(){
        return this.length * this.width;
    }

    public boolean Equals(LandTract obj) {
        boolean equal;
        if(this.Area() == obj.Area())
            equal = true;
        else
            equal = false;
        return equal;
    }

    public String toString() {
        return "Length: " + this.length + " Width: " + this.width + " Area: " + this.Area();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
