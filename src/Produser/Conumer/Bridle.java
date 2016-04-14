package Produser.Conumer;

import java.io.IOException;
import java.sql.SQLException;

public class Bridle extends Tack {
    protected  void hay(){
        System.out.println("hey");
    }


    public Bridle(short s) {
        super(s);
        System.out.println(s + 1);
    }
    public static void main(String[] args) throws IOException {
        short s = 55;
        Bridle b = new Bridle(s);
    }
    @Override
    public void testExp() throws StackOverflowError{

    }
}
