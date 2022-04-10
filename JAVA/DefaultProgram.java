//Default is a access modifier. if no access modifier written the by default it is Default. It is accesible with in the package only.

class Fun{
    String mes = "Rahul Joshi from Innogent Technology";
}

public class DefaultProgram {
    public static void main(String args[]) {
        Fun obj = new Fun();
        System.out.println(obj.mes);
    }
}
