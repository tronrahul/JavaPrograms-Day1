package Collection;
import java.util.ArrayList;


public class NameOfEmp {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));

        for(int i=0;i<list.size();i++)
        {
            Employee obj = list.get(i);
            if(obj.getDepartment().equals("HR")){
                System.out.println("HR Department "+obj.getName());
            }
            else if(obj.getDepartment().equals("IT")){
                System.out.println("IT Department "+obj.getName());
            }
            else if(obj.getDepartment().equals("Purchase")){
                System.out.println("Purchase Department "+obj.getName());
            }
            else{
                System.out.println("Operation Department "+obj.getName());
            }
        }
    }
}
