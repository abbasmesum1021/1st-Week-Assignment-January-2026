import java.util.Scanner ;
public class Sales02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Discounted Selling Price  : ");
        double dsp = input.nextDouble();
        System.out.println("Enter Discount Percentage  : ");
        double dper = input.nextDouble();
        double osp =(dsp*100)/(100-dper);

        System.out.println("Original price is " + osp);
    }
}

