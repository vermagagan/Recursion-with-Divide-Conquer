public class Last_Occurence
{
    public static int lastOccurence(int arr[], int target, int eidx)
    {
        if(eidx == -1)
            return -1;
        if(arr[eidx] != target)
            return lastOccurence(arr, target, eidx-1);
        return eidx;
    }
    public static void main(String args[])
    {
        int arr[] = {2,5,3,6,4,7,2,8,5};
        int target = 5;
        System.out.println("The first Occurence of "+target+" is at  index: "+lastOccurence(arr,target,arr.length-1));
    }
}
