import java.util.PriorityQueue;

public class KthElem {
    public static int KthElemFun(int arr[],int k){

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int no:arr){
            pq.add(no);
        }
        for(int i=1;i<k;i++)
        {
           pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[]args){
        int[] arr={7, 10, 4, 3, 20, 15};
        int k=3;
       int result= KthElemFun(arr,k);
       System.out.print(result);
    }
}
