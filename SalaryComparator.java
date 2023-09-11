package Start3.Tsak2;

import java.util.Comparator;

public class SalaryComparator implements Comparator <Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getAge(),o2.getAge());
        //return o1.calculateSalary()== o2.calculateSalary() ? 0:
        //        o1.calculateSalary()>o2.calculateSalary() ? 1:-1;
    }
}
