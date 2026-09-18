public class PlacementGoal {

    private String company;
    private String role;
    private int targetPackage;
    private boolean achieved;

    // Constructor
    public PlacementGoal(String company, String role, int targetPackage) {

        this.company = company;
        this.role = role;
        this.targetPackage = targetPackage;
        this.achieved = false;
    }

    // Get company name
    public String getCompany() {
        return company;
    }

    // Get role
    public String getRole() {
        return role;
    }

    // Get target package
    public int getTargetPackage() {
        return targetPackage;
    }

    // Check whether goal is achieved
    public boolean isAchieved() {
        return achieved;
    }

    // Mark goal as achieved
    public void markAchieved() {
        achieved = true;
    }

    // Display placement goal
    public void displayGoal() {

        String status;

        if (achieved) {
            status = "Achieved";
        } else {
            status = "In Progress";
        }

        System.out.println(
                company + " | " +
                role + " | " +
                targetPackage + " LPA | " +
                status
        );
    }
}
