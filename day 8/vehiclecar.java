class Vehicle {

    void start(int id) {
        System.out.println("Vehicle Started" + id);
    }
}

class Car extends Vehicle {

}

public class vehiclecar {

    public static void main(String[] args) {

        Car car = new Car();

        car.start(23);
    }
}