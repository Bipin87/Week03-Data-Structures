package singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        SocialMedia social = new SocialMedia();
        // Adding the user in social media
        social.addUserNode(01,"Abhinav",23);
        social.addUserNode(03,"Abhay",20);
        social.addUserNode(02,"Atul",16);
        // Adding friend connection
        social.addFriendConnection(01,03);
        social.addFriendConnection(01,02);

        // Display the user friend connection
        System.out.println("Abhinav friends:"+ social.displayAllFriends(01));
        System.out.println("Abhay friends:"+ social.displayAllFriends(02));
        System.out.println("Atul friends:"+ social.displayAllFriends(03));

        //Display the mutual friends
        System.out.println("Mutual friends between Abhinav and Abhay: " + social.findMutualFriends(1, 2));

        social.removeFriendConnection(1, 2);
        System.out.println("Alice's friends after removing Deepraj: " + social.displayAllFriends(01));

        System.out.println("Number of friends Abhinav has: " + social.countFriends(01));
        System.out.println("Search for user by ID 2: " + social.searchUserById(02).name);
        System.out.println("Search for user by name 'Atul': " + social.searchUserByName("Atul").userId);
    }



}
