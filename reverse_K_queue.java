import java.util.Stack;
import java.util.Queue;
public class reverse_K_queue
{

        public static void main(String[] args)
        {
            System.out.println("ho gaya code");
        }
   
        // Function to reverse first k elements of a queue.
        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
            
            Stack<Integer> st = new Stack<>();
            int shift = k;
          
            while(k>0){
                
                st.push(q.peek());
                q.remove();
                k--;
                
            }
            
            while(!st.isEmpty()){
                
                q.add(st.peek());
                st.pop();
            }
            
            int temp = q.size()-shift;
            
            while(temp > 0){
                
                q.add(q.peek());
                q.remove();
                temp--;
            }
            
          return q;  
            
    }
}