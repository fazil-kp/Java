import java.util.Scanner;

class Student {
    protected String name;
    protected int rollNumber;
    protected String address;
    
    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        this.rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
    }
    
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Address: " + this.address);
    }
}

class Mark extends Student {
    private int[] marks = new int[5];
    
    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            this.marks[i] = scanner.nextInt();
        }
    }
    
    public int getTotalMarks() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += this.marks[i];
        }
        return total;
    }
    
    public float getAverageMarks() {
        return (float)getTotalMarks() / 5.0f;
    }
    
    public void displayResult() {
        displayDetails();
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }
}

public class Main {
    public static void main(String[] args) {
        Mark student = new Mark();
        student.readDetails();
        student.readMarks();
        student.displayResult();
    }
}
