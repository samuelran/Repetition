import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<String> arrayOfWords = new ArrayList();
        File file = new File("src/Exercise3Words.txt");

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                arrayOfWords.add(line);
            }
        } catch (FileNotFoundException var5) {
        }

        System.out.println(arrayOfWords);
        int numberOfWords = arrayOfWords.size();
        System.out.println("the amount of words in the file is " + numberOfWords);

    }
}
