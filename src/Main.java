import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        TravelItineraryPlanner t1 = new TravelItineraryPlanner();
        int choice;

        do {
            System.out.println("\t\n*** Travel Itinerary Planner ***");
            System.out.println("1. Add Destination");
            System.out.println("2. Display information");
            System.out.println("3. Generate Map for Destination");
            System.out.println("4. Fetch Weather for Destination");
            System.out.println("5. Calculate Budget");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = h.nextInt();
            h.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Destination Name: ");
                    String name = h.nextLine();
                    System.out.print("Enter Start Date (yyyy-mm-dd): ");
                    String startDate = h.nextLine();
                    System.out.print("Enter End Date (yyyy-mm-dd): ");
                    String endDate = h.nextLine();
                    System.out.print("Enter Estimated Budget: ");
                    double budget = h.nextDouble();
                    t1.addDestination(name, startDate, endDate, budget);
                    break;

                case 2:
                    t1.displayInformation();
                    break;

                case 3:
                    System.out.print("Enter Destination Name for Map: ");
                    String map = h.nextLine();
                    t1.Map(map);
                    break;

                case 4:
                    System.out.print("Enter Destination Name for Weather: ");
                    String weather = h.nextLine();
                    t1.fetchWeather(weather);
                    break;

                case 5:
                    System.out.print("Enter Travel Cost: ");
                    double travelCost = h.nextDouble();
                    System.out.print("Enter Accommodation Cost: ");
                    double accommodationCost = h.nextDouble();
                    System.out.print("Enter Food Cost: ");
                    double foodCost = h.nextDouble();
                    System.out.print("Enter Activity Cost: ");
                    double activityCost = h.nextDouble();
                    t1.calculateBudget(travelCost, accommodationCost, foodCost, activityCost);
                    break;

                case 6:
                    System.out.println("Thank you for using Travel Itinerary Planner");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);
    }
}
