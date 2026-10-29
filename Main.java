import java.util.*; // to get all classes
public class Main{
    static ArrayList<Student> students = new ArrayList<>();//Step 5: Store data using ArrayList
    static Scanner sc = new Scanner(System.in);

    static void main() {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // Step 2: Add functionality to insert student records
    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check whether the ID already exists
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("This student ID already exists!");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        Student student = new Student(id, name, marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // Step 3: Display all student details
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
        }
    }

    // Step 4:Search student by ID
    public static void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("Student found!");
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found!");
    }
}

