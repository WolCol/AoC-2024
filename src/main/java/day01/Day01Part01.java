import java.util.List;

public class Day01Part01 {
    public static void main(String[] args) {
        String dateiPfad = "/Users/wolfs/Documents/GitHub/AoC-2024/src/main/resources/day01.txt";
        List<String> zeilen = InputReader.readInputByLine(dateiPfad);

        for (String zeile : zeilen) {
            System.out.println("Zeile: " + zeile);
        }
    }
}