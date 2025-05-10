import java.util.PriorityQueue;

public class Sort0s1S2S {
      
    static void SortFun(int arr[])
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int no:arr){
           pq.add(no);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(pq.poll());
        }
    }
    public static void main(String[]args){
        int arr[]={0, 1 ,2 ,0, 1 ,2};
        SortFun(arr);
    }
}
