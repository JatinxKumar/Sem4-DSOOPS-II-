//
class Employee {
    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calSalary() {
        return bonus + baseSalary;
    }
}

class PartTimeEmployee extends Employee {
    int noofhours;
    int costperhour;

    PartTimeEmployee(int id, String name, int noofhours, int costperhour) {
        super(id, name, 0);
        this.noofhours = noofhours;
        this.costperhour = costperhour;
    }
    @Override
    double calSalary() {
        return noofhours * costperhour;
    }
}
public class ques2 {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = new Employee[2];

        // Pass array of employees
        employees[0] = new FullTimeEmployee(1, "John", 50000, 10000);
        employees[1] = new PartTimeEmployee(2, "Vaibhav", 20, 15);

        // Iterate through the array and display salaries
        for (Employee emp : employees) {
            System.out.println(emp.name + " Salary: " + emp.calSalary());
        }
    }
}
