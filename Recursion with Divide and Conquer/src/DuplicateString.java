public class DuplicateString
{
    public static void removeDuplicate(String s,int idx, StringBuilder newstr, boolean map[])
    {
        if(idx == s.length())
        {
            System.out.println(newstr);
            return;
        }
        char curr = s.charAt(idx);
        if(map[curr-'A'] == true)
            removeDuplicate(s, idx+1, newstr, map);
        else
        {
            map[curr-'A'] = true;
            removeDuplicate(s, idx+1, newstr.append(curr), map);
        }
    }
    public static void main(String[] args)
    {
        String s = "GAGANVERMA";
        removeDuplicate(s, 0, new StringBuilder(), new boolean[26]);
    }
}
