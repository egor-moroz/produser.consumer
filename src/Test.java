import Produser.Conumer.Bridle;
import Produser.Conumer.Consumer;
import Produser.Conumer.MyComparator;
import Produser.Conumer.SingleBuffer;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeInlineAnnotationReader;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;
import  java.util.Map;

class  Test extends Bridle {
    final int c = 45;
    static  int tt = 48;
    int cc = 55;

    public static int b = 35;




    private final int r = 9;

    public Test(short s) throws IOException {

        super(s);
        throw new IOException();
    }

    public static class hhhhh {
        int b = 88;

        public  void hell() {
            b = 15;
            System.out.println();
            final int m;


        }
    }

    interface ccoi {
        public void hellow();
    }

    private static interface hhh {


        default public  void jhkjh() {
            b = 55;
        }

        public static void hellow() {
            b = 66;
            System.out.println(b);

        }


    }

    public void textException() {
        int x = 5;
        int y = 0;
        tt=66;



try {
  //  FileInputStream fileInputStream = new FileInputStream("kshfjkh");
    System.out.println("after hadleding");
    try {
        throw new StackOverflowError();
    }catch (StackOverflowError error){
        System.out.println("hadled error");
    }

    throw new SQLException();


} catch (SQLException e) {
    System.out.println("handled sqlexception");
    e.printStackTrace();


}
        System.out.println("i go ..__>>>");
    }

    public void method(int a) {
    }

    public void method(int a, double b) {
        System.out.println("int , double");
    }

    public void method(double a, int b) {
        System.out.println("double , int");
    }

    public static void main(String[] args) throws IOException {

        Map<Integer, String> random = new HashMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            random.put((int)(Math.random() * 100), String.valueOf((int) (Math.random() * 100)));
        }

        System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));
LinkedHashSet hashSet =new LinkedHashSet();
        hashSet.add(45);

        Map<Integer, String> sortedMap =
                random.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map: " + Arrays.toString(sortedMap.entrySet().toArray()));


        Test.tt = 88;
        System.out.println(Test.tt);
        Map<String, String> map = new HashMap<>();
        map.put("Hellow", "a");
        map.put("iouoi", "c");
        map.put("jhs", "b");
        MyComparator myComparator = new MyComparator();
        Comparator<Map.Entry<String, String>> com2 =
                Map.Entry.<String, String>comparingByValue();
        Set<Map.Entry<String,String>> mapset = map.entrySet();
        TreeSet<Map.Entry<String,String>> sortedSet = new TreeSet<Map.Entry<String, String>>(com2);
        System.out.println();
      /*  Scanner scanner = new Scanner(System.in);
        float f =  scanner.nextFloat();
        System.out.println("f = "+f);*/
        //Bridle bridle = new Bridle(44);


        Test test = new Test((short)4);
        test.method(44.4, 5);

            test.textException();

        char y = 55;
        System.out.println("Y = " + y);
        final char ch = 33;
        System.out.println("ch = " + ch);
        Consumer consumer = new Consumer(new SingleBuffer());
        System.out.println("HELLOW = ");
        hhh.hellow();
       /* HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 50);
        map.put("d", 40);
        map.put("e", 100);
        map.put("f", 60);
        map.put("g", 110);
        map.put("h", 50);
        map.put("i", 90);
        map.put("k", 70);
        map.put("L", 80);

        Map.Entry.comparingByKey();
        map.entrySet().parallelStream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(12);
        list.stream().sorted().forEach(System.out::println);
        System.out.println(list);
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);


        Arrays.parallelSort(array);

        System.out.println(Arrays.toString(array));


       /* SingleBuffer buffer = new SingleBuffer();
        Consumer consumer = new Consumer(buffer);
        Produser produser = new Produser(0,buffer);
        Thread con = new Thread(consumer);
        con.start();
        Thread prod = new Thread(produser);
        prod.start();*/
        Test test1 = new Test((short)4);

        boolean b1 = true;
        boolean c = false;
        System.out.println(b1 ^ c);

        switch (5) {
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("default");


        }

        int a = 5;
        int b = 10;
        System.out.println("b = " + b);


        metodtarampampam(b);


    }


    public static void metodtarampampam(int b) {
        b = 40;
        System.out.println("b = " + b);


    }


}
