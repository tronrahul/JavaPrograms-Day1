//It has no methods and constant inside it. It provides runtime information so JVM have more info about it.

interface car{

}

interface bike{

}

class FourWheeler implements car{
    static void displayCar(){
        System.out.println("Car");
    }
}

class TwoWheeler implements bike{
    static void displayBike(){
        System.out.println("Bike");
    }
}


public class MarkerInterface {
    public static void main(String args[]) {
        FourWheeler.displayCar();
        TwoWheeler.displayBike();
    }
}
