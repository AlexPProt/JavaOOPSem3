package Start3.Tsak2;

import java.util.Arrays;
import java.util.Random;

public class Program {


    private static Random random = new Random();
    public static Employee generateEmployee(){
        String[] names = new String[] {"Паша","Саша", "Вася","Коля"};
        String[] surNames = new String[] {"Иванов","Петров", "Сидоров","Васильев"};
        int salaryIndex = random.nextInt(400,1000);
        int checkEmployee = random.nextInt(0,2);
        if (checkEmployee==0)
            return new Worker((names[random.nextInt(names.length)]), surNames[random.nextInt(surNames.length)],
                    random.nextInt(18,60),100*salaryIndex );
        else
            return new Freelancer((names[random.nextInt(names.length)]), surNames[random.nextInt(surNames.length)],
                    random.nextInt(18,60),salaryIndex/2 );
    }

    public static Employee[] generateEmployees (int count){
        Employee[] employees = new Employee[count];
        for (int i=0;i<count;i++)
            employees[i]=generateEmployee();
        return employees;
    }

    public static void main(String[] args){
        Employee[] employees = generateEmployees(12);

        Arrays.sort(employees ,new SalaryComparator());

        for (Employee woker: employees) {
            System.out.println(woker);
        }


    }
}
