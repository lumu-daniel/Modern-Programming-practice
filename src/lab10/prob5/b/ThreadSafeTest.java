package lab10.prob5.b;

public class ThreadSafeTest {
    private static Queue obj = new Queue();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            multipleCalls();
            System.out.println(obj.size());

            //We can see that expected output is 1000, so size of our Queue is 1000 now when last thread finished=>
            // => it is equal to expected output, not occurring "race condition" with synchronized keyword
        }
    }

    public static void multipleCalls() {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                obj.add(Math.random());
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Queue getQueueInstance(){
        return obj;
    }

}
