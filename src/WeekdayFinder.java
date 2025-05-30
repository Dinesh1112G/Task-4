import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays starting from Sunday (index 0)
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for day index
            System.out.print("Enter day index (0 to 6): ");
            int index = scanner.nextInt();

            // Print the day name based on index
            System.out.println("Day is: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("Invalid input! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle other unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*
sample output:
//getting input from user//

Enter day index (0 to 6): 2
Day is: Tuesday

 */