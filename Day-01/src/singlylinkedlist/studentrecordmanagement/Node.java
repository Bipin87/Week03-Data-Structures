package singlylinkedlist.studentrecordmanagement;

class Node {
    String rollNumber;
    String name;
    int age;
    char grade;
    Node next;

    // Constructor
    public Node(String rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
