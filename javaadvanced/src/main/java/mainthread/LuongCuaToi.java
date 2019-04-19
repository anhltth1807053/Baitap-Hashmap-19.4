package mainthread;

public class LuongCuaToi extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World " + i);
            try {
                Thread.sleep(5* 1000);
            }catch (Exception ex){

            }

        }

    }
}
