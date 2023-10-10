package Homework;

public class Teacher extends People{
    public float salary;

    public Teacher(String name, int age, String hometown, float salary) {
        super(name, age, hometown);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void Show(){
        System.out.println("Giáo viên: " + this.getName());
        System.out.println("Tuổi: " + this.getAge());
        System.out.println("Quê quán: " + this.getHometown());
        System.out.println("Bậc học: " + this.getSalary());
        System.out.println("--------------------------------------");
    }
    public void DayHoc(){
        System.out.println("Giáo viên " + this.getName() + " đang dạy học");
    }
}
