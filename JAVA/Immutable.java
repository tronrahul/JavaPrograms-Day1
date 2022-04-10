//When we create an object of Immutable class, we can't change the value of it. All wrapper and String class is immutable.
//Using final datamember and class also leads to immutable class. 

final class Student{
    final String rollno;
    public Student(String rollno){
        this.rollno = rollno;
    }

    public String getRoll(){
        return rollno;
    }
}

public class Immutable {
    public static void main(String args[]) {
        Student obj = new Student("ABCD1234");
        String s = obj.getRoll();
        System.out.print(s);

    }
}
