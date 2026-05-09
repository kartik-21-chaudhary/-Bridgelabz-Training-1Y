import java.util.*;

class Sensor {

    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(10, 50, 80, 30);

        readings.stream()
                .filter(r -> r > 40)
                .forEach(System.out::println);
    }
}