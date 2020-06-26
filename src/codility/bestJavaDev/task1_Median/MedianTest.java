package codility.bestJavaDev.task1_Median;

import org.junit.Assert;
import org.junit.Test;

class MedianTest {

    @Test
    public void firstMedianTest() {

        // is
        int[] input = {1, 4, 2, 7};

        // when
        double result = Median.calculateMedian(input);

        // expected
        double expected = 3;

        Assert.assertEquals(3, result, 0);
    }
}
