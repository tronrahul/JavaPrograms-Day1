//It generate copy of object with different dates. Type of marker interface.

class CloneableInterface implements Cloneable{
    int id;
    String name;

    public CloneableInterface(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println("ID:- " +id);
        System.out.println("Name:- " +name);
    }


    public static void main(String args[]) throws CloneNotSupportedException {
        CloneableInterface obj1 = new CloneableInterface(1, "Rahul");
        obj1.show();
        CloneableInterface obj2 = (CloneableInterface)obj1.clone();
        obj2.show();
}
}