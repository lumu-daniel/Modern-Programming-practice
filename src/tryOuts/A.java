package tryOuts;

public class A implements Iface1,Iface2{

    protected String getString(){
        return toString();
    }

    @Override
    public String toString() {
        System.out.printf("Class A");
        return super.toString();
    }

    @Override
    public int myMethod(int x) {
        return x;
    }

    public static void main(String[] args) {
        System.out.println(new A().myMethod(6));
    }
}
