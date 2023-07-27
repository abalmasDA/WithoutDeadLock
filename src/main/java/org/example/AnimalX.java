package org.example;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AnimalX {
    private final Lock lockAnimalX = new ReentrantLock();

    public void roar(AnimalY animalY) throws InterruptedException {
        lockAnimalX.lock();
        try {
            System.out.println("AnimalX is roaring");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("AnimalX is calling AnimalY's growl");
            animalY.growl(this);
        } finally {
            lockAnimalX.unlock();
        }

    }

    public void run() {
        System.out.println("AnimalX is running");
    }


}
