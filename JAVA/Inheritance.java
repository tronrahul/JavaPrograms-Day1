//It's a concept that inherit all the property of parent class to child class.
//used for code reusability and achieving method overriding.
//java supports single, multilevel, hierarichal except multiple because it leads to ambiguity error.


 class ParentClass1{
    void message(){
        System.out.println("Class1");
    }
}

 class ParentClass2{
    void message(){
        System.out.println("Class2");
    }
}

 class Inheritance extends ParentClass1 , ParentClass2 {
    public static void main(String args[]) {
        Inheritance obj = new Inheritance();
        obj.message();
    }
}
