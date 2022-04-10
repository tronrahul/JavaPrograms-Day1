//Static method can't be overwritten because overriding is based on runtime dynamic binding and static is on compile static binding

class Parent{
    public static void display(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public static void display(){
        System.out.println("Child");
    }
}

public class StaticOverwritten {
    public static void main(String args[]){
        Parent obj = new Parent();
        obj.display();
    }
}
