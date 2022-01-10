/**
 * Test.java
 * Kevin Lou
 * 2022/01/10
 * A testing class
 */
public class Test {

    /**
     * Tests if the queue works
     */
    public static void main(String[] args) {
        StackQueue<Integer> q = new StackQueue<>();   //[]
        q.enqueue(1);   //[1]
        q.enqueue(2);   //[1,2]
        System.out.println(q.peek());   //[1,2] should print: 1
        System.out.println(q.isEmpty());//[1,2] should print: false
        System.out.println(q.size());   //[1,2] should print: 2
        System.out.println(q.dequeue());//[2]   should print: 1
        System.out.println(q.size());   //[2]   should print: 1
        q.dequeue();
        System.out.println(q.isEmpty());//[]    should print: true
    }

}
