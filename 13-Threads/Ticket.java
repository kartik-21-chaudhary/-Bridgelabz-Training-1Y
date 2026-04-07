import java.util.Random;
class Ticket extends Thread {
    int id;
    String type;
    int priority;
    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
    }
    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;
        System.out.println("Ticket " + id + " (" + type + ") started by " + getName() + " Priority: " + priority);
        try { Thread.sleep(time); } catch (Exception e) {}
        System.out.println("Ticket " + id + " completed in " + time + " ms");
    }
    public static void main(String[] args) {
        Ticket[] t = {
            new Ticket(1, "Critical Bug", 10),
            new Ticket(2, "Feature Request", 4),
            new Ticket(3, "General Query", 2),
            new Ticket(4, "Feedback", 1),
            new Ticket(5, "Critical Bug", 10),
            new Ticket(6, "General Query", 2),
            new Ticket(7, "Feature Request", 4),
            new Ticket(8, "Feedback", 1),
            new Ticket(9, "Critical Bug", 10),
            new Ticket(10, "General Query", 2)
        };
        for (Ticket ticket : t) {
            ticket.setPriority(ticket.priority);
            ticket.start();
        }
    }
}