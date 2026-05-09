class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class AnimalUtil {

    static void printAnimals(java.util.List<? extends Animal> animals) {

        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}

class Main8 {

    public static void main(String[] args) {

        java.util.List<Dog> dogs =
                java.util.Arrays.asList(new Dog(), new Dog());

        AnimalUtil.printAnimals(dogs);
    }
}