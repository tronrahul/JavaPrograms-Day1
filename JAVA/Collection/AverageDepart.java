package Collection;

import java.util.ArrayList;

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getDepartment()
    {
        return department;
    }
    public int getYearOfJoining()
    {
        return yearOfJoining;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return "Id :" + id
				+" , " + "Name : "+ name
				+" , " + "Age : "+ age
				+" , " + "Gender : "+ gender
                +" , " + "Department : " + department
                +" , " + "Year Of Joining : " + yearOfJoining
                +" , " + "Salary : " + salary;
    }
}
public class AverageDepart {
    public static void main(String args[]) {
        Employee emp1 = new Employee(1,"Aman",21,"M","HR",2020,140.80);
		Employee emp2 = new Employee(2,"Rahul",22,"M","IT",2021,132.50);
		Employee emp3 = new Employee(3,"Sumit",20,"M","Purchase",2022,139.90);
		Employee emp4 = new Employee(4,"Vaishnavi",19,"F","Operations",2020,100.05);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

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

