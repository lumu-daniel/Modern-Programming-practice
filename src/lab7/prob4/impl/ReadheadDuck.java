package lab7.prob4.impl;

public class ReadheadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("displaying");
        fly();
        quack();
        swim();
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
