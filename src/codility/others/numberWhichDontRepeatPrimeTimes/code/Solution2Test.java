package codility.others.numberWhichDontRepeatPrimeTimes.code;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static codility.others.numberWhichDontRepeatPrimeTimes.code.Solution2.isPrime;
import static java.util.Arrays.fill;

public class Solution2Test {

    private Solution2 solution;

    @BeforeTest
    public void setUp() {
        solution = new Solution2();
    }

    @DataProvider(name = "test")
    public Object[][] createData() {

        int[] B = new int[97]; // prime number
        fill(B, 1);
        int[] B2 = new int[98];
        fill(B2, 1);

        return new Object[][]{
                new Object[]{new int[]{2, 3, 9, 2, 5, 1, 3, 7, 10},
                        new int[]{2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10},
                        new int[]{2, 9, 2, 5, 7, 10}},
                new Object[]{new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 1, 5, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 5},
                        new int[]{1, 2, 3}},
                new Object[]{new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 1, 5, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 1, 1, 5, 5, 5},
                        new int[]{2, 3}},
                new Object[]{new int[]{2, 3, 9, 2, 5, 1, 3, 7, 14},
                        new int[]{2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10},
                        new int[]{2, 9, 2, 5, 7, 14}},
                new Object[]{new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2},
                        new int[]{2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10},
                        new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2}},
                new Object[]{new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2},
                        new int[]{2, 2, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10},
                        new int[]{}},
                new Object[]{new int[]{},
                        new int[]{2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10},
                        new int[]{}},
                new Object[]{new int[]{},
                        new int[]{},
                        new int[]{}},
                new Object[]{new int[]{1, 2, 3},
                        new int[]{},
                        new int[]{1, 2, 3}},
                new Object[]{new int[]{1, 2, 3},
                        B,
                        new int[]{2, 3}},
                new Object[]{new int[]{1, 2, 3},
                        B2,
                        new int[]{1, 2, 3}},
        };
    }

    @Test(dataProvider = "test")
    public void verifySolution(int[] inputA, int[] inputB, int[] expected) {
        Assert.assertEquals(solution.getNumberWhichDontRepeatPrimeTimes(inputA, inputB), expected);
    }

    @DataProvider(name = "prime")
    public Object[][] createDataNumbers() {
        return new Object[][]{
                new Object[]{0, false},
                new Object[]{1, false},
                new Object[]{2, true},
                new Object[]{3, true},
                new Object[]{4, false},
                new Object[]{97, true},
                new Object[]{98, false},
        };
    }

    @Test(dataProvider = "prime")
    public void verifyPrimeNumber(int number, boolean expected) {

        Assert.assertEquals(isPrime(number), expected);
    }
}
