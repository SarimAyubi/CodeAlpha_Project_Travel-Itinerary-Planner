import java.util.ArrayList;

public class TravelItineraryPlanner {
    private ArrayList<Destination> itinerary;
    private double totalBudget;

    public TravelItineraryPlanner() {
        itinerary = new ArrayList<>();
        totalBudget = 0;
    }

    public void addDestination(String name, String startDate, String endDate, double estimatedBudget) {
        Destination destination = new Destination(name, startDate, endDate, estimatedBudget);
        itinerary.add(destination);
        totalBudget += estimatedBudget;
        System.out.println("Destination added to itinerary.");
    }

    public void displayInformation() {
        System.out.println("Your Travel details:");
        for (Destination destination : itinerary) {
            destination.displayDestinationInfo();
            System.out.println("-----------------------");
        }
        System.out.println("Total Estimated Budget: $" + totalBudget);
    }
    public void Map(String destination) {
        System.out.println("Fetching map for " + destination + "...");
        System.out.println("Map of " + destination + " generated (simulated).");
    }
    public void fetchWeather(String destination) {
        System.out.println("Fetching weather data for " + destination + "...");
        System.out.println("Weather in " + destination + ": Sunny, 25°C (simulated).");
    }

    public void calculateBudget(double travelCost, double accommodationCost, double foodCost, double activityCost) {
        double totalCost = travelCost + accommodationCost + foodCost + activityCost;
        System.out.println("Estimated budget: ");
        System.out.println("Travel Cost: $" + travelCost);
        System.out.println("Accommodation Cost: $" + accommodationCost);
        System.out.println("Food Cost: $" + foodCost);
        System.out.println("Activity Cost: $" + activityCost);
        System.out.println("Total Estimated Cost: $" + totalCost);
    }
}
