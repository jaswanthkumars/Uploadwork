public class Program18 {
    public static void main(String[] args)
        {
            int num = 121,rev=0;
            int res = num;
            while (num>0)
            {
                rev=(rev*10)+num%10;
                num=num/10;
            }
            if (rev==res)
            {
                System.out.println(res+"  is a Palindrome");
            }
            else
            {
                System.out.println(res+"  is not a Palindrome");
            }
        }

}
