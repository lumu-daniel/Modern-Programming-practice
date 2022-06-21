package tryOuts;

public interface Iface1 {
    default int myMethod(int x){
        return x;
    }
}
