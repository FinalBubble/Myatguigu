/**
 * ClassName: BinaryTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 杨其睿
 * @Create 2024-03-28 7:00
 * @Version 1.0
 */

/**
 * - **十进制（decimal）**
 *   - 数字组成：0-9
 *   - 进位规则：满十进一
 *
 * - **二进制（binary）**
 *   - 数字组成：0-1
 *   - 进位规则：满二进一，以`0b`或`0B`开头
 *
 * - **八进制（octal）：很少使用**
 *   - 数字组成：0-7
 *   - 进位规则：满八进一，以数字`0`开头表示
 *
 * - **十六进制**
 *   - 数字组成：0-9，a-f
 *   - 进位规则：满十六进一，以`0x`或`0X`开头表示。此处的 a-f 不区分大小写
 */
public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 123;		//十进制
        int num2 = 0b101;	//二进制
        int num3 = 0127;	//八进制
        int num4 = 0x12aF;	//十六进制

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

}
