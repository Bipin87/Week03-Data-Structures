package singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        // Add the students
        stu.addNodeBeginning("AL43","BK",21,'A');
        stu.addNodeEnd("AL23","Atul",16,'B');
        stu.addNodeAtPosition(2,"CS02","Aryan",22,'A');


        // Display all student record
        System.out.println("Display all student: ");
        stu.displayRecords();

        // Search the student
        System.out.println("Searching the roll number");
        stu.searchRecord("AL43");

        // Update the student grade
        System.out.println("Update the student grade for rollnumber \"AL23\"");
        stu.updateGrade("Al23", 'B');

        // Display the record after update
        System.out.println("Display the record after update");
        stu.displayRecords();

        // Delete a student record
        System.out.println("Delete the student");
        stu.deleteNode("CS02");

        // Display student record after deletion
        System.out.println("student record after deletion");
        stu.displayRecords();



    }
}
