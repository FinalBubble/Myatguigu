/**
 * ClassName: ArrayExer02
 * Package: PACKAGE_NAME
 * Description:使用二维数组打印一个 10 行杨辉三角。
 *
 * @Author 杨其睿
 * @Create 2024-03-27 7:37
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int yanghui[][] = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == i){
                    yanghui[i][j] = 1;
                }else {
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
