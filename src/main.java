import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        InitializeData.readFile();
        BinaryInsertion.biInsertionSort(InitializeData.students);
        InitializeData.printList();

    }
}