package lab9.prob12;

public class MyMain {
    public static void main(String[] args) {

        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        if(System.identityHashCode(singleton1) == System.identityHashCode(singleton2)) {
            System.out.println("It is Singleton");
        }

//
//        MySingletonLazy singletonLazy = MySingletonLazy.getInstance();
//        MySingletonLazy singletonLazy1 = MySingletonLazy.getInstance();

//        if(System.identityHashCode(singletonLazy) == System.identityHashCode(singletonLazy1)) {
//            System.out.println("It is Singleton");
//        }
    }
}
