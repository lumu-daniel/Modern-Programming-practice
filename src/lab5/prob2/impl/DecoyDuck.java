package lab5.prob2.impl;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("displaying");
    }

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
