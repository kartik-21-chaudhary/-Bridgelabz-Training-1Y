
class Fruit {
}

class Apple extends Fruit {
}

class Mango extends Fruit {
}

class FruitBox<T extends Fruit> {

    java.util.List<T> list = new java.util.ArrayList<>();

    void add(T fruit) {
        list.add(fruit);
    }

    void show() {
        for (T f : list) {
            System.out.println(f);
        }
    }
}

class Main5 {

    public static void main(String[] args) {

        FruitBox<Apple> box = new FruitBox<>();

        box.add(new Apple());

        box.show();
    }
}
