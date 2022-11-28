import java.util.ArrayList;

public class BinaryInsertion {

   // this should return a index so we can place the value in
   // binary search -> want to search for a value
   // but want the index back for the insertion sort.
   // |0------|kxxxxx|
   // ________
   // we have a value of x, and each time we split
   //
   private static int binarySearch(ArrayList<Student> students, Student key, int endPos) {
      int beginPos = 0;

      while (beginPos <= endPos) {
         // we find the midpoint
         int midpoint = beginPos + (endPos - beginPos) / 2;

         Student studentInQuestion = students.get(midpoint);

         // if the key and studentInQuestion are the same then returns one position to
         // the right of midpoint

         if (key.getStudentId() == studentInQuestion.getStudentId())
            return midpoint + 1;

         // if not update parameters to continue splitting

         if (key.getStudentId() > studentInQuestion.getStudentId()) {
            beginPos = midpoint + 1;
         } else {
            endPos = midpoint - 1;
         }

      }
      return beginPos;

   }

   // This method sorts a list of students using insertion sort based on their ids
   // using also a binary search. This is done in order to decrease the number
   // of comparisions done through solely using insertion sort.
   public static void biInsertionSort(ArrayList<Student> students) {

      for (int n = 1; n < students.size(); n++) {
         Student key = students.get(n);
         int adjIndx = n - 1;

         // after we find the index
         int foundIndx = binarySearch(students, key, adjIndx);

         // we shift the left values to the right
         while (adjIndx >= foundIndx) {

            students.set(adjIndx + 1, students.get(adjIndx));
            adjIndx--;
         }
         // we place the original value in the correct position
         students.set(adjIndx + 1, key);

      }

   }

}
