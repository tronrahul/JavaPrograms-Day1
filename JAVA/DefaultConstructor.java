//Default Constructor has no parameter. If there is no constructor is created then by-default the Default Constructor is called.
//It is used to provide values to the object like 0 and null.

public class DefaultConstructor {
    int id;
    String name;

    void show(){
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String args[])
    {
        DefaultConstructor obj1 = new DefaultConstructor();
        DefaultConstructor obj2 = new DefaultConstructor();

        obj1.show();
        obj2.show();
    }
}



