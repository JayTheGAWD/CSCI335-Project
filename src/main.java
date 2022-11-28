import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        ReadData.readFile();
        BinaryInsertion.biInsertionSort(ReadData.students);
        // ReadData.printList();

        exportData.exportSortedList(ReadData.students);

    }
}