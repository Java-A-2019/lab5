import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab5 {

    /**
     * Plus method of Matrix
     * @param a     an integer array
     * @param b     an integer array
     * @return result of plussing a and b
     */
    public static int[][] plus(int[][] a, int[][] b) {
        // your code here.

        return new int[0][0];
    }

    /**
     * Minus method of Matrix
     * @param a     an integer array
     * @param b     an integer array
     * @return result of subtracting a with b
     */
    public static int[][] minus(int[][] a, int[][] b) {
        // your code here.

        return new int[0][0];
    }

    /**
     * 从文件中读取构造一个 integer 二维数组
     * @param filename      a string of filename
     * @return integer 二维数组
     */
    public static int[][] buildIntegerArrayFrom(String filename) throws FileNotFoundException {
        // 创建一个 File 实例
        File file = new File(filename);

        // 创建一个此文件的 Scanner 实例
        Scanner input = new Scanner(file);

        int[][] result = new int[4][4];

        // 读取数据
        // your code here.

        // 关闭文件
        input.close();
        return result;
    }

    /**
     * 将 integer 二维数组保存到文件中
     * @param a
     * @param filename
     */
    public static void saveIntegerArrayTo(int[][] a, String filename) throws FileNotFoundException {
        // 创建一个 File 实例
        File file = new File(filename);

        // 创建一个文件
        PrintWriter output = new PrintWriter(file);

        // 存储数据
        // your code here.

        // 关闭文件
        output.close();
    }

}
