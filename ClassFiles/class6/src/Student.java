public class Student {
    //Caitlyn
    private String name;
    //19
    private int age;
    //14
    private int grade;

    //Constructor
    public Student(String nm, int age, int grade) {
        this.name = nm;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ". My age is "
                + this.age + ". My grade is " + this.grade;
    }
}
