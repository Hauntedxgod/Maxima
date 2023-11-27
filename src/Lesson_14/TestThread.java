package Lesson_14;

import java.beans.IntrospectionException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {


    public static void main(String[] args) throws InterruptedException {


        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();



        thread1.join();
        thread2.join();

        runner.finished();
    }

        static class Runner {

            Random random = new Random();

            private Account account1 = new Account();
            private Account account2 = new Account();

            private Lock lock1 = new ReentrantLock();
            private Lock lock2 = new ReentrantLock();

            public void takeLocks(Lock lock1 , Lock lock2){
                boolean firstLockTaken = false;
                boolean secondLockTaken = false;

                while (true){
                    try {
                        firstLockTaken = lock1.tryLock();
                        secondLockTaken = lock2.tryLock();
                    } finally {
                        if (firstLockTaken && secondLockTaken){
                            return;
                        }
                        if (firstLockTaken ){
                            lock1.unlock();
                        }
                        if(secondLockTaken){
                            lock2.unlock();
                        }
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
            public void firstThread() {
                for (int i = 0; i < 10000; i++) {
                    takeLocks(lock1 , lock2);
                    lock1.lock();
                    lock2.lock();
                    try {

                        Account.transfer(account1, account2, random.nextInt(100));
                    } finally {
                        takeLocks(lock1 , lock2);
                    }
                }
            }



            public void secondThread() {
                for (int i = 0; i < 10000; i++) {
                    lock2.lock();
                    lock1.lock();
                    try {

                        Account.transfer(account2, account1, random.nextInt(100));

                    } finally {
                        takeLocks(lock1 , lock2);
                    }
                }
            }

            public void finished() {
                System.out.println(account1.getBalance());
                System.out.println(account2.getBalance());
                System.out.println("All" + (account1.getBalance() + account2.getBalance()));
            }

            class Account {

                private int balance = 10000;

                public int getBalance() {
                    return balance;
                }

                public void addToDeposit(int amount) {
                    balance += amount;
                }

                public void withDraw(int amount) {
                    balance -= amount;
                }

                public static void transfer(Account acct1, Account acct2, int amount) {
                    acct1.withDraw(amount);
                    acct2.addToDeposit(amount);
                }
            }
        }
    }


