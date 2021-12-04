package HW5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        Employee [] employee = new Employee[5];
        employee[0] = new Employee("Ivan", "Dev.Team", "ivan@mail.dev.team.ru","8900123456",100000,30);
        employee[1] = new Employee("Yuri", "Dev.Team", "yuri@mail.dev.team.ru","8900123457",100000,35);
        employee[2] = new Employee("Stas", "Dev.Team", "stas@mail.dev.team.ru","8900123458",100000,40);
        employee[3] = new Employee("Dima", "Dev.Team", "dima@mail.dev.team.ru","8900123459",100000,45);
        employee[4] = new Employee("Vasia", "Dev.Team", "vasia@mail.dev.team.ru","8900123470",100000,50);

        for (int i = 0; i < employee.length; i++){
            if (employee[i].getAge() >= 40) {
                System.out.println(employee[i].toString());
            }
        }

    }
}
