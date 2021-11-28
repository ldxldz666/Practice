package JKlevel.fourth;

import javax.naming.Name;
import java.util.Random;
import java.util.Scanner;

public class fourthlevel3 {
    public  static void main(String[] args) {
        other2 other2 = new other2();
        other other = new other();
        other.xuanchuan();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String a = sc.next();
        other2.setName(a);
        System.out.println("请输入你的电话号码");
        int b = sc.nextInt();
        other2.setTelephone(b);
        other.setOther2(other2);
        other.songcan();
    }

}
