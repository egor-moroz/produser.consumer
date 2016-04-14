package Produser.Conumer;

import com.sun.org.apache.xpath.internal.SourceTree;

public class SingleBuffer {
    Integer element = null;

    public synchronized void put(Integer newElement) throws InterruptedException{
        int i = 0;
        System.out.println("haha "+i);
        while (element!=null){
            System.out.println("Produser wait");
            this.wait();
            System.out.println("Produser wait111");
        }
        System.out.println("haha "+(i+1));
        System.out.println();

        this.element = newElement;
        this.notifyAll();

    }

    public synchronized Integer get() throws InterruptedException{
        System.out.println("Consumer in get");
        while(element == null) {
            System.out.println("Consumer wait");
            this.wait();
            System.out.println("Consumer wait111");
        }
        Integer result = this.element;
        this.element = null;
        this.notifyAll();
        return result;
    }
}
