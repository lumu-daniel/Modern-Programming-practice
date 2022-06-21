package lab7.prob4.impl;

public interface Quackable {
    public default void quack(){
        System.out.println("quacking");
    }
}

