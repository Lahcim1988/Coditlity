package codility.bestJavaDev.task1_Median;

import java.util.Arrays;

public class Median {

    public static void main(String[] args) {
        int[] input = {1, 4, 2, 7};
        Median median = new Median();
        System.out.println(median.calculateMedian(input));

    }

    public static double calculateMedian(int [] numbers){

        int numbersLength = numbers.length;
        int numbersMidNam = numbersLength / 2;
        int numbersMidNum2 = numbersLength / 2 - 1;

        int [] sortedNumbers = Arrays.stream(numbers).sorted().toArray();

        if(numbersLength % 2 == 0){
            return (sortedNumbers[numbersMidNam] + sortedNumbers[numbersMidNum2]) / 2;
        }else {
            return sortedNumbers[numbersMidNam] / 2;
        }
    }
}
