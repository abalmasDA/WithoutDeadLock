package org.example;

import java.util.concurrent.TimeUnit;


public class AnimalY {

    public void growl(AnimalX animalX) throws InterruptedException {
        synchronized (this) {
            System.out.println("AnimalY is growling");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("AnimalY is calling AnimalX's run");
            animalX.run();
        }
    }
}
