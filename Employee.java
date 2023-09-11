package Start3.Tsak2;
/**
 * Работник
 */
public abstract class Employee implements Comparable <Employee> {

    public  Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age=age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    /*
    * Возраст сотрудника
    **/
    protected int age;
    /*
    /ИМЯ РАБОТНИКА
    */
    protected String name;

    /*
    фамилия
    */
    protected String surName;

    //ставка
    protected double salary;

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s - %s,  возраст - ",surName,name,age);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo((o.surName));
        if (surNameRes ==0)
            return name.compareTo(o.name);
        return surNameRes;

    }
}
