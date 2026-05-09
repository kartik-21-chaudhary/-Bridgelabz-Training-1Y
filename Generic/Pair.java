class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    T getFirst() {
        return first;
    }

    U getSecond() {
        return second;
    }
}

class Main2 {

    public static void main(String[] args) {

        Pair<String, Integer> student = new Pair<>("Amol", 20);

        System.out.println(student.getFirst());
        System.out.println(student.getSecond());
    }
}