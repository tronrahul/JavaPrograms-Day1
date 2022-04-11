package Collection;
import java.util.ArrayList;

public class JoiningAfter {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));

        for(int i=0;i<list.size();i++){
            Employee obj = list.get(i);
            if(obj.getYearOfJoining() > 2015){
                System.out.println(obj.getName());
            }
        }
    }
}