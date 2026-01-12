import java.util.Scanner ;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number   : ");
        int num = input.nextInt();
        int check = num % 2;
        if (check == 0)
            System.out.println("You Entered an EVEN Number");
        else
            System.out.println("You Entered an ODD Number");
    }
}