public class First_Occurence
{
    public static int firstOccurence(int arr[], int target, int sidx)
    {
        if(sidx == arr.length)
            return -1;
        if(arr[sidx] != target)
            return firstOccurence(arr, target, sidx+1);
        return sidx;
    }
    public static void main(String args[])
    {
        int arr[] = {2,5,3,6,4,7,2,8,5};
        int target = 5;
        System.out.println("The first Occurence of "+target+" is at  index: "+firstOccurence(arr,target,0));
    }
}
