package HW5;

public class Employee {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private Integer salary;
    private Integer age;

    public Employee(String name,String position,String mail,String phone,Integer salary,Integer age){
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    };

    public Integer getSalary() {
        return salary;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
