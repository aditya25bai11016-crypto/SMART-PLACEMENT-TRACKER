import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataManager {

    private static final String FILE_NAME = "placement_data.txt";

    public static void saveData(
            Student student,
            ArrayList<Skill> skills,
            ArrayList<Subject> subjects,
            ArrayList<CodingProblem> codingProblems,
            ArrayList<PlacementGoal> placementGoals) {

        try {

            FileWriter writer = new FileWriter(FILE_NAME);

            writer.write("========================================\n");
            writer.write("       SMART PLACEMENT TRACKER DATA\n");
            writer.write("========================================\n\n");

            // Student information
            writer.write("STUDENT PROFILE\n");
            writer.write("----------------\n");

            if (student != null) {

    writer.write("Name: " + student.getName() + "\n");
    writer.write("Roll Number: " + student.getRollNumber() + "\n");
    writer.write("Branch: " + student.getBranch() + "\n");
    writer.write("Year: " + student.getYear() + "\n");
    writer.write("CGPA: " + student.getCgpa() + "\n");
    writer.write("Target Role: " + student.getTargetRole() + "\n");

} else {

    writer.write("Profile: Not Created\n");
}

            writer.write("\n");

            // Skills
            writer.write("SKILLS\n");
            writer.write("----------------\n");

            for (Skill skill : skills) {
                writer.write(
                        skill.getName() + " - " +
                        skill.getLevel() + "%\n"
                );
            }

            writer.write("\n");

            // Subjects
            writer.write("SUBJECTS\n");
            writer.write("----------------\n");

            for (Subject subject : subjects) {
                writer.write(
                        subject.getName() + " - " +
                        String.format("%.1f", subject.getProgress()) +
                        "% progress\n"
                );
            }

            writer.write("\n");

            // Coding problems
            writer.write("CODING PRACTICE\n");
            writer.write("----------------\n");

            for (CodingProblem problem : codingProblems) {

                String status;

                if (problem.isSolved()) {
                    status = "Solved";
                } else {
                    status = "Pending";
                }

                writer.write(
                        problem.getProblemName() + " | " +
                        problem.getPlatform() + " | " +
                        problem.getDifficulty() + " | " +
                        status + "\n"
                );
            }

            writer.write("\n");

            // Placement goals
            writer.write("PLACEMENT GOALS\n");
            writer.write("----------------\n");

            for (PlacementGoal goal : placementGoals) {

                String status;

                if (goal.isAchieved()) {
                    status = "Achieved";
                } else {
                    status = "In Progress";
                }

                writer.write(
                        goal.getCompany() + " | " +
                        goal.getRole() + " | " +
                        goal.getTargetPackage() +
                        " LPA | " +
                        status + "\n"
                );
            }

            writer.close();

            System.out.println("All data saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error while saving data: " + e.getMessage()
            );
        }
    }
}