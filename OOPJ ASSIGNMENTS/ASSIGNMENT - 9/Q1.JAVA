class Vehicle {
    void drive() {
        System.out.println("Repairing A Vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing A Car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}