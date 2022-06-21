package lab5.prob2.impl;

public class ReadheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("displaying");
    }

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }

    @Override
    public void quack() {
        System.out.println("quacking");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
