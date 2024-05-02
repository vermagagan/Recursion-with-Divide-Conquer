public class Power
{
    public static int power(int n, int e)
    {
        if(e == 0)
            return 1;
        return n*power(n,e-1);
    }
    public static void main(String args[])
    {
        int n = 5, e = 3;
        System.out.println("The Answer is: "+power(n,e));
    }
}
