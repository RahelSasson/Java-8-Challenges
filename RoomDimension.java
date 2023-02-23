//BS'D
public class RoomDimension {
    private double width;
    private double length;

    public RoomDimension(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double Area() {
        return width * length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "Length= " + this.length + " Width= " + this.width + " Area= " + this.Area() + "\n";
    }
}
