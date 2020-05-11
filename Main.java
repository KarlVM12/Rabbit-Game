public class Main
{
    public static void main(String[] args)
    {
        int[] n = {1,2,3,4};
        System.out.println(containsVowel("JSJ"));
    }
    public static void printTriangle(int n)
    {
        if (n < 1)
            return; 

        printTriangle(n-1);
        printStars(n);
        
    }

    public static void printStars(int n)
    {
        String asterik = "";
        for (int i =1;i<=n;i++)
            asterik += "*";
        System.out.println(asterik);
    }

    int sum(int[] n, int numOfN)
    {
        if (numOfN <= 0)
            return n[0];
        else
            return n[numOfN-1] + sum(n, numOfN-1);
    }

    public static boolean containsVowel(String s)
    {
        CharSequence cs = s;
        String vowel = "aeiouy";
        //CharSequence csFirst = cs.charAt(0) + "";
        if (s.length() == 0)
            return false;

        if (vowel.contains(cs.charAt(0) + ""))
            return true;
        else if(s.length() > 0)
        {
            String last = s.substring(1,s.length());
            return containsVowel(last);
        }
        else
            return false;
            
    }


}