public class Factorial
{
    static int facto = 1;
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        facto = n*fact(n-1);
        return facto;
    }
    public static void main(String args[])
    {
        System.out.println("The factorial of 5 is: "+fact(5));
    }
}
