import java.util.ArrayList;

public class All_Occurence
{
    static ArrayList<Integer> al = new ArrayList<>();
    public static void print(ArrayList<Integer> al)
    {
        for(int i=0; i<al.size(); i++)
            System.out.print(al.get(i)+" ");
    }
    public static void allOccurence(int arr[], int target, int i)
    {
        if(i == arr.length)
        {
            print(al);
            return;
        }
        if(arr[i] == target)
        {
            al.add(i);
            allOccurence(arr, target, i+1);
        }
        else
        {
            allOccurence(arr, target, i+1);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int target = 2;
        allOccurence(arr, target, 0);
    }
}
