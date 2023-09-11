package Start3.Tsak2;

public class Freelancer extends Employee {

    public Freelancer(String name, String surName,int age, double salary) {
        super(name, surName,age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s  %s ; Возраст - %d, фрилансер, \n \t\t  часовая ставка - %.2f",surName,name,age,salary);
    }
}
