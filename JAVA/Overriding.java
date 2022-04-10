//If child class has same name method as parent class then it will override the parent class method 

class OverridingParent{
    void message(){
        System.out.println("Parent class");
    }
}


class Overriding extends OverridingParent {
    void message(){
        System.out.println("Child class");
}

    public static void main(String agrs[]){
        Overriding obj = new Overriding();
        obj.message();
        OverridingParent obj1 = new OverridingParent();
        obj1.message();
    } 
}
