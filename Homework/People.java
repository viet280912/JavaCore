package Homework;

public class People {
    public String name;
    public int age;
    public String Hometown;

    public People(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        Hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return Hometown;
    }

    public void setHometown(String hometown) {
        Hometown = hometown;
    }
}
