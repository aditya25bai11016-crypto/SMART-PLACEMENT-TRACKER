public class Dashboard {

    public static void displayDashboard(
            Student student,
            int skillCount,
            int subjectCount,
            int codingProblemCount,
            int placementGoalCount,
            double overallProgress) {

        System.out.println("\n========================================");
        System.out.println("          SMART PLACEMENT DASHBOARD");
        System.out.println("========================================");

        if (student != null) {
            System.out.println("Student     : Profile Created");
        } else {
            System.out.println("Student     : Profile Not Created");
        }

        System.out.println("----------------------------------------");

        System.out.println("Skills      : " + skillCount);
        System.out.println("Subjects    : " + subjectCount);
        System.out.println("Coding      : " + codingProblemCount);
        System.out.println("Goals       : " + placementGoalCount);

        System.out.println("----------------------------------------");

        System.out.printf(
                "Overall Preparation : %.1f%%\n",
                overallProgress
        );

        System.out.println("========================================");
    }
}