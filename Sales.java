import java.util.Scanner ;
public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Original Selling Price  : ");
        double osp = input.nextDouble();
        System.out.println("Enter Discount Percentage  : ");
        double dper = input.nextDouble();
        double dprice = osp * dper / 100;
        double fp = osp - dprice;
        System.out.println("Final Discounted price is " + fp);
    }
}

