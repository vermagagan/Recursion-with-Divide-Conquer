public class Merge_Sort
{
    public static void mergeSort(String [] arr, int si, int ei)
    {
        if(si >= ei)
            return;
        int mid = (si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        meRge(arr, si, mid, ei);
    }
    public static void meRge(String arr[], int si, int mid, int ei)
    {
        String temp[] = new String[ei-si+1];
        int left=si;
        int right=mid+1;
        int k = 0;//for indexing of temp[]
        while(left <= mid && right <= ei)
        {
            if(isalphabeticallysmaller(arr[left], arr[right]))
            {
                temp[k] = arr[left];
                left++;
            }
            else
            {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        //leftover elements of left

        while(left <= mid)
        {
            temp[k++] = arr[left++];
        }

        //leftover elements of right

        while(right <= ei)
        {
            temp[k++] = arr[right++];
        }

        //copying to original array

        for(left = si, k=0; k<temp.length; k++,left++)
        {
            arr[left] = temp[k];
        }
    }
    public static void print(String arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static Boolean isalphabeticallysmaller(String s1, String s2)
    {
        if(s1.compareTo(s2) < 0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        String arr[] = {"sun","earth","mars","mercury"};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
}
