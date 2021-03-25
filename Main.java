public class Main {

    public static void main(String[] args) {
        System.out.println("1 задание:");
        Thread t1 = new Thread(new WaitNotifyClass('A', 'B'));
        Thread t2 = new Thread(new WaitNotifyClass('B', 'C'));
        Thread t3 = new Thread(new WaitNotifyClass('C', 'A'));
        t1.start();
        t2.start();
        t3.start();
    }

    static volatile char c = 'A';
    static  Object mnt = new Object();

    static class WaitNotifyClass implements Runnable {
        private char currentLetter;
        private char nextLetter;

        public WaitNotifyClass (char currentLetter, char nextLetter){
            this.currentLetter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5 ; i++) {
                synchronized (mnt) {
                    try {
                        while (c != currentLetter)
                        mnt.wait();
                        System.out.print(currentLetter);
                        c = nextLetter;
                        mnt.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
