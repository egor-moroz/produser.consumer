package Produser.Conumer;


public class Produser implements Runnable {
    SingleBuffer buff;
    Integer elem;
    public Produser(Integer elem,SingleBuffer buff){
        this.elem = elem;
        this.buff = buff;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("element" + elem + "prodused");

            try {
               // Thread.sleep(5000);
                buff.put(elem++);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
