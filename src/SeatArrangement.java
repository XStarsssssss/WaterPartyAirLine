
import java.util.HashSet;
import java.util.Set;



public class SeatArrangement {
    private static Set<String> bookedSeats = new HashSet<>();


    public static void displayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailable(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailable(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void displayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }

    public static void displayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 69; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailable(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }

    private static boolean isSeatAvailable(String seatNumber) {
        return !bookedSeats.contains(seatNumber);
    }

    public static boolean checkSeatAvailability(String seatType, String seatNumber) {
        return !bookedSeats.contains(seatNumber);
    }

    public static void bookSeat(String seatNumber) {
        bookedSeats.add(seatNumber);
    }
}



