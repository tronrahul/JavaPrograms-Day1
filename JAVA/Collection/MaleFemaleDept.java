package Collection;

import java.util.ArrayList;
public class MaleFemaleDept {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));

        int mCount = 0, fCount = 0;
        for(int i=0;i<list.size();i++){
            Employee obj = list.get(i);
            if(obj.getDepartment().equals("Sales and Marketing") && obj.getGender().equals("M")){
                mCount++;
            }
            else if(obj.getDepartment().equals("Sales and Marketing") && obj.getGender().equals("F")){
                fCount++;
            }
        }
        System.out.println("Male count in Sales and Marketing Department are "+mCount);
        System.out.println("Female count in Sales and Marketing Department are "+fCount);
    }
}
