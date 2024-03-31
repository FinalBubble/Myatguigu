import java.util.Scanner;

/**
 * ClassName: WeekArrayTest
 * Package: PACKAGE_NAME
 * Description:
 *              用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 *              {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * @Author 杨其睿
 * @Create 2024-03-26 21:58
 * @Version 1.0
 */
public class WeekArrayTest {
    public static void main(String[] args) {
        //1. 声明并初始化星期的数组
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        //2. 使用Scanner从键盘获取1-7范围的整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入[1-7]范围的整数：");
        int day = scanner.nextInt();

        if (day < 1 || day > 7){
            System.out.println("你输入的输入非法");
        }else {
            //3. 根据输入的整数，到数组中相应的索引位置获取指定的元素（即：星期几）
            System.out.println("对应的星期为：" + weeks[day - 1]);
        }
        scanner.close();

    }
}
