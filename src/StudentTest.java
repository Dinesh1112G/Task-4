// StudentTest.java

  // Custom Exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

 // Custom Exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

 // Student class to store and validate student details
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should not contain numbers or special characters.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main   class to test Student creation
public class StudentTest {
    public static void main(String[] args) {
        try {
            // Creating valid student
            Student s = new Student(101, "Dinesh", 20, "Computer Science");
            s.display();  // Display student details
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

/*
sample output:
Roll No: 101
Name: Dinesh
Age: 20
Course: Computer Science
*/
