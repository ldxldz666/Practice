package JKlevel.fifth;
 class fifthlevel1 extends Thread{
    @Override
    public void run(){
        System.out.println("---运行程序---");
        System.out.println("A通知B帮忙");
        System.out.println("A开始做任务1");
        try {
            new second().start();
            System.out.println("---A线程等待5秒---");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A处理任务1完成");
    }

}

class second extends Thread{
    @Override
    public void run(){
        System.out.println("B开始做任务2");
        try {
            System.out.println("此时等待3秒");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B处理任务2结束");
    }
}