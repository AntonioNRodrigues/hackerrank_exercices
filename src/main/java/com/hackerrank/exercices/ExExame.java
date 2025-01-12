package com.hackerrank.exercices;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class ExExame {

    public static int lenht(String s ){
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        Stream.of("toto", "toto", "toto").map(ExExame::lenht);
        int m = m();
        //System.out.println(m);


        CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
        l.add("d");
        l.add("4");
        l.add("5");
        Iterator<String> it = l.iterator();
        l.remove("4");
        while(it.hasNext()){
            System.out.println(it.next());

        }

        var a = new AutoCloseable(){
            @Override
            public void close() {
                System.out.println("close a");
            }
        };
        var b = new AutoCloseable(){
            @Override
            public void close() {
                System.out.println("close B");
            }
        };
        try (a; b){
            System.out.println("RUN");
        }


    }

    public static int m(){
        try {
            //System.exit(0);
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
