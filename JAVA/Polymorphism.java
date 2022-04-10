//It's a concept by which we can perform a single action in different task.

class Addition{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String agrs[]){
        Addition obj = new Addition();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(3.5, 6.5));
    }
}
