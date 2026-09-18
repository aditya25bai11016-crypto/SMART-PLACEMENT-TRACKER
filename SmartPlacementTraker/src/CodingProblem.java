public class CodingProblem {

    private String problemName;
    private String platform;
    private String difficulty;
    private boolean solved;

    // Constructor
    public CodingProblem(String problemName, String platform, String difficulty) {

        this.problemName = problemName;
        this.platform = platform;
        this.difficulty = difficulty;
        this.solved = false;
    }

    // Get problem name
    public String getProblemName() {
        return problemName;
    }

    // Get platform
    public String getPlatform() {
        return platform;
    }

    // Get difficulty
    public String getDifficulty() {
        return difficulty;
    }

    // Check whether problem is solved
    public boolean isSolved() {
        return solved;
    }

    // Mark problem as solved
    public void markSolved() {
        solved = true;
    }

    // Display problem
    public void displayProblem() {

        String status;

        if (solved) {
            status = "Solved";
        } else {
            status = "Pending";
        }

        System.out.println(
                problemName + " | " +
                platform + " | " +
                difficulty + " | " +
                status
        );
    }
}