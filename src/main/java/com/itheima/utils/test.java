package com.itheima.utils;

/**
 * 备注为冯罗伊曼原版
 */
//public class test extends Thread{
//    String word;
//    int delay;
//
//    public test(String word, int delay) {
//        this.word = word;
//        this.delay = delay;
//    }
//    public void run(){
//        try{
//            for(;;){
//                System.out.print(word+" ");
//                sleep(delay);
//            }
//        } catch (InterruptedException e) {
//            return;
//        }
//    }
//
//    public static void main(String[] args) {
//        new test("ping",33).start();
//        new test("pong",100).start();
//
//    }
//}

public class test extends Thread{
    String word;
    int delay;

    public test(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }
    public void run(){
        int a=1;
        try{
            System.out.println();
            for(;;){
        System.out.print(word+(a++)+" ");
        System.out.println("aa");
        sleep(delay);

    }
} catch (InterruptedException e) {
        return;
        }
    }

    public  void main(String[] args) {
        new test("ping",33).start();
        new test("pong",100).start();

    }
}