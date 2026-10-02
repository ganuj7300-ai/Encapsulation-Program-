class Student {
    // Private data members
    private String name;
    private int age;
    private double marks;
 
    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    // Setter and Getter for age
    public void setAge(int age) {
        this.age = age;
    }
 
    public int getAge() {
        return age;
    }
 
    // Setter and Getter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
 
    public double getMarks() {
        return marks;
    }
}
 
public class Main {
    public static void main(String[] args) {
 
        // Creating object
        Student s1 = new Student();
 
        // Setting values using setters
        s1.setName("Anuj");
        s1.setAge(18);
        s1.setMarks(85.5);
 
        // Displaying values using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Marks: " + s1.getMarks());
    }
}
