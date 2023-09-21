import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the number of people in your group: ");
        int people = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
        double totalCost = 0;
        while (true) {
            System.out.print("Enter the item cost (-1 to end): ");
            double itemCost = scan.nextDouble();
            if (itemCost == -1) {
                break;
            } else {
                totalCost += itemCost;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println(totalCost);
    }
}
