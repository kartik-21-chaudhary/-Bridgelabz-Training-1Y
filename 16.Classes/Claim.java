import java.util.*;
import java.util.stream.*;

class Claim {

    String type;
    double amount;

    Claim(String t, double a) {
        type = t;
        amount = a;
    }
}

class ClaimAnalysis {

    public static void main(String[] args) {

        List<Claim> list = Arrays.asList(
                new Claim("Health", 1000),
                new Claim("Health", 2000),
                new Claim("Auto", 1500)
        );

        Map<String, Double> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                c -> c.type,
                                Collectors.averagingDouble(c -> c.amount)
                        ));

        System.out.println(result);
    }
}