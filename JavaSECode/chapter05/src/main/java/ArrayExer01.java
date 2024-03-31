/**
 * ClassName: ArrayExer01
 * Package: PACKAGE_NAME
 * Description:获取arr数组中所有元素的和。
 *
 * @Author 杨其睿
 * @Create 2024-03-27 7:35
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
