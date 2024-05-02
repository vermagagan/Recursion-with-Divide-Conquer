public class Pair_Ways
{
    public static int pairways(int n)
    {
        if(n == 1||n == 2)
            return n;
        return pairways(n-1)+(n-1)*pairways(n-2);
    }
    public static void main(String args[])
    {
        System.out.println(pairways(6));
    }
}
