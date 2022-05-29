package com.duckburrito.len.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This is the class that implements the change System.
 */
public class SmallChangeSysOOP {

    private double money = 0;

    private double balance = 0;

    private String details = "==============零钱通明细================";

    private String note = "";

    private String key = "";

    private Date date;

    Boolean loop = true;

    Scanner scanner = new Scanner(System.in);

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu() {
        do {
            System.out.println("\n==============零钱通菜单================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.print("请选择(1-4): ");
            key = scanner.next();

            switch (key) {
                case "1" :
                    detail();
                    break;
                case "2" :
                    income();
                    break;
                case "3" :
                    pay();
                    break;
                case "4" :
                    exit();
                    break;
                default:
                    System.out.println("选择有误，重新输入：");
            }
        } while (loop);
        System.out.println("退出了零钱通项目");
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("入账金额应该大于0！");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.println("消费");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在0 ~ " + balance + "之间");
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        /*
         * (1)
         * (2) Use while + break to handle incoming input.
         * (3) After exiting while and then judging whether choice is y or n.
         */
        String choice = "";

        /*
         * Just judge whether choice is y or n.
         */
        while (true) {
            System.out.print("你确定要退出码？ (y/n)\t");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if (choice.equals("y")) {
            loop = false;
        }
    }
}
