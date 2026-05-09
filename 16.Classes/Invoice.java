import java.util.*;
import java.util.stream.*;

class Invoice {

    String id;

    Invoice(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

class MethodRef3 {

    public static void main(String[] args) {

        List<String> ids = Arrays.asList("T1", "T2", "T3");

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        System.out.println(invoices);
    }
}