package lesson4;

public class Threads implements Runnable{
    static Object obj = new Object();
    static volatile String firstSym = "A";

    private String firstLetter;
    private String nextLetter;

    public Threads(String currentLetter, String nextLetter) {
            this.firstLetter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (obj) {
                    try {
                        while (firstSym != firstLetter)
                            obj.wait();
                        System.out.print(firstLetter);
                        firstSym = nextLetter;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

}
