/*
阶段一的项目：谷粒记账软件的实现
 */
public class GuiAccount {
    public static void main(String[] args) {

        boolean isFlag = true;

        //初始金额
        int balance = 10000;

        //记录收支的说明
        String info = "";

        while (isFlag){
            System.out.println("\n-----------------谷粒记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   请选择(1-4)：");

            char selection = Utility.readMenuSelection();//获取用户的选择： '1' '2' '3' '4'

            switch (selection){
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说  明\n");
                    System.out.println(info);
                    System.out.println("------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money1 = Utility.readNumber();

                    if (money1 > 0){
                        balance += money1;
                    }

                    System.out.print("本次收入说明：");
                    String addDesc = Utility.readString();

                    info += "收入\t" + balance + "\t\t" + money1 + "\t" + addDesc + "\n";

                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNumber();

                    if (money2 > 0){
                        balance -= money2;
                    }

                    System.out.print("本次支出说明：");
                    String minusDesc = Utility.readString();

                    info += "收入\t" + balance + "\t\t" + money2 + "\t" + minusDesc + "\n";

                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '4':
                    System.out.print("\n确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }

        }
    }
}
