package circularlinkedlist.onlineticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();

        // Adding tickets
        system.addTicket(1, "Atul", "Pushpa3", "C1");
        system.addTicket(2, "Ankit", "Leo", "A2");
        system.addTicket(3, "Bharat", "Avatar", "A1");

        // Displaying tickets
        system.displayTickets();

        // Searching for a ticket
        System.out.println("Searching for tickets for 'Avatar':");
        system.searchTicket("Avatar");

        // Removing a ticket
        System.out.println("Removing ticket with ID 2:");
        system.removeTicket(2);

        // Displaying tickets after removal
        system.displayTickets();

        // Total tickets count
        System.out.println("Total number of tickets: " + system.getTotalTickets());
    }
}
