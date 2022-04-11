package Collection;

import java.util.ArrayList;

public class DepartCount {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));

        int hrCount = 0, itCount = 0, purCount = 0, operCount = 0;
        for(int i=0;i<list.size();i++){
            Employee obj = list.get(i);
            if(obj.getDepartment().equals("HR")){
                hrCount++;
            }
            else if(obj.getDepartment().equals("IT")){
                itCount++;
            }
            else if(obj.getDepartment().equals("Purchase")){
                purCount++;
            }
            else{
                operCount++;
            }
        }
        System.out.println("HR department has "+hrCount+ " member");
        System.out.println("IT department has "+itCount+ " member");
        System.out.println("Purchase department has "+purCount+ " member");
        System.out.println("Operation department has "+operCount+ " member");
    }
}
