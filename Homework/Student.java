package Homework;

public class Student extends People{
    public String trainingSystem;

    public Student(String name, int age, String hometown, String trainingSystem) {
        super(name, age, hometown);
        this.trainingSystem = trainingSystem;
    }

    public String getTrainingSystem() {
        return trainingSystem;
    }

    public void setTrainingSystem(String trainingSystem) {
        this.trainingSystem = trainingSystem;
    }
    public void DangKy(){
        System.out.println("Đăng ký");
    }
    public void HocBai(){
        System.out.println("Sinh viên " + this.getName() + " đang học bài");
    }
    public void Show(){
        System.out.println("Sinh viên: " + this.getName());
        System.out.println("Tuổi: " + this.getAge());
        System.out.println("Quê quán: " + this.getHometown());
        System.out.println("Bậc học: " + this.getTrainingSystem());
        System.out.println("--------------------------------------");
    }
}
