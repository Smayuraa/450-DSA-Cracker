class Reverse_Array{
     
    static void RevArrFun(int arr[]){
        
        int temp[]=new int[arr.length];

       for(int i=0;i<arr.length;i++)
       {
          temp[i]=arr[arr.length-i-1];
       }
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=temp[i];
       }

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        RevArrFun(arr);

    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    }


}