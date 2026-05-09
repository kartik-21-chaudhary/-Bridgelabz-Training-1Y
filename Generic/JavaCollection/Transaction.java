import java.util.*;

class Transaction {

    int id;

    Transaction(int id) {
        this.id = id;
    }

    public String toString() {
        return "Txn " + id;
    }
}

class Banking {

    public static void main(String[] args) {

        List<Transaction> all = new ArrayList<>();

        Queue<Transaction> queue = new LinkedList<>();

        Set<Integer> accounts = new HashSet<>();

        accounts.add(1);
        accounts.add(2);

        Stack<Transaction> rollback = new Stack<>();

        queue.add(new Transaction(1));
        queue.add(new Transaction(2));

        while (!queue.isEmpty()) {

            Transaction t = queue.remove();

            if (accounts.contains(t.id)) {
                all.add(t);
                rollback.push(t);
                System.out.println("Processed " + t);
            }
        }

        System.out.println("Undo: " + rollback.pop());
    }
}