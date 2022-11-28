import java.util.ArrayList;

public class BinaryInsertion {

   // this should return a index so we can place the value in
   // binary search -> want to search for a value
   // but want the index back for the insertion sort.
   // |0------|kxxxxx|
   // ________
   // we have a value of x, and each time we split
   //
   private static int binarySearch(ArrayList<Student> students, int id, int k)

   {
      int beginPos = 0;
      int endPos = k;

      while (beginPos < endPos) {
         // we split array
         int midpoint = (beginPos + endPos) / 2;
         // we then compare the midpoint value to whatever current value we have
         boolean expression = students.get(midpoint).getStudentId() <= students.get(k).getStudentId();

         if (expression) {
            beginPos = midpoint + 1;

         } else {
            endPos = midpoint;
         }
      }

      return beginPos;

      // if (high <= low)
      // return (item > students.get(low).getStudentId()) ? (low + 1) : low;
      // int mid = (low + high) / 2;
      // if (item == students.get(mid).getStudentId())
      // return mid + 1;
      // if (item > students.get(mid).getStudentId())
      // return binarySearch(students, item, mid + 1, high);
      // else
      // return binarySearch(students, item, low, mid - 1);

   }

   // sort the input arrays based on student id
   private static void biInsertionSort(ArrayList<Student> students) {
      int sortedLoc, k;
      Student selectedStudentRecord;

      // running a loop to put each item to its right position

      for (int i = 1; i < students.size(); ++i) {
         k = i - 1;

         // Select an item
         selectedStudentRecord = students.get(k);

         // finds the index to place th value
         sortedLoc = binarySearch(students, selectedStudentRecord.getStudentId(), k);

         // while loc is less than j shift array to the right
         while (k >= sortedLoc) {
            // students[k + 1] = students[k];
            students.set(k + 1, students.get(k));
         }
         // put selected to its right position
         students.set(k + 1, selectedStudentRecord);
      }
   }
}
