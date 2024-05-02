public class Numbers_reversed
{
    public static void printNumdec(int n)
    {
        if( n == 0)
            return;
        System.out.println(n);
        printNumdec(n-1);
    }
    public static void main(String args[])
    {
        printNumdec(5);
    }
}
