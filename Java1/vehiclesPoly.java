abstract class Vehicles {
    public void speed() {
        System.out.println("Speed is 100.");
    }
}

class Car extends Vehicles {
    public void speed() {
        System.out.println("Car Speed is 150.");
    }
}

class Bike extends Vehicles {
    public void speed() {
        System.out.println("Bike Speed is 90.");
    }
}

class Jet extends Vehicles {
    public void speed() {
        System.out.println("Jet Speed is 400.");
    }
}

public class vehiclesPoly {

    public static void main(String[] args) {
        Vehicles p;
        p = new Car();
        p.speed();
        p = new Bike();
        p.speed();
        p = new Jet();
        p.speed();
    }
}