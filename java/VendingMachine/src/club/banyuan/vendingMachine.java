package club.banyuan;
import java.util.Scanner;
public class vendingMachine {
    private static int insertMoney;
    private static String button="=";
    private static int inCome;
    private static final int password=1110;
    private Drinks A =new Drinks("Juice",10,10);
    private Drinks B =new Drinks("Cola",6,10);
    private Drinks C =new Drinks("Tea",5,5);
    private Drinks D =new Drinks("Water",8,6);
    private Drinks E =new Drinks("Coffee",7,9);
    public vendingMachine(){

    }

    public static int getInsertMoney() {
        return insertMoney;
    }

    public static void setInsertMoney(int insertMoney) {
        vendingMachine.insertMoney = insertMoney;
    }

    public static String getButton() {
        return button;
    }

    public static void setButton(String button) {
        vendingMachine.button = button;
    }

    public static int getInCome() {
        return inCome;
    }

    public static void setInCome(int inCome) {
        vendingMachine.inCome = inCome;
    }

    static void mainMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1. Read product information");
        System.out.println("2. Insert coin");
        System.out.println("3. Press product button");
        System.out.println("4. Press return button");
        System.out.println("9. Open service menu (code required)");
        System.out.println("0. Quit");
    }

     void  mainDrawing(){
         int i =vendingMachine.getInsertMoney();
         String a=A.lightCondition(i);
         String b=B.lightCondition(i);
         String c=C.lightCondition(i);
         String d=D.lightCondition(i);
         String e=E.lightCondition(i);
        System.out.println("*-------------------------*");
        System.out.println("|     Vending  Machine    |");
        System.out.println("*-------------------------*");
        System.out.println("|  A    B    C    D    E  |");
        System.out.println("| $10  $ 6  $ 5  $ 8  $ 7 |");
        System.out.println("| ["+a+"]  ["+b+"]  ["+c+"]  ["+d+"]  ["+e+"] |");
        System.out.println("*-------------------------*");
        System.out.println("|                   [$"+i+"]  |");
        System.out.println("|                         |");
        System.out.println("|            [="+button+"=]        |");
        System.out.println("*-------------------------*");
        System.out.println();
    }

    public  void menuFunction(){
        mainDrawing();
        while(true){
            mainMenu();
            System.out.println("Your choice:");
            Scanner in = new Scanner(System.in);
            int option = Integer.parseInt(in.nextLine());
            switch (option){
                case 1:
                    System.out.println("Your choice:"+option);
                    System.out.println();
                    System.out.println("(1) The displayed products are:");
                    System.out.println("A. Juice ($10)");
                    System.out.println("B. Cola ($6)");
                    System.out.println("C. Tea ($5)");
                    System.out.println("D. Water ($8)");
                    System.out.println("E. Coffee ($7)");
                    System.out.println();
                    break;
                case 2:
                    boolean flag=true;
                    while (flag) {
                    System.out.println("(2) Which coin would you like to insert?");
                    System.out.println("1. $1");
                    System.out.println("2. $2");
                    System.out.println("3. $5");
                    System.out.println("4. $10");
                    System.out.println("0. Go back");
                        System.out.println("Your choice:");
                        int insertCoinsOption = Integer.parseInt(in.nextLine());

                            System.out.println("Your choice:"+insertCoinsOption);
                            switch (insertCoinsOption){
                                case 1:
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()+1);

                                    System.out.println("Your have inserted $1");
                                    mainDrawing();
                                    break;
                                case 2:
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()+2);
                                    System.out.println("Your have inserted $2");
                                    mainDrawing();
                                    break;
                                case 3:
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()+5);
                                    System.out.println("Your have inserted $5");
                                    mainDrawing();
                                    break;
                                case 4:
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()+10);
                                    System.out.println("Your have inserted $10");
                                    mainDrawing();
                                    break;
                                case 0:
                                    System.out.println("Going back!");
                                   flag=false;
                                   break;
                                default:
                                    System.out.println("输入无效！请重新选择！");
                                    break;
                        }
                    }
                    break;
                case 3:
                    boolean flag3=true;
                    while(flag3){
                    System.out.println("Which product button would you like to press?");
                    System.out.println("1.A");
                    System.out.println("2.B");
                    System.out.println("3.C");
                    System.out.println("4.D");
                    System.out.println("5.E");
                    System.out.println("0.Go back");
                        System.out.println("Your choice:");
                        int buttonOption = Integer.parseInt(in.nextLine());
                        System.out.println("Your choice:"+buttonOption);
                        switch (buttonOption) {
                            case 1:
                                System.out.println("You have pressed button A");
                                if (A.lightCondition(vendingMachine.insertMoney).equals("O")) {
                                    System.out.println("橘汁一瓶，谢谢购买！");
                                    vendingMachine.setButton("A");
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()-10);
                                    A.setNumber(A.getNumber()-1);
                                    vendingMachine.setInCome(getInCome()+10);
                                    mainDrawing();
                                } else {
                                    System.out.println("invalid choice");
                                    vendingMachine.setButton("=");;
                                    mainDrawing();
                                }
                                break;
                            case 2:
                                System.out.println("You have pressed button B");
                                if (B.lightCondition(vendingMachine.insertMoney).equals("O")) {
                                    System.out.println("可乐一瓶，谢谢购买！");
                                    vendingMachine.setButton("B");
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()-6);
                                    B.setNumber(B.getNumber()-1);
                                    mainDrawing();
                                    vendingMachine.setInCome(getInCome()+6);
                                } else {
                                    System.out.println("invalid choice");
                                    vendingMachine.setButton("=");
                                    mainDrawing();
                                }
                                break;
                            case 3:
                                System.out.println("You have pressed button C");
                                if (C.lightCondition(vendingMachine.insertMoney).equals("O")) {
                                    System.out.println("茶一瓶，谢谢购买！");
                                    vendingMachine.setButton("C");
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()-5);
                                    C.setNumber(C.getNumber()-1);
                                    vendingMachine.setInCome(getInCome()+5);
                                    mainDrawing();
                                } else {
                                    System.out.println("invalid choice");
                                    vendingMachine.setButton("=");
                                    mainDrawing();
                                }
                                break;
                            case 4:
                                System.out.println("You have pressed button D");
                                if (D.lightCondition(vendingMachine.insertMoney).equals("O")) {
                                    System.out.println("水一瓶，谢谢购买！");
                                    vendingMachine.setButton("D");
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()-8);
                                    D.setNumber(D.getNumber()-1);
                                    vendingMachine.setInCome(getInCome()+8);
                                    mainDrawing();
                                } else {
                                    System.out.println("invalid choice");
                                    vendingMachine.setButton("=");
                                    mainDrawing();
                                }

                                break;
                            case 5:
                                System.out.println("You have pressed button E");
                                if(E.lightCondition(vendingMachine.insertMoney).equals("O")){
                                    System.out.println("咖啡一瓶，谢谢购买！");
                                    vendingMachine.setButton("E");
                                    vendingMachine.setInsertMoney(vendingMachine.getInsertMoney()-7);
                                    E.setNumber(E.getNumber()-1);
                                    vendingMachine.setInCome(getInCome()+7);
                                    mainDrawing();
                                }else{
                                    System.out.println("invalid choice");
                                    vendingMachine.setButton("=");
                                    mainDrawing();
                                }
                                break;
                            case 0:
                                System.out.println("Going back!");
                                flag3=false;
                                break;
                            default:
                                System.out.println("输入无效！请重新选择！");
                                break;
                        }

                    }
                      break;
                case 4:
                    System.out.println("Return button is pressed.");
                    System.out.println("$"+vendingMachine.insertMoney+"has been returned.");
                    vendingMachine.setInsertMoney(0);
                    menuFunction();
                    break;
                case 9:
                    System.out.println("Opening service menu. Access code is required.");
                    System.out.println("Enter access code:");
                    int code = Integer.parseInt(in.nextLine());
                    if(vendingMachine.password==code) {
                        System.out.println("correct code!");
                        System.out.println();
                        boolean flag9=true;
                        while (flag9) {
                            System.out.println("What would you like to do?");
                            System.out.println("1. Inspect machine status");
                            System.out.println("2. Withdraw all money");
                            System.out.println("3. Refill product");
                            System.out.println("4. Change product");
                            System.out.println("0. Go back");
                            System.out.println("You choice:");
                            int serviceOption = Integer.parseInt(in.nextLine());
                            System.out.println("You choice:" + serviceOption);
                            switch (serviceOption) {
                                case 1:
                                System.out.println("(9-1) Machine status");
                                System.out.println("Amount of revenue: $" + vendingMachine.getInCome());
                                System.out.println("Amount of inserted coins: $" + vendingMachine.getInsertMoney());
                                if (A.getNumber() > 0) {
                                    System.out.println("A. Juice ($10) (" + A.getNumber() + "left)");
                                } else {
                                    System.out.println("A. Juice ($10) (sold out)");
                                }
                                if (B.getNumber() > 0) {
                                    System.out.println("B. Cola ($6) (" + B.getNumber() + "left)");
                                } else {
                                    System.out.println("B. Juice ($6) (sold out)");
                                }
                                if (C.getNumber() > 0) {
                                    System.out.println("C. Tea ($5) (" + C.getNumber() + "left)");
                                } else {
                                    System.out.println("C. Tea ($5) (sold out)");
                                }
                                if (D.getNumber() > 0) {
                                    System.out.println("D. Water ($8) (" + D.getNumber() + "left)");
                                } else {
                                    System.out.println("D. Water ($8) (sold out)");
                                }
                                if (E.getNumber() > 0) {
                                    System.out.println("E. Coffee ($7) (" + E.getNumber() + "left)");
                                } else {
                                    System.out.println("E. Coffee ($7) (sold out)");
                                }
                                    break;
                                case 2:
                                    System.out.println("余额"+vendingMachine.getInsertMoney()+"将被提取");
                                    vendingMachine.setInsertMoney(0);
                                    System.out.println("All money is being withdrawn.");
                                    break;
                                case 3:
                                    System.out.println("Which product would you like to refill?");
                                    System.out.println("1. A");
                                    System.out.println("2. B");
                                    System.out.println("3. C");
                                    System.out.println("4. D");
                                    System.out.println("5. E");
                                    System.out.println("0. Go back");
                                    System.out.println("You choice:");
                                    int fullOption = Integer.parseInt(in.nextLine());
                                    System.out.println("You choice:"+fullOption);
                                    if(fullOption==1) {
                                        System.out.printf("You have refilled product A to full.");
                                    }
                                    if(fullOption==2){
                                        System.out.printf("You have refilled product B to full.");
                                    }
                                    if(fullOption==3){
                                        System.out.printf("You have refilled product C to full.");
                                    }
                                    if(fullOption==4){
                                        System.out.printf("You have refilled product D to full.");
                                    }
                                    if(fullOption==5){
                                        System.out.printf("You have refilled product E to full.");
                                    }
                                    if(fullOption==0){
                                        System.out.printf("Go back");
                                        break;
                                    }
                                case 4:
                                    System.out.println("What would you like to do");

                                case 0:
                                    System.out.println("Going back!");
                                    flag9=false;
                                    break;
                                default:
                                    System.out.println("输入无效！请重新选择！");
                                    break;

                            }

                        }
                        }else{
                        System.out.println("Incorrect code!");
                        menuFunction();
                    }

                    break;

                case 0:
                    System.out.println("程序终止。");
                    return;
                default:
                    System.out.println("输入无效！请重新选择！");
                    menuFunction();
            }
        }


    }



}
