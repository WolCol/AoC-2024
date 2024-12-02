import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Day01Part01 {
    public static String dateiPfad = "main/resources/day01.txt";
    public static List<String> zeilen = InputReader.readInputByLine(dateiPfad);
    public static List<Integer> leftNums = new ArrayList<>();
    public static List<Integer> rightNums = new ArrayList<>();
    public static int counter = 0;
    public static int[] result = new int[zeilen.size()];
    public static int solution = 0;

    public static void sortLists(){
        for(int i = 0; i < zeilen.size(); i++) {
            String zeile = zeilen.get(i);
            String[] parts = zeile.split("\\s+");
            leftNums.add(Integer.parseInt(parts[0]));
            rightNums.add(Integer.parseInt(parts[1]));
        }
        Collections.sort(leftNums);
        Collections.sort(rightNums);
    }

    public static void calcSolution(){
        while (counter < leftNums.size() && counter <rightNums.size()) {
            //System.out.println(leftNums.get(counter) + " " + rightNums.get(counter));
            result[counter] = Math.abs(rightNums.get(counter) - leftNums.get(counter));
            solution += result[counter];
            //System.out.println(result[counter]);
            counter++;
        }
    }

    public static void main(String[] args) {
        sortLists();
        calcSolution();
        System.out.println("The number is: "+solution);
    }
}