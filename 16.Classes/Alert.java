import java.util.*;
import java.util.function.Predicate;

class Alert {

    String type;

    Alert(String t) {
        type = t;
    }

    public String toString() {
        return type;
    }
}

class FilterAlerts {

    public static void main(String[] args) {

        List<Alert> list = Arrays.asList(
                new Alert("Critical"),
                new Alert("Normal"),
                new Alert("Emergency")
        );

        Predicate<Alert> filter = a -> a.type.equals("Critical") || a.type.equals("Emergency");

        for (Alert a : list) {
            if (filter.test(a)) {
                System.out.println(a);
            }
        }
    }
}