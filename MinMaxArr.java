class Pair{
    int min ,max;
    Pair(int min,int max){
        this.min=min;
        this.max=max;
    }
}
public class MinMaxArr {
    public static Pair MinMaxArrFun(int arr[])
    {
        if(arr==null||arr.length==0)
        {
            return null;
        }
        int min =arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        return new Pair(min,max);
    }

    public static void main(String args[]){
        int arr[]={2,4,1,70,400,43};
        Pair result=MinMaxArrFun(arr);

        if(result==null){
            System.out.println("array is empty");
        }
        else {
            System.out.println(result.min);
             System.out.println(result.max);
        }
    }

}
