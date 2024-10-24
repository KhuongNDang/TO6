package Task2;

public class Cinema {
    String[][] seats;

    // Constructor that initializes the seating arrangement
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats]; // Initialize the seats array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "0"; // Mark all seats as "O" (not reserved)
            }
        }
        this.seats[0][0] = "X"; // Reserve seat 0,0 for the director
    }

    public int getRows() {
        return seats.length; // Return number of rows
    }

    public int getSeats() {
        return seats[0].length; // Return number of seats in a row
    }

    // Reserve a seat if not already reserved
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("0")) { // Check if seat is not reserved
            seats[row][seat] = "X"; // Reserve the seat
            return true;
        }
        return false; // Seat already reserved
    }

    // Cancel a reservation if the seat is reserved
    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "0";
            return false;
        }
        return true;
    }

    // Return a string representation of the cinema seating
    public String toString() {
        String result = ""; // Initialize an empty result string
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|"; // Add each seat's status to the result
            }
            result += "\n"; // Newline after each row
        }
        return result; // Return the final seating arrangement as a string
    }
}
