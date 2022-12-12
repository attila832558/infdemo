import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Make a program that generates the lottery numbers
        // 5 numbers between 1 and 90
        // 1. make a list of numbers
        // 2. shuffle the list
        // 3. pick the first 5 numbers
        // 4. sort the numbers
        // 5. print the numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningNumbers = numbers.subList(0, 5);
        Collections.sort(winningNumbers);
        System.out.println(winningNumbers);
        // Powered by AI
    }
}


