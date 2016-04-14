package Produser.Conumer;

public class Consumer implements Runnable {
    SingleBuffer buff;
    Integer element;
    private int count = 55;
    public Consumer(SingleBuffer buff){
        this.buff = buff;
    }
    @Override
    public void run() {
        while (true) {
            try {
                element = buff.get();
                Thread.sleep(6000);
                System.out.println("consumer element = " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            
        }
    }
}
