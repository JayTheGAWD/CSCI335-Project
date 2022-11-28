import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class exportData {

   static File sortedData;

   public static void createExportFile() throws IOException {

      sortedData = new File("sortedInput.txt");

      if (sortedData.createNewFile()) {
         System.out.println("File created at: " + sortedData.getAbsolutePath());

      } else {
         System.out.println("File already created at: " + sortedData.getAbsolutePath());
      }
   }

   public static void exportSortedList(ArrayList<Student> data) throws IOException {
      // first we create the file
      createExportFile();

      // then write the data of each object of array list.
      String studentInfo = "";

      for (Student stud : data) {

         studentInfo += compileData(stud.getStudentId(), stud.getName(), stud.getAge(), stud.getGpa()) + "\n";

      }
      FileWriter writeFile = new FileWriter("sortedInput.txt");
      writeFile.write(studentInfo);
      System.out.println("Data has succesfully been exported to " + sortedData.getAbsolutePath());
      writeFile.close();

   }

   private static String compileData(int studentId, String name, int age, double gpa) {
      return studentId + " " + name + " " + age + " " + gpa;
   }

}
