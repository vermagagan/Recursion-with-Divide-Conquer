public class Int_to_String
{
    static String[] s = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
    public static void intString(int n)
    {
        if(n == 0)
            return;
        int lastdigit = n%10;
        intString(n/10);
        System.out.print(s[lastdigit]+" ");
    }
    public static void main(String args[])
    {
        int n=2019;
        intString(n);
    }
}
