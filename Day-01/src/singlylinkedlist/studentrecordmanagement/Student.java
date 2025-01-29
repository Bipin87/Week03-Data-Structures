package singlylinkedlist.studentrecordmanagement;

public class Student {
    Node head;

    // Add a new student at the beginning
    public void addNodeBeginning(String rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add a new student at the end
    public void addNodeEnd(String rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add a new student at a specific position
    public void addNodeAtPosition(int position, String rollNumber, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Please enter a valid position");
            return;
        }
        if (position == 1) {
            addNodeBeginning(rollNumber, name, age, grade);
            return;
        }
        Node newNode = new Node(rollNumber, name, age, grade);
        Node current = head;
        int count = 1;
        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a student record by Roll Number
    public void deleteNode(String rollNumber) {
        if (head == null) {
            System.out.println("Student record not present");
            return;
        }
        if (head.rollNumber.equals(rollNumber)) {
            head = head.next;
            System.out.println("Student record deleted");
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.rollNumber.equals(rollNumber)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student record not found");
        } else {
            current.next = current.next.next;
            System.out.println("Student record deleted");
        }
    }

    // Search the student record by Roll Number
    public void searchRecord(String rollNumber) {
        Node current = head;
        while (current != null) {
            if (current.rollNumber.equals(rollNumber)) {
                System.out.println("Student found: Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student record not found");
    }

    // Display all student records
    public void displayRecords() {
        if (head == null) {
            System.out.println("No student records to display");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // Update the student grade by Roll Number
    public void updateGrade(String rollNumber, char newGrade) {
        Node current = head;
        while (current != null) {
            if (current.rollNumber.equals(rollNumber)) {
                current.grade = newGrade;
                System.out.println("Grade updated for Roll Number: " + rollNumber);
                return;
            }
            current = current.next;
        }
    }
}