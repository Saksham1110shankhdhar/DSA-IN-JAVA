import java.util.Scanner;

public class PointPositionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point lies at the Origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point lies in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the 3rd Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the 4th Quadrant.");
        }

        sc.close();
    }
}
