package tryOuts;

public class B {

    protected String getString() {
       return a.getString();
    }


    private A a;
    public B() {
        a = new A();
    }

    public A getA() {
        a.getString();
        return a;
    }
}
