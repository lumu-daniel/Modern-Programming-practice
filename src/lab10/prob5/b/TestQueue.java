package lab10.prob5.b;
import static org.junit.Assert.*;

import lab10.prob5.a.NotThreadSafeTest;
import org.junit.Test;


public class TestQueue {

    private static Queue obj = ThreadSafeTest.getQueueInstance();
    private static lab10.prob5.a.Queue obj2 = NotThreadSafeTest.getQueueInstance();

    @Test
    public void testThreadNotSafe(){
        NotThreadSafeTest.multipleCalls();
        assertFalse(obj2.size() == 100);
    }

    @Test
    public void testThreadSafe(){
        ThreadSafeTest.multipleCalls();
        assertEquals(obj.size(), 100 );
    }

}
