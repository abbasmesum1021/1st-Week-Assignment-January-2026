import java.util.Scanner ;
public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the length of first side  : ");
        double s1 = input.nextDouble();
        
        System.out.println("Enter the length of second  side : ");
        double s2 = input.nextDouble();
        
        System.out.println("Enter the perpendicular height : ");
        double h = input.nextDouble();
        
        double area = (s1 + s2) * h / 2;
        
        System.out.println("Area of Trapezoid is " + area);
    }
}
