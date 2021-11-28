package JKlevel.fourth;

        import sun.misc.PostVMInitHook;

        import java.util.Scanner;

public class other implements jiekou {
    //快餐店
    other2 other2 ;
    public void xuanchuan(){
        System.out.println("清仓大甩卖之快餐店特色餐~~~......");
    }
    @Override
    public void songcan(){
        setOther2(other2);
        System.out.println("确认送货人和电话号码");
        System.out.println("姓名:"+other2.getName());
        System.out.println("电话号码:"+other2.getTelephone());
        System.out.println("开始送餐咯~");
    }
    public void setOther2(other2 other2){
        this.other2 = other2;
    }
}
