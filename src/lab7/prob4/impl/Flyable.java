package lab7.prob4.impl;

public interface Flyable {
    public default void fly(){
        System.out.println("fly with wings");
    }
}
