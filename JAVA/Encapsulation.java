//Wraps data into a single unit.


public class Encapsulation {
    private int id;
    public int getId(){
        return id;
    } 

    public void setId(int identity){
        id = identity;
    }

    public static void main(String agrs[]) {
        Encapsulation obj = new Encapsulation();
        obj.setId(15);
        System.out.println(obj.getId());
    }
}
