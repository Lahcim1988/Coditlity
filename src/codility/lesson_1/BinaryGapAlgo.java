package codility.lesson_1;

public class BinaryGapAlgo {

    public static void main(String[] args) {

        BinaryGapAlgo gap2 = new BinaryGapAlgo();

        int solution = gap2.solution(32);

        System.out.println(solution);
    }

    public int solution(int N) {

        int counter = 0;
        while (true) {
            if (Math.pow(2, counter) > N) break;
            counter++;
        }
        counter--;

        int maxGap = 0;
        int gap = 0;
        int numberLeft = N;
        while (numberLeft > 0) {
            int pow = (int) Math.pow(2, counter);
            if (pow <= numberLeft) {
                numberLeft = (numberLeft - pow);
                if (gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
            counter--;
        }
        return maxGap;
    }
}
