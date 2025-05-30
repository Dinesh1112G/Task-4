// Custom checked exception for invalid voter age
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class with parameterized constructor
class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to test the Voter class
public class VoterTest {
    public static void main(String[] args) {
        try {
            // Valid voter (age> 18)
            Voter voter1 = new Voter(1001, "Dinesh", 20);
            voter1.display();

            System.out.println();

            // Invalid voter (age < 18)
            Voter voter2 = new Voter(1002, "Gayathri", 14); // This will throw exception

        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


/* sample output
Voter ID: 1001
Name: Dinesh
Age: 20

Exception: invalid age for voter
*/