public class Contagious_String
{
    public static int contagiousString(String s,int sidx, int eidx, int iter)
    {
        if(iter == 1)
            return 1;
        if(iter <= 0)
            return 0;
        int total = contagiousString(s, sidx, eidx-1, iter-1)+contagiousString(s, sidx+1, eidx, iter-1)-contagiousString(s, sidx+1, eidx-1, iter-2);
        if(s.charAt(sidx) == s.charAt(eidx))
            total++;
        return total;
    }
    public static void main(String args[])
    {
        String s = "ababcb";
        System.out.println(contagiousString(s,0,s.length()-1,s.length()));
    }
}
