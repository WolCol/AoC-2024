import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Day01Part01 {
    public static void main(String[] args) {
        String dateiPfad = "/Users/wolfs/Documents/GitHub/AoC-2024/src/main/resources/day01.txt";
        List<String> zeilen = InputReader.readInputByLine(dateiPfad);
        List<Integer> leftNums = new ArrayList<>();
        List<Integer> rightNums = new ArrayList<>();

        /*for (int i = 0; i < zeilen.size(); i++) {
            System.out.println("Zeile " + (i + 1) + ": " + zeilen.get(i));
        }*/

        for (int i = 0; i < zeilen.size(); i++) {
            String zeile = zeilen.get(i);
            String[] parts = zeile.split("\\s+");
            leftNums.add(Integer.parseInt(parts[0]));
            rightNums.add(Integer.parseInt(parts[1]));
        }
        Collections.sort(leftNums);
        Collections.sort(rightNums);

        int counter = 0;
        int[] result = new int[zeilen.size()];
        int finalcalc = 0;
        while (counter < leftNums.size() && counter <rightNums.size()) {
            //System.out.println(leftNums.get(counter) + " " + rightNums.get(counter));
            result[counter] = Math.abs(rightNums.get(counter) - leftNums.get(counter));
            finalcalc += result[counter];
            //System.out.println(result[counter]);
            counter++;
        }
        System.out.println("The number is: "+finalcalc);
    }
}