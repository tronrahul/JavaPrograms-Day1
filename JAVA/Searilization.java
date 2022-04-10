import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Searilization means converting object into byte stream. It's a process where object state is read from memory and written on database. 

class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Searilization {
    public static void main(String args[]) {
        try{
            Student obj = new Student(1, "Rahul");
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(obj);
            out.flush();
            out.close();System.out.println("Data has been read");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
