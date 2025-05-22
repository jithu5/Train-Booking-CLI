package ticket.booking;

import ticket.booking.services.UserBookingService;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running Train booking system");
        Scanner sc = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;
        try{
            userBookingService = new UserBookingService();
        }catch (IIOException ex){
            System.out.println("There is something wrong");
            return;
        } catch (IOException e) {
            throw new RuntimeException();
        }
        while (option!=7){
            System.out.println("Choose option");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Bookings");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a Seat");
            System.out.println("6. Cancel my Booking");
            System.out.println("7. Exit the App");
            option = sc.nextInt();
        }
    }
}