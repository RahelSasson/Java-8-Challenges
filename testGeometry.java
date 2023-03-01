import java.util.Scanner;

public class testGeometry {
    public static void main (String[] args) {
        display();
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        error(val);
        String[] names = {"Circles","Rectangle","Triangle"};
        double area = functionCall(val);
        System.out.println("The area of the " + names[val-1] + " is " + area);
    }
    public static void display() {
        System.out.println("Enter a number representing your choice from the list below");
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
    }
    public static void error(int val) {
        if(val < 1 || val > 4) {
            System.out.println("Invalid input, outside of legal range (1-4)");
            System.exit(1);
        }
        return;
    }
    public static double functionCall(int val) {
        Geometry shapes = new Geometry();
        Scanner s = new Scanner(System.in);
        double area = 0;
        if(val == 1){
            System.out.println("enter radius");
            area = shapes.Area(s.nextDouble());
        }
        else if(val == 2){
            System.out.println("enter length followed by width");
            area = shapes.Area(s.nextInt(), s.nextInt());
        }
        else if(val == 3){
            System.out.println("enter base followed by height");
            area = shapes.Area(s.nextDouble(), s.nextInt());
        }
        else if(val == 4)
            System.exit(0);

        return area;
    }
}
