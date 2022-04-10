//It's a blueprint of class. It has only abstract methods. Used for abstraction and multiple inheritance.

interface display{
    void print();
}

public class InterfaceProgram implements display { 
    public void print(){
        System.out.println("DISPLAYED");
    }

    public static void main(String args[]){
        InterfaceProgram obj = new InterfaceProgram();
        obj.print();
    }
}

