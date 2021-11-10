package JKlevel.thirdlevel3;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static Student stu1 = new Student();
    static Student stu2 = new Student();
    static Student stu3 = new Student();
    static Student stu4 = new Student();
    static Student stu5 = new Student();
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> stus = new ArrayList<>();
        Student(stu1);
        Student(stu2);
        Student(stu3);
        Student(stu4);
        Student(stu5);
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);
        stus.add(stu5);
        for (int i = 0; i < stus.size(); i++) {
            System.out.println("学号："+stus.get(i).getsNO()+",姓名："+stus.get(i).getsName()+",性别："+stus.get(i).getsSex()+",年龄："+stus.get(i).getsAge()+",java成绩:"+stus.get(i).getSjava());
        }
        float x = 0;
        x = (stu1.getSjava() + stu2.getSjava() + stu3.getSjava() + stu4.getSjava() + stu5.getSjava()) / 5;
        System.out.println("平均值为" + x);
        int max = stus.get(0).getSjava();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getSjava() > max) {
                max = stus.get(i).getSjava();
            }
        }
        System.out.println("最大值为" + max);
        int min = stus.get(0).getSjava();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getSjava() < min) {
                min = stus.get(i).getSjava();
            }
        }
        System.out.println("最小值为" + min);
    }

    public static void Student(Student stu) {

        System.out.println("请依次输入学号，姓名，性别，年龄和java的课程成绩");
        int sNO = sc.nextInt();
        String sName = sc.next();
        String sSex = sc.next();
        int sAge = sc.nextInt();
        int sjava = sc.nextInt();
        stu.setsNO(sNO);
        stu.setsName(sName);
        stu.setsSex(sSex);
        stu.setsAge(sAge);
        stu.setSjava(sjava);

    }

}
