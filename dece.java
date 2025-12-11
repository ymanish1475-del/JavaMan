class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for( int i=0;i<5;i++){
            System.out.println("downloading file..."+(i*20)+"%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
        }
    }
}
public class dece {
    public static void main(String[] args ){
        MyThread t1= new MyThread();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        for( int i=0;i<5;i++){
            System.out.println(i+"main");
        //System.out.println("heheheh");
        // System.out.println("heheheh");
    }
}
}
