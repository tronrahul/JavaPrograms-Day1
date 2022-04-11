package Collection;
import java.util.*;

public class MaleFemaleEmp
{
	public static void main(String args[])
	{
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));

        int maleCount = 0;
        int femaleCount = 0;
        for(int i=0;i<list.size();i++)
        {
            Employee obj = list.get(i);
            if(obj.getGender().equals("M"))
            {
                maleCount = maleCount + 1;
            }
            else{
                femaleCount = femaleCount + 1;
            }
        }

        System.out.println("Male are :" + maleCount);
        System.out.println("Female are :" + femaleCount);
		
	}
}