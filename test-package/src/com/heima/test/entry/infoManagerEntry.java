package com.heima.test.entry;


import com.heima.test.controller.StudentController;

import java.util.Scanner;

//程序的入口点
public class infoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("------欢迎黑马管理系统------");
        System.out.println("请输入您的选择：1，学生管理  2，老师管理  3，退出");
        String choice = sc.next();
        switch (choice){
            case "1":
                //System.out.println("学生管理");
                //开启学生管理系统
                StudentController studentController = new StudentController();
                studentController.start();

                break;
            case "2":
                //System.out.println("老师管理");
                break;
            case "3":
                System.out.println("感谢你的使用");
                System.exit(0);
                //退出当前正在运行的JVM虚拟机，即关闭循环，寄
                break;
            default:
                System.out.println("您的输入有误，请重新输入");
                break;




        }
    }

















        }

}
