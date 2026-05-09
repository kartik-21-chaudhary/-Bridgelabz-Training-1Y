class Vehicle {
}

class Truck extends Vehicle {
}

class Bike extends Vehicle {
}

class FleetManager<T extends Vehicle> {

    java.util.List<T> fleet = new java.util.ArrayList<>();

    void addVehicle(T v) {
        fleet.add(v);
    }

    void showFleet() {
        System.out.println(fleet);
    }
}

class Main11 {

    public static void main(String[] args) {

        FleetManager<Truck> manager = new FleetManager<>();

        manager.addVehicle(new Truck());

        manager.showFleet();
    }
}