package lab5.prob2.main;

import lab5.prob2.impl.*;

public class MainClass {

    public static void main(String[] args) {
        Duck[] ducks = new Duck[]{
                new MallardDuck(),new DecoyDuck(),new ReadheadDuck(),new RubberDuck()
        };

        for (Duck duck :
                ducks) {
            System.out.println(duck.getClass().getSimpleName() + ":");
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}
