import java.util.Scanner ;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Current in Amperes : ");
        double amp = input.nextDouble();
        System.out.println("Enter Voltage in volts  : ");
        double volt = input.nextDouble();
        double watt = amp * volt;
        System.out.println("Power Output is : " + watt);
    }
}