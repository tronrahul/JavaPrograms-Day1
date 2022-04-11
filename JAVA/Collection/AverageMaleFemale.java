package Collection;
import java.util.ArrayList;

public class AverageMaleFemale {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Aman",21,"M","HR",2020,140.80));
		list.add(new Employee(2,"Rahul",21,"M","IT",2021,132.50));
		list.add(new Employee(3,"Sumit",26,"M","Purchase",2022,139.90));
		list.add(new Employee(4,"Vaishnavi",25,"F","Operations",2020,100.05));
        
        int avgMale=0, maleCount=0, avgM=0;
        int avgFemale=0, femaleCount=0, avgF=0;

        for(int i=0;i<list.size();i++){
            Employee et = list.get(i);
            if(et.getGender().equals("M")){
                avgMale = et.getAge() + avgMale;
                maleCount = maleCount + 1;
                avgM = avgMale/maleCount;
            }
            else{
                avgFemale = et.getAge()+avgFemale;
                femaleCount = femaleCount + 1;
                avgF = avgFemale/femaleCount;
            }
        }
        System.out.println("Average of Male is "+ avgM);
        System.out.println("Average of Female is "+ avgF);
    }
}
