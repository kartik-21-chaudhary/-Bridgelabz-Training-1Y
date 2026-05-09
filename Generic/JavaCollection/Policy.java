import java.util.*;

class Policy {

    int policyNumber;
    String name;
    Date expiry;
    String type;
    double premium;

    Policy(int num, String name, Date exp, String type, double premium) {
        this.policyNumber = num;
        this.name = name;
        this.expiry = exp;
        this.type = type;
        this.premium = premium;
    }

    public String toString() {
        return policyNumber + " " + name + " " + type;
    }

    public int hashCode() {
        return policyNumber;
    }

    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }
}

class InsuranceSystem {

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();

        Set<Policy> treeSet = new TreeSet<>(
                (a, b) -> a.expiry.compareTo(b.expiry)
        );

        Policy p1 = new Policy(1, "Aman", new Date(125, 5, 1), "Health", 1000);
        Policy p2 = new Policy(2, "Ravi", new Date(125, 4, 1), "Auto", 2000);
        Policy p3 = new Policy(1, "Aman", new Date(125, 5, 1), "Health", 1000);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);

        linkedSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        System.out.println("All Policies:");
        System.out.println(hashSet);

        System.out.println("Sorted by Expiry:");
        System.out.println(treeSet);

        System.out.println("Health Policies:");
        for (Policy p : hashSet) {
            if (p.type.equals("Health")) {
                System.out.println(p);
            }
        }
    }
}