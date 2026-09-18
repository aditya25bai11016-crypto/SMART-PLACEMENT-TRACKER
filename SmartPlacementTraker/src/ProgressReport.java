import java.util.ArrayList;

public class ProgressReport {

    // Calculate average skill progress
    public static double calculateSkillProgress(ArrayList<Skill> skills) {

        if (skills.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Skill skill : skills) {
            total += skill.getLevel();
        }

        return (double) total / skills.size();
    }

    // Calculate subject progress
    public static double calculateSubjectProgress(ArrayList<Subject> subjects) {

        if (subjects.isEmpty()) {
            return 0;
        }

        double totalProgress = 0;

        for (Subject subject : subjects) {
            totalProgress += subject.getProgress();
        }

        return totalProgress / subjects.size();
    }

    // Calculate coding practice progress
    public static double calculateCodingProgress(
            ArrayList<CodingProblem> codingProblems) {

        if (codingProblems.isEmpty()) {
            return 0;
        }

        int solved = 0;

        for (CodingProblem problem : codingProblems) {

            if (problem.isSolved()) {
                solved++;
            }
        }

        return ((double) solved / codingProblems.size()) * 100;
    }

    // Calculate overall placement preparation
    public static double calculateOverallProgress(
            ArrayList<Skill> skills,
            ArrayList<Subject> subjects,
            ArrayList<CodingProblem> codingProblems) {

        double skillProgress = calculateSkillProgress(skills);
        double subjectProgress = calculateSubjectProgress(subjects);
        double codingProgress = calculateCodingProgress(codingProblems);

        return (skillProgress + subjectProgress + codingProgress) / 3;
    }

    // Display complete progress report
    public static void displayReport(
            ArrayList<Skill> skills,
            ArrayList<Subject> subjects,
            ArrayList<CodingProblem> codingProblems) {

        double skillProgress = calculateSkillProgress(skills);
        double subjectProgress = calculateSubjectProgress(subjects);
        double codingProgress = calculateCodingProgress(codingProblems);
        double overallProgress = calculateOverallProgress(
                skills,
                subjects,
                codingProblems
        );

        System.out.println("\n========================================");
        System.out.println("          PLACEMENT PROGRESS REPORT");
        System.out.println("========================================");

        System.out.printf(
                "Skill Development     : %.1f%%\n",
                skillProgress
        );

        System.out.printf(
                "Subject Preparation   : %.1f%%\n",
                subjectProgress
        );

        System.out.printf(
                "Coding Practice       : %.1f%%\n",
                codingProgress
        );

        System.out.println("----------------------------------------");

        System.out.printf(
                "Overall Preparation   : %.1f%%\n",
                overallProgress
        );

        System.out.println("========================================");
    }
}