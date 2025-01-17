import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (isBooked) {
            System.out.println("Seat " + this.seatNumber + " is already booked. Choose another seat.");
            return;
        }
        this.seatNumber = seatNumber;
        this.isBooked = true;
        System.out.println("Ticket booked successfully for " + movieName + " at Seat " + seatNumber);
    }

    // Method to display ticket details
    public void displayTicket() {
        if (!isBooked) {
            System.out.println("No ticket booked yet.");
            return;
        }
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Movie Name: ");
        String movie = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket(movie, price);

        System.out.print("Enter Seat Number to Book: ");
        int seat = scanner.nextInt();

        // Booking the ticket
        ticket.bookTicket(seat);

        // Displaying ticket details
        ticket.displayTicket();

        scanner.close(); // Closing scanner
    }
}
