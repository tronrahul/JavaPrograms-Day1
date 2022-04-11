package Collection;

import java.util.ArrayList;


public class AverageDepart {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));
        
        double hrAvg = 0, itAvg = 0, purAvg = 0, operAvg = 0;
        double hrSum = 0, itSum = 0, purSum = 0, operSum = 0;
        double hrCount = 0, itCount = 0, purCount = 0, operCount = 0;
        for(int i=0;i<list.size();i++){
            Employee obj = list.get(i);
            if(obj.getDepartment().equals("HR")){
                hrSum = hrSum + obj.getSalary();
                hrCount++;
                hrAvg = hrSum/hrCount;

            }
            else if(obj.getDepartment().equals("IT")){
                itSum = itSum + obj.getSalary();
                itCount++;
                itAvg = itSum/itCount;
            }
            else if(obj.getDepartment().equals("Purchase")){
                purSum = purSum + obj.getSalary();
                purCount++;
                purAvg = purSum/purCount;
            }
            else{
                operSum = operSum + obj.getSalary();
                operCount++;
                operAvg = operSum/operCount;
            }
        }
        System.out.println("Average salary of HR department is "+hrAvg);
        System.out.println("Average salary of IT department is "+itAvg);
        System.out.println("Average salary of Purchase department is "+purAvg);
        System.out.println("Average salary of Operation department is "+operAvg);
    }
}

