/*
9. Write a Java program that creates two threads, where one thread prints even numbers and 
the other prints odd numbers from 1 to 100.  

 */

package wt.april26.pkg;

public class Question6 {

    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {

        Thread oddThread = new Thread(() -> {
            while (number <= MAX) {
                synchronized (lock) {
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify(); 
                    } else {
                        try {
                            lock.wait(); 
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

       
        Thread evenThread = new Thread(() -> {
            while (number <= MAX) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify(); 
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}


