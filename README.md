# Smart Placement Tracker

## Overview

**Smart Placement Tracker** is a simple Java console application created to help college students organize and monitor their placement preparation in one place. Instead of keeping track of skills, subjects, coding practice, and placement targets separately, the application brings these activities together through a single menu-driven system.

The project focuses on making placement preparation more structured and easier to monitor. It allows a student to record their progress, update their preparation status, view an overall progress report, and save their current data for reference.

---

## Features

### 1. Student Profile
- Create a student profile with:
  - Name
  - Roll number
  - Branch
  - Year
  - CGPA
  - Target job role
- View the saved profile details.

### 2. Skill Management
- Add skills such as Java, Python, SQL, DSA, etc.
- Assign a skill level from **0% to 100%**.
- View all added skills.
- Update the level of an existing skill.
- Delete a skill when it is no longer required.

### 3. Subject & Topic Tracker
- Add subjects related to placement preparation.
- Add individual topics under each subject.
- Mark topics as completed.
- View subject-wise topic status and progress percentage.

### 4. Coding Practice Tracker
- Add coding problems to keep track of practice.
- Store the problem name, platform, and difficulty.
- Mark problems as solved.
- View pending and solved problems.

### 5. Placement Goals
- Create placement goals based on a company, role, and target package.
- View all placement goals.
- Mark a goal as achieved when completed.

### 6. Progress Report
The application calculates progress in three major areas:
- Skill development
- Subject preparation
- Coding practice

It then combines these values to display an **overall preparation percentage**.

### 7. Dashboard
A simple dashboard gives a quick overview of:
- Student profile status
- Number of skills
- Number of subjects
- Number of coding problems
- Number of placement goals
- Overall preparation progress

### 8. Data Saving
- The application provides an option to save the current project data.
- The data is stored in a text file named `placement_data.txt`.
- The saved file contains the student profile, skills, subject progress, coding practice, and placement goals.

---

## Technologies / Tools Used

- **Programming Language:** Java
- **Development Environment:** Visual Studio Code
- **Java Concepts Used:**
  - Classes and Objects
  - Encapsulation
  - Constructors
  - Methods
  - ArrayList
  - Loops and Conditional Statements
  - Switch-Case
  - Exception Handling
  - File Handling
  - Basic input validation
- **Data Storage:** Text file (`placement_data.txt`)
- **Version Control:** Git and GitHub

---

## Project Structure

```text
SmartPlacementTracker/

 src/
     Main.java
     Student.java
     Skill.java
     Subject.java
     CodingProblem.java
     PlacementGoal.java
     ProgressReport.java
     Dashboard.java
     DataManager.java
```

### Role of the Main Classes

| Class | Purpose |
|---|---|
| `Main.java` | Controls the main menu and application workflow |
| `Student.java` | Stores and displays student profile information |
| `Skill.java` | Represents and manages individual skills |
| `Subject.java` | Manages subjects, topics, and topic completion |
| `CodingProblem.java` | Stores coding problems and their solved status |
| `PlacementGoal.java` | Stores company, role, package, and goal status |
| `ProgressReport.java` | Calculates preparation progress |
| `Dashboard.java` | Displays a quick summary of the student's preparation |
| `DataManager.java` | Saves project data into a text file |

---

## How to Install and Run

### Prerequisites

Make sure the following are installed on your computer:

1. **Java JDK**
2. **Visual Studio Code** or any Java-supported IDE
3. **Git** (if you are cloning the project from GitHub)

You can check whether Java is installed by opening the terminal and running:

```bash
java -version
```

and:

```bash
javac -version
```

### Step 1: Clone the Repository

Open a terminal and run:

```bash
git clone <YOUR-GITHUB-REPOSITORY-LINK>
```

Then move into the project folder:

```bash
cd SmartPlacementTracker
```

### Step 2: Compile the Project

If the source files are inside the `src` folder:

```bash
javac src/*.java
```

### Step 3: Run the Application

```bash
java -cp src Main
```

Alternatively, the project can be opened directly in Visual Studio Code and `Main.java` can be run using the Java Run option.

---

## How to Use the Application

After starting the program, the main menu provides the following options:

```text
------------- MAIN MENU -------------
1. Create Student Profile
2. View Student Profile
3. Manage Skills
4. Track Subjects
5. Coding Practice
6. Placement Goals
7. Progress Report
8. Dashboard
9. Save Data
10. Exit
-------------------------------------
```

