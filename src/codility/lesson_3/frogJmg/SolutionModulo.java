package codility.lesson_3.frogJmg;

public class SolutionModulo {

    public static void main(String[] args) {

        SolutionModulo solutionModulo = new SolutionModulo();

        System.out.println(solutionModulo.solution2(10, 85, 30)); // 3
        System.out.println(solutionModulo.solution2(1, 1, 3));    // 0
        System.out.println(solutionModulo.solution2(1, 2, 3));    // 1
        System.out.println(solutionModulo.solution2(5, 105, 3));   // 34
        System.out.println(solutionModulo.solution2(3, 999111321, 7));


    }

    // Detected time complexity: O(1)
    // Task Score 100%
    // Correctness 100 %

    private int solution2(int X, int Y, int D){

        if(X == Y) return 0;

        int counter = (Y - X) / D;

        if(X + counter * D >= Y) return counter;

        else return counter + 1;

    }

    private int solution1(int X, int Y, int D){

        if(X == Y) return 0;

        int counter = (Y - X) / D;

        if((Y - X) % D == 0) return counter;

        else return counter + 1;

    }
}
