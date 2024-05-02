public class fibonacci
{
    public static int fib(int n)
    {
        int fn;
        if(n == 0 || n == 1)
            return n;
        fn = fib(n-1)+fib(n-2);
        return fn;
    }
    public static void main(String args[])
    {
        System.out.print(fib(6));
    }
}
