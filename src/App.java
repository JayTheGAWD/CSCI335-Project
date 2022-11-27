import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.until.ArrayList;
import java.unntil.List;
import java.until.Scanner;

//Binary Search Program that sorts student records where the student ID is the sorting key

public class BinaryInsertionSort {
    public static void public static void main(String[] args) {
        throws IOException



        // input TXT containing student records unsorted
        java.util.Scanner filescanner = new Scanner(new File("C:\Users\Justin\New folder\CSCI335 PROJECT JUSTIN M\unsortedinput.txt"))
        List<String> inputRecords = new ArrayList<>();
        while(filescanner.hasNext())
        inputRecords.add(filescanner.nextLine());
    
    }Student[]=studentRecords=new Student[inputRecords.size()];

    int i=0;for(
    string line:inputRecords){
        String[] oneStudentRecord = line.split("");
        int studentId = Integer.parseInt(oneStudentRecord[0].trim());
        String name = oneStudentRecord[1].trim()
        int age = Integer.parseInt(oneStudentRecord[2].trim());
        double gpa = Double.parseDouble(oneStudentRecord[3].trim());
        studentRecords[i++] = new Student(studentId,name,age,gpa);
    }}
    // Creates output file in sorted order

    FileWriter outputToFileWriter = new FileWriter("C:\\Users\\Public\\Downloads\\sortedOutput.txt");

    // PRESORT
    outputToFileWriter.write("Before Sorting\n");for(Student student:studentRecords)outputToFileWriter.write(student.toString()+"\n");

    // sort records
sort(studentRecords, studentRecords.length);

//POST SORT
outputToFileWriter.write("\n\nAfter Sorting\n");
for(Student student : studentRecords)outputToFileWriter.write(student.toString() + "\n");
outputToFileWriter.close();

private static int binarySearch(Student[] arr, int item, int, low, int high)
{
    if (high <= low)
    return (item > arr[low].getStudentId())? (low + 1): low;
    int mid = (low + high)/2;
    if(item == arr[mid].getStudentId())
    return mid+1;
    if(item > arr[mid].getStudentId.())
    return binarySearch(arr, item, mid+1, high);
    return binarySearch(arr, item, low, mid-1);


    // sort the input arrays based on student id
    private static void sort(Student[] arr, int n) {
        int i, sortedLoc, k;
        Student selectedStudentRecord;

        for (i = 1; i < n; ++i) {
            k = i - 1;

            // Select an index
            selectedStudentRecord = arr[i];

            // Find correct location with binary search
            sortedLoc = binarySearch(arr, selectedStudentRecord.getStudentId(), 0, k);

            // while the location is less than j shirft arrya to right
            while (k >= sortedLoc) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = selectedStudentRecord;
        }
    }
}

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