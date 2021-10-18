public class Program19 {

        public static void main(String[] args)
        {
            int num = 6, sum = 0;
            if (num>0)
            {
                for(int i=1 ;i<=num/2;i++)
                {
                    if(num%i==0)
                    {
                        sum=sum+i;
                    }
                }
                if (sum==num)
                {
                    System.out.println(num+ " Is Perfect Number");
                }
                else
                {
                    System.out.println(num+ " Is Not a Perfect Number");
                }
            }
        }

}
