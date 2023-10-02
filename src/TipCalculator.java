import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculator {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the number of people in your group: ");
        int people = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
        double totalCost = 0;
        ArrayList<String> itemsList = new ArrayList<>();
        //Asks the user for cost of item
        while (true) {
            System.out.print("Enter the item cost (-1 to end): ");
            double itemCost = scan.nextDouble();
            scan.nextLine();
            if (itemCost == -1) {
                break;
            } else {
                totalCost += itemCost;
                //Asks the user for the name of item and adds to an array
                System.out.print("Enter the name of the item: ");
                itemsList.add(scan.nextLine());
            }
        }

        //Calculates the data
        double tip = (int) (totalCost * (tipPercentage/100.0) * 100 + 0.5) / 100.0;
        double totalBill = (int) ((totalCost + tip) * 100 + 0.5) / 100.0;
        double perPersonTip = (int) (tip/people * 100 + 0.5) / 100.0;
        double perPersonCost = (int) (totalCost/people * 100 + 0.5) / 100.0;
        double totalPerPersonCost = (int) ((perPersonCost + perPersonTip) * 100 + 0.5) / 100.0;
        //Data is printed for the user
        System.out.println("--------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: %" + tipPercentage);
        System.out.println("Total tip: $" + tip);
        System.out.println("Total bill with tip: $" + totalBill);
        System.out.println("Per person cost before tip: $" + perPersonCost);
        System.out.println("Tip per person: $" + perPersonTip);
        System.out.println("Total cost per person: " + totalPerPersonCost);
        System.out.println("--------------------------------------");
        //prints the names of the items
        System.out.println("Items ordered:");
        for (int i = 1; i <= itemsList.size(); i++) {
            System.out.println(i + ". " + itemsList.get(i-1));
        }

        //Finds a way to pay the cost with the least number of bills and coins

        //Sets the name of bills
        ArrayList<String> moneyNames = new ArrayList<>(Arrays.asList(
                "Hundreds",
                "Fifties",
                "Twenties",
                "Tens",
                "Fives",
                "Ones",
                "Quarters",
                "Dimes",
                "Nickels",
                "Pennies"
        ));

        //sets the value of bills (the index corresponds to the name)
        ArrayList<Integer> moneyValues = new ArrayList<>(Arrays.asList( //in pennies
                10000,
                5000,
                2000,
                1000,
                500,
                100,
                25,
                10,
                5,
                1
        ));

        ArrayList<Integer> amountsOfMoney = new ArrayList<>();

        //calculates the number of each bill and adds it to an array
        int billLeft = (int) (totalBill * 100);
        for (int i = 1; i <= moneyValues.size(); i++) {
            int Count = billLeft/moneyValues.get(i-1);
            billLeft -= moneyValues.get(i-1) * Count;
            amountsOfMoney.add(Count);
        }

        //prints the bills and coins
        System.out.println("--------------------------------------");
        System.out.println("You can pay with the least amount of bills and coins using:");
        for (int i = 1; i <= moneyValues.size(); i++) {
            System.out.println(moneyNames.get(i-1) + ": " + amountsOfMoney.get(i-1));
        }
    }
}
