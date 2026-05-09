import java.util.*;

class Welcome {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aman", "Ravi", "Neha");

        names.forEach(n -> System.out.println("Welcome " + n));
    }
}