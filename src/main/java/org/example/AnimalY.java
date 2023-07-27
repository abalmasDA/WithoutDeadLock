package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AnimalY {
    private final Lock lockAnimalY = new ReentrantLock();

    public void growl(AnimalX animalX) throws InterruptedException {
        lockAnimalY.lock();
        try {
            System.out.println("AnimalY is growling");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("AnimalY is calling AnimalX's run");
            animalX.run();
        } finally {
            lockAnimalY.unlock();
        }

    }


}
