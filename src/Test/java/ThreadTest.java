public class ThreadTest {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.thread2.start();
        b.thread1.start();

    }
}
    class Bank implements  Runnable {
        Thread thread1, thread2;

        Bank() {
            thread1 = new Thread(this);
            thread2 = new Thread(this);
        }

        @Override
        public void run() {
            printMess();
        }

        public void printMess() {
            System.out.println(Thread.currentThread().getName() + "正在使用这个方法");
            synchronized (this) {//当一个线程使用同步块时，其他线程必须等待
                try {
                    Thread.sleep(2000);
                } catch (Exception exp) {
                }
                System.out.println(Thread.currentThread().getName() + "正在使用这个同步块");
            }

        }
    }