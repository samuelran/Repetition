import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numberArray.add(i+1);
        }
        System.out.println(numberArray);
        System.out.println("Choose a number which multipliers you want removed from the array");
        int pickNumber = scanner.nextInt();

        for (int i = 0; i < numberArray.size(); i++) {
            if((numberArray.get(i) % pickNumber == 0) && numberArray.get(i) != pickNumber){
                numberArray.remove(i);
            }
        }
        System.out.println(numberArray);
    }
}