import Homework.Student;
import Homework.Teacher;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Việt",20,"Phủ Lý","Đại Học");
        Teacher teacher1 = new Teacher("Mai",23,"Yên Bái",1000);
        std1.HocBai();
        std1.Show();
        teacher1.Show();
        teacher1.DayHoc();
    }
}