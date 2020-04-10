package codility.lessons.lesson_4.MissingInteger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SolutionTest {

    private Solution solution;

    @BeforeMethod
    public void setUp() {
        solution = new Solution();
    }

    @DataProvider(name = "test")
    public Object[][] createData() {

        int[] ints = new int[100000];
        for (int i = 0; i < 100000; i++) {
            ints[i] = i + 1;
        }

        return new Object[][]{
                new Object[]{new int[]{1, 3, 6, 4, 1, 2}, 5},
                new Object[]{new int[]{1, 2, 3}, 4},
                new Object[]{new int[]{-1, -3}, 1},
                new Object[]{new int[]{-1000000, 1000000}, 1},
                new Object[]{new int[]{0, 2, 3, 4}, 1},
                new Object[]{new int[]{0}, 1},
                new Object[]{new int[]{1, 1, 1, 1, 1}, 2},
                new Object[]{new int[]{1}, 2},
                new Object[]{new int[]{-1, 2, 0, 3, -1, -2, 6}, 1},
                new Object[]{ints, 100001},
                new Object[]{new int[]{1, 3, 6, 4, 1, 2, 5}, 7},
                new Object[]{new int[]{-1, -3, 2}, 1},
                new Object[]{new int[]{-1, -3, 1}, 2},
                new Object[]{new int[]{-1000000, 1}, 2},
                new Object[]{new int[]{1000000}, 1},
                new Object[]{new int[]{999999, 999998, 1000000}, 1},
                new Object[]{new int[]{1, 3, 999999, 999998, 1000000}, 2},
        };
    }

    @Test(dataProvider = "test")
    public void verifySolution(int [] input, int expectedMissingNumber){
        Assert.assertEquals(solution.solution(input), expectedMissingNumber);
    }
}
