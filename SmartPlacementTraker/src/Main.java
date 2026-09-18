import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Student object
        Student student = null;

        //Skill List
        ArrayList<Skill> skills = new ArrayList<>();

        //track subjects
        ArrayList<Subject> subjects = new ArrayList<>();

        // Coding problem list
        ArrayList<CodingProblem> codingProblems = new ArrayList<>();

        // Placement goal list
        ArrayList<PlacementGoal> placementGoals = new ArrayList<>();

        boolean running = true;

        System.out.println("========================================");
        System.out.println("       SMART PLACEMENT TRACKER");
        System.out.println("========================================");

        while (running) {

            System.out.println("\n------------- MAIN MENU -------------");
            System.out.println("1. Create Student Profile");
            System.out.println("2. View Student Profile");
            System.out.println("3. Manage Skills");
            System.out.println("4. Track Subjects");
            System.out.println("5. Coding Practice");
            System.out.println("6. Placement Goals");
            System.out.println("7. Progress Report");
            System.out.println("8. Dashboard");
            System.out.println("9. Save Data");
            System.out.println("10. Exit");
            System.out.println("-------------------------------------");

            System.out.print("Enter your choice: ");

            int choice = getIntInput(scanner);
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n===== CREATE STUDENT PROFILE =====");

                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter roll number: ");
                    String rollNumber = scanner.nextLine();

                    System.out.print("Enter branch: ");
                    String branch = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();

                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter target job role: ");
                    String targetRole = scanner.nextLine();

                    student = new Student(
                            name,
                            rollNumber,
                            branch,
                            year,
                            cgpa,
                            targetRole
                    );

                    System.out.println("\nStudent profile created successfully!");

                    break;

                case 2:

                    if (student == null) {
                        System.out.println("\nPlease create your student profile first.");
                    } else {
                        student.displayProfile();
                    }

                    break;

                case 3:

    boolean skillMenu = true;

    while (skillMenu) {

        System.out.println("\n========== SKILL MANAGEMENT ==========");
        System.out.println("1. Add Skill");
        System.out.println("2. View Skills");
        System.out.println("3. Update Skill");
        System.out.println("4. Delete Skill");
        System.out.println("5. Back to Main Menu");
        System.out.println("======================================");

        System.out.print("Enter your choice: ");
        int skillChoice = scanner.nextInt();
        scanner.nextLine();

        switch (skillChoice) {

            case 1:

                System.out.print("Enter skill name: ");
                String skillName = scanner.nextLine();

                System.out.print("Enter skill level (0-100): ");
                int skillLevel = scanner.nextInt();
                scanner.nextLine();

                if (skillLevel < 0 || skillLevel > 100) {
                    System.out.println("Invalid skill level.");
                } else {
                    Skill newSkill = new Skill(skillName, skillLevel);
                    skills.add(newSkill);

                    System.out.println("Skill added successfully!");
                }

                break;

            case 2:

                if (skills.isEmpty()) {

                    System.out.println("\nNo skills added yet.");

                } else {

                    System.out.println("\n========== YOUR SKILLS ==========");

                    for (Skill skill : skills) {
                        skill.displaySkill();
                    }
                }

                break;

            case 3:

                if (skills.isEmpty()) {

                    System.out.println("\nNo skills available to update.");

                } else {

                    System.out.print("Enter skill name to update: ");
                    String updateName = scanner.nextLine();

                    boolean found = false;

                    for (Skill skill : skills) {

                        if (skill.getName().equalsIgnoreCase(updateName)) {

                            System.out.print("Enter new skill level (0-100): ");
                            int newLevel = scanner.nextInt();
                            scanner.nextLine();

                            if (newLevel < 0 || newLevel > 100) {

                                System.out.println("Invalid skill level.");

                            } else {

                                skill.setLevel(newLevel);
                                System.out.println("Skill updated successfully.");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Skill not found.");
                    }
                }

                break;

            case 4:

                if (skills.isEmpty()) {

                    System.out.println("\nNo skills available to delete.");

                } else {

                    System.out.print("Enter skill name to delete: ");
                    String deleteName = scanner.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < skills.size(); i++) {

                        if (skills.get(i).getName()
                                .equalsIgnoreCase(deleteName)) {

                            skills.remove(i);

                            System.out.println("Skill deleted successfully.");

                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Skill not found.");
                    }
                }

                break;

            case 5:

                skillMenu = false;
                break;

            default:

                System.out.println("Invalid choice.");
        }
    }

    break;
     case 4:

    boolean subjectMenu = true;

    while (subjectMenu) {

        System.out.println("\n========== SUBJECT TRACKER ==========");
        System.out.println("1. Add Subject");
        System.out.println("2. Add Topic");
        System.out.println("3. Mark Topic Completed");
        System.out.println("4. View Subjects");
        System.out.println("5. Back to Main Menu");
        System.out.println("=====================================");

        System.out.print("Enter your choice: ");
        int subjectChoice = scanner.nextInt();
        scanner.nextLine();

        switch (subjectChoice) {

            case 1:

                System.out.print("Enter subject name: ");
                String subjectName = scanner.nextLine();

                Subject newSubject = new Subject(subjectName);
                subjects.add(newSubject);

                System.out.println("Subject added successfully.");

                break;

            case 2:

                if (subjects.isEmpty()) {

                    System.out.println("\nPlease add a subject first.");

                } else {

                    System.out.println("\nAvailable Subjects:");

                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println(
                                (i + 1) + ". " + subjects.get(i).getName()
                        );
                    }

                    System.out.print("Select subject number: ");
                    int subjectNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (subjectNumber < 1 ||
                            subjectNumber > subjects.size()) {

                        System.out.println("Invalid subject number.");

                    } else {

                        Subject selectedSubject =
                                subjects.get(subjectNumber - 1);

                        System.out.print("Enter topic name: ");
                        String topicName = scanner.nextLine();

                        selectedSubject.addTopic(topicName);

                        System.out.println("Topic added successfully.");
                    }
                }

                break;

            case 3:

                if (subjects.isEmpty()) {

                    System.out.println("\nPlease add a subject first.");

                } else {

                    System.out.println("\nAvailable Subjects:");

                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println(
                                (i + 1) + ". " + subjects.get(i).getName()
                        );
                    }

                    System.out.print("Select subject number: ");
                    int subjectNumber = scanner.nextInt();

                    if (subjectNumber < 1 ||
                            subjectNumber > subjects.size()) {

                        System.out.println("Invalid subject number.");

                    } else {

                        Subject selectedSubject =
                                subjects.get(subjectNumber - 1);

                        selectedSubject.displaySubject();

                        System.out.print(
                                "Enter topic number to mark completed: "
                        );

                        int topicNumber = scanner.nextInt();
                        scanner.nextLine();

                        boolean success =
                                selectedSubject.markTopicCompleted(topicNumber);

                        if (success) {
                            System.out.println(
                                    "Topic marked as completed!"
                            );
                        } else {
                            System.out.println(
                                    "Invalid topic number."
                            );
                        }
                    }
                }

                break;

            case 4:

                if (subjects.isEmpty()) {

                    System.out.println("\nNo subjects added yet.");

                } else {

                    System.out.println("\n========== YOUR SUBJECTS ==========");

                    for (Subject subject : subjects) {
                        subject.displaySubject();
                    }
                }

                break;

            case 5:

                subjectMenu = false;
                break;

            default:

                System.out.println("Invalid choice.");
        }
    }

    break;

               case 5:

    boolean codingMenu = true;

    while (codingMenu) {

        System.out.println("\n======= CODING PRACTICE =======");
        System.out.println("1. Add Coding Problem");
        System.out.println("2. View Coding Problems");
        System.out.println("3. Mark Problem as Solved");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");

        System.out.print("Enter your choice: ");
        int codingChoice = scanner.nextInt();
        scanner.nextLine();

        switch (codingChoice) {

            case 1:

                System.out.print("Enter problem name: ");
                String problemName = scanner.nextLine();

                System.out.print("Enter platform: ");
                String platform = scanner.nextLine();

                System.out.print("Enter difficulty (Easy/Medium/Hard): ");
                String difficulty = scanner.nextLine();

                CodingProblem newProblem =
                        new CodingProblem(
                                problemName,
                                platform,
                                difficulty
                        );

                codingProblems.add(newProblem);

                System.out.println("Coding problem added successfully!");

                break;

            case 2:

                if (codingProblems.isEmpty()) {

                    System.out.println("\nNo coding problems added yet.");

                } else {

                    System.out.println("\n========== CODING PROBLEMS ==========");

                    for (int i = 0; i < codingProblems.size(); i++) {

                        System.out.print((i + 1) + ". ");
                        codingProblems.get(i).displayProblem();
                    }
                }

                break;

            case 3:

                if (codingProblems.isEmpty()) {

                    System.out.println("\nNo coding problems available.");

                } else {

                    System.out.println("\nAvailable Problems:");

                    for (int i = 0; i < codingProblems.size(); i++) {

                        System.out.print((i + 1) + ". ");
                        codingProblems.get(i).displayProblem();
                    }

                    System.out.print(
                            "\nEnter problem number to mark as solved: "
                    );

                    int problemNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (problemNumber < 1 ||
                            problemNumber > codingProblems.size()) {

                        System.out.println("Invalid problem number.");

                    } else {

                        CodingProblem selectedProblem =
                                codingProblems.get(problemNumber - 1);

                        selectedProblem.markSolved();

                        System.out.println(
                                "Problem marked as solved!"
                        );
                    }
                }

                break;

            case 4:

                codingMenu = false;
                break;

            default:

                System.out.println("Invalid choice.");
        }
    }

    break;

               case 6:

    boolean goalMenu = true;

    while (goalMenu) {

        System.out.println("\n======= PLACEMENT GOALS =======");
        System.out.println("1. Add Placement Goal");
        System.out.println("2. View Placement Goals");
        System.out.println("3. Mark Goal as Achieved");
        System.out.println("4. Back to Main Menu");
        System.out.println("===============================");

        System.out.print("Enter your choice: ");
        int goalChoice = scanner.nextInt();
        scanner.nextLine();

        switch (goalChoice) {

            case 1:

                System.out.print("Enter company name: ");
                String company = scanner.nextLine();

                System.out.print("Enter target job role: ");
                String role = scanner.nextLine();

                System.out.print("Enter target package (LPA): ");
                int targetPackage = scanner.nextInt();
                scanner.nextLine();

                if (targetPackage <= 0) {

                    System.out.println(
                            "Invalid package. Please enter a positive value."
                    );

                } else {

                    PlacementGoal newGoal =
                            new PlacementGoal(
                                    company,
                                    role,
                                    targetPackage
                            );

                    placementGoals.add(newGoal);

                    System.out.println(
                            "Placement goal added successfully!"
                    );
                }

                break;

            case 2:

                if (placementGoals.isEmpty()) {

                    System.out.println(
                            "\nNo placement goals added yet."
                    );

                } else {

                    System.out.println(
                            "\n========== PLACEMENT GOALS =========="
                    );

                    for (int i = 0; i < placementGoals.size(); i++) {

                        System.out.print((i + 1) + ". ");
                        placementGoals.get(i).displayGoal();
                    }
                }

                break;

            case 3:

                if (placementGoals.isEmpty()) {

                    System.out.println(
                            "\nNo placement goals available."
                    );

                } else {

                    System.out.println("\nAvailable Goals:");

                    for (int i = 0; i < placementGoals.size(); i++) {

                        System.out.print((i + 1) + ". ");
                        placementGoals.get(i).displayGoal();
                    }

                    System.out.print(
                            "\nEnter goal number to mark as achieved: "
                    );

                    int goalNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (goalNumber < 1 ||
                            goalNumber > placementGoals.size()) {

                        System.out.println(
                                "Invalid goal number."
                        );

                    } else {

                        PlacementGoal selectedGoal =
                                placementGoals.get(goalNumber - 1);

                        selectedGoal.markAchieved();

                        System.out.println(
                                "Placement goal marked as achieved!"
                        );
                    }
                }

                break;

            case 4:

                goalMenu = false;
                break;

            default:

                System.out.println("Invalid choice.");
        }
    }

    break;

                case 7:

    ProgressReport.displayReport(
            skills,
            subjects,
            codingProblems
    );

    break;

                case 8:

    double overallProgress =
            ProgressReport.calculateOverallProgress(
                    skills,
                    subjects,
                    codingProblems
            );

    Dashboard.displayDashboard(
            student,
            skills.size(),
            subjects.size(),
            codingProblems.size(),
            placementGoals.size(),
            overallProgress
    );

    break;

               case 9:

    DataManager.saveData(
            student,
            skills,
            subjects,
            codingProblems,
            placementGoals
    );

    break;

case 10:

    running = false;

    System.out.println(
            "\nThank you for using Smart Placement Tracker!"
    );

    break;
                default:
                    System.out.println("\nInvalid choice. Please enter 1-10.");
            }
        }

        scanner.close();
    }
    public static int getIntInput(Scanner scanner) {

    while (!scanner.hasNextInt()) {

        System.out.println("Invalid input. Please enter a number.");
        scanner.next();

    }

    return scanner.nextInt();
}
}