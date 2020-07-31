package Java1HW5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee("Ivanov", "ivanov@mail.ru", 45, "CEO", 190000),
                new Employee("Ivanov1", "ivanov@mail.ru", 36,  "Accountant", 45000),
                new Employee("Ivanov2", "ivanov@mail.ru", 52,  "Cook", 40000),
                new Employee("Ivanov3", "ivanov@mail.ru", 27,  "Main Accountant", 80000),
                new Employee("Ivanov4", "ivanov@mail.ru", 48,  "Janitor", 20000)
        };

        for(int i = 0; i < employees.length; ++i) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }

    }
}
