package singlylinkedlist.socialmediafriendconnections;
import java.util.ArrayList;
import java.util.List;

public class SocialMedia {
    private ArrayList<Node> users;

    SocialMedia() {
        users = new ArrayList<>();
    }

    public void addUserNode(int userId, String name, int age) {
        users.add(new Node(userId, name, age));
    }

    public void addFriendConnection(int userId1, int userId2) {
        Node user1 = getUserById(userId1);
        Node user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        Node user1 = getUserById(userId1);
        Node user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    public List<Integer> findMutualFriends(int userId1, int userId2) {
        List<Integer> mutualFriends = new ArrayList<>();
        Node user1 = getUserById(userId1);
        Node user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            List<Integer> friends1 = user1.friendIds;
            List<Integer> friends2 = user2.friendIds;
            for (int friendId : friends1) {
                if (friends2.contains(friendId)) {
                    mutualFriends.add(friendId);
                }
            }
        }
        return mutualFriends;
    }

    public List<Integer> displayAllFriends(int userId) {
        Node user = getUserById(userId);
        if (user != null) {
            return user.friendIds;
        }
        return new ArrayList<>();
    }

    public Node searchUserById(int userId) {
        for (Node user : users) {
            if (user.userId == userId) {
                return user;
            }
        }
        return null;
    }

    public Node searchUserByName(String name) {
        for (Node user : users) {
            if (user.name.equals(name)) {
                return user;
            }
        }
        return null;
    }

    public int countFriends(int userId) {
        Node user = getUserById(userId);
        if (user != null) {
            return user.friendIds.size();
        }
        return 0;
    }

    private Node getUserById(int userId) {
        for (Node user : users) {
            if (user.userId == userId) {
                return user;
            }
        }
        return null;
    }
}