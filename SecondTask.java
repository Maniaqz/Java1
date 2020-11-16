public class SecondTask {
    public static void main(String[] args) {
        MFU utility = new MFU();
        new Thread(() -> utility.scan("A", 4)).start();
        new Thread(() -> utility.print("A", 4)).start();
        new Thread(() -> utility.print("B", 7)).start();
    }

    static class MFU {
        Object mnt1 = new Object();
        Object mnt2 = new Object();

        public void print (String doc, int n){
            synchronized (mnt1){
                System.out.println("Запускается печать документа: " + doc + "\n==========");
                for (int i = 0; i < n ; i++) {
                    System.out.println("Печатается " + i + " страница доркумента " + doc + "...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Печать документа " + doc + " завершена" + "\n==========");
            }
        }

        public void scan (String doc, int n){
            synchronized (mnt2){
                System.out.println("Запускается сканирование документа: " + doc + "\n==========");
                for (int i = 0; i < n ; i++) {
                    System.out.println("Сканируется " + i + "страница доркумента " + doc + "...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Сканирование документа " + doc + " завершена" + "\n==========");
            }
        }

    }
}
