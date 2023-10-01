/**
 * клас TramStopImpl2 є похідним класом від класу TramStopImpl
 * перевизначає методи сортування та містить внутрішній клас
 * CommentComparator згідно до завдвння
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TramStopImpl2 extends TramStopImpl {

    public TramStopImpl2(String name, List<String> routeNumbers, Hour[] listHour) {
        super(name, routeNumbers, listHour);

    }

    @Override
    public void sortByComment() {
        Arrays.sort(getListHour(), new CommentComparator());
    }


    private static class CommentComparator implements Comparator<Hour> {
        @Override
        public int compare(Hour hour1, Hour hour2) {
            return hour1.getComment().compareTo(hour2.getComment());
        }
    }

    @Override
    public void sortByNumberPassengers() {
        Arrays.sort(getListHour(), (hour1, hour2) -> Integer.compare(hour1.getPassengerCount(), hour2.getPassengerCount()));
    }
}
