import java.util.Scanner;

public class AirLineReservationSystem {

    public static void showControlOptions(Scanner scanner) {
        while (true) {
            System.out.println("If you want to Account Creation, Click 'Acc'");
//            System.out.println("If you want to search account,Click 'Search'");
            System.out.println("If you want to Account Delete, Click 'Del'");
            System.out.println("If you want to see plane names, itineraries, time, and prices, Click 'See'");
            System.out.println("If you want to buy tickets, Click 'Buy'");
//            System.out.println("If you want to see report, Click 'Report'");
            System.out.println("If you want to stop, Click 'Stop'");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Acc")) {
                CustomerManager.createAccount(scanner);
            } else if (input.equalsIgnoreCase("Search")) {
                CustomerManager.displayCreatedAccountsList(scanner);
            } else if (input.equalsIgnoreCase("Del")) {
                CustomerManager.deleteAccount(scanner);
            } else if (input.equalsIgnoreCase("See")) {
                PlaneDetails.showDetails();
            } else if (input.equalsIgnoreCase("Buy")) {
                TicketPurchase.buyTickets(scanner);
            } else if (input.equalsIgnoreCase("Report")) {
                Reporting.generateSalesReport();
            } else if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Stopping the program.");
                break;
            } else {
                System.out.println("Invalid input! Please choose 'Acc', 'Del', 'See', 'Buy', or 'Stop'.");
            }
        }
    }








}
