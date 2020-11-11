package lesson4;


public class Main {
    static Object obj = new Object();
    static volatile String firstSym = "A";

    public static void main (String[] args) {
        Thread t1 = new Thread(new Threads("A", "B"));
        t1.start();

        Thread t2 = new Thread(new Threads("B", "C"));
        t2.start();

        Thread t3 = new Thread(new Threads("C", "A"));
        t3.start();

        Thread test1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {
                        try {
                            while (firstSym != "A")
                                obj.wait();
                            System.out.print("A");
                            firstSym = "B";
                            obj.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        test1.start();

        Thread test2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {
                        try {
                            while (firstSym != "B")
                                obj.wait();
                            System.out.print("B");
                            firstSym = "C";
                            obj.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        test2.start();

        Thread test3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {
                        try {
                            while (firstSym != "C")
                                obj.wait();
                            System.out.print("C");
                            firstSym = "A";
                            obj.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        test3.start();

    }






}
