public class Destination {
    private String name;
    private String startingDate;
    private String endingDate;
    private double estimatedBudget;

    public Destination(String name, String startDate, String endDate, double estimatedBudget) {
        this.name = name;
        this.startingDate = startDate;
        this.endingDate = endDate;
        this.estimatedBudget = estimatedBudget;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startingDate;
    }

    public String getEndDate() {
        return endingDate;
    }

    public double getEstimatedBudget() {
        return estimatedBudget;
    }

    public void displayDestinationInfo() {
        System.out.println("Destination: " + name);
        System.out.println("Start Date: " + startingDate);
        System.out.println("End Date: " + endingDate);
        System.out.println("Estimated Budget: $" + estimatedBudget);
    }
}
