import java.util.List;
import java.util.ArrayList;

public class Day01Part02 {
    public static String dateiPfad = "main/resources/day01.txt";
    public static List<String> zeilen = InputReader.readInputByLine(dateiPfad);
    public static List<Integer> leftNums = new ArrayList<>();
    public static List<Integer> rightNums = new ArrayList<>();
    public static int simScore;
    public static int amountOfSims;
    public static int solution;

    public static void splitLists(){
        for(int i = 0; i < zeilen.size(); i++) {
            String zeile = zeilen.get(i);
            String[] parts = zeile.split("\\s+");
            leftNums.add(Integer.parseInt(parts[0]));
            rightNums.add(Integer.parseInt(parts[1]));
            System.out.println(leftNums.get(i) + " " + rightNums.get(i));
        }
    }

    public static void compareNums(){
        simScore =0;
        for(int i=0; i<leftNums.size(); i++){
            for(int j=0; j<rightNums.size(); j++){
                if(leftNums.get(i).equals(rightNums.get(j))){
                    amountOfSims++;
                }
            }
            simScore += leftNums.get(i)*amountOfSims;
            amountOfSims = 0;
        }
    }

    public static void main(String[] args) {
        splitLists();
        compareNums();
        System.out.println("The number is: "+simScore);
    }
}
