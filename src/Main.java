import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of route numbers
        List<String> routeNumbers = Arrays.asList("Route1", "Route2", "Route3");

        // Create an array of Hour objects
        Hour[] hours = {
                new Hour("09:00", 50, "Comment A"),
                new Hour("10:00", 30, "Comment Z"),
                new Hour("11:00", 40, "Comment C looooong"),
                new Hour("12:00", 60, "Comment B midle"),
                new Hour("13:00", 25, "Comment E")
        };

        // Create an instance of TramStopImpl
        TramStopImpl tramStopImpl = new TramStopImpl("Tram Stop 1", routeNumbers, hours);

        // Create an instance of TramStopImpl2
        TramStopImpl2 tramStopImpl2 = new TramStopImpl2("Tram Stop 2", routeNumbers, hours);

        // Testing methods of TramStopImpl
        System.out.println("Testing methods of TramStopImpl:");
        System.out.println("Total Passenger Count: " + tramStopImpl.findByTotalPassengerCount());
        System.out.println("Hour with Min Passenger Count: " + tramStopImpl.findHourWithMinPassengerCount());
        System.out.println("Longest Comment: " + tramStopImpl.findLongestComment());
        System.out.println();

        // Sorting by Number of Passengers using TramStopImpl
        tramStopImpl.sortByNumberPassengers();
        tramStopImpl.printListHour("passenger");
        System.out.println();

        tramStopImpl.sortByComment();
        tramStopImpl.printListHour("comment");
        System.out.println();

        // Testing methods of TramStopImpl2
        System.out.println("\nTesting methods of TramStopImpl2:");
        System.out.println("Total Passenger Count: " + tramStopImpl2.findByTotalPassengerCount());
        System.out.println("Hour with Min Passenger Count: " + tramStopImpl2.findHourWithMinPassengerCount());
        System.out.println("Longest Comment: " + tramStopImpl2.findLongestComment());
        System.out.println();

        // Sorting by Comment using TramStopImpl2
        tramStopImpl2.sortByComment();
        tramStopImpl.printListHour("comment");
        System.out.println();

        tramStopImpl2.sortByNumberPassengers();
        tramStopImpl.printListHour("passenger");
    }
}
