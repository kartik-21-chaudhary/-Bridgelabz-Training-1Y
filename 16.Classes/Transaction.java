import java.util.*;
import java.time.*;

class TransactionLog {

    public static void main(String[] args) {

        List<String> ids = Arrays.asList("T1", "T2", "T3");

        ids.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}