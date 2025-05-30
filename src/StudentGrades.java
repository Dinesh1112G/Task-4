import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

    // HashMap to store student name and grade
    private HashMap<String, Integer> studentMap = new HashMap<>();

    // Method to add a student
    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade is: " + studentMap.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display Grade\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    sg.addStudent(addName, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    sg.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to view grade: ");
                    String viewName = scanner.nextLine();
                    sg.displayGrade(viewName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

/* Sample output:

1. Add Student
2. Remove Student
3. Display Grade
4. Exit
Choose an option: 1
Enter student name: Dinesh
Enter grade: 70
Student added: Dinesh with grade 70

1. Add Student
2. Remove Student
3. Display Grade
4. Exit
Choose an option: 3
Enter student name to view grade: Dinesh
Dinesh's grade is: 70

 */