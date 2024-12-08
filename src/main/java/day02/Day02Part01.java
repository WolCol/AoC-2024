import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day02Part01 {
    public  String path = "main/resources/day02.txt";
    public  List<String> lines = InputReader.readInputByLine(path);
    public  int safeNums = 0;

    public void checkOrder(){
        for(int i = 0; i< lines.size(); i++){
            List<Integer> nums = new ArrayList<>();
            String[] parts = lines.get(i).split(" ");
            for(int k=0; k<parts.length; k++){
                nums.add(Integer.parseInt(parts[k]));
            }
            //System.out.println("Line "+(i+1)+" "+ Arrays.toString(parts));

            int amountOfSameNumsAsc = 0;
            int amountOfSameNumsDesc = 0;

            for(int j=0; j<parts.length-1; j++) {
                int absoluteDiff = Math.abs(nums.get(j) - nums.get(j+1));
                if (nums.get(j) < nums.get(j + 1) && absoluteDiff >= 1 && (absoluteDiff <= 3)){
                    amountOfSameNumsAsc++;
                    //System.out.println("Part "+(j)+" is ascending");
                }
                else if(nums.get(j) > nums.get(j + 1) && (absoluteDiff >= 1) && (absoluteDiff <= 3)){
                    amountOfSameNumsDesc++;
                    //System.out.println("Part "+(j)+" is descending");
                }
                if(nums.size() == amountOfSameNumsAsc+1 || nums.size() == amountOfSameNumsDesc+1){
                    safeNums++;
                    //System.out.println("Safe nums: "+safeNums);
                }
            }
        }
        System.out.println("");
        System.out.println("Safe nums: "+safeNums);
    }

    public static void main(String[] args) {
        Day02Part01 day02Part01 = new Day02Part01();
        day02Part01.checkOrder();
    }
}