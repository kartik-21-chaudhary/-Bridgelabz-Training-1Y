class MovieTicket {
    String movie;
    int seat;
    int price;
    MovieTicket(String m, int s, int p) {
        movie = m;
        seat = s;
        price = p;
    }
    void display() {
        System.out.println("Movie: " + movie);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Avengers",12,300);
        t.display();
    }
}