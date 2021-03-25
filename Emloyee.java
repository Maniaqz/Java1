package Java1HW5;

class Employee {
    private String fio;
    private int age;
    private int salary;
    private String position;
    private String email;


    public int getAge() {
        return this.age;
    }

    public Employee(String fio, String email, int age, String position, int salary) {
        this.fio = fio;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public void printInfo() {
        System.out.println("ФИО " + this.fio + "; Должность: " + this.position +
                "; Электронная почта: " + this.email + " ; Возраст  " + this.age +
                "; З/П: " + this.salary);
    }
}

