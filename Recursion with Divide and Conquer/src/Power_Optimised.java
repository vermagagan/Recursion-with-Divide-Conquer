public class Power_Optimised
{
    public static int powerOpt(int n, int e)
    {
        if(e == 0)
            return 1;
        int halfPower, halfPowersq;
        halfPower = powerOpt(n, e/2);
        halfPowersq = halfPower*halfPower;
        if(e%2 != 0)
            halfPowersq = n*halfPowersq;
        return halfPowersq;
    }
    public static void main(String args[])
    {
        int n = 5, e = 5;
        System.out.println("The Answer is: "+powerOpt(n,e));
    }
}
