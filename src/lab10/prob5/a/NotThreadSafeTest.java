package lab10.prob5.a;

public class NotThreadSafeTest {
    private static Queue obj = new Queue();
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            multipleCalls();
            System.out.println(obj.size());

            //We can see that expected output is 1000, but size of our Queue in when all threads are finished=>
            // => it is less than expected output, reason is "race condition"

            // Multiple threads trying to add element into one node.
        }
    }

    public static void multipleCalls(){
        Runnable r = () -> {
            for (int i = 0; i < 10; i++){
                obj.add(Math.random());
            }
        };
        for (int i = 0; i < 10; i++){
            new Thread(r).start();
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static Queue getQueueInstance(){
        return obj;
    }

}
