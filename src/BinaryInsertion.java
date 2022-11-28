import java.util.ArrayList;

public class BinaryInsertion {

   // this should return a index so we can place the value in
   // binary search -> want to search for a value
   // but want the index back for the insertion sort.
   // |0------|kxxxxx|
   // ________
   // we have a value of x, and each time we split
   //
   private static int binarySearch(ArrayList<Student> students, int id, int n)

   {
      int beginPos = 0;
      int endPos = n;

      while (beginPos < endPos) {
         // we split array
         int midpoint = (beginPos + endPos) / 2;
         // we then compare the midpoint value to whatever current value we have
         boolean expression = students.get(midpoint).getStudentId() <= students.get(n).getStudentId();

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
   public static void biInsertionSort(ArrayList<Student> students) {

      for (int n = 1; n < students.size(); n++) {
         int key = students.get(n).getStudentId();

         // after we find the index
         int foundIndx = binarySearch(students, key, n);

         // we shift the values to the right
         int adjIndx = n;

         while (adjIndx > foundIndx) {
            // left values will go right
            students.set(adjIndx, students.get(adjIndx - 1));
            adjIndx--;
         }
         students.set(foundIndx, students.get(n));

      }
      // int sortedLoc, k;
      // // our key
      // Student selectedStudentRecord;

      // // running a loop to put each item to its right position

      // for (int i = 1; i < students.size(); i++) {

      // // We store a refernece of the value
      // selectedStudentRecord = students.get(i);

      // System.out.println(selectedStudentRecord.getStudentId());
      // // finds the index to place th value
      // sortedLoc = binarySearch(students, selectedStudentRecord.getStudentId(), i);
      // k = i;

      // // while loc is less than j shift array to the right
      // while (k > sortedLoc) {
      // // students[k + 1] = students[k];
      // students.set(k, students.get(k - 1));
      // k--;
      // }
      // // put selected to its right position
      // students.set(sortedLoc, selectedStudentRecord);
      // }
      // System.out.println("finished main logic");

   }

}
