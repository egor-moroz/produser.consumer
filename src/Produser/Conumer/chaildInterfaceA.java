package Produser.Conumer;

/**
 * Created by Егор on 16.03.2016.
 */
public interface chaildInterfaceA extends parentInterface {

    default public void cool(){
        System.out.println("Hellow in A");
    }
}
