package lab9.prob12;

import java.util.Optional;

public class LazySingleton {

        public static LazySingleton instance = null;

        private LazySingleton() {}

    private static LazySingleton createLazySingleton(){
            instance = new LazySingleton();
            return instance;
    }

        public static LazySingleton getInstance() {
            return Optional.ofNullable(instance).orElseGet(LazySingleton::createLazySingleton);
        }
}

