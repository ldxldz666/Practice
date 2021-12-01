package JKlevel.fifth;

import java.util.ArrayList;

public class level3 {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList();
        list.add(1);
        list.add(2);
        list.remove(1);//移除2
        list.size();
        System.out.println(list.size());
        for (Integer x:list
             ) {
            System.out.println(x);
        }
        list.set(0,10);
        for (Integer x:list
        ) {
            System.out.println(x);
        }
        System.out.println("第一个元素是"+list.get(0));
    }
}
