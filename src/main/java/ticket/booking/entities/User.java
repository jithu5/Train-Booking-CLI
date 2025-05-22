package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private  String password;
    private  String hashPassword;
    private List<Ticket> ticketsBooked;
    private  String userId;

    // Default constructor (required by Jackson)
    public User() {}
        // Getters
        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public String getHashPassword() {
            return hashPassword;
        }
}
