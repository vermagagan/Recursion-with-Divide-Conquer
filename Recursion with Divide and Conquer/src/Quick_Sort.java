public class Quick_Sort
{
    public static void quickSort(int arr[], int si, int ei)
    {
        //Base Condition
        if(si >= ei)
            return;
        int pIdx = partItion(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int partItion(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        int arr[] = {3,7,2,8,1,9,4,6,5,0};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
