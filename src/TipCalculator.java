import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the number of people in your group: ");
        int people = scan.nextInt();
        System.out.println("Enter the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
    }
}