### Suggested Testing Flow

For the first run, the following order can be used:

1. Create a student profile.
2. Add a few skills and assign skill levels.
3. Add subjects and topics.
4. Mark some topics as completed.
5. Add several coding problems.
6. Mark some coding problems as solved.
7. Add one or more placement goals.
8. Mark a goal as achieved if required.
9. Open the **Progress Report**.
10. Open the **Dashboard**.
11. Select **Save Data**.
12. Check whether `placement_data.txt` has been created.

---

## Testing Instructions

The application should be tested using both normal and incorrect inputs.

### Functional Testing

| Test Case | Expected Result |
|---|---|
| Create student profile | Profile should be created successfully |
| View profile | Entered student details should be displayed |
| Add skill | Skill should appear in the skill list |
| Update skill | Skill percentage should be updated |
| Delete skill | Selected skill should be removed |
| Add subject | Subject should be added |
| Add topic | Topic should appear under the selected subject |
| Complete topic | Topic status should change to Completed |
| Add coding problem | Problem should be added to the list |
| Mark coding problem solved | Problem status should change to Solved |
| Add placement goal | Goal should appear in the goal list |
| Mark goal achieved | Goal status should change to Achieved |
| View progress report | Skill, subject, coding, and overall progress should be calculated |
| View dashboard | Summary of preparation should be displayed |
| Save data | `placement_data.txt` should be created/updated |

### Validation Testing

The following cases should also be checked:

- Enter an invalid main-menu option.
- Enter a skill level below `0` or above `100`.
- Select a subject number that does not exist.
- Select an invalid topic number.
- Select an invalid coding problem number.
- Select an invalid placement goal number.
- Enter an invalid or non-numeric value where a number is expected.
- Try viewing lists before adding any data.

The application should display an appropriate message instead of silently failing.

---

## Screenshots

Screenshots can be added here to show the working application.

Suggested screenshots:

1. Main Menu
2. Student Profile
3. Skill Management
4. Subject & Topic Tracker
5. Coding Practice
6. Placement Goals
7. Progress Report
8. Dashboard
9. Saved `placement_data.txt` file

> **Note:** Add the actual screenshots from your project before submitting the GitHub repository.

---

## Why This Project Was Created

Placement preparation involves several different activities. A student may be learning technical subjects, improving programming skills, solving coding questions, and preparing for specific job roles at the same time. When this information is scattered across notebooks, spreadsheets, or different applications, it can become difficult to see the bigger picture.

The Smart Placement Tracker was created to provide a small, organized system for managing these activities together. The project also provides practical experience with object-oriented programming, collections, modular programming, input handling, calculations, and file handling in Java.

---

## Limitations

The current version is intentionally designed as a simple console-based application.

- Data is saved in a text file rather than a database.
- The saved file is mainly intended for storing and viewing the current data.
- The application does not currently provide automatic account-based login.
- There is no graphical user interface.
- Advanced placement prediction and company recommendation features are not included in the current version.

These limitations also provide possible directions for future development.

---

## Future Enhancements

Some features that could be added in future versions include:

- A graphical user interface or web interface
- Database-based data storage
- Automatic loading of previously saved data
- User login and multiple student profiles
- More detailed coding statistics
- Weekly/monthly progress tracking
- Placement preparation reminders
- Skill-gap analysis
- Personalized preparation recommendations
- Integration with coding platforms

---

## Learning Outcomes

While developing this project, the main focus was on applying Java programming concepts to a practical problem.

The project provides hands-on practice with:

- Object-oriented programming
- Designing classes and relationships
- Using `ArrayList` for dynamic data
- Creating modular program components
- Menu-driven application design
- Input validation
- File handling
- Calculating and presenting progress
- Organizing a multi-class Java project
- Testing and debugging
- Using Git and GitHub for project management

---

## Conclusion

Smart Placement Tracker is a practical Java console application that brings important placement-preparation activities into one organized system. It is designed to be simple enough to use from the terminal while still demonstrating multiple Java programming concepts and meaningful project modules.

The project can be extended further into a database-backed or web-based placement preparation platform as more advanced features are added.

---

## Author

**Aditya Yadav**  
B.Tech CSE (AI & ML)  
VIT Bhopal University
