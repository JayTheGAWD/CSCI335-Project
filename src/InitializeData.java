import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

// This class will read a text file that contains student information.
// It will read and seperate each line into objects.

public class InitializeData {

    static ArrayList<Student> students = new ArrayList<Student>();

    // first you take in the input which is the file. the file contains all the

    public static void readFile() throws IOException {
        File unsortedRecords = new File("C:\\Users\\Justin\\CSCI335-Project\\unsortedinput.txt");

        BufferedReader br = new BufferedReader(new FileReader(unsortedRecords));
        String line;

        while ((line = br.readLine()) != null) {

            String[] stringData = line.split(" ");
            seperateIntoObjects(stringData);
        }
        br.close();

    }

    public static void seperateIntoObjects(String[] formattedData) {
        int id = Integer.parseInt(formattedData[0]);
        String name = formattedData[1];
        int age = Integer.parseInt(formattedData[2]);
        double gpa = Double.parseDouble(formattedData[3]);

        makeObject(id, name, age, gpa);
    }

    public static void makeObject(int studentId, String name, int age, double gpa) {

        Student student = new Student(studentId, name, age, gpa);
        students.add(student);
    }

    public static void printList() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ");
        }
    }

}
