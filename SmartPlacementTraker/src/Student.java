public class Student {

    // Student information
    private String name;
    private String rollNumber;
    private String branch;
    private int year;
    private double cgpa;
    private String targetRole;

    // Constructor
    public Student(String name, String rollNumber, String branch,
                   int year, double cgpa, String targetRole) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.year = year;
        this.cgpa = cgpa;
        this.targetRole = targetRole;
    }

    // Display student information
    public void displayProfile() {

        System.out.println("\n========================================");
        System.out.println("           STUDENT PROFILE");
        System.out.println("========================================");

        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Branch      : " + branch);
        System.out.println("Year        : " + year);
        System.out.println("CGPA        : " + cgpa);
        System.out.println("Target Role : " + targetRole);

        System.out.println("========================================");
    }
    public String getName() {
    return name;
}

public String getRollNumber() {
    return rollNumber;
}

public String getBranch() {
    return branch;
}

public int getYear() {
    return year;
}

public double getCgpa() {
    return cgpa;
}

public String getTargetRole() {
    return targetRole;
}
}