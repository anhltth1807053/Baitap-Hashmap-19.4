package mainthread;

public class MyThread {
    public static void main(String[] args) {
        LuongCuaToi luongCuaToi = new LuongCuaToi();
        luongCuaToi.start();
        LuongCuaToi luongCuaToi2 = new LuongCuaToi();
        luongCuaToi2.start();

        CungLuongCuaToi luongCuaToi3 = new CungLuongCuaToi();
        Thread t = new Thread(luongCuaToi3);
        t.start();
    }
}
