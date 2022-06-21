package lab5.prob2.impl;

public class RubberDuck extends Duck{
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
        System.out.println("Squeaking");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
