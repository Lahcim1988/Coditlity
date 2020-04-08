package codility.lessons.lesson_1;

// Task Score 100%
// Correctness 100%
// Performance not assessed

public class BinaryGapString {

    public static void main(String[] args) {

        BinaryGapString gap1 = new BinaryGapString();
        int solution = gap1.solution(1025);
        System.out.println(solution);

    }

    public int solution(int N) {

        String s = Long.toBinaryString(N);

        int modifier = 0;
        if (s.endsWith("0")) {
            modifier = 1;
        }

        String[] split = s.split("1");

        int max = 0;
        for (int i = 0; i < split.length - modifier; i++) {
            int length = split[i].length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
