//BS'D
/*
Write a class that has three overloaded static methods for calculating the areas of the
following geometric shapes:
•	 circles
•	 rectangles
•	 cylinders
Because the three methods are to be overloaded, they should each have the same name, but
different parameter lists. Demonstrate the class in a complete program.
 */
public class Area {
    static enum Shape {CIRCLE, RECTANGLE, CYLINDER};
    private static Shape type;
    public Area(Shape type) {
        this.type = type;
    }

    public static double Area(double radius) {
        double area = -1;
            if(type == Shape.CIRCLE) {
                area = Math.PI * (radius * radius);
            }
        return area;
    }

    public static double Area(int width, int length) {
        double area = -1;
        if(type == Shape.RECTANGLE) {
            area = (double) width * length;
        }
        return area;
    }

    public static double Area(double radius, int height) {
        double area = -1;
        if(type == Shape.CYLINDER) {
            area = Math.PI * (radius*radius) * (double) height;
        }
        return area;
    }
    public static Shape getType() {
        return type;
    }

}
