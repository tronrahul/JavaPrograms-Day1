//In this methods have same name but different functionality

class Calc{
    void sum(int a){
        System.out.println("Integer variable called");
    }

    void sum(double a){
        System.out.println("Double variable called");
    }
} 


public class Overloading {
    public static void main(String args[]) {
        Calc obj = new Calc();
        obj.sum(55.5);
    }
}

