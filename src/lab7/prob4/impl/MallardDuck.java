package lab7.prob4.impl;

public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("display");
        fly();
        quack();
        swim();
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
