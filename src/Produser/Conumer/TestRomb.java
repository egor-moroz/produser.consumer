package Produser.Conumer;

import java.sql.SQLException;

/**
 * Created by Егор on 16.03.2016.
 */

abstract class Tack {
    static short s = 17;
    public Tack(short ss) {


        s *= ss;
    }

    public  void testExp() throws SQLException
    {
        s =  45;
        System.out.println(s);
    }

}
