public class Tower_Of_Hanoii
{
    public static void towerHanoi(int n, String src, String temp, String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer disk number "+n+" from "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1, src, dest, temp);// A -------> C ------> B
        System.out.println("Transfer disk number "+n+" from "+src+" to "+dest);
        towerHanoi(n-1, temp, src, dest);// B--------> A ------> C
    }
    public static void main(String args[])
    {
        int n=3; //Number of Disks
        String src = "A";
        String temp = "B";
        String dest = "C";
        towerHanoi(n, src, temp, dest);
    }
}
