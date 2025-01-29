package singlylinkedlist.socialmediafriendconnections;

import java.util.ArrayList;

public class Node {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;

    Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}
