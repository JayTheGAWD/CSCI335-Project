public class Student {
    private final int studentId, age;
    private final double gpa;
    private final String name;

    Student(int studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "id = " + studentId + ", Name = " + name + ", Age = " + age + ", GPA =" + gpa;
    }
}
