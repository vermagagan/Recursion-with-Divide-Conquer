public class Sum_of_Naturals
{
    public static int sum(int n)
    {
        if(n == 0)
            return 0;
        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        System.out.println("The Sum of first 10 natural numbers is: "+sum(5));
    }
}
