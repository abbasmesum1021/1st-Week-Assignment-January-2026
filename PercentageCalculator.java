import java.util.Scanner ;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Obtained marks  : ");
        int obt = input.nextInt();
        System.out.println("Enter Total marks  : ");
        int tot = input.nextInt();
        double per = 1.0 * obt / tot * 100;
        System.out.println("Your Percentage is " + per);
    }
}