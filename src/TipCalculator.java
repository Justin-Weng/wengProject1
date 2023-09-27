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
        double tip = (int) (totalCost * (tipPercentage/100.0) * 100 + 0.5) / 100.0;
        System.out.println("--------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: $" + tipPercentage);
        System.out.println("Total tip: $" + tip);
        System.out.println("Total bill with tip: $" + (int) ((totalCost + tip) * 100 + 0.5) / 100);
        double perPersonTip = (int) (tip/people * 100 + 0.5) / 100.0;
        double perPersonCost = (int) (totalCost/people * 100 + 0.5) / 100.0;
        System.out.println("Per person cost before tip: $" + perPersonCost);
        System.out.println("Tip per person: $" + perPersonTip);
        System.out.println("Total cost per person: " + (perPersonCost + perPersonTip));
        System.out.println("--------------------------------------");
    }
}
