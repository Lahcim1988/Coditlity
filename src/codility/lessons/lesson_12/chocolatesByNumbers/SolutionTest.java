package codility.lessons.lesson_12.chocolatesByNumbers;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SolutionTest {
    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "data")
    public Object [][] testCondition(){
        return new Object [][]{
                new Object[]{10, 4, 5},
                new Object[]{9, 6, 3},
                new Object[]{10, 11, 10},
                new Object[]{100, 1, 100},
                new Object[]{1,1,1},
                new Object[]{24,18,4}
        };
    }

    @Test(dataProvider = "data")
    public void checkSolution(int N, int M, int expected){
        Assert.assertEquals(solution.solution(N, M), expected);
    }

}
