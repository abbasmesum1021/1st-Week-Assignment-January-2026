import java.util.Scanner ;
public class CircleArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int r = read.nextInt();
        double A=3.14*r*r;
        double C = 2*3.14*r;
        System.out.println("Area of Circle is   " + A);
        System.out.println("Circumference of Circle is   " + C);

    }
}