package Start3.Tsak2;

/*
* Обычный Рабочий
* */
public class Worker extends Employee{

    public Worker(String name, String surName,int age, double salary) {
        super(name, surName,age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s  %s; Возраст - %d, рабочий \n\t\t  оклад - %.2f",surName,name,age,salary);
    }
}
