import java.util.*;

class Movie {

    String name;
    double rating;
    int year;

    Movie(String n, double r, int y) {
        name = n;
        rating = r;
        year = y;
    }

    public String toString() {
        return name + " " + rating + " " + year;
    }
}

class TopMovies {

    public static void main(String[] args) {

        List<Movie> list = Arrays.asList(
                new Movie("A", 4.5, 2022),
                new Movie("B", 4.8, 2023),
                new Movie("C", 4.2, 2021),
                new Movie("D", 4.9, 2024),
                new Movie("E", 4.1, 2020),
                new Movie("F", 4.7, 2023)
        );

        list.stream()
                .sorted((a, b) -> {
                    int cmp = Double.compare(b.rating, a.rating);
                    if (cmp == 0) {
                        return b.year - a.year;
                    }
                    return cmp;
                })
                .limit(5)
                .forEach(System.out::println);
    }
}