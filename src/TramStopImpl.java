/**
 * клас TramStopImpl є похідним класом від класу TramStop
 * реалізує його абстрактні методи та містить масив класу Hour
 * також містить методи сортуваня "бульбашкою" та "перстановкою"
 */

import java.util.List;

public class TramStopImpl extends TramStop {
    private Hour[] listHour;

    public Hour[] getListHour() {
        return listHour;
    }

    public void setListHour(Hour[] listHour) {
        this.listHour = listHour;
    }

    public TramStopImpl(String name, List<String> routeNumbers, Hour[] listHour) {
        super(name, routeNumbers);
        this.listHour = listHour;
    }

    @Override
    public int findByTotalPassengerCount() {
        int totalPassengerCount = 0;
        for (Hour hour : listHour) {
            totalPassengerCount += hour.getPassengerCount();
        }
        return totalPassengerCount;
    }

    @Override
    public String findHourWithMinPassengerCount() {
        if (listHour.length == 0) {
            return "No hours available.";
        }

        Hour minHour = listHour[0];
        for (Hour hour : listHour) {
            if (hour.getPassengerCount() < minHour.getPassengerCount()) {
                minHour = hour;
            }
        }
        return minHour.getTime();
    }

    @Override
    public String findLongestComment() {
        if (listHour.length == 0) {
            return "No hours available.";
        }

        Hour longestCommentHour = listHour[0];
        for (Hour hour : listHour) {
            if (hour.getComment().length() > longestCommentHour.getComment().length()) {
                longestCommentHour = hour;
            }
        }
        return longestCommentHour.getComment();
    }

    public void sortByComment() {
        int n = listHour.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (listHour[i - 1].getComment().compareTo(listHour[i].getComment()) > 0) {
                    Hour temp = listHour[i - 1];
                    listHour[i - 1] = listHour[i];
                    listHour[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public void sortByNumberPassengers() {
        int n = listHour.length;
        for (int i = 1; i < n; i++) {
            Hour key = listHour[i];
            int j = i - 1;

            while (j >= 0 && listHour[j].getPassengerCount() > key.getPassengerCount()) {
                listHour[j + 1] = listHour[j];
                j = j - 1;
            }
            listHour[j + 1] = key;
        }
    }

    public void printListHour(String reson) {
        System.out.println("List of Hours for " + getName() + " sorted by " + reson + " :");
        for (Hour hour : listHour) {
            System.out.println(hour);
        }
    }
}
