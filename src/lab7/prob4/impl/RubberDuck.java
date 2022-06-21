package lab7.prob4.impl;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("displaying");
        quack();
        swim();
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
