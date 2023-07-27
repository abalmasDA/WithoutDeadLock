package org.example;


import java.util.concurrent.TimeUnit;


public class AnimalX {


    public  void roar(AnimalY animalY) throws InterruptedException {
        synchronized (this){
            System.out.println("AnimalX is roaring");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("AnimalX is calling AnimalY's growl");
            animalY.growl(this);
        }
    }
    public void run() {
        System.out.println("AnimalX is running");
    }



}
