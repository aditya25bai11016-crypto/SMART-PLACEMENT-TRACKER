# Project Statement

## Project Title

**Smart Placement Tracker**
---

## 1. Problem Statement

Preparing for placements is not limited to solving coding questions. A student usually has to work on several things at the same time, such as improving technical skills, completing important subject topics, practicing coding problems, maintaining academic information, and setting targets for companies or job roles.

When all of this information is maintained separately, it becomes difficult to get a clear idea of how much preparation has actually been completed and what still needs attention. Students may know that they are preparing for placements, but they may not have a simple way to track their progress across different areas.

The **Smart Placement Tracker** is developed to address this problem by bringing these basic placement-preparation activities into one organized application. The project provides a simple, menu-driven Java system where a student can maintain their preparation information, update progress, and view an overall summary of their placement readiness.

---

## 2. Scope of the Project

The scope of this project is to provide a **simple and practical placement-preparation tracking system** for students.

The current system focuses on the following areas:

- Maintaining a student's basic academic and career profile.
- Recording technical skills and their current proficiency levels.
- Organizing subjects and individual topics that need to be prepared.
- Tracking coding problems and their solved status.
- Creating and monitoring placement goals.
- Calculating preparation progress in different areas.
- Displaying an overall progress report and dashboard.
- Saving the current preparation data into a text file.

The project is intentionally designed as a **console-based Java application**, making it straightforward to understand, run, test, and extend.

The current version does not aim to replace complete placement platforms or recruitment portals. Instead, it focuses on the preparation and self-tracking side of the placement process.

---

## 3. Target Users

The primary users of the Smart Placement Tracker are:

### College Students

Students preparing for internships and campus placements can use the application to keep their preparation activities organized.

### Engineering / Computer Science Students

Students working on programming, technical subjects, coding practice, and job-specific skills can use the tracker to monitor their progress.

### Students Preparing for Multiple Job Roles

Students who have specific companies, job roles, or salary/package targets can record these goals and keep track of their progress.

The project is especially suitable for students who want a simple system instead of maintaining their preparation information across multiple notebooks or separate files.

---

## 4. High-Level Features

### 4.1 Student Profile Management

The application allows the student to create and view a profile containing:

- Name
- Roll number
- Branch
- Year
- CGPA
- Target job role

This provides the basic identity and career context for the placement tracker.

### 4.2 Skill Management

Students can maintain a list of their technical skills and assign a proficiency level from **0% to 100%**.

The module supports:

- Adding skills
- Viewing skills
- Updating skill levels
- Deleting skills

This makes it easier to keep track of skills that are being developed for placements.

### 4.3 Subject and Topic Tracking

The application allows students to add subjects and break them into individual topics.

A topic can be marked as completed after preparation. The system then calculates the percentage of completed topics for each subject.

This helps students see which areas of their technical preparation are complete and which are still pending.

### 4.4 Coding Practice Tracking

Students can record coding problems along with:

- Problem name
- Coding platform
- Difficulty level

Each problem can be marked as **Solved** or remain **Pending**.

This provides a simple way to maintain a record of coding practice.

### 4.5 Placement Goal Management

Students can create placement goals by entering:

- Company name
- Target job role
- Target package

A goal can later be marked as **Achieved**.

This allows students to keep their placement targets visible while working on their preparation.

### 4.6 Progress Report

The system calculates preparation progress across three major areas:

- Skill development
- Subject preparation
- Coding practice

These values are combined to generate an overall preparation percentage.

The report provides a quick numerical view of the student's current preparation status.

### 4.7 Dashboard

The dashboard gives a compact summary of the student's preparation.

It displays:

- Profile status
- Number of skills
- Number of subjects
- Number of coding problems
- Number of placement goals
- Overall preparation percentage

This allows the student to understand their current preparation without going through every module separately.

### 4.8 Data Saving

The application includes a data-saving feature that stores the current project information in a text file named:

`placement_data.txt`

The saved information includes the student profile, skills, subject progress, coding practice, and placement goals.

---

## 5. Project Approach

The project follows a modular approach in which different responsibilities are handled by different Java classes.

For example:

- `Student` handles student information.
- `Skill` represents individual skills.
- `Subject` manages subjects, topics, and completion.
- `CodingProblem` manages coding practice.
- `PlacementGoal` manages placement targets.
- `ProgressReport` performs progress calculations.
- `Dashboard` presents an overall summary.
- `DataManager` handles saving the data.
- `Main` controls the overall application flow and user interaction.

This structure keeps the project organized and makes individual parts easier to understand, test, and modify.

---

## 6. Expected Outcome

The expected outcome of the project is a working Java console application that gives students a structured way to record and monitor their placement preparation.

By using the application, a student should be able to move from simply preparing for placements to having a clearer record of:

**What skills they have → What subjects they have completed → How much they have practiced coding → What placement goals they have → How their overall preparation is progressing.**

The project also demonstrates how basic Java programming concepts can be combined to create a meaningful solution to a real student-oriented problem.

---

## 7. Future Scope

The current project provides the basic foundation for a more advanced placement preparation system. In future versions, it could be extended with:

- Database-based storage
- Automatic loading of previously saved data
- User login and multiple student profiles
- Graphical or web-based interface
- Weekly and monthly progress tracking
- Skill-gap analysis
- Personalized preparation recommendations
- Coding statistics and performance analysis
- Reminders for pending preparation tasks
- Company-specific preparation plans

These additions could turn the current console application into a more complete placement preparation platform while keeping the same core idea.

---

## 8. Summary

**Smart Placement Tracker** is a student-focused Java project created to make placement preparation more organized and measurable. It combines profile management, skill tracking, subject preparation, coding practice, placement goals, progress calculation, dashboard reporting, and data saving in a single application.

The main idea is simple: **make placement preparation easier to organize, easier to track, and easier to understand.**
