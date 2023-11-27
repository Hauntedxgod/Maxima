package Lesson_14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before cooling method run");


        FirsRunner runner = new FirsRunner();
        runner.start();
        Thread secondRunner = new Thread(new SecondRunner());
        secondRunner.start();
        System.out.println("After cooling method run");
    }
}


class FirsRunner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 is printing " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class SecondRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 is printing " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}





