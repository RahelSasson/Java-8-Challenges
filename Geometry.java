//BS'D
/*
Design a Geometry class with the following methods:
•	 A static method that accepts the radius of a circle and returns the area of the circle.
Use Math.PI for π and the radius of the circle for r.
•	 A static method that accepts the length and width of a rectangle and returns the area
of the rectangle.
•	 A static method that accepts the length of a triangle’s base and the triangle’s height.
The method should return the area of the triangle.
The methods should display an error message if negative values are used for the circle’s
radius, the rectangle’s length or width, or the triangle’s base or height.
Next, write a program to test the class, which displays the following menu and responds
to the user’s selection:
Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit
Enter your choice (1-4):
Display an error message if the user enters a number outside the range of 1 through 4 when
selecting an item from the menu
 */
public class Geometry {
    public static double Area(double radius) {
        if(radius < 0 ) {
            System.out.println("Negative value entered, invalid input");
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double Area(int length, int width) {
        if(length < 0 || width < 0 ) {
            System.out.println("Negative value entered, invalid input");
            return -1;
        }
        return (double) length * width;
    }

    public static double Area(double base, int height) {
        if(base < 0 || height < 0 ) {
            System.out.println("Negative value entered, invalid input");
            return -1;
        }
        return base * height * .5;
    }

}
