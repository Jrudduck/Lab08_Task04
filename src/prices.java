import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        boolean yes;
        do {
            double price = InputHelper.getRangedDouble(scan,"Enter the price of your item.", 10, 0.50 );
            total += price;
            yes = InputHelper.getYNConfirm(scan, "Enter [Y/N] to keep adding items.");
        }while (yes);
        System.out.println("Your total is $" + total);

    }
}