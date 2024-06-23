package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void robTest() {
        Solution solution = new Solution();
        int[] numsOne = new int[]{1, 2, 3, 1};
        int[] numsTwo = new int[]{2,7,9,3,1};
        Assert.assertEquals(4, solution.rob(numsOne));
        Assert.assertEquals(12, solution.rob(numsTwo));
    }

}