import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//During serialization if we do not want to convert object than use transiet.

class Employee implements Serializable{
    int empId;
    String empName;
    transient int empAge;

    public Employee(int empId, String empName, int empAge){
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }
}

public class TransietProgram {
    public static void main(String agrs[]) throws Exception {
        Employee obj = new Employee(1, "Rahul", 21);
        FileOutputStream f = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(obj);
        out.flush();
        out.close();
        f.close();
        System.out.println("Success");
    }
}
