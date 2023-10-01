/**
 * Базовий абстрактний клас Трамвайна зупинка (TramStop), який представляє першу з сутностей
 * індивідуального завдання, містить поля назва (String name)
 * та список номерів маршрутів (List<String> routeNumbers)
 * також містить абстрактні методи
 */

import java.util.List;
import java.util.Objects;

public abstract class TramStop {
    private String name;
    private List<String> routeNumbers;

    public TramStop(String name, List<String> routeNumbers) {
        this.name = name;
        this.routeNumbers = routeNumbers;
    }

    public String getName() {
        return name;
    }

    public List<String> getRouteNumbers() {
        return routeNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRouteNumbers(List<String> routeNumbers) {
        this.routeNumbers = routeNumbers;
    }

    @Override
    public String toString() {
        return "Трамвайна зупинка: " + name + "\n Список номерів маршрутів: " + routeNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TramStop tramStop = (TramStop) o;
        return Objects.equals(name, tramStop.name) && Objects.equals(routeNumbers, tramStop.routeNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, routeNumbers);
    }

    public abstract int findByTotalPassengerCount();

    public abstract String findHourWithMinPassengerCount();

    public abstract String findLongestComment();
}

