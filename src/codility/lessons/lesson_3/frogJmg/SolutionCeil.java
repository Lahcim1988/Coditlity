package codility.lessons.lesson_3.frogJmg;

public class SolutionCeil {

    public static void main(String[] args) {


        SolutionCeil solutionCeil = new SolutionCeil();

        System.out.println(solutionCeil.solution(10, 85, 30)); // 3
        System.out.println(solutionCeil.solution(1, 1, 3));    // 0
        System.out.println(solutionCeil.solution(1, 2, 3));    // 1
        System.out.println(solutionCeil.solution(5, 105, 3));   // 34
        System.out.println(solutionCeil.solution(3, 999111321, 7));


    }

    // Detected time complexity: O(1)
    // Task Score 100%
    // Correctness 100 %

    private int solution(int X, int Y, int D) {

     //   if (X == Y) return 0;

        double jumps = (double) (Y - X) / D;

        return (int) Math.ceil(jumps);

    }
}
