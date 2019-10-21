import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestLab5 {

    @Test
    public void testMatrixPlusMethod() {
        // do no change it!!
        int[][] a = {{1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        int[][] b = {{1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] c = {{2, 2, 2, 2}, {2, 2, 2, 2}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        Assert.assertArrayEquals(c, Lab5.plus(a, b));
    }

    @Test
    public void testMatrixMinusMethod() {
        // do no change it!!
        int[][] a = {{2, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        int[][] b = {{1, 0, 0, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] c = {{1, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        Assert.assertArrayEquals(c, Lab5.minus(a, b));
    }

    @Test
    public void testFileInput() {
        int[][] a = {{1, 1, 1, 1}, {0, 0, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        try {
            Assert.assertArrayEquals(a, Lab5.buildIntegerArrayFrom("files/plus.left.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPlusFileOutput() {
        try {
            int[][] left = Lab5.buildIntegerArrayFrom("files/plus.left.in");
            int[][] right = Lab5.buildIntegerArrayFrom("files/plus.right.in");
            int[][] test = Lab5.buildIntegerArrayFrom("files/plus.out.test");
            Lab5.saveIntegerArrayTo(Lab5.plus(left, right), "files/plus.out");
            int[][] result = Lab5.buildIntegerArrayFrom("files/plus.out");
            Assert.assertArrayEquals(test, result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMinusFileOutput() {
        try {
            int[][] left = Lab5.buildIntegerArrayFrom("files/minus.left.in");
            int[][] right = Lab5.buildIntegerArrayFrom("files/minus.right.in");
            int[][] test = Lab5.buildIntegerArrayFrom("files/minus.out.test");
            Lab5.saveIntegerArrayTo(Lab5.minus(left, right), "files/minus.out");
            int[][] result = Lab5.buildIntegerArrayFrom("files/minus.out");
            Assert.assertArrayEquals(test, result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
