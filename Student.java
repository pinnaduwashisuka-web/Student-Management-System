public class Student {//step 1 creating student class
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails(){
        System.out.println("Student ID: "+id+"\nStudent Name: "+name+"\nStudent Marks: "+marks);
        System.out.println("-------------------------------");
    }

}
