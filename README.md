Palindrome Checker App
📌 Project Procedure – UC1 (Application Entry & Welcome Message)
🎯 Project Objective

The objective of the Palindrome Checker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions while improving core Java programming skills and understanding of application flow.

🔄 Project Flow (What I Have Done)
Step 1: Repository Setup

Created a GitHub repository named PalindromeCheckerApp.

Enabled the README file (mandatory).

Cloned the repository to my local system using:

git clone <repository_link>
Step 2: Project Setup in IntelliJ

Opened the cloned project in IntelliJ IDEA.

Created a new module named App.

Created a Java class inside App/src:

PalindromeCheckerApp.java
Step 3: Branch Creation

Checked branch status:

git status

Created a new branch for UC1:

git checkout -b UC1-WelcomePage

Verified branch:

git branch
Step 4: Implementation of UC1

Implemented welcome message logic inside:

public static void main(String[] args)

Displayed:

Application Name

Application Version

Startup Message

Step 5: Adding Specific File

Used:

git add .

Restored staged files:

git restore --staged

Added only required file:

git add App/src/PalindromeCheckerApp.java
📖 Use Case 1 – Application Entry & Welcome Message
Goal

Display a welcome message and application details at startup.

Actor

User

Flow

Program starts.

JVM invokes the main() method.

Application name is displayed.

Application version is displayed.

Program continues to next use case.

🛠 Key Concepts Used

Class – Container for application logic.

Main Method – Entry point of Java application.

Static Keyword – Allows JVM to call main() without object creation.

System.out.println() – Used for console output.

Application Flow Control – Defines startup behavior.

💻 Compilation & Execution
Compile
javac PalindromeCheckerApp.java
Run
java PalindromeCheckerApp
✅ Git Workflow Followed

After implementation:

git add README.md
git commit -m "YourName Added UC1-ApplicationEntry"
git push origin UC1-WelcomePage

Then:

Created Pull Request

Merged branch into main

Pulled latest code to main

📌 Conclusion

UC1 has been successfully implemented following:

Proper Git branching strategy

Clean project structure

Correct Java application flow

Use case-driven development approach