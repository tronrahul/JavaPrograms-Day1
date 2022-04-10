//It's a class which use abstract keyword. It is used to get abstraction. It has abstract and non-abstract method.

abstract class Bike{
    abstract void engine();
}

class Scotty extends Bike{
    void engine(){
        System.out.println("Scotty has Engine");
    }
}

public class AbstractProgram {
    public static void main(String args[]) {
        Bike obj = new Scotty();
        obj.engine();
    }
}
