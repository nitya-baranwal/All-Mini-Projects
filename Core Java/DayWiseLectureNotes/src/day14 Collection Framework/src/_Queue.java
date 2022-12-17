import java.util.LinkedList;
import java.util.Queue;

public class _Queue {

    public static void main(String[] args) {
        //fifo
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
//        q.remove(); //remove 2
        System.out.println(q.isEmpty());
        if(q.size()>0){
            //peek, remove, poll
        }
        System.out.println(q);
        q.peek(); //return 2 without removing it
        q.poll(); //pop of stack: remove 2 from it
        System.out.println(q);
    }
}