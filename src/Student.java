public class Student {
    private final int studentId, age;
    private final String name;
    private final double gpa;

    Student(int studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "id = " + studentId + ", Name = " + name + ", Age = " + age + ", GPA =" + gpa;
    }
}
