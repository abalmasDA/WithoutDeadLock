package org.example;

/**
 * Змінити завдання №2 Усі можливі способи (які Ви знаєте) вирішити проблему взаємного блокування.
 */


/**
 * Коментарі до коду:
 * 1) Варіант1. Вирішення проблеми DeadLock через locks.ReentrantLock
 */
public class Main {
    public static void main(String[] args) {
        final AnimalX animalX = new AnimalX();
        final AnimalY animalY = new AnimalY();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    animalX.roar(animalY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    animalY.growl(animalX);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}

