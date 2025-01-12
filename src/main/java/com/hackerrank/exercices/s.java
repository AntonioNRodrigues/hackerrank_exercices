package com.hackerrank.exercices;

import java.util.Scanner;

public class s extends Thread{

    s (){
        System.out.println("MyThread");
    }
    public void run(){
        System.out.println("bar");
    }
    public void run(String s){
        System.out.println("baz");
    }


    public static void main(String [] args){

        Scanner myObj = new Scanner(System.in);

        int age = Integer.parseInt(myObj.nextLine());
        System.out.println("" + age);
        double d = Double.parseDouble(myObj.nextLine());
        System.out.println("" + d);
        String s = myObj.nextLine();
        System.out.println(s);


        Thread t = new s(){
            public void run(){

                System.out.println("foo");
            }
        };
        t.start();

    }

}
